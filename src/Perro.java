/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jotajota
 */
public class Perro extends Mascota implements Vacunable{

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    @Override
    public void vacunar() {
        System.out.println(" el perro ha sido vacunado.");
    }
    
}
