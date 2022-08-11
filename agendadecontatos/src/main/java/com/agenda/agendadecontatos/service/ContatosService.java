package com.agenda.agendadecontatos.service;

import com.agenda.agendadecontatos.model.ContatosModel;
import com.agenda.agendadecontatos.repository.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatosService {
    @Autowired
    private ContatosRepository contatosRepository;

    public List<ContatosModel> buscarContatos() {
        return  contatosRepository.findAll();
    }

    public Optional<ContatosModel> buscarId(Long valorDoContato){
        return  contatosRepository.findById(valorDoContato);
    }

    public  ContatosModel cadastrar(ContatosModel contatosModel) {
        contatosModel.getValorDoContato();
        contatosModel.getNome();
        contatosModel.getNumeroDotelefone();
                return contatosRepository.save(contatosModel);
    }

public  ContatosModel atualizar(ContatosModel contatos){
        contatos.getValorDoContato();
                contatos.getNome();
                contatos.getNumeroDotelefone();
                return  contatosRepository.save(contatos);
}

public  void  deletar( Long valordocontato){
        contatosRepository.deleteById(valordocontato);
}
}
