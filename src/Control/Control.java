/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Caja;
import Modelo.Pokemon;
import Modelo.PokemonFactory;
import Vista.Ataque;
import Vista.Inicio;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LUIS FELIPE SUAREZ SANCHEZ - 20231020033 JUAN DIEGO MARTINEZ BELTRAN
 * - 20231020131
 */
public class Control implements ActionListener {

    private Vista vista;
    private Inicio inicio;
    private Ataque ataqueVista;
    private Caja caja1;
    private PokemonFactory factory;

    public Control() {
        vista = new Vista(this);
        inicio = new Inicio();
        inicio.botonAgregarInicio.addActionListener(this);
        inicio.botonVerPokemonesInicio.addActionListener(this);
        inicio.setVisible(true);
        caja1 = new Caja();
        factory = new PokemonFactory();
        ataqueVista = new Ataque();
        ataqueVista.botonElegirPokemon.addActionListener(this);
    }

    public Pokemon crearPokemon(String nombre, String tipo, String color, int salud, int ataque, int defensa) {
        //SE UTILIZA EL PATRÓN DE DISEÑO FACTORY PARA LA CREACIÓN DE LOS DISTINTOS TIPOS DE POKEMONES
        //REVISAR LA CLASE POKEMONFACTORY DONDE SE REALIZA LA VERFICACIÓN
        Pokemon pokemon = factory.createPokemon(nombre, tipo, color, salud, ataque, defensa);
        vista.mostrarMensaje("Se agregó el pokemón");
        inicio.cajaNombreInicio.setText("");
        inicio.cajaSaludInicio.setText("");
        inicio.cajaAtaqueInicio.setText("");
        inicio.cajaColorInicio.setText("");
        inicio.cajaDefensaInicio.setText("");
        inicio.cajaTipoInicio.setText("");
        return pokemon;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inicio.botonAgregarInicio) {
            String nombre = inicio.cajaNombreInicio.getText();
            String tipo = inicio.cajaTipoInicio.getText();
            String color = inicio.cajaColorInicio.getText();
            int salud = Integer.parseInt(inicio.cajaSaludInicio.getText());
            int ataque = Integer.parseInt(inicio.cajaAtaqueInicio.getText());
            int defensa = Integer.parseInt(inicio.cajaDefensaInicio.getText());
            if (caja1.getPokemones().size() < 5) {
                Pokemon pokemon = crearPokemon(nombre, tipo, color, salud, ataque, defensa);
                caja1.agregarPokemon(pokemon);
                ataqueVista.comboPokemonAtaque.addItem(pokemon.getNombre());
            } else {
                vista.mostrarMensaje("La caja ya cuenta con el máximo de pokemones (5)");

            }
        }
        if (e.getSource() == inicio.botonVerPokemonesInicio) {
            if (caja1.getPokemones().size() <= 5) {
                vista.mostrarMensaje(caja1.verPokemon());
            }
            if (caja1.getPokemones().size() == 5) {
                ataqueVista.setVisible(true);
                inicio.dispose();
            }
        }
        if (e.getSource() == ataqueVista.botonElegirPokemon) {
            int elegido = ataqueVista.comboPokemonAtaque.getSelectedIndex();
            Pokemon pokemonelegido = caja1.buscarPokemon(elegido);
            vista.mostrarMensaje("El pokemon elegido es: " + pokemonelegido.getNombre());
        }
    }
}
