package br.edu.unichristus.service;

import br.edu.unichristus.domain.dto.ReservaDTO;
import br.edu.unichristus.domain.model.Reserva;
import br.edu.unichristus.exception.CommonsException;
import br.edu.unichristus.repository.ReservaRepository;
import br.edu.unichristus.utils.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public ReservaDTO save(ReservaDTO reserva){
        var reservaEntity = MapperUtil.parseObject(reserva, Reserva.class);
        var savedReserva = repository.save(reservaEntity);
        return MapperUtil.parseObject(savedReserva, ReservaDTO.class);
    }

    public List<ReservaDTO> findAll(){
        var listReservas = repository.findAll();
        return MapperUtil.parseListObjects(listReservas, ReservaDTO.class);
    }

    public Reserva findById(Long idReserva){
        var reservaEntity = repository.findById(idReserva);
        if(reservaEntity.isEmpty()){
            throw new CommonsException(HttpStatus.NOT_FOUND,
                    "unichristus.user.findbyid.notfound",
                    "Reserva não encontrada!");
        }

        return repository.findById(idReserva).get();
    }

    public void delete(Long idReserva){
        repository.deleteById(idReserva);
    }
}