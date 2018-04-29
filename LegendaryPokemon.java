/**
 *  This class represents the Legendary Pokemon Lugia.
 *  By using inheritance and gaining access to the Pokemon class
 * @author Allen Telson
 *
 */
class LegendaryPokemon extends Pokemon {

  // Below represents the process of overriding methods within
  // The pokemon class in order to provide characteristics of Lugia
  @Override
  String get_appearance() {
    return "From a group of incredibly rare and often very powerful Pokémon,"
        + " generally featured prominently in the legends and myths of the Pokémon world. ";
  }

  @Override
  String get_color() {
    return "Silver with navy blue and light accents.";
  }

  @Override
  String get_name() {
    return "Lugia";
  }

  @Override
  String get_typeOfPokemon() {
    return "Psychic and Flying";
  }

  @Override
  double get_weight() {
    return 476.2;
  }
}
