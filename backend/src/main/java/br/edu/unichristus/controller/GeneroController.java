package br.edu.unichristus.controller;

import br.edu.unichristus.domain.dto.MessageDTO;
import br.edu.unichristus.domain.dto.GeneroDTO;
import br.edu.unichristus.domain.model.Genero;
import br.edu.unichristus.service.GeneroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Genero")
public class GeneroController {

    @Autowired
    private GeneroService service;

    @PostMapping
    public GeneroDTO save(@RequestBody GeneroDTO Genero){
        return service.save(Genero);
    }

    @PutMapping
    public GeneroDTO update(@RequestBody GeneroDTO Genero){
        return service.save(Genero);
    }

    @Operation(summary = "Retorna a Genero do ID digitado" ,tags = "Generos")

    @GetMapping("/all")
    public List<GeneroDTO> findAll(){
        return service.findAll();
    }

    @Operation(summary = "Retorna a Genero do ID digitado" ,tags = "Generos")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Lista os dados do Genero"),
            @ApiResponse(responseCode = "404", description = "Genero não encontrado!",
                    content = @Content(schema = @Schema(implementation = MessageDTO.class)))
    })
    @GetMapping("/{idGenero}")
    public Genero findById(@PathVariable Long idGenero){
        return service.findById(idGenero);
    }

    @DeleteMapping("/{idGenero}")
    public void delete(@PathVariable Long idGenero){
        service.delete(idGenero);
    }
}