package org.com.unisabana.caso2;

public class Alerta extends Notificacion {
    public Alerta(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("Alerta", mensaje);
    }
}