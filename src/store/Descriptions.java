
package store;

public class Descriptions {

    private String nombreProducto; 
    private String tipoProducto;
    private String peso;
    private String tamaño;
    private String color;
    private double precio;

    private Descriptions(Builder builder) {
        this.nombreProducto = builder.nombreProducto;
        this.tipoProducto = builder.tipoProducto;
        this.peso = builder.peso;
        this.tamaño = builder.tamaño;
        this.color = builder.color;
        this.precio = builder.precio;
    }

    public static class Builder {
        private String nombreProducto; 
        private String tipoProducto;
        private String peso;
        private String tamaño;
        private String color;
        private double precio;

        public Builder setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;
            return this;
        }

        public Builder setTipoProducto(String tipoProducto) {
            this.tipoProducto = tipoProducto;
            return this;
        }

        public Builder setPeso(String peso) {
            this.peso = peso;
            return this;
        }

        public Builder setTamaño(String tamaño) {
            this.tamaño = tamaño;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }
        
         public Builder setPrecio(double precio) {
            this.precio = precio;
            return this;
        }

        public Descriptions build() {
            return new Descriptions(this);
        }
    }

    // Getters para acceder a los atributos
    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public String getPeso() {
        return peso;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getColor() {
        return color;
    }
    
    public double getPrecio(){
        return precio;
    }

    // Método para crear una instancia de Descriptions
    public static Descriptions PrimerProducto() {
        return new Builder()
            .setNombreProducto("Aceite Vegetal")
            .setTipoProducto("Aceites")
            .setPeso("220 gramos") //Gramos
            .setTamaño("Mediano")
            .setColor("Amarillo")
            .setPrecio(8.70) //Soles
            .build();
    }
    
    // Método para crear una instancia de Descriptions
    public static Descriptions SegundoProducto() {
        return new Builder()
            .setNombreProducto("Leche en caja")
            .setTipoProducto("Bebida")
            .setPeso("1 litro") //Litros
            .setTamaño("Mediano")
            .setColor("Blanco")
            .setPrecio(6.00)
            .build();
    }
    
    // Método para crear una instancia de Descriptions
    public static Descriptions TercerProducto() {
        return new Builder()
            .setNombreProducto("Atún en lata")
            .setTipoProducto("Enlatado")
            .setPeso("215 gramos") //Gramos
            .setTamaño("Pequeño")
            .setColor("Azul")
            .setPrecio(5.50)
            .build();
    }
    // Método para crear una instancia de Descriptions
    public static Descriptions CuartoProducto() {
        return new Builder()
            .setNombreProducto("Coca Cola")
            .setTipoProducto("Bebida")
            .setPeso("30.5 gramos") //Gramos
            .setTamaño("Mediano")
            .setColor("Rojo")
            .setPrecio(5.20)
            .build();
    }   
}

