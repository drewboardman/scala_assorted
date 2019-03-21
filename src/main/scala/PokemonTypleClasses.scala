sealed trait PokeMove {
  def show: String
}

trait FireMove extends PokeMove
case object Ember extends FireMove {
  override def show = "Vinewhip"
}
case object FlameThrower extends FireMove {
  override def show = "FlameThrower"
}
case object FireBlast extends FireMove {
  override def show = "Fireblast"
}

trait WaterMove extends PokeMove
case object Bubble extends WaterMove {
  override def show = "Bubble"
}
case object WaterGun extends WaterMove {
  override def show = "Watergun"
}

trait GrassMove extends PokeMove
case object VineWhip extends GrassMove {
  override def show = "Vinewhip"
}

sealed trait Pokemon
sealed trait Tier1 extends Pokemon
implicit val Tier1Ord = new Ordered[Tier1] // why can't i create an instance of this?

sealed trait Tier2 extends Pokemon
sealed trait Tier3 extends Pokemon

trait FirePokemon extends Pokemon
case object Charmander extends FirePokemon with Tier1
case object Charmeleon extends FirePokemon with Tier3
case object Charizard extends FirePokemon with Tier3

trait WaterPokemon extends Pokemon
case object Squirtle extends WaterPokemon with Tier1
case object WarTortle extends WaterPokemon with Tier2
case object Blastoise extends WaterPokemon with Tier3

trait GrassPokemon extends Pokemon
case object Bulbasaur extends GrassPokemon with Tier1
case object Ivysaur extends GrassPokemon with Tier2
case object Venusaur extends GrassPokemon with Tier3

trait Battle[A <: Pokemon] {
  def ability(a: A): PokeMove
  def fight[B <: Pokemon](a1: A, a2: B): Pokemon
}

implicit class PokeOps(a: Pokemon) {
  def considerTier(a: Pokemon, b: Pokemon): Pokemon =
}
implicit val FirePokemonBattle = new Battle[FirePokemon] {
  override def ability(a: FirePokemon): PokeMove = a match {
    case Charmander => Ember
    case Charmeleon => FlameThrower
    case Charizard => FireBlast
  }

  override def fight(a: FirePokemon, b: Pokemon): Pokemon = b match {
    case w: WaterPokemon => w
  }
}
