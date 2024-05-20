/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

/**
 *
 * @author Inspiron 15
 */
public class Internos extends DatosGnrales
{

    private String numControl;
    private int semestre;

    public Internos()
    {
        super();
        precio();
    }

    public Internos(String numControl, int semestre, String nombre, String direccion, String telefono, String correo, char nivel, String claveGrupo)
    {
        super(nombre, direccion, telefono, correo, nivel, claveGrupo);
        this.numControl = numControl;
        this.semestre = semestre;
        precio();
    }

    public String getNumControl()
    {
        return numControl;
    }

    public void setNumControl(String numControl)
    {
        this.numControl = numControl;
    }

    public int getSemestre()
    {
        return semestre;
    }

    public void setSemestre(int semestre)
    {
        this.semestre = semestre;
    }

    @Override
    public void precio()
    {
        setPrecio((getPrecio() - 600));
    }
}
