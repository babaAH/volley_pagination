package com.example.volleypag;

public class Comment {
    private String name;
    private String body;

    public Comment(String name, String body){
        this.name=name;
        this.body=body;
    }

    public String getName(){
        return this.name;
    }

    public String getBody(){
        return this.body;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setBody(String body){
        this.body=body;
    }
}
