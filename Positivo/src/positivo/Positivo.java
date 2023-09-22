/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivo;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Positivo{

    public void ejem(){
        float numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero real");
        numero = entrada.nextFloat();
        if (numero>0)
        {
            System.out.println(numero+"es mayor a cero");
        }
    }
    
    public static void main(String[] args)
    {
        Positivo m = new Positivo();
        m.ejem();
    }
    
}  
    
    
    
