package Bank;

public class bank {
    int Saldo, SimpanUang, AmbilUang;
    public bank(int Saldo){
         this.Saldo = 100000;
    }

    public void Saldo (int Saldo) {
        System.out.println("Selamat Datang di Bank Aldaeva");
        System.out.println("Saldo anda saat ini = Rp." +Saldo);
        System.out.println("================================");
    }
    public void SimpanUang(int SimpanUang) {
        System.out.println("Simpan Uang         = Rp." +SimpanUang);
        System.out.println("Saldo anda saat ini = Rp." +Saldo);
        System.out.println("================================");
    }
    public void AmbilUang(int AmbilUang) {
        System.out.println("Ambil Uang          = Rp." +AmbilUang);
        System.out.println("Saldo anda saat ini = Rp." +Saldo);
        System.out.println("================================");
    }
    int getsaldo () {
        return Saldo;
    }
}
