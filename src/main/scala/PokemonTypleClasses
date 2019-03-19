trait PokeMove

trait FireMove extends PokeMove
case object Ember extends FireMove
case object FlameThrower extends FireMove {
  override def show = "FlameThrower"
}
case object FireBlast extends FireMove {
  override def show = "Fireblast"
}

trait WaterMove extends PokeMove
case object Bubble extends WaterMove
case object WaterGun extends WaterMove {
  override def show = "Watergun"
}

trait GrassMove extends PokeMove
case object VineWhip extends GrassMove {
  override def show = "Vinewhip"
}

trait Pokemon {
  val name: String
  val move: PokeMove
}

case class FirePokemon(override val name: String, override val move: FireMove) extends Pokemon
val charmander = FirePokemon("Charmander", Ember)
val charmeleon = FirePokemon("Charmeleon", FlameThrower)
val charizard = FirePokemon("Charizard", FireBlast)

case class WaterPokemon(override val name: String, override val move: WaterMove) extends Pokemon
val squirtle = WaterPokemon("Squirtle", Bubble)
val wartortle = WaterPokemon("Wartortle", WaterGun)
val blastoise = WaterPokemon("Blastoise", WaterGun)

case class GrassPokemon(override val name: String, override val move: GrassMove) extends Pokemon
val bulbasaur = GrassPokemon("Bulbasaur", VineWhip)
val ivysaur = GrassPokemon("Ivysaur", VineWhip)
val venusaur = GrassPokemon("Venusaur", VineWhip)

object Battle {
  def movePicker(pokemon: Pokemon) = ???
}