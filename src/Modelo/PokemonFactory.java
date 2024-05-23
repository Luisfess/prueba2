/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LUIS FELIPE SUAREZ SANCHEZ - 20231020033
 * JUAN DIEGO MARTINEZ BELTRAN - 20231020131
 */
public class PokemonFactory {

    public Pokemon createPokemon(String nombre, String tipo, String color, int salud, int ataque, int defensa) {
        switch (tipo.toLowerCase()) {
            case "agua" -> {
                return new PokemonAgua(nombre, tipo, color, salud, ataque, defensa);
            }
            case "fuego" -> {
                return new PokemonFuego(nombre, tipo, color, salud, ataque, defensa);
            }
            default -> throw new IllegalArgumentException("Tipo de Pokémon no válido: " + tipo);
        }
        //LUEGO SERÁN AÑADIDOS OTRO TIPO DE POKEMONES
    }
}
