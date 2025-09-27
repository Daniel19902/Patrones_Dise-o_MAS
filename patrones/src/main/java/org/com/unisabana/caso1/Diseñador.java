package org.com.unisabana.caso1;

class Diseñador{

    public void autoDeportivo(Constructor b) {
        b.reinicio();
        b.asignarSillas(2);
        b.asignarMotor(Automovil.Motor.M20T);
        b.asignarColor(Automovil.Color.ROJO);
        b.asignarTipoLlantas(Automovil.Llantas.R19);
        b.asignarSonido(Automovil.Sonido.SURROUND);
        b.asignarTechoSolar(true);
        b.asignarGPS(true);
        b.asignarNavegacion(true);
    }

    public void autoSedan(Constructor b) {
        b.reinicio();
        b.asignarSillas(5);
        b.asignarMotor(Automovil.Motor.M20);
        b.asignarColor(Automovil.Color.NEGRO);
        b.asignarTipoLlantas(Automovil.Llantas.R17);
        b.asignarSonido(Automovil.Sonido.PREMIUM);
        b.asignarTechoSolar(false);
        b.asignarGPS(true);
        b.asignarNavegacion(true);
    }

    public void autoSUV(Constructor b) {
        b.reinicio();
        b.asignarSillas(7);
        b.asignarMotor(Automovil.Motor.V6);
        b.asignarColor(Automovil.Color.AZUL);
        b.asignarTipoLlantas(Automovil.Llantas.R18);
        b.asignarSonido(Automovil.Sonido.PREMIUM);
        b.asignarTechoSolar(false);
        b.asignarGPS(true);
        b.asignarNavegacion(true);
    }

}