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
        char tipo = verificaTipoG();
        String clave = verificaClave();
        Grupos c = new Grupos(dia, hora, tipo, clave);
        arreglo.add(c);
        matriz.add(new ArrayList<>());

    }

    private char verificaTipoG()
    {
        char tipo;
        boolean bandera = true;
        do
        {
            System.out.println("a)Adultos");
            System.out.println("i)infante");
            tipo = Lecturas.nextChar("Que tipo de grupo va a ser");
            if (tipo == 'a' || tipo == 'i')
            {
                bandera = false;
            } else
            {
                System.out.println("Tipo de dato incorrecto");
            }
        } while (bandera);
        return tipo;

    }

    private char verificaTipoP()
    {
        char tipo;
        boolean bandera = true;
        do
        {
            System.out.println("b)basico");
            System.out.println("i)intermedio");
            System.out.println("a)avanzado");
            tipo = Lecturas.nextChar("Que nivel:");
            if (tipo == 'a' || tipo == 'i' || tipo == 'b')
            {
                bandera = false;
            } else
            {
                System.out.println("Tipo de dato incorrecto");
            }
        } while (bandera);
        return tipo;

    }

    private String verificaClave()
    {
        boolean bandera;
        String clave;
        do
        {
            bandera = false;
            clave = Lecturas.nextSt(true, "clave:");
            for (int i = 0; i < arreglo.size(); i++)
            {
                if (arreglo.get(i).getClave().equals(clave))
                {
                    bandera = true;
                    System.out.println("ya registrada escoga otra");
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

    private int encuentraPosClave(String clave)
    {

        for (int i = 0; i < arreglo.size(); i++)
        {
            if (arreglo.get(i).getClave().equals(clave))
            {

                return i;
            }
        }

        return 0;
    }


    private char EncuentraTipoGrupo(String clv)
    {

        for (int i = 0; i < arreglo.size(); i++)
        {
            if (arreglo.get(i).getClave().equals(clv))
            {
                return arreglo.get(i).getTipo();

            }

        }

        return ' ';
    }

    public void inserta()
    {

        char instancia;
        do
        {
            instancia = Lecturas.nextChar("Seleccione  i)interno   e)externo");
            if (instancia == 'i')
            {
                registroPersonasI();
            } else if (instancia == 'e')
            {
                registroPersonasE();
            }

        } while (instancia != 'i' || instancia != 'e');

    }

    private void registroPersonasI()
    {
        String clav = verificaClvePersonas();
        String nombre = Lecturas.nextSt(true, "Coloque su nombre");
        String direccion = Lecturas.nextSt(true, "Coloque su direccion");
        String telefono = Lecturas.nextSt(true, "Coloque su telefono");
        String correo = Lecturas.nextSt(true, "Coloque su cooreo");
        char nivel = verificaTipoP();
        String numControl = Lecturas.nextSt("Coloque su numero de control");
        int semestre = Lecturas.nexEnter();
        DatosGnrales c = new Internos(numControl, semestre, nombre, direccion, telefono, correo, nivel, clav);
        matriz.get(encuentraPosClave(clav)).add(c);

    }

    private void registroPersonasE()
    {
        String clav = verificaClvePersonas();
        String nombre = Lecturas.nextSt(true, "Coloque su nombre");
        String direccion = Lecturas.nextSt(true, "Coloque su direccion");
        String telefono = Lecturas.nextSt(true, "Coloque su telefono");
        String correo = Lecturas.nextSt(true, "Coloque su correo");
        char nivel = verificaTipoP();
        int edad = Lecturas.nexEnter(true, "Coloque su edad");
        boolean x = verificaEdadE(edad, clav);
        if (x)
        {
            String folio="00000";
            DatosGnrales c = new Externos(folio, edad, nombre, direccion, telefono, correo, nivel, clav);
            matriz.get(encuentraPosClave(clav)).add(c);

        } else
        {
            System.out.println("datos incorrectos no coincide la edad con el tipo");
        }

    }

    private boolean verificaEdadE(int edad, String clave)
    {
        boolean var = false;
        char c = EncuentraTipoGrupo(clave);
        char d;
        if (edad > 18)
        {
            d = 'a';
        } else
        {
            d = 'i';
        }
        if (d == c)
        {
            var = true;
        }
        return var;
    }

}
