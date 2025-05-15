package br.edu.unichristus.service;

import br.edu.unichristus.domain.dto.EmprestimoDTO;
import br.edu.unichristus.domain.model.Emprestimo;
import br.edu.unichristus.exception.CommonsException;
import br.edu.unichristus.repository.EmprestimoRepository;
import br.edu.unichristus.utils.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository repository;

    public EmprestimoDTO save(EmprestimoDTO emprestimo){
        var emprestimoEntity = MapperUtil.parseObject(emprestimo, Emprestimo.class);
        var savedEmprestimo = repository.save(emprestimoEntity);
        return MapperUtil.parseObject(savedEmprestimo, EmprestimoDTO.class);
    }

    public List<EmprestimoDTO> findAll(){
        var listEmprestimos = repository.findAll();
        return MapperUtil.parseListObjects(listEmprestimos, EmprestimoDTO.class);
    }

    public Emprestimo findById(Long emprestimoId){
        var emprestimoEntity = repository.findById(emprestimoId);
        if(emprestimoEntity.isEmpty()){
            throw new CommonsException(HttpStatus.NOT_FOUND,
                    "unichristus.user.findbyid.notfound",
                    "Empréstimo não encontrado!");
        }

        return repository.findById(emprestimoId).get();
    }

    public void delete(Long emprestimoId){
        repository.deleteById(emprestimoId);
    }
}