package org.ernesto.marin;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
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
                        System.out.println("Hasta la proximaaaaaaaa, piuuuuuum pown pown pown pown piiiiiuuum ");
                        menu = 5;
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

    public static void LeerFichero(){

        File file = new File("Concesionario.xml");

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("coche");

            for(int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("\nCoche id: " + eElement.getAttribute("id"));
                    System.out.println("Marca: "
                            + eElement.getElementsByTagName("marca").item(0).getTextContent());
                    System.out.println("Modelo: "
                            + eElement.getElementsByTagName("modelo").item(0).getTextContent());
                    System.out.println("Cilindrada: "
                            + eElement.getElementsByTagName("cilindrada").item(0).getTextContent());
                }
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
