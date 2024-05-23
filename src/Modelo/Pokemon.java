package Modelo;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author LUIS FELIPE SUAREZ SANCHEZ - 20231020033
 * JUAN DIEGO MARTINEZ BELTRAN - 20231020131
 */
public abstract class Pokemon {
    protected String nombre;
    protected String tipo;
    protected int salud;
    protected int ataque;
    protected int defensa;
    protected String color;

    public Pokemon(String nombre, String tipo, String color, int salud, int ataque, int defensa) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
        this.color = color;
    }

    
    public abstract void atacar(Pokemon victima);

    public abstract void recibirDaño(int daño);

    public abstract void usarHabilidad();

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSalud() {
        return salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public String getColor() {
        return color;
    }

    
    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", tipo=" + tipo + ", salud=" + salud + ", ataque=" + ataque + ", defensa=" + defensa + ", color=" + color + '}';
    }
    
    
}
