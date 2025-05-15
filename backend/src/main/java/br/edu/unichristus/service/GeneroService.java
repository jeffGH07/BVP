package br.edu.unichristus.service;

import br.edu.unichristus.domain.dto.GeneroDTO;
import br.edu.unichristus.domain.model.Genero;
import br.edu.unichristus.exception.CommonsException;
import br.edu.unichristus.repository.GeneroRepository;
import br.edu.unichristus.utils.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository repository;

    public GeneroDTO save(GeneroDTO genero){
        var generoEntity = MapperUtil.parseObject(genero, Genero.class);
        var savedGenero = repository.save(generoEntity);
        return MapperUtil.parseObject(savedGenero, GeneroDTO.class);
    }

    public List<GeneroDTO> findAll(){
        var listGeneros = repository.findAll();
        return MapperUtil.parseListObjects(listGeneros, GeneroDTO.class);
    }

    public Genero findById(Long generoId){
        var generoEntity = repository.findById(generoId);
        if(generoEntity.isEmpty()){
            throw new CommonsException(HttpStatus.NOT_FOUND,
                    "unichristus.user.findbyid.notfound",
                    "Gênero não encontrado!");
        }

        return repository.findById(generoId).get();
    }

    public void delete(Long generoId){
        repository.deleteById(generoId);
    }
}