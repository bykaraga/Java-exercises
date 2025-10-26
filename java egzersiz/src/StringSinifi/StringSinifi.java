package StringSinifi;

public class StringSinifi {
    public static void main(String[] args){
    /*    str.length()       // Karakter sayısını verir
        str.charAt(i)      // i. karakteri verir
        str.substring(a,b) // a'dan b'ye kadar alt string
        str.indexOf(ch)    // Karakterin indeksini verir
        str.lastIndexOf(ch)// Son görünen karakterin indeksini verir
        str.equals(str2)   // İki string eşit mi?
        str.equalsIgnoreCase(str2) // Büyük-küçük harfe bakmadan eşit mi?
        str.toLowerCase()  // Küçük harfe çevirir
        str.toUpperCase()  // Büyük harfe çevirir
        str.trim()         // Baş ve sondaki boşlukları siler
        str.replace(a,b)   // a’yı b ile değiştirir
        str.contains(s)    // s var mı kontrol eder
        str.startsWith(s)  // s ile başlıyor mu?
        str.endsWith(s)    // s ile bitiyor mu?
        str.split(s)       // s ile parçalar, dizi döndürür */

//char[] str = {'K','O','D'};
//
//String metin = new String(str);
//        System.out.println(metin);
//
//        String m = "KOD"; // bu kod aslinda yukardakini kod

        String metin = "kodlama";
        String metin2 = " zamani";
        System.out.println(metin.length());
        System.out.println(metin +metin2);
        System.out.println(metin.concat(metin2));
        System.out.println(metin.indexOf('l'));
        System.out.println(metin.charAt(0));
    }
}
