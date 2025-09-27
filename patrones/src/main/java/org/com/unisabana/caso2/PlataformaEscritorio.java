package org.com.unisabana.caso2;

public class PlataformaEscritorio implements Plataforma {
    @Override
    public void mostrar(String titulo, String mensaje) {
        System.out.println(" [ESCRITORIO] " + titulo + ": " + mensaje);
    }
}
