package org.com.unisabana.caso1;

class Automovil {

    enum Motor { M16, M20, M20T, V6, EV_75KWH }
    enum Color { BLANCO, NEGRO, ROJO, AZUL, GRIS }
    enum Llantas { R16, R17, R18, R19 }
    enum Sonido { BASICO, PREMIUM, SURROUND }

    private int sillas;
    private Motor motor;
    private Color color;
    private Llantas tipoLlantas;
    private boolean gps;
    private boolean navegacion;
    private boolean techoSolar;
    private Sonido sonido;

    void setSillas(int s) { this.sillas = s; }
    void setMotor(Motor m) { this.motor = m; }
    void setColor(Color c) { this.color = c; }
    void setTipoLlantas(Llantas l) { this.tipoLlantas = l; }
    void setGps(boolean v) { this.gps = v; }
    void setNavegacion(boolean v) { this.navegacion = v; }
    void setTechoSolar(boolean v) { this.techoSolar = v; }
    void setSonido(Sonido s) { this.sonido = s; }

    @Override
    public String toString() {
        return "Automovil{" +
                "sillas=" + sillas +
                ", motor=" + motor +
                ", color=" + color +
                ", tipoLlantas=" + tipoLlantas +
                ", gps=" + gps +
                ", navegacion=" + navegacion +
                ", techoSolar=" + techoSolar +
                ", sonido=" + sonido +
                '}';
    }
}