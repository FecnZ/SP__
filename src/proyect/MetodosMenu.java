/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

import java.util.ArrayList;
import stand.Lecturas;

/**
 *
 * @author Inspiron 15
 */
public class MetodosMenu
{

    ArrayList<Grupos> arreglo = new ArrayList<>();
    ArrayList<ArrayList<DatosGnrales>> matriz = new ArrayList<>();

    public void registroGrupos()
    {

        int dia = Lecturas.nexEnter(true, "Dia de las sesiones:");
        String hora = Lecturas.nextSt(true, "Hora de las sesiones:");
        char tipo = Lecturas.nextChar(true, "Infantil o Adulto:");
        String clave = verificaClave();
        Grupos c = new Grupos(dia, hora, tipo, clave);
        arreglo.add(c);
        matriz.add(new ArrayList<>());

    }

    private String verificaClave()
    {
        boolean bandera = true;
        String clave;
        do
        {
            clave = Lecturas.nextSt(true, "Clave del grupo");
            boolean var = true;
            for (int i = 0; i < arreglo.size() && var; i++)
            {
                if (arreglo.get(i).getClave().equals(clave))
                {
                    System.out.println("Ya esta registrado");
                    var = false;
                } else
                {
                    bandera = false;
                }
            }
        } while (bandera);

        return clave;
    }

    private String verificaClvePersonas()
    {
        boolean bandera = true;
        String clve;
        do
        {
            clve = Lecturas.nextSt(true, "Coloque la clave del grupo a la que desea entrar");

            for (int i = 0; i < arreglo.size() && bandera; i++)
            {
                if (arreglo.get(i).getClave().equals(clve))
                {
                    System.out.println("Ya esta registrado");
                    bandera = false;

                }

            }
        } while (bandera);

        return clve;
    }

    public void registroPersonas()
    {
     String clav=verificaClvePersonas();
     String nombre=Lecturas.nextSt(true, "Coloque su nombre");
     String direccion=Lecturas.nextSt(true, "Coloque su direccion");
     String telefono=Lecturas.nextSt(true, "Coloque su telefono");
     String correo=Lecturas.nextSt(true, "Coloque su cooreo");
     char nivel=Lecturas.nextChar(true, "Coloque su nivel");

}

private boolean restringeEdad(int edad)
    {
        boolean var = false;
        if (edad >= 18)
        {
            var = true;
        }
        return var;
    }

    

}
