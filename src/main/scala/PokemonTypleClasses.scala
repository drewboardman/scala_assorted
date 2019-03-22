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
    override def compare(x: Hierarchy, y: Hierarchy): Int = x.order - y.order match {
      case x: Int if x > 0 => 1
      case x: Int if x < 0 => -1
      case _: Int => 0
    }
  }

  sealed trait Pokemon

  trait FirePokemon extends Pokemon

  case object Charmander extends FirePokemon {
    val tier: Hierarchy = Tier1
  }

  case object Charmeleon extends FirePokemon {
    val tier: Hierarchy = Tier2
  }

  case object Charizard extends FirePokemon {
    val tier: Hierarchy = Tier3
  }

  trait WaterPokemon extends Pokemon

  case object Squirtle extends WaterPokemon {
    val tier: Hierarchy = Tier1
  }

  case object WarTortle extends WaterPokemon {
    val tier: Hierarchy = Tier2
  }

  case object Blastoise extends WaterPokemon {
    val tier: Hierarchy = Tier3
  }

  trait GrassPokemon extends Pokemon

  case object Bulbasaur extends GrassPokemon {
    val tier: Hierarchy = Tier1
  }

  case object Ivysaur extends GrassPokemon {
    val tier: Hierarchy = Tier2
  }

  case object Venusaur extends GrassPokemon {
    val tier: Hierarchy = Tier3
  }

  trait Battle[A <: Pokemon] {
    def fight[B <: Pokemon](a1: A, a2: B): Pokemon
  }

}
