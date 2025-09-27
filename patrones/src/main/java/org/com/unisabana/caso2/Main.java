package org.com.unisabana.caso2;

public class Main {
    public static void main(String[] args) {
            Notificacion n1 = new Mensaje(new PlataformaWeb());
            Notificacion n2 = new Alerta(new PlataformaMovil());
            Notificacion n3 = new Confirmacion(new PlataformaEscritorio());
            Notificacion n4 = new Advertencia(new PlataformaMovil());

            n1.enviar("Hola mundo");
            n2.enviar("Llamada entrante");
            n3.enviar("Archivo actualizado correctamente");
            n4.enviar("Sismo inminente");
    }
}