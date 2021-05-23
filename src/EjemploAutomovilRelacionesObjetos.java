

public class EjemploAutomovilRelacionesObjetos {
        public static void main(String[] args) {


                //instanciamos el objeto
                Persona conductorChevrolet = new Persona("Elias", "Morales");
                Rueda ruedaYokohama = new Rueda("Yokohama", 16, 7.5f);
                Rueda ruedaMicheline = new Rueda("Micheline", 20, 10.5f);
                Rueda[] ruedasChevrolet = new Rueda[5];

                Automovil chevrolet = new Automovil("DMS", "Chevrolet", Color.AZUL, new Motor(1.4f, TipoMotor.GASOLINA));
                chevrolet.setTipo(TipoAutomovil.STATION_WAGON);
                chevrolet.setConductor(conductorChevrolet);
                //chevrolet.setRuedas(ruedasChevrolet);

                for (int i = 0; i < ruedasChevrolet.length; i++) {
                        chevrolet.addRuedas(ruedaYokohama);
                }

                Persona conductorMazda = new Persona("Pepe", "Palacio");
                Rueda[] ruedasMazda = new Rueda[4];

                Automovil mazda = new Automovil("Mazda","Sorento",Color.ROJO, new Motor(1.8f, TipoMotor.GASOLINA), new Estanque() ,TipoAutomovil.STATION_WAGON ,conductorMazda, ruedasMazda);
                for (int i = 0; i < ruedasMazda.length; i++) {
                        mazda.addRuedas(ruedaMicheline);
                }

                //Modificar el atributo Static
                //Desde otra clase
                Automovil.setColorPatente(Color.VERDE);

                Persona conductorNissan = new Persona("Miguel", "Quesada");
                Rueda[] ruedasNissan = new Rueda[4];

                Automovil nissan = new Automovil("Nissan","QuiashQai", Color.BLANCO, new Motor(2.1f, TipoMotor.GASOLINA), new Estanque(30));
                nissan.setTipo(TipoAutomovil.STATION_WAGON);
                nissan.setConductor(conductorNissan);
                //nissan.setRuedas(ruedasNissan);
                for (int i = 0; i < ruedasNissan.length; i++) {
                        nissan.addRuedas(ruedaYokohama);
                }

                //Ejemplo de metodo con encadenamiento
//                nissan.addRuedas(ruedaYokohama)
//                      .addRuedas(ruedaYokohama)
//                      .addRuedas(ruedaYokohama)
//                      .addRuedas(ruedaYokohama)
//                      .addRuedas(ruedaYokohama);

                Persona conductorNissan2 = new Persona("David", "Pimentel");
                Rueda[] ruedasNissan2 = new Rueda[4];

                Automovil nissan2 = new Automovil("Nissan","QuiashQai", Color.GRIS, new Motor(3.1f, TipoMotor.DISEL), new Estanque());
                nissan2.setTipo(TipoAutomovil.HATCHBACK);
                nissan2.setConductor(conductorNissan2);
                //nissan2.setRuedas(ruedasNissan2);

                for (int i = 0; i < ruedasNissan2.length; i++) {
                        nissan2.addRuedas(ruedaMicheline);
                }

                Automovil auto = new Automovil();
                auto.setTipo(TipoAutomovil.PICKUP);

                //Imprimiendo primero objeto
                System.out.println("Datos del Primer Objecto: Chevrolet = ");
                System.out.println(chevrolet.detalle());
                System.out.println();
                System.out.println("Datos del Segundo Objecto: Mazda = ");
                System.out.println(mazda.detalle());
                System.out.println();
                System.out.println("Datos del Segundo Objecto: Nissan");
                System.out.println(nissan.detalle());

                //Imprimir las ruedas de un conjunto de ruedas
//                for (Rueda rueda : ruedasNissan2) {
//                        System.out.println("Fabricante: " + rueda.getFabricante() + " Aro: " + rueda.getAro() + " Ancho: " + rueda.getAncho());
//                }

}
}