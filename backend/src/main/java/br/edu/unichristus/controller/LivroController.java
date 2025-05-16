package br.edu.unichristus.controller;

import br.edu.unichristus.domain.dto.MessageDTO;
import br.edu.unichristus.domain.dto.LivroDTO;
import br.edu.unichristus.domain.model.Livro;
import br.edu.unichristus.service.LivroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/livro")
public class LivroController {

    @Autowired
    private LivroService service;

    @PostMapping
    public LivroDTO save(@RequestBody LivroDTO livro){
        return service.save(livro);
    }

    @PutMapping
    public LivroDTO update(@RequestBody LivroDTO livro){
        return service.save(livro);
    }

    @Operation(summary = "Retorna o livro do ID digitado" ,tags = "Livros")

    @GetMapping("/all")
    public List<LivroDTO> findAll(){
        return service.findAll();
    }

    @Operation(summary = "Retorna o livro do ID digitado" ,tags = "Livros")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Lista os dados do livro"),
            @ApiResponse(responseCode = "404", description = "Livro não encontrado!",
                    content = @Content(schema = @Schema(implementation = MessageDTO.class)))
    })
    @GetMapping("/{idLivro}")
    public Livro findById(@PathVariable Long idLivro){
        return service.findById(idLivro);
    }

    @DeleteMapping("/{idLivro}")
    public void delete(@PathVariable Long idLivro){
        service.delete(idLivro);
    }
}