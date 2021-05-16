public class EjemploAutomovil {
        public static void main(String[] args) {

                //instanciamos el objeto
                Automovil chevrolet = new Automovil();

                chevrolet.cilindrada = 1.8;
                chevrolet.modelo="Chevrolet";
                chevrolet.fabricante = "DMG";

                Automovil mazda = new Automovil();

                mazda.cilindrada = 2.2;
                mazda.modelo="Sorento";
                mazda.color = "Negro";
                mazda.fabricante = "Mazda";

                //Imprimiendo primero objeto
                System.out.println("Datos del Primer Objecto");
                System.out.println(chevrolet.detalle());
                System.out.println();
                System.out.println("Datos del Segundo Objecto");
                System.out.println(mazda.detalle());

                //Mostrando metodo acelerando / frenando
                System.out.println("mazda.acelerar(100) = " + mazda.acelerarFrenar(100));
                System.out.println("chevrolet.acelerar(200) = " + chevrolet.acelerarFrenar(200));


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
