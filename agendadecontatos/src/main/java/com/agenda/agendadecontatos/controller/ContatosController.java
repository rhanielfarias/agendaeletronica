package com.agenda.agendadecontatos.controller;

import com.agenda.agendadecontatos.model.ContatosModel;
import com.agenda.agendadecontatos.service.ContatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.PrivateKey;
import java.util.List;
import java.util.Optional;

@RestController
public class ContatosController {
    @Autowired
    private ContatosService contatosService;
    @GetMapping(path = "/contatos")
    public List<ContatosModel> buscarContatos() {
        return contatosService.buscarContatos();
    }
    @GetMapping(path = "/produtos/{valorDoContato}")
    public Optional<ContatosModel> buscarId(@PathVariable Long valorDoContato) {
        return contatosService.buscarId(valorDoContato);
    }

    @PostMapping(path = "/contatos")
    @ResponseStatus(HttpStatus.CREATED)
    public  ContatosModel cadastrarContatos(@RequestBody ContatosModel contatosModel) {
        return contatosService.cadastrar(contatosModel);
    }

    @PutMapping(path = "/contatos/{valorDoContato}")
    public     ContatosModel atualizarContatos(@RequestBody ContatosModel contatos) {
return contatosService.atualizar(contatos);
        }

        @DeleteMapping(path = "/contatos/{valorDoContato}")
                public void deletarContatos(@PathVariable Long valorDoContato){
            contatosService.deletar(valorDoContato);
        }

        }

