package org.com.unisabana.caso2;

public class Advertencia extends Notificacion {
    public Advertencia(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("Advertencia", mensaje);
    }
}
