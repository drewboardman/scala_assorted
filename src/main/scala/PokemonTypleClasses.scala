import Things.WaterPokemon

object PokemonTypleClasses {

  trait Hierarchy {
    val order: Int
  }

  case object Tier1 extends Hierarchy {
    override val order = 1
  }

  case object Tier2 extends Hierarchy {
    override val order = 2
  }

  case object Tier3 extends Hierarchy {
    override val order = 3
  }

  implicit val TierOrdering: Ordering[Hierarchy] = new Ordering[Hierarchy] {
    override def compare(x: Hierarchy, y: Hierarchy): Int = x.order - y.order
  }

  implicit class RichTieredPokemon(a: Pokemon) {
    import TierOrdering._
    def considerTiers(b: Pokemon): Pokemon = if (a.tier > b.tier) a else b
  }

  trait Battle[A <: Pokemon] {
    def fight(a1: A, a2: Pokemon): FightResult
  }

  trait FightResult
  case class Winner(a: Pokemon) extends FightResult
  case object Draw extends FightResult

  implicit val FireBattle: Battle[FirePokemon] = new Battle[FirePokemon] {
    def fight(a: FirePokemon, b: Pokemon): FightResult = b match {
      case waterWins: WaterPokemon => Winner(waterWins.considerTiers(a))
      case grassLoses: GrassPokemon => Winner(grassLoses.considerTiers(a))
      case anotherFire: FirePokemon => if (a.tier == anotherFire.tier) Draw else Winner(anotherFire.considerTiers(a))
    }
  }

  /**
    * The interface should be as follows:
    * 1. Define a Pokemon Type (eg "air")
    * 2. Put pokemon in that type, with tiers
    * 3. Provide a typeclass instance of something that tells how they stack up against other types
    */
}
