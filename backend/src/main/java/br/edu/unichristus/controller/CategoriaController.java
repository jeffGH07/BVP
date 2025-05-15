package br.edu.unichristus.controller;

import br.edu.unichristus.domain.dto.MessageDTO;
import br.edu.unichristus.domain.dto.CategoriaDTO;
import br.edu.unichristus.domain.model.Categoria;
import br.edu.unichristus.service.CategoriaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @PostMapping
    public CategoriaDTO save(@RequestBody CategoriaDTO categoria){
        return service.save(categoria);
    }

    @PutMapping
    public CategoriaDTO update(@RequestBody CategoriaDTO categoria){
        return service.save(categoria);
    }

    @Operation(summary = "Retorna a Categoria do ID digitado" ,tags = "Categorias")

    @GetMapping("/all")
    public List<CategoriaDTO> findAll(){
        return service.findAll();
    }

    @Operation(summary = "Retorna a categoria do ID digitado" ,tags = "Categorias")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Lista os dados da categoria"),
            @ApiResponse(responseCode = "404", description = "Categoria não encontrada!",
                    content = @Content(schema = @Schema(implementation = MessageDTO.class)))
    })
    @GetMapping("/{CategoriaId}")
    public Categoria findById(@PathVariable Long categoriaId){
        return service.findById(categoriaId);
    }

    @DeleteMapping("/{CategoriaId}")
    public void delete(@PathVariable Long categoriaId){
        service.delete(categoriaId);
    }
}