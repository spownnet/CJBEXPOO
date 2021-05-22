public enum Color {
        ROJO("Rojo"),
        BLANCO("Blanco"),
        AZUL ("Azul"),
        AMARILLO ("Amarillo"),
        GRIS ("Gris Oscuro"),
        VERDE ("Verde"),
        NEGRO ("Negro"),
        NARANJA ("Naranja");

        //definicion de propiedad en enumeradores
        private final String color;

        //Constructor en enumeradores
        Color(String color) {
                this.color = color;
        }

        //Definicion de ge/set method
        public String getColor() {
                return color;
        }

        //Sobre escribir el metodo toString en enumeradores
        @Override
        public String toString() {
                return this.color;
        }
}
