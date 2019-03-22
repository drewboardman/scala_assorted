import PokemonTypleClasses.{Hierarchy, Tier1, Tier2, Tier3}

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

sealed trait Pokemon {
  val tier: Hierarchy
}

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


