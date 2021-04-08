
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Familia-PC
 */
public class Mensajero {

    EnvioChat envChat = new EnvioChat();
    EnvioCorreo envCorreo = new EnvioCorreo();
    EnvioSMS envSMS = new EnvioSMS();

    public void enviarMensaje() {

        int opcion = 0;
        int salir = 1;
        Mensaje mensaje = new Mensaje();

        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Ingrese los datos ");
            System.out.println("Destinatario: ");
            mensaje.setDestino(s.nextLine());
            System.out.println("Asunto: ");
            mensaje.setAsunto(s.nextLine());
            System.out.println("Mensaje: ");
            mensaje.setContenido(s.nextLine());
            System.out.println("........................");
            System.out.println("¿En que modo desea enviar el mensaje?\n"
                    + "SMS --> 1\n"
                    + "Correo --> 2\n"
                    + "Chat --> 3");
            opcion = s.nextInt();
            System.out.println("---------Mensaje enviado---------");
            if (opcion == 1) {
                envSMS.envioMensaje(mensaje);
            } else if (opcion == 2) {
                envCorreo.envioMensaje(mensaje);
            } else if (opcion == 3) {
                envChat.envioMensaje(mensaje);
            }

            System.out.println(".......................");
            System.out.println("¿Desea enviar otro mensaje?\n"
                    + "Si --> 1\n"
                    + "No --> 0");
            salir = s.nextInt();
        } while (salir == 1);

    }
}
