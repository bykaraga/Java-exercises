package oop.oopTemelleri.inheritance;

import oop.oopTemelleri.A;

public class Kalitim {
    public static void main(String[] args){

        Akademisyen a = new Akademisyen("Akademisyen","akademisyen e postasi ","5051234","TUrkce","abc ogret","turkce turkce tarihi");
         Memurlar m = new Memurlar("adMemur","memurposta","6969435","dep","9-17");
           Guvenlik g = new Guvenlik("yakisikli guvenlik","yakisikli@gmail.com","531631931","yakisikliDep","KEyfi keder tiktok");
           Asistan as =  new Asistan("ahmettttt","postaaa","5051ad234","sddd","abc ss","s turkce tarihi","");
           BilgiIslem b = new BilgiIslem("ad","yakisikli@gmaisl.com","5316319s31","yakissikliDep","KEyfi kedser tiktok");
OgretimUyesi o = new OgretimUyesi("ogretim name","postaa","50329","turlce anadal","akademisyeni ...","tterkc");
           as.derseGir();
o.derseGir();

    }
}
