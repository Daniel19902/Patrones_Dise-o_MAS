package org.com.unisabana.caso1;

interface Constructor {
    void reinicio();
    void asignarSillas(int numero);
    void asignarMotor(Automovil.Motor motor);
    void asignarColor(Automovil.Color color);
    void asignarTipoLlantas(Automovil.Llantas llantas);
    void asignarGPS(boolean tiene);
    void asignarSonido(Automovil.Sonido paquete);
    void asignarTechoSolar(boolean tiene);
    void asignarNavegacion(boolean tiene);
    Automovil getResultado();
}