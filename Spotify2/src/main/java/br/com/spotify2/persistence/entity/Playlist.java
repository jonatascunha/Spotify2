package br.com.spotify2.persistence.entity;

import javax.persistence.*;
import java.util.ArrayList;
@Entity
@Table (name = "playlist")
public class Playlist {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nomePlaylist", nullable = false)
    private String namePlaylist;

    ArrayList<Music> musicList;
    @Column(name = "quantityOfMusic", nullable = false)
    private int quantityOfMusic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
    }

    public ArrayList<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    public int getQuantityOfMusic() {
        return quantityOfMusic;
    }

    public void setQuantityOfMusic(int quantityOfMusic) {
        this.quantityOfMusic = quantityOfMusic;
    }
}
