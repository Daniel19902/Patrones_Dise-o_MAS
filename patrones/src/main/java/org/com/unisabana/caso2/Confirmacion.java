package org.com.unisabana.caso2;


public class Confirmacion extends Notificacion {
    public Confirmacion(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("Confirmacion", mensaje);
    }
}
