import java.util.Arrays;

public class EjemploAutomovilArreglo {
        public static void main(String[] args) {


                //instanciamos el objeto
                Persona conductorChevrolet = new Persona("Elias", "Morales");
                Rueda ruedaYokohama = new Rueda("Yokohama", 16, 7.5f);
                Rueda ruedaMicheline = new Rueda("Micheline", 20, 10.5f);
                Rueda[] ruedasChevrolet = new Rueda[5];
                Automovil chevrolet = new Automovil("DMS", "Chevrolet", Color.AZUL, new Motor(1.4f, TipoMotor.GASOLINA));
                chevrolet.setTipo(TipoAutomovil.STATION_WAGON);
                chevrolet.setConductor(conductorChevrolet);

                Persona conductorMazda = new Persona("Pepe", "Palacio");
                Rueda[] ruedasMazda = new Rueda[4];
                Automovil mazda = new Automovil("Mazda","Sorento",Color.ROJO, new Motor(1.8f, TipoMotor.GASOLINA));
                mazda.setEstanque(new Estanque());
                mazda.setTipo(TipoAutomovil.CONVERTIBLE);
                mazda.setConductor(conductorMazda);

                Persona conductorNissan = new Persona("Miguel", "Quesada");
                Rueda[] ruedasNissan = new Rueda[4];
                Automovil nissan = new Automovil("Nissan","QuiashQai", Color.BLANCO, new Motor(2.1f, TipoMotor.GASOLINA), new Estanque(30));
                nissan.setTipo(TipoAutomovil.STATION_WAGON);
                nissan.setConductor(conductorNissan);

                Persona conductorSuzuki = new Persona("David", "Pimentel");
                Rueda[] ruedasSuzuki = new Rueda[4];
                Automovil suzuki = new Automovil("Suzuki","Vitara", Color.NEGRO, new Motor(2.8f, TipoMotor.GASOLINA), new Estanque(40));
                suzuki.setTipo(TipoAutomovil.SUV);
                suzuki.setConductor(conductorSuzuki);

                //Arreglos de objeto Automovil
                Automovil[] autos = new Automovil[4];
                autos[0] = chevrolet;
                autos[1] = mazda;
                autos[2] = nissan;
                autos[3] = suzuki;

                Arrays.sort(autos);
                //Imprimir la lista de autos
                for (int i = 0; i < autos.length; i++) {
                        System.out.println("autos[" + i +"] = " + autos[i]);
                }

}
}