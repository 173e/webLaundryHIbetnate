package modelo;
// Generated 25/09/2017 10:56:56 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idusuario;
     private Roles roles;
     private Suscripcion suscripcion;
     private String dpi;
     private String nombre;
     private String apellido;
     private String nit;
     private String direccion;
     private String descripcionCasa;
     private String correo;
     private String usuario;
     private String clave;
     private String estado;
     private Set facturas = new HashSet(0);
     private Set sucursals = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(Roles roles, Suscripcion suscripcion, String dpi, String nombre, String apellido, String nit, String direccion, String descripcionCasa, String correo, String usuario, String clave, String estado) {
        this.roles = roles;
        this.suscripcion = suscripcion;
        this.dpi = dpi;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nit = nit;
        this.direccion = direccion;
        this.descripcionCasa = descripcionCasa;
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
    }
    public Usuario(Roles roles, Suscripcion suscripcion, String dpi, String nombre, String apellido, String nit, String direccion, String descripcionCasa, String correo, String usuario, String clave, String estado, Set facturas, Set sucursals) {
       this.roles = roles;
       this.suscripcion = suscripcion;
       this.dpi = dpi;
       this.nombre = nombre;
       this.apellido = apellido;
       this.nit = nit;
       this.direccion = direccion;
       this.descripcionCasa = descripcionCasa;
       this.correo = correo;
       this.usuario = usuario;
       this.clave = clave;
       this.estado = estado;
       this.facturas = facturas;
       this.sucursals = sucursals;
    }
   
    public Integer getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }
    public Suscripcion getSuscripcion() {
        return this.suscripcion;
    }
    
    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }
    public String getDpi() {
        return this.dpi;
    }
    
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNit() {
        return this.nit;
    }
    
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDescripcionCasa() {
        return this.descripcionCasa;
    }
    
    public void setDescripcionCasa(String descripcionCasa) {
        this.descripcionCasa = descripcionCasa;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }
    public Set getSucursals() {
        return this.sucursals;
    }
    
    public void setSucursals(Set sucursals) {
        this.sucursals = sucursals;
    }




}


