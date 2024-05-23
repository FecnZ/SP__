/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

import stand.Lecturas;

/**
 *
 * @author Biblioteca
 */
public class PrbMenu
{

    public static void main(String[] args)
    {
        MetodosMenu obj=new MetodosMenu();
        int opc;
        do
        {
            System.out.println("\n1.-REGISTRAR GRUPO");
            System.out.println("2.-INSCRIBIRSE A GRUPO");
            System.out.println("3.-MODIFICA PRECIO");
            System.out.println("4.-CONSULTA DE GRUPOS");
//            System.out.println("5.-CONSULTA POR NUMERO DE AUTOBUS");
//            System.out.println("6.-CAMBIARASIENTO");
//            System.out.println("7.-CAMBIARASIENTOBUS");
//            System.out.println("8.-CONSULTA NUM DE PASAJERO");
            System.out.println("9.-SALIR");
            opc = Lecturas.nexEnter(true, "\t\tElige una opcion");

            switch (opc)
            {
                case 1:
                  obj.registroGrupos();
                    break;
                case 2:
                   obj.inserta();
                    break;
                case 3:
                 
                    break;
                case 4:
                  
                    break;
                case 5:
                  
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;

            }
        } while (opc!=9);

    }

}
