import java.io.*;
import java.net.*;

class ClientTCP{
    public static void main(String[] args) throws Exception {
        BufferedReader lectureLocale     = new BufferedReader(new InputStreamReader(System.in));
        Socket socketCliente             = new Socket("192.168.1.7",9876);
        DataOutputStream emissionserveur = new DataOutputStream(socketCliente.getOutputStream());
        BufferedReader receptionserveur  = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
        
	String Phrase= lectureLocale.readLine();
        emissionserveur.writeBytes(Phrase+'\n');
        String reponse= receptionserveur.readLine();
	System.out.println("Maya t'es la meilleure, et voici ce que tu t'es envoyée: \n");
        System.out.println("from server: " + reponse);

    }
}
