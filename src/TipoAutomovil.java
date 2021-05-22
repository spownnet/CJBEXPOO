public enum TipoAutomovil {
        SEDAN("Sedan",4,"Auto Normal"),
        STATION_WAGON("Station Wagon",5,"Auto grande"),
        HATCHBACK("Hatchback",5,"Auto Compacto"),
        PICKUP("Pickup",4,"Camioneta"),
        COUPE("Coupe",2,"Auto Pequeño"),
        CONVERTIBLE("Convertible",2,"Auto deportivo"),
        FURGON("Furgon",4,"Auto Utilitario");

        public final String nombre;
        public final int numeroPuertas;
        public final String descripcion;

        TipoAutomovil(String nombre, int numeroPuertas, String descripcion) {
                this.nombre = nombre;
                this.numeroPuertas = numeroPuertas;
                this.descripcion = descripcion;
        }

        public String getNombre() {
                return nombre;
        }

        public int getNumeroPuertas() {
                return numeroPuertas;
        }

        public String getDescripcion() {
                return descripcion;
        }

        @Override
        public String toString() {
                return "TipoAutomovil{" +
                        "nombre='" + nombre + '\'' +
                        ", numeroPuertas=" + numeroPuertas +
                        ", descripcion='" + descripcion + '\'' +
                        '}';
        }
}
