public class Automovil {

        String fabricante;
        String modelo;
        String color = "Rojo";
        double cilindrada;

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

}
