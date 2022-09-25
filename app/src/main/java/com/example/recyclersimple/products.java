package com.example.recyclersimple;

class products{
    private int id;
    private  String title;
    private String shortdesc;
    private double rating;
    private int image;

    public products(int id, String title, String shortdesc, double v, double rating, int image) {
    }

    public int getId()
    {
        return id;
    }
    public String getTitle(){
        return title;
    }


    public String getShortdesc(){
        return shortdesc;
    }

    public double getRating(){
        return rating;
    }
    public int getImage(){
        return image;
    }

}