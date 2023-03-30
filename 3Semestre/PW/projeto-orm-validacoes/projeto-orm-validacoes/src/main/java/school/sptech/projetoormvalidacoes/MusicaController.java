package school.sptech.projetoormvalidacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/musicas")
public class MusicaController {
    @Autowired
    private MusicaRepository musicaRepository;

    @GetMapping
    public ResponseEntity<List<Musica>> listar() {

        List<Musica> musicas = this.musicaRepository.findAll();
        if (musicas.isEmpty()) {
            return ResponseEntity.status(204).body(musicas);
        }

        return ResponseEntity.status(200).body(musicas);
    }

    @PostMapping
    public ResponseEntity<Musica> cadastrar(@RequestBody @Valid Musica novaMusica) {

        Musica musicaRegistrada = this.musicaRepository.save(novaMusica);
        return ResponseEntity.status(201).body(musicaRegistrada);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Musica> buscarPorId(@PathVariable Integer id) {

        Optional<Musica> musicaOpt = this.musicaRepository.findById(id);
        if (musicaOpt.isPresent()){
            Musica musica = musicaOpt.get();
            return ResponseEntity.status(200).body(musica);
        }
        return ResponseEntity.status(404).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Musica> atualizar(
            @PathVariable int id,
            @RequestBody Musica musica
    ) {

        if (this.musicaRepository.existsById(id)){
            musica.setId(id);
            Musica musicaAtualizada = musicaRepository.save(musica);
            return ResponseEntity.status(200).body(musicaAtualizada);
        }


        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {

        if (musicaRepository.existsById(id)){
            this.musicaRepository.deleteById(id);
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(404).build();
    }
}
