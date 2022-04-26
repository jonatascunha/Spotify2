package br.com.spotify2.persistence.repository;

import br.com.spotify2.persistence.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Long> {

}
