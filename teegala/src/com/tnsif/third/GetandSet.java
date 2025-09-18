package com.tnsif.third;

public class GetandSet {
    private String name; 

   
    public void setName(String name) {
        this.name = name;
    }

  
    public String getName() {
        return name;
    }

    
    public static void main(String[] args) {
        GetandSet obj = new GetandSet();  

        obj.setName("Anjali Reddy"); 
        System.out.println("Name: " + obj.getName()); 
    }
}
