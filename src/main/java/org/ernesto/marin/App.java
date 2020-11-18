package org.ernesto.marin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{

    static Scanner Entrada_teclado = new Scanner(System.in);

    public static void main( String[] args )
    {
        Menu();
    }

    public static void Menu(){
        int menu = 0;

        do {

            System.out.println("************************************************************************");
            System.out.println("1.- Añadir una agenda                                                  *");
            System.out.println("2.- Ver Agendas                                                        *");
            System.out.println("3.- Editar Agenda                                                      *");
            System.out.println("4.- Eliminar Agenda                                                    *");
            System.out.println("5.- Salir                                                              *");
            System.out.println("************************************************************************");

            try {
                menu = Entrada_teclado.nextInt();

                switch (menu){
                    case 1:

                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        break;

                    default:
                        System.out.println("Vuelva a introducir una variable");
                        break;

                }

            }catch (InputMismatchException ime){

                System.out.println("¡Cuidado! Solo puedes insertar números. Intentalo de nuevo:");

                Entrada_teclado.next();

            }


        }while (menu!=5);

    }
}
