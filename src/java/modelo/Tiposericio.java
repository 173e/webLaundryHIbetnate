package modelo;
// Generated 25/09/2017 10:56:56 PM by Hibernate Tools 4.3.1



/**
 * Tiposericio generated by hbm2java
 */
public class Tiposericio  implements java.io.Serializable {


     private Integer idsericio;
     private Sucursal sucursal;
     private String nombre;

    public Tiposericio() {
    }

    public Tiposericio(Sucursal sucursal, String nombre) {
       this.sucursal = sucursal;
       this.nombre = nombre;
    }
   
    public Integer getIdsericio() {
        return this.idsericio;
    }
    
    public void setIdsericio(Integer idsericio) {
        this.idsericio = idsericio;
    }
    public Sucursal getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


