package br.com.spotify2.persistence.repository;

import br.com.spotify2.persistence.entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {



}
