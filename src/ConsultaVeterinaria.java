
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jotajota
 */
public class ConsultaVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Mascota> mascotas = new ArrayList<>();
        
        mascotas.add(new Perro());
        mascotas.add(new Gato());
        mascotas.add(new Conejo());
        
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);

            m.hacerSonido();
            m.descansar();

            // Verificar si requiere atención especial
            if (m instanceof AtencionEspecial) {
                AtencionEspecial a = (AtencionEspecial) m;
                a.recibirAtencionEspecial();
            }

            System.out.println("---");
        }
        
    }
    
}
