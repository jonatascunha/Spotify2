package br.com.spotify2.model.Request;

import br.com.spotify2.persistence.entity.Music;

import java.util.ArrayList;

public class PlaylistRequestDTO {

    private Long id;
    private String nomePlaylist;
    private ArrayList<Music> musicList;
    private int quantityOfMusic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
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
