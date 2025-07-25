/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jotajota
 */
public class Conejo extends Mascota implements AtencionEspecial{

    @Override
    public void hacerSonido() {
        System.out.println("El conejo conejea jaj");
    }

    @Override
    public void recibirAtencionEspecial() {
        System.out.println("necesita mas cuidado");
    }
    
}
