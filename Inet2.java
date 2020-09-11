// pour avoir l'adresse d'un siteweb

import java.net.InetAddress;
import java.net.UnknownHostException;


public class Inet2 {

   public static void main(String[] args) {
      try {
         //Nous appelons une méthode statique de cet objet pour en récupérer une instance 
         InetAddress address = InetAddress.getByName("openclassrooms.com");
         System.out.println("L'adresse IP de " + address.getHostName() + " est : " + address.getHostAddress());
         
         
         //Certains sites Internet peuvent avoir plusieurs adresses IP
         //C'est le cas de Google
         InetAddress[] addresses = InetAddress.getAllByName("depinfonancy.net");
         System.out.println("\nToutes les adresses IP de depinfonancy.net : ");
         for(InetAddress ad : addresses)
              System.out.println(" - " + ad.getHostAddress());
         
         addresses = InetAddress.getAllByName("depinfonancy.net");
         System.out.println("\nToutes les adresses IP de depinfonancy.net : ");
         for(InetAddress ad : addresses)
              System.out.println(" - " + ad.getHostAddress());
         
      } catch (UnknownHostException e) {
         e.printStackTrace();
      }
   }
}
