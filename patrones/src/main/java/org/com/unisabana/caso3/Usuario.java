package org.com.unisabana.caso3;

class Usuario {
    private ChatMediator mediator;
    private String nombre;

    public Usuario(ChatMediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public void enviar(String mensaje) {
        System.out.println(nombre + " envIa: " + mensaje);
        mediator.enviarMensaje(mensaje, this);
    }

    public void recibir(String mensaje) {
        System.out.println(nombre + " recibe: " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }
}