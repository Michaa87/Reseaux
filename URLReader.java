import java.net.*;
import java.io.*;

public class URLReader {

    public static void main(String[] args) throws Exception {

        URL oulal = new URL("http://www.depinfonancy.net"); // il n'y a rien dedans, il faut prendre une autre page web (loria par exemple)
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oulal.openStream()));

        String inputLine;
        
	while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
	in.close();
    }

}
