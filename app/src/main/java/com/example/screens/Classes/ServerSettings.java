package com.example.screens.Classes;
/*Class for server status*/
public class ServerSettings {

    private Long id;

    private int size, limit;//size is player count, limit is turn limit
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSize() { //get size of map
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTurn(){ //get turn limit
        return limit;
    }

    public void setTurn(int limit){
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
