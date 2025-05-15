package br.edu.unichristus.controller;

import br.edu.unichristus.domain.dto.MessageDTO;
import br.edu.unichristus.domain.dto.EmprestimoDTO;
import br.edu.unichristus.domain.model.Emprestimo;
import br.edu.unichristus.service.EmprestimoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Emprestimo")
public class EmprestimoController {

    @Autowired
    private EmprestimoService service;

    @PostMapping
    public EmprestimoDTO save(@RequestBody EmprestimoDTO Emprestimo){
        return service.save(Emprestimo);
    }

    @PutMapping
    public EmprestimoDTO update(@RequestBody EmprestimoDTO Emprestimo){
        return service.save(Emprestimo);
    }

    @Operation(summary = "Retorna o Empréstimo do ID digitado" ,tags = "Empréstimos")

    @GetMapping("/all")
    public List<EmprestimoDTO> findAll(){
        return service.findAll();
    }

    @Operation(summary = "Retorna a Empréstimo do ID digitado" ,tags = "Empréstimos")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Lista os dados do Empréstimo"),
            @ApiResponse(responseCode = "404", description = "Empréstimo não encontrado!",
                    content = @Content(schema = @Schema(implementation = MessageDTO.class)))
    })
    @GetMapping("/{emprestimoId}")
    public Emprestimo findById(@PathVariable Long emprestimoId){
        return service.findById(emprestimoId);
    }

    @DeleteMapping("/{emprestimoId}")
    public void delete(@PathVariable Long emprestimoId){
        service.delete(emprestimoId);
    }
}