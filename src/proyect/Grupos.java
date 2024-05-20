/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

/**
 *
 * @author Inspiron 15
 */
public class Grupos
{
    private int dia;
    private String hora;
    private char tipo;
    private String clave;

    public Grupos()
    {
    }

    public Grupos(int dia, String hora, char tipo, String clave)
    {
        this.dia = dia;
        this.hora = hora;
        this.tipo = tipo;
        this.clave = clave;
    }

    public int getDia()
    {
        return dia;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public String getHora()
    {
        return hora;
    }

    public void setHora(String hora)
    {
        this.hora = hora;
    }

    public char getTipo()
    {
        return tipo;
    }

    public void setTipo(char tipo)
    {
        this.tipo = tipo;
    }

    public String getClave()
    {
        return clave;
    }

    public void setClave(String clave)
    {
        this.clave = clave;
    }
    
}
