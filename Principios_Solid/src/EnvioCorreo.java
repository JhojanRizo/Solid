/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia-PC
 */
public class EnvioCorreo implements Envio_Mensaje {

    @Override
    public void envioMensaje(Mensaje mensaje) {
        System.out.println("Destinatario: " + mensaje.getDestino());
        System.out.println("Asunto: " + mensaje.getAsunto());
        System.out.println("Mensaje: " + mensaje.getContenido());
        System.out.println("El mensaje ha sido enviado por correo");
    }

}
