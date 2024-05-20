/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

/**
 *
 * @author Inspiron 15
 */
public class Externos extends DatosGnrales {

    private int consecutivo;
    private String folio;
    private int edad;

    public Externos() {
        super();
        precio();
    }

    public Externos(String folio, int edad, String nombre, String direccion, String telefono, String correo, char nivel, String claveGrupo) {
        super(nombre, direccion, telefono, correo, nivel, claveGrupo);
        this.folio = folio;
        this.edad = edad;
        precio();
    }

    public String getFolio() {
        return folio;
    }

    public int getEdad() {
        return edad;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void precio() {

    }

}
