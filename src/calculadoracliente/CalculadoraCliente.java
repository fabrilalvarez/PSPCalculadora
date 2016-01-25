package calculadoracliente;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author fabrilalvarez
 */
public class CalculadoraCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Creando socket cliente");
        Socket socket = new Socket();
        InetSocketAddress addr = new InetSocketAddress("LocalHost", 5555);
        Ventana ventana = new Ventana(socket, addr);
        ventana.setVisible(true);
        if (ventana.isVisible() == false) {
            try {
                socket.close();
                System.out.println("Cerrando el socket cliente");
            } catch (IOException ex) {
            }
        }
    }

}
