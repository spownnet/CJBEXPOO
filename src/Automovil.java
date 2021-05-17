public class Automovil {

      //Seccion de declaraciones de variables
      private String fabricante;
      private String modelo;
      private String color = "Rojo";
      private double cilindrada;
      private int capacidadtanque = 40;

      //Seccion de definicion de constructores
        public Automovil(){
        }

        public Automovil(String fabricante, String modelo) {
                this.fabricante = fabricante;
                this.modelo = modelo;
        }

        public Automovil(String fabricante, String modelo, String color) {
                this(fabricante,modelo);
                this.color = color;
        }

        public Automovil(String fabricante, String modelo, String color, double cilindrada){
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
        }

        public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadtanque) {
                this(fabricante,modelo,color,cilindrada);
                this.capacidadtanque = capacidadtanque;
        }

//Seccion de definiciones de metodos get/set de atributos de la clase
public String getFabricante(){ return this.fabricante; }
public String getModelo(){ return this.modelo; }
public String getColor(){ return this.color;}
public double getCilindrada(){return this.cilindrada;}
public int getCapacidadTanque(){return this.capacidadtanque;}

public void setFabricante(String fabricante){this.fabricante=fabricante;}
public void setModelo(String modelo){this.modelo=modelo;}
public void setColor(String color){this.color=color;}
public void setCilindrada(double cilindrada){this.cilindrada=cilindrada;}
public void setCapacidadtanque(int capacidadtanque){this.capacidadtanque=capacidadtanque;}

//Seccion de definicion de metodos
public String detalle(){

        return "Fabricante: " + this.fabricante +
                "\nColor: " + this.color +
                "\nModelo: " + this.modelo +
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
                        "fabricante='" + fabricante + '\'' +
                        ", modelo='" + modelo + '\'' +
                        ", color='" + color + '\'' +
                        ", cilindrada=" + cilindrada +
                        ", capacidadtanque=" + capacidadtanque +
                        '}';
        }
}
