package dev.wakandaacademy.produdoro.usuario.aplication.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class UsuarioController implements UsuarioAPI{

    @Override
    public UsuarioCriadoResponse postNovoUsuario(UsuarioNovoRequest usuarioNovo) {
        log.info("[start] UsuarioController - postNovoUsuario");
        return null;
    }
}
