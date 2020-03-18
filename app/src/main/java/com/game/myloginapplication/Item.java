package com.game.myloginapplication;

public class Item {
    String birdListName;
    int birdListImage;

    public Item(String birdName,int birdImage){
        this.birdListImage=birdImage;
        this.birdListName=birdName;
    }

    public void setBirdListName(String birdListName) { this.birdListName = birdListName; }

    public void setBirdListImage(int birdListImage) { this.birdListImage = birdListImage; }

    public String getbirdName() { return birdListName; }

    public int getbirdImage() {
        return birdListImage;
    }
}
