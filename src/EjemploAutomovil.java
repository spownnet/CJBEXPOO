import java.util.Date;
import java.util.Objects;

public class EjemploAutomovil {
        public static void main(String[] args) {

                Date fecha= new Date();
                //instanciamos el objeto
                Automovil chevrolet = new Automovil("DMS", "Chevrolet", Color.NEGRO, 1.8f);

//                chevrolet.setCilindrada(1.8);
//                chevrolet.setModelo("Chevrolet");
//                chevrolet.setFabricante("DMG");

                Automovil mazda = new Automovil("Mazda","Sorento",Color.NEGRO, 2.2f);

                Automovil nissan = new Automovil("Nissan","QuiashQai", Color.ROJO, 2.0f, 30);
                Automovil nissan2 = new Automovil("Nissan","QuiashQai", Color.AZUL, 2.0f, 30);
                Automovil auto = new Automovil();
//                mazda.setCilindrada(2.2);
//                mazda.setModelo("Sorento");
//                mazda.setColor("Negro");
//                mazda.setFabricante("Mazda");

                //Imprimiendo primero objeto
                System.out.print("Datos del Primer Objecto: Chevrolet = ");
                System.out.println(chevrolet);
                System.out.println(chevrolet.detalle());
                System.out.println();
                System.out.print("Datos del Segundo Objecto: Mazda = ");
                System.out.println(mazda);
                System.out.println(mazda.detalle());
                System.out.println();
                System.out.println("Datos del Segundo Objecto: Nissan");
                System.out.println(nissan.detalle());

                //Comparacion de Objetos
                System.out.println("Son iguales los objetos nissan al compararlo con el operador == ? " + (nissan == nissan2));
                System.out.println("Son iguales los objetos nissan al compararlo con el metodo equals ? " + (nissan.equals(nissan2)));
                System.out.println("Son iguales los objetos comparado auto vs nissan2 al compararlo con el metodo equals ? " + (auto.equals(nissan)));
                System.out.println(new StringBuilder().append("Son iguales los objetos comparado auto vs fecha al compararlo con el metodo equals ? ").append(auto.equals(fecha)).toString());

                //Mostrando metodo acelerando / frenando
                System.out.println("mazda.acelerar(100) = " + mazda.acelerarFrenar(100));
                System.out.println("chevrolet.acelerar(200) = " + chevrolet.acelerarFrenar(200));

                //Mostrar metodo calcula consumo de combustible
                System.out.println("mazda Comsumo Km/l = " + mazda.calcularConsumo(200, 0.50f));
                System.out.println("chevrolet Comsumo Km/l = " + chevrolet.calcularConsumo(300, 66));


//                System.out.println("auto.fabricante = " + auto.fabricante);
//                System.out.println("auto.color = " + auto.color);
//                System.out.println("auto.modelo = " + auto.modelo);
//                System.out.println("auto.cilindrada = " + auto.cilindrada);
//
//                System.out.println("auto.fabricante = " + mazda.fabricante);
//                System.out.println("auto.color = "      + mazda.color);
//                System.out.println("auto.modelo = "     + mazda.modelo);
//                System.out.println("auto.cilindrada = " + mazda.cilindrada);
        }
}
