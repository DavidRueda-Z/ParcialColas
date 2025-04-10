public class ObjArticulo {
    
    private String Referencia;
    private String Marca;
    private int Cantidad;
    private double Precio;
    private String NombreUsu;
    private String CedulaUsu;

    
    public ObjArticulo() {
    }

    

    public ObjArticulo(String referencia, String marca, int cantidad, double precio, String nombreUsu,
            String cedulaUsu) {
        Referencia = referencia;
        Marca = marca;
        Cantidad = cantidad;
        Precio = precio;
        NombreUsu = nombreUsu;
        CedulaUsu = cedulaUsu;
    }



    public String getReferencia() {
        return Referencia;
    }


    public void setReferencia(String referencia) {
        Referencia = referencia;
    }


    public String getMarca() {
        return Marca;
    }


    public void setMarca(String marca) {
        Marca = marca;
    }


    public int getCantidad() {
        return Cantidad;
    }


    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }


    public double getPrecio() {
        return Precio;
    }


    public void setPrecio(double precio) {
        Precio = precio;
    }


    public String getNombreUsu() {
        return NombreUsu;
    }


    public void setNombreUsu(String nombreUsu) {
        NombreUsu = nombreUsu;
    }


    public String getCedulaUsu() {
        return CedulaUsu;
    }


    public void setCedulaUsu(String cedulaUsu) {
        CedulaUsu = cedulaUsu;
    }

    
}
