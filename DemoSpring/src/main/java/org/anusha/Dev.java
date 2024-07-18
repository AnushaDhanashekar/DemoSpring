package org.anusha;


public class Dev {

    //private Laptop laptop;
    private Computer comp;

    public Dev(){
        System.out.println("Dev constructor");
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }


    public void build(){
        System.out.println("Working on awsome project");
        comp.compile();
    }

}
