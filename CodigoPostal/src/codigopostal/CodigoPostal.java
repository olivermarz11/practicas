
package codigopostal;
import java.util.Scanner;
public class CodigoPostal
{
        public void ejemplo () {
        // TODO code application logic here
        Scanner stdIn =new Scanner(System.in);
        String cp;
        System.out.println("introduzca codigo portal: ");
        cp = stdIn.nextLine();
        switch (cp.charAt(0))
        {
            case 1:
                System.out.println(cp+"esta en la zona sur");
                break;
            case 2:
                System.out.println(cp+"esta en la zona norte");
                break;
            case 3:
                System.out.println(cp+"esta en la zona este");
                break;
            case 4:
                System.out.println(cp+"esta en la zona oeste");
                break;
            case 5:
                System.out.println(cp+"esta en la zona noroeste");
                break;
            case 6:
                System.out.println(cp+"esta en la zona plano central");
                break;
            case 7:
                System.out.println(cp+"esta en la zona central");
                break;        
            default:
                System.out.println("opcion incorrecta");
        }
    }
    public static void main (String[]args)
    {
        CodigoPostal cp = new CodigoPostal();
        cp.ejemplo();
    }
    
}
