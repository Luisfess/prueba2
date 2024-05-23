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
public class PokemonFuego extends Pokemon{

    public PokemonFuego(String nombre, String tipo, String color, int salud, int ataque, int defensa) {
        super(nombre, tipo, color, salud, ataque, defensa);
    }

    
    @Override
    public void atacar(Pokemon victima) {
        victima.recibirDaño(this.ataque);
    }

    @Override
    public void recibirDaño(int daño) {
        this.salud -= this.salud - daño;
    }

    @Override
    public void usarHabilidad() {
        
    }
    
}
