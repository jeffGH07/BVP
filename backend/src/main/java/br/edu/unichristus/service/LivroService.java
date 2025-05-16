package br.edu.unichristus.service;

import br.edu.unichristus.domain.dto.LivroDTO;
import br.edu.unichristus.domain.model.Livro;
import br.edu.unichristus.exception.CommonsException;
import br.edu.unichristus.repository.LivroRepository;
import br.edu.unichristus.utils.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public LivroDTO save(LivroDTO livro){
        var livroEntity = MapperUtil.parseObject(livro, Livro.class);
        var savedLivro = repository.save(livroEntity);
        return MapperUtil.parseObject(savedLivro, LivroDTO.class);
    }

    public List<LivroDTO> findAll(){
        var listLivros = repository.findAll();
        return MapperUtil.parseListObjects(listLivros, LivroDTO.class);
    }

    public Livro findById(Long idLivro){
        var livroEntity = repository.findById(idLivro);
        if(livroEntity.isEmpty()){
            throw new CommonsException(HttpStatus.NOT_FOUND,
                    "unichristus.user.findbyid.notfound",
                    "Usuário não encontrado!");
        }

        return repository.findById(idLivro).get();
    }

    public void delete(Long idLivro){
        repository.deleteById(idLivro);
    }
}
