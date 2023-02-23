/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//ejemplo con 6~ perito contador
/**
 *
 * @author Sapón Pérez
 */
public class Contadores {
    
    public static void main(String[] args) throws IOException{ // metodo principal
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String str_costo_pieza,str_numero_pieza;
        double costo_pieza;
        int numero_pieza;
        double subtotal;
        double inversion;
        double banco;
        double credito;
        
        System.out.println("Hola bienvenido ;/ ");
        
        System.out.println("Ingrese cantidad refacciones a comprar");
        str_numero_pieza = entrada.readLine();
        
        System.out.println("Ingrese precio de las refacciones");
        str_costo_pieza = entrada.readLine();
        
        costo_pieza=Double.parseDouble(str_costo_pieza);
        numero_pieza=Integer.parseInt(str_numero_pieza);
        
        subtotal=costo_pieza*numero_pieza;
        
        if(subtotal>500000){
            inversion=subtotal*0.55;
            banco=subtotal*0.3;
            credito=subtotal-(banco+inversion);
            System.out.println("El monto invertido es:"+inversion);
            System.out.println("El monto solicitado al banco es:"+banco);
            System.out.println("Credito pedido a la empresa"+credito);
            System.out.println(inversion+banco+credito);
        }
        
        
        //
        
        
        
        
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str_costo_pieza,str_numero_pieza;
        double costo_pieza;
        
        int numero_pieza;
        
        System.out.println("Ingrese el costo por unidad de la pieza");
        str_costo_pieza=br.readLine();
        
        System.out.println("Ingrese la cantidad de piezas");
        str_numero_pieza=br.readLine();
        
        //pasamos de datos alfanumericos a enteros
        
        costo_pieza = Integer.parseInt(str_costo_pieza);
        numero_pieza= Integer.parseInt(str_numero_pieza);
        
        System.out.println("El numero de pieza es: "+numero_pieza);
        System.out.println("El costo por pieza es: "+costo_pieza);
        */
        
        
        
    }
    
    
    
}
