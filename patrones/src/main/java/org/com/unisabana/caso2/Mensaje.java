package org.com.unisabana.caso2;

public class Mensaje extends Notificacion {
    public Mensaje(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("Mensaje", mensaje);
    }
}
