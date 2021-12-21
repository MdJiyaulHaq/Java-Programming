package com.PU;

class cube{
    int length;
    int width;
    int height;
    void put(int l, int w, int h){
        length =l;
        width = w;
        height =h;
    }
    void get(){
        System.out.println("The volume is :" +(length*width*height));
    }
    public static void main(String[] args) {
        cube c1 = new cube(), c2 = new cube();
        c1.put(3,4,5);
        c2.put(4,4,4);
        c1.get();
        c2.get();
    }
}
