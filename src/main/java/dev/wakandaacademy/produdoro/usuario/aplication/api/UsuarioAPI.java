package dev.wakandaacademy.produdoro.usuario.aplication.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/v1/usuario")
public interface UsuarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioCriadoResponse postNovoUsuario(@RequestBody @Valid UsuarioNovoRequest usuarioNovo);
}
