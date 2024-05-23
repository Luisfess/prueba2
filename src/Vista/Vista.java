/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Control.Control;
import javax.swing.JOptionPane;

/**
  * @author LUIS FELIPE SUAREZ SANCHEZ - 20231020033
 * JUAN DIEGO MARTINEZ BELTRAN - 20231020131
 */
public class Vista {

    private Control control;

    public Vista(Control control) {
        this.control = control;
    }

    public void mostrarMensaje(String cadena) {
        JOptionPane.showMessageDialog(null, cadena);
    }

    public void mostrarMensajeConsola(String cadena) {
        System.out.println(cadena);
    }

}
