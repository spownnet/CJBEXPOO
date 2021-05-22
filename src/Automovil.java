public class Automovil {

      //Seccion de declaraciones de variables
      private int id;
      private String fabricante;
      private String modelo;
      private Color color = Color.ROJO;
      private double cilindrada;
      private int capacidadtanque = 40;
      private TipoAutomovil tipo;

      //definicion de atributos static o de la clase
      private static Color colorPatente = Color.NARANJA;
      private static int ultimoid;

      //definicion de atributos static final o constantes
      public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
      public static final int VELOCIDAD_MAX_CIUDAD = 60;

      public static final String COLOR_ROJO = "Rojo";
      public static final String COLOR_AMARILLO = "Amarillo";
      public static final String COLOR_AZUL = "Azul";
      public static final String COLOR_BLANCO = "Blanco";
      public static final String COLOR_GRIS_OSCURO = "Gris Ocuro";


      //Seccion de definicion de constructores
        public Automovil(){
                //hace un pre-incremento al atributo estatico luego
                //se lo asigna al atributo no estatico
                this.id = ++ultimoid;
        }

        public Automovil(String fabricante, String modelo) {
                this();//llamar al constructor vacio
                this.fabricante = fabricante;
                this.modelo = modelo;
        }

        public Automovil(String fabricante, String modelo, Color color) {
                this(fabricante,modelo); //llama al constructor con dos parametros
                this.color = color;
        }

        public Automovil(String fabricante, String modelo, Color color, double cilindrada){
        this(fabricante,modelo,color); //llama al constructor con tres parametros
        this.cilindrada = cilindrada;
        }

        public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadtanque) {
                this(fabricante,modelo,color,cilindrada); //llama al constructor con cuatro parametros.
                this.capacidadtanque = capacidadtanque;
        }

//Seccion de definiciones de metodos get/set de atributos de la clase
public String getFabricante(){ return this.fabricante; }
public String getModelo(){ return this.modelo; }
public Color getColor(){ return this.color;}
public double getCilindrada(){return this.cilindrada;}
public int getCapacidadTanque(){return this.capacidadtanque;}
public int getId(){return this.id;}
public static Color getColorPatente(){return Automovil.colorPatente;}
public static int getUltimoid(){return Automovil.ultimoid;}
public TipoAutomovil getTipo(){return this.tipo;}

public void setFabricante(String fabricante){this.fabricante=fabricante;}
public void setModelo(String modelo){this.modelo=modelo;}
public void setColor(Color color){this.color=color;}
public void setCilindrada(double cilindrada){this.cilindrada=cilindrada;}
public void setCapacidadtanque(int capacidadtanque){this.capacidadtanque=capacidadtanque;}
public static void setColorPatente(Color colorPatente){ Automovil.colorPatente = colorPatente;}
public void setTipo(TipoAutomovil tipo){this.tipo = tipo;}

//Seccion de definicion de metodos
public String detalle(){

        return "auto.id: " + this.id +
               "\nTipo: " + this.tipo +
                "\nFabricante: " + this.fabricante +
                "\nColor: " + this.color +
                "\nModelo: " + this.modelo +
                "\nPatente Color: " + colorPatente +
                "\nCilindrada: " + this.cilindrada;

}

public String acelerar(int rpm){
        return "El auto: " + this.fabricante + " acelerando a " + rpm + "rpm";
}

public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!!";
}

public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
}

//metodo de rendimento de quilometro recorrido.
public float calcularConsumo(int km, float porcentajeGasolina){
        return km/(porcentajeGasolina * capacidadtanque);
}
//Se sobre carga el metodo anterior con un tipo de dato parametro diferente
public float calcularConsumo(int km, int porcentajeGasolina){
        return km/((porcentajeGasolina/100f) * capacidadtanque);
}

//Seccion de definicion de sobre escritura de metodos

        //Se sobre escribe el metodo equals de comparacion de objetos.
        //a una definicion mas personalizadas
        @Override
        public boolean equals(Object obj) {

                //Validacion de comparacion de referencia
                if(this == obj){
                        return true;
                }

                //Validacion del mismo tipo a comparar
                //Y que se son diferente entonces debe ser false
                if(!(obj instanceof Automovil)){
                        return false;
                }

                Automovil a = (Automovil) obj;
                return (this.fabricante != null &&
                        this.modelo != null &&
                        this.color != null &&
                        this.fabricante.equals(a.fabricante) &&
                        this.modelo.equals(a.modelo) &&
                        this.color.equals(a.color) &&
                        this.cilindrada == a.cilindrada &&
                        this.capacidadtanque == a.capacidadtanque);
        }

        @Override
        public String toString() {
                return "Automovil{" +
                        "id= " + id +
                        ", fabricante='" + fabricante + '\'' +
                        ", modelo='" + modelo + '\'' +
                        ", color='" + color + '\'' +
                        ", cilindrada=" + cilindrada +
                        ", capacidadtanque=" + capacidadtanque +
                        '}';
        }
}
