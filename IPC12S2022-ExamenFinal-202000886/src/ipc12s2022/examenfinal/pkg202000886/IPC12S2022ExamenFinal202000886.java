/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc12s2022.examenfinal.pkg202000886;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author josé
 */
public class IPC12S2022ExamenFinal202000886 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
            Scanner sn  = new Scanner(System.in);
            int opc=0;
            //S de clara una variable tipo boleana para saber cuando salir 
            boolean sal=false;        
            //se utiliza do para iniciar el ciclo que contrute el menu
            do {      
            //indicador
            System.out.print("-------MENU-------"+"\n");
            System.out.print("1. Ejercicio 1"+"\n");
            System.out.print("2. Ejercicio 2"+"\n");
            System.out.print("3. Ejercicio 3"+"\n");
            System.out.print("4. SALIR"+"\n");
            System.out.print("------------------"+"\n");
            System.out.println("Ingrese una opción:");
            System.out.print("------------------"+"\n");
            //lee opcion del usuario    
            opc= sn.nextInt();
            System.out.print("------------------"+"\n");
            //inicio del ciclo switch para escoger opciones 
            switch(opc){
                case 1:
                    int num1, num2;
                    System.out.println("Ingrese el primer número");
                    num1=sn.nextInt();
                    System.out.println("Ingrese el segundo número");
                    num2=sn.nextInt();
                    System.out.print("\n"+"*****************************************"+"\n");    
                    System.out.println("El mayor de los dos números es " + Math.max(num1, num2));
                    System.out.print("\n"+"*****************************************"+"\n");    
                    break;
                case 2:
                    
                    
                    System.out.print("Introduce el numero: ");
                    int numero = sn.nextInt();
                    if(numero %2 == 0){
                        System.out.print("\n"+"*****************************************"+"\n");   
                        System.out.println("El numero no es impar");
                        System.out.print("\n"+"*****************************************"+"\n");   
                    }
                    else 
                    {
                        System.out.println();
                        for(int i = 1; i<=Math.ceil((float)numero/2); i++){
                    //Espacios en blanco
                            for(int j = 1; j<=numero-i; j++){
                                System.out.print(" ");
                    }
                    //Asteriscos
                    for(int asteriscos=1; asteriscos<=(i*2)-1; asteriscos++){
                        System.out.print("*");
                           
                    }
                    System.out.println();
                    
            }
                      
        }
                    break;
                case 3: 
                    double pesoVacas[] = {155,200,243,200, 223,300,100,150};
                    double lecheVacas[] = {50,45,34,31,30,29,28,1};
                     int K=4;
                     double total =0;
                     double totLeche=0;

                    for (int i = 0; i < K; i++) {
                    total+= pesoVacas[i];
                    totLeche+= lecheVacas[i];
                    }
                    System.out.print("\n"+"*****************************************"+"\n"); 
                    System.out.println("PARA LAS 8 VACAS");
                    System.out.print("\n"+"*****************************************"+"\n"); 
                    System.out.println("EL PESO DE LAS VACAS ES:"+total);
                    System.out.println("LA MAYOR PRODUCCION DE LECHE ES:"+totLeche+"LITROS");
                    System.out.print("\n"+"*****************************************"+"\n"); 
                    break;
                case 4:
                    System.out.println("USTED SALIO DEL PROGRAMA");
                    System.exit(0);
                    break;
                default:
                    sal=true;
                    break;
            }
            
            }while(opc<=opc);
            
}  
}
    
