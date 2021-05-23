

public class EjemploAutomovilEnum {
        public static void main(String[] args) {

                //instanciamos el objeto
                Automovil chevrolet = new Automovil("DMS", "Chevrolet", Color.AZUL, new Motor(1.8f,TipoMotor.GASOLINA));
                chevrolet.setTipo(TipoAutomovil.STATION_WAGON);

                Automovil mazda = new Automovil("Mazda","Sorento",Color.ROJO, new Motor(2.1f, TipoMotor.DISEL));
                mazda.setTipo(TipoAutomovil.SEDAN);

                //Modificar el atributo Static
                //Desde otra clase
                Automovil.setColorPatente(Color.VERDE);

                Automovil nissan = new Automovil("Nissan","QuiashQai", Color.BLANCO, new Motor(1.6f,TipoMotor.GASOLINA), new Estanque(30));
                nissan.setTipo(TipoAutomovil.STATION_WAGON);
                Automovil nissan2 = new Automovil("Nissan","QuiashQai", Color.GRIS, new Motor(1.5f, TipoMotor.GASOLINA), new Estanque(30));
                nissan2.setTipo(TipoAutomovil.HATCHBACK);
                Automovil auto = new Automovil();
                auto.setTipo(TipoAutomovil.PICKUP);

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
                System.out.println("Automovil.getUltimoid() = " + Automovil.getUltimoid());
                System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
                System.out.println("Automovil.VELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);

                TipoAutomovil tipo = nissan.getTipo();
                System.out.println("tipoNissan.getNombre() = " + tipo.getNombre());
                System.out.println("tipoNissan.getDescripcion() = " + tipo.getDescripcion());

                tipo = mazda.getTipo();

                //switch case con tipos enumeradores
                //Se modifca a switch case mejorado desde la version
                //de java 13 en adelante
                switch (tipo) {
                        case CONVERTIBLE -> System.out.println("Hola soy tipo Convertible");
                        case SEDAN -> System.out.println("Hola soy tipo Sedan");
                        case STATION_WAGON -> System.out.println("Hola soy tipo Station Wagon");
                        case COUPE -> System.out.println("Hola soy tipo Coupe");
                        case FURGON -> System.out.println("Hola soy tipo Furgon");
                        case PICKUP -> System.out.println("Hola soy tipo Pickup");
                        case HATCHBACK -> System.out.println("Hola soy tipo Hachtback");
                }

                //Iterando Enumeradores
                TipoAutomovil[] tipos = TipoAutomovil.values();
                for (TipoAutomovil tipoAutomovil : tipos) {
                        System.out.print( tipoAutomovil + " => " + tipoAutomovil.name() + " , " +
                                          tipoAutomovil.getNombre() + " , " +
                                          tipoAutomovil.getDescripcion() + " , " +
                                          tipoAutomovil.getNumeroPuertas());
                        System.out.println();
                }
}
}