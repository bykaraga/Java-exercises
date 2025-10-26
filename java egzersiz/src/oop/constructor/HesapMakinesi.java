package oop.constructor;

public class HesapMakinesi {
    public  int sayi1;
    public   int sayi2;
public String renk;

    HesapMakinesi(int s1,int s2,String renk){
this.sayi1 = s1;
this.sayi2 = s2;
this.renk = renk;
    }

    public int toplama(){
        return this.sayi1 + this.sayi2;
    }
    public int cıkartma(){
        return this.sayi1 - this.sayi2;
    }
    public int carpma(){
        return this.sayi1 * this.sayi2;
    }

    public int bolme(){
        return this.sayi1 / this.sayi2;
    }


}
