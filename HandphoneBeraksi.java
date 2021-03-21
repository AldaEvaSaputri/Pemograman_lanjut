package hp;

public class HandphoneBeraksi {
    public static void main(String[] args) {

        Handphone handphoneAlda = new Handphone();
        handphoneAlda.Hidupkan = "Handphone Hidup";
        handphoneAlda.LakukanPanggilan = "Kring, kring, kring, Panggilan dilakukan";
        handphoneAlda.KirimSMS = "Dung Dung SMS berhasil terkirim";
        handphoneAlda.Matikan = "Handphone mati";
    
    System.out.println(handphoneAlda.Hidupkan);
    System.out.println(handphoneAlda.LakukanPanggilan);
    System.out.println(handphoneAlda.KirimSMS);
    System.out.println(handphoneAlda.Matikan);
    } 
}
