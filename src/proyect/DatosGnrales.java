/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

/**
 *
 * @author Inspiron 15
 */
public abstract class DatosGnrales
{

    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private char nivel;
    private String claveGrupo;
    private double precio = 950;

    public DatosGnrales(String nombre, String direccion, String telefono, String correo, char nivel, String claveGrupo)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.nivel = nivel;
        this.claveGrupo = claveGrupo;
       

    }

    public DatosGnrales()
    {
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public String getCorreo()
    {
        return correo;
    }

    public char getNivel()
    {
        return nivel;
    }

    public String getClaveGrupo()
    {
        return claveGrupo;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    public void setNivel(char nivel)
    {
        this.nivel = nivel;
    }

    public void setClaveGrupo(String claveGrupo)
    {
        this.claveGrupo = claveGrupo;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public abstract void precio();
    
    

}
