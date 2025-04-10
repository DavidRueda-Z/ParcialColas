public class ObjVenta {
    
    private String Nombreusuario;
    private double Total;
    
    public ObjVenta() {
    }

    

    public ObjVenta(String nombreusuario, double total) {
        Nombreusuario = nombreusuario;
        Total = total;
    }



    public String getNombreusuario() {
        return Nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        Nombreusuario = nombreusuario;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    
}
