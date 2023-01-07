package com.company;

public class WorkDetails {
    int artistNO ;
    int noOfSongs ;

    public int getArtistNO() {
        return artistNO;
    }

    public int getNoOfSongs() {
        return noOfSongs;
    }

    public void setArtistNO(int artistNO) {
        this.artistNO = artistNO;
    }

    public void setNoOfSongs(int noOfSongs) {
        this.noOfSongs = noOfSongs;
    }

    public WorkDetails(int artistNO, int noOfSongs) {
        this.artistNO = artistNO;
        this.noOfSongs = noOfSongs;
    }
}
