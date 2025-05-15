package br.edu.unichristus.service;

import br.edu.unichristus.domain.dto.CategoriaDTO;
import br.edu.unichristus.domain.model.Categoria;
import br.edu.unichristus.exception.CommonsException;
import br.edu.unichristus.repository.CategoriaRepository;
import br.edu.unichristus.utils.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public CategoriaDTO save(CategoriaDTO Categoria){
        var CategoriaEntity = MapperUtil.parseObject(Categoria, Categoria.class);
        var savedCategoria = repository.save(CategoriaEntity);
        return MapperUtil.parseObject(savedCategoria, CategoriaDTO.class);
    }

    public List<CategoriaDTO> findAll(){
        var listCategorias = repository.findAll();
        return MapperUtil.parseListObjects(listCategorias, CategoriaDTO.class);
    }

    public Categoria findById(Long categoriaId){
        var CategoriaEntity = repository.findById(categoriaId);
        if(CategoriaEntity.isEmpty()){
            throw new CommonsException(HttpStatus.NOT_FOUND,
                    "unichristus.user.findbyid.notfound",
                    "Categoria não encontrada!");
        }

        return repository.findById(categoriaId).get();
    }

    public void delete(Long categoriaId){
        repository.deleteById(categoriaId);
    }
}