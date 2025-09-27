package org.com.unisabana.caso3;

public class Main {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();

        Usuario Alex = new Usuario(chat, "Alex");
        Usuario Julian = new Usuario(chat, "Julian");
        Usuario Camilo = new Usuario(chat, "Camilo");

        chat.agregarUsuario(Alex);
        chat.agregarUsuario(Julian);
        chat.agregarUsuario(Camilo);

        Alex.enviar("Hola a todos");
        Julian.enviar("Hola Camilo");

    }
}
