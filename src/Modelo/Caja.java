package Modelo;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author LUIS FELIPE SUAREZ SANCHEZ - 20231020033
 * JUAN DIEGO MARTINEZ BELTRAN - 20231020131
 */
public class Caja {

    
    ArrayList<Pokemon> pokemones; //Caja max 5 pokemones, se trabaja adentro cuando se use el .size
    int maxCajas = 10;

    public Caja() {
       this.pokemones = new ArrayList<>();
    }

    
    public void agregarPokemon(Pokemon pokemon) {
        pokemones.add(pokemon);
    }

    
    public void liberarPokemon(Pokemon pokemon) { // .remove se usa acá podriamos usarlo
        pokemones.remove(pokemon);
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }
    
        public Pokemon buscarPokemon(int i){
        return this.pokemones.get(i);
    }


    public String verPokemon() {
        String s = "";
        for(Pokemon pokemon : pokemones){
            s +=pokemon.toString() + "\n";
        }
        return s;
    }
}
