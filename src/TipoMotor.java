public enum TipoMotor {
        DISEL("Disel"),
        GASOLINA("Gasolina");

        public final String tipo;

        TipoMotor(String tipo) {
                this.tipo = tipo;
        }

        @Override
        public String toString() {
                return tipo;
        }
}
