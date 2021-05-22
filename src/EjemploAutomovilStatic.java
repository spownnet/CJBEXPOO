import java.util.Date;

public class EjemploAutomovilStatic {
        public static void main(String[] args) {

                Date fecha= new Date();
                //instanciamos el objeto
                Automovil chevrolet = new Automovil("DMS", "Chevrolet", Color.AZUL, 1.8f);
                chevrolet.setTipo(TipoAutomovil.STATION_WAGON);

                Automovil mazda = new Automovil("Mazda","Sorento",Color.ROJO, 2.2f);
                mazda.setTipo(TipoAutomovil.SEDAN);

                //Modificar el atributo Static
                //Desde otra clase
                Automovil.setColorPatente(Color.VERDE);

                Automovil nissan = new Automovil("Nissan","QuiashQai", Color.BLANCO, 2.0f, 30);
                nissan.setTipo(TipoAutomovil.STATION_WAGON);
                Automovil nissan2 = new Automovil("Nissan","QuiashQai", Color.GRIS, 2.0f, 30);
                nissan2.setTipo(TipoAutomovil.HATCHBACK);
                Automovil auto = new Automovil();
                auto.setTipo(TipoAutomovil.PICKUP);

                //Imprimiendo primero objeto
                System.out.print("Datos del Primer Objecto: Chevrolet = ");
                System.out.println(chevrolet);
                System.out.println(chevrolet.detalle());
                System.out.println();
                System.out.print("Datos del Segundo Objecto: Mazda = ");
                System.out.println(mazda.toString());
                System.out.println(mazda.detalle());
                System.out.println();
                System.out.println("Datos del Segundo Objecto: Nissan");
                System.out.println(nissan.detalle());
                System.out.println("Automovil.getUltimoid() = " + Automovil.getUltimoid());
                System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
                System.out.println("Automovil.VELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);

}
}