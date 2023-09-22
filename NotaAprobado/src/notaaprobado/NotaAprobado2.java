/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaaprobado;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class NotaAprobado2
{

    public  void ejerc()
    {
        // TODO code application logic here
        int nota;
        Scanner entrada =new Scanner(System.in);
        System.out.println("Introduzca la nota a analizar");
        nota =entrada.nextInt();
        if (nota>5)
        {
            System.out.println("Prueba superada");
        }
    }
    public static void main(String args) {

    NotaAprobado2  nota = new NotaAprobado2();
        nota.ejerc();
        }
}    
    
  