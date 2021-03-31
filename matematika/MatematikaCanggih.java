package matematika;

public class MatematikaCanggih extends Matematika{    

    void Modulus (int a, int b){
        int modulus = a%b;
     System.out.println("Modulus : " +a+"%"+b+"="+modulus);   
    }
    void Modulus (double a, double b){
        double modulus2 = a%b;
        System.out.println("Modulus : " +a+"%"+b+"="+modulus2);
    }

    int getModulus () {
        return modulus;
    }
    double getModulus2 (){
        return modulus2;
    }
}
