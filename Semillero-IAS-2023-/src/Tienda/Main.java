package Tienda;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[4];
        String[] opciones = {"1. Añadir nuevo cliente", "2. Borrar cliente", "3. Buscar cliente", "4. Mostrar los clientes", "5. Salir"};

        Scanner opcionUsuario = new Scanner(System.in);
        int option;
        int count = 0;


        while (true) {
            verMenu(opciones);
            option = opcionUsuario.nextInt();
            switch (option) {
                case 1:
                    Cliente clienteNuevo = new Cliente();

                    System.out.println("Ingrese nombre: ");
                    String name = opcionUsuario.next();
                    if(!name.equals(null) && name.matches("^[a-zA-Z]*$")){
                        clienteNuevo.setNombre(name);
                    }else {
                        System.out.println("No es un posible usar el valor");
                        System.out.println("");
                        break;
                    }

                    System.out.println("Ingrese cédula: ");
                    String id = opcionUsuario.next();
                    if(Objects.nonNull(id) && id.matches("[+-]?[0-9]+")){
                        clienteNuevo.setCedula(Integer.parseInt(id));
                    }else {
                        System.out.println("No es un posible usar el valor");
                        System.out.println("");
                        break;
                    }

                    clientes[count] = clienteNuevo;
                    count = count + 1;
                    break;
                case 2:
                    System.out.println("Ingrese la posicion a borrar: ");
                    int position = opcionUsuario.nextInt();
                    if(clientes[position + 1] != null){
                        clientes[position] = clientes[position + 1];
                        clientes[position + 1] = null;
                    }else{
                        clientes[position] = null;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cedula a buscar: ");
                    int cedula = opcionUsuario.nextInt();
                    try {
                        for (int i = 0; i < clientes.length; i++) {
                            if (clientes[i].getCedula() == cedula) {
                                System.out.println("Cliente numero " + i + ": El cliente se llama " + clientes[i].getNombre() + " y su cedula es " + clientes[i].getCedula());
                            }
                        }
                    }catch (Exception e){

                    }
                    break;
                case 4:
                    try {
                        for (int i = 0; i < clientes.length; i++) {
                            System.out.println("::::::: "+i+": El cliente se llama " + clientes[i].getNombre() + " y su cedula es " + clientes[i].getCedula() + "::::::");
                        }
                    } catch (Exception e) {

                    }

                    break;
                case 5:
                    System.exit(0);


            }
        }
    }

    public static void verMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Escribe una de las opciones");
        System.out.println(" ");
    }

}
