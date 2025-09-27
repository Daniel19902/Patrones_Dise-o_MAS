package org.com.unisabana.caso3;
import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<Usuario> usuarios;

    public ChatRoom() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario remitente) {
        for (Usuario usuario : usuarios) {
            if (usuario != remitente) {
                usuario.recibir(mensaje);
            }
        }
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
