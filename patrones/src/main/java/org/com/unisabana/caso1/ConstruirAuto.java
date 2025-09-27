package org.com.unisabana.caso1;

import java.util.Objects;

class ConstruirAuto implements Constructor {
    private Automovil auto;

    @Override public void reinicio() { auto = new Automovil(); }

    @Override public void asignarSillas(int numero) {
        if (numero <= 0) throw new IllegalArgumentException("sillas debe ser > 0");
        auto.setSillas(numero);
    }

    @Override public void asignarMotor(Automovil.Motor motor) {
        auto.setMotor(Objects.requireNonNull(motor));
    }

    @Override public void asignarColor(Automovil.Color color) {
        auto.setColor(Objects.requireNonNull(color));
    }

    @Override public void asignarTipoLlantas(Automovil.Llantas llantas) {
        auto.setTipoLlantas(Objects.requireNonNull(llantas));
    }

    @Override public void asignarGPS(boolean tiene) { auto.setGps(tiene); }

    @Override public void asignarSonido(Automovil.Sonido paquete) {
        auto.setSonido(Objects.requireNonNull(paquete));
    }

    @Override public void asignarTechoSolar(boolean tiene) { auto.setTechoSolar(tiene); }

    @Override public void asignarNavegacion(boolean tiene) { auto.setNavegacion(tiene); }

    @Override public Automovil getResultado() { return auto; }
}