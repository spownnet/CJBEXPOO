public class Automovil implements Comparable<Automovil>{

      //Seccion de declaraciones de variables
      private int id;
      private String fabricante;
      private String modelo;
      private Color color = Color.ROJO;
      private Motor motor;
      private Estanque estanque;
      private TipoAutomovil tipo;
      private Persona conductor;
      private Rueda[] ruedas;
      private int indicerueda;


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
                this.ruedas = new Rueda[5];
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

        public Automovil(String fabricante, String modelo, Color color, Motor motor){
        this(fabricante,modelo,color); //llama al constructor con tres parametros
        this.motor = motor;
        }

        public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
                this(fabricante,modelo,color,motor); //llama al constructor con cuatro parametros.
                this.estanque = estanque;
        }

        public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, TipoAutomovil tipo, Persona conductor, Rueda[] ruedas) {
                this(fabricante,modelo,color,motor,estanque);
                this.tipo = tipo;
                this.conductor = conductor;
                this.ruedas = ruedas;
        }

        //Seccion de definiciones de metodos get/set de atributos de la clase
public String getFabricante(){ return this.fabricante; }
public String getModelo(){ return this.modelo; }
public Color getColor(){ return this.color;}
public Motor getMotor(){return this.motor;}
public Estanque getEstanque(){
                if (this.estanque == null){
                        this.estanque = new Estanque();
                }
                return this.estanque;
        }
public int getId(){return this.id;}
public static Color getColorPatente(){return Automovil.colorPatente;}
public static int getUltimoid(){return Automovil.ultimoid;}
public TipoAutomovil getTipo(){return this.tipo;}
public Persona getConductor() {return conductor;}
public Rueda[] getRuedas() {return ruedas;}

public void setFabricante(String fabricante){this.fabricante=fabricante;}
public void setModelo(String modelo){this.modelo=modelo;}
public void setColor(Color color){this.color=color;}
public void setMotor(Motor motor){this.motor=motor;}
public void setEstanque(Estanque estanque){this.estanque=estanque;}
public static void setColorPatente(Color colorPatente){ Automovil.colorPatente = colorPatente;}
public void setTipo(TipoAutomovil tipo){this.tipo = tipo;}
public void setConductor(Persona conductor) {this.conductor = conductor;}
public void setRuedas(Rueda[] ruedas) { this.ruedas = ruedas; }
public Automovil addRuedas(Rueda rueda) {
                if (indicerueda < ruedas.length) {this.ruedas[indicerueda++] = rueda; }
        return this;
        }



        //Seccion de definicion de metodos
public String detalle(){

        String detalle = "auto.id: " + this.id +
                         "\nTipo: " + this.tipo +
                        "\nFabricante: " + this.fabricante +
                        "\nColor: " + this.color +
                        "\nModelo: " + this.modelo +
                        "\nPatente Color: " + colorPatente +
                        "\nCilindrada: " + this.motor.getCilindrada();
                if (getConductor() != null) {
                        detalle += "\nConductor: " + this.getConductor();
                }
                if (getRuedas() != null){
                        detalle += "\nRuedas del Automovil: ";
                        for (Rueda r : this.getRuedas()) {
                                if (r != null ){
                                        detalle += "\n  Fabricante: " + r.getFabricante() + " Aro: " + r.getAro() + " Ancho: " + r.getAncho();
                                }
                        }
                }

                return detalle;

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
        return km/(porcentajeGasolina * this.getEstanque().getCapacidad());
}
//Se sobre carga el metodo anterior con un tipo de dato parametro diferente
public float calcularConsumo(int km, int porcentajeGasolina){
        return km/((porcentajeGasolina/100f) * this.getEstanque().getCapacidad());
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
                        this.motor.getCilindrada() == a.motor.getCilindrada() &&
                        this.estanque.getCapacidad() == a.estanque.getCapacidad());
        }

        @Override
        public String toString() {
                String tostr = "id: " + id +
                        ", fabricante: '" + fabricante + '\'' +
                        ", modelo: '" + modelo + '\'';
                      return tostr;
        }

        //Se establece el contrato de la interface
        //Sobre escribiendo el metodo compareTo
        @Override
        public int compareTo(Automovil auto) {
                //Al implementar el compateTo se debe elegir el atributo
                //que se usara para comparar.
                //Automovil auto = (Automovil) o;

                return this.modelo.compareTo(auto.modelo);
        }
}
