package br.edu.unichristus.controller;

import br.edu.unichristus.domain.dto.MessageDTO;
import br.edu.unichristus.domain.dto.ReservaDTO;
import br.edu.unichristus.domain.model.Reserva;
import br.edu.unichristus.service.ReservaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Reserva")
public class ReservaController {

    @Autowired
    private ReservaService service;

    @PostMapping
    public ReservaDTO save(@RequestBody ReservaDTO Reserva){
        return service.save(Reserva);
    }

    @PutMapping
    public ReservaDTO update(@RequestBody ReservaDTO Reserva){
        return service.save(Reserva);
    }

    @Operation(summary = "Retorna a Reserva do ID digitado" ,tags = "Reservas")

    @GetMapping("/all")
    public List<ReservaDTO> findAll(){
        return service.findAll();
    }

    @Operation(summary = "Retorna a Reserva do ID digitado" ,tags = "Reservas")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Lista os dados da Reserva"),
            @ApiResponse(responseCode = "404", description = "Reserva não encontrada!",
                    content = @Content(schema = @Schema(implementation = MessageDTO.class)))
    })
    @GetMapping("/{reservaId}")
    public Reserva findById(@PathVariable Long reservaId){
        return service.findById(reservaId);
    }

    @DeleteMapping("/{reservaId}")
    public void delete(@PathVariable Long reservaId){
        service.delete(reservaId);
    }
}