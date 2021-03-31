//Nama   : Alda Eva Saputri
//NIM    :11200930000022
//Materi : karakteristik Pemograman Berorientasi Objek
//         (Abstraction, Encapsulation, Inheritance, Polymorphism)

package matematika;

public class Matematika {
    //Pertambahan//
    void pertambahandasar (int a, int b){
        int hasil = a+b;
        System.out.println("pertambahandasar : " + a +"+"+ b +"="+hasil);
    }
    void pertambahandasar (int a, int b, int c){
        int hasil2 = a+b+c;
        System.out.println("pertambahandasar : " + a + "+"+ b +"="+hasil2);
    }
    void pertambahandasar (double a, double b){
        double hasil =a+b;
        System.out.println("pertambahandasar : " +a+"+"+b+"="+hasil);
    }
    void pertambahandasar(double a, double b, double c){
        double hasil2 = a+b+c;
        System.out.println("pertambahandasar : " +a+"+"+b+"+"+c+"="+hasil2);
    }
    //perkalian//
    void perkaliandasar (int a, int b){
        int hasil =a*b;
        System.out.println ("perkaliandasar : " +a+"*"+b+"="+hasil);
    }
    void perkaliandasar (int a, int b, int c){
        int hasil2 = a*b*c;
        System.out.println("perkaliandasar : " +a+"*"+b+"*"+c+"="+ hasil2);
    }
    void perkaliandasar (double a, double b){
        double hasil =  a*b;
        System.out.println("perkaliandasar : " +a+"*"+b+"="+hasil);
    }
    void perkaliandasar (double a, double b, double c){
        double hasil2 = a*b*c;
        System.out.println("perkaliandasar : " +a+"*"+b+"*"+c+"="+ hasil2);
    }
    //pembagian//
    void pembagiandasar (int a, int b){
        int hasil = a/b;
        System.out.println("pembagiandasar : " +a+"/"+b+"="+hasil);
    }
    void pembagiandasar (int a, int b, int c){
        int hasil2 = a/b/c;
        System.out.println("pembagiandasar : " +a+"/"+b+"/"+c+"="+hasil);
    }
    void pembagiandasar (double a, double b){
        double hasil = a/b;
        System.out.println("pembagiandasar : " +a+"/"+b+"="+hasil);
    }
    void pembagiandasar (double a, double b, double c){
        double hasil2 = a/b/c;
        System.out.println("pembagiandasar : " +a+"/"+b+"/"+c+"="+hasil);
    }
    //pengurangan//
    void pengurangandasar (int a, int b){
        int hasil = a-b;
        System.out.println("pengurangandasar : " +a+"-"+b+"="+hasil);
    }
    void pengurangandasar (int a, int b, int c){
        int hasil2 = a-b-c;
        System.out.println("pengurangandasar : " +a+"-"+b+"-"+c+"="+hasil);
    }
    void pengurangandasar (double a, double b){
        double hasil = a-b;
        System.out.println("pengurangandasar : " +a+"-"+b+"="+hasil);
    }
    void pengurangandasar (double a, double b, double c){
        double hasil2 = a-b-c;
        System.out.println("pengurangandasar : " +a+"-"+b+"-"+c+"="+hasil);
    }
    int getpertambahandasar(){
        return hasil;
    }
    double getpertambahandasar(){
        return hasil2;
    }
    int getperkaliandasar(){
        return hasil;
    }
    double getperkaliandasar(){
        return hasil2;
    }
    int getpembagiandasar(){
        return hasil;
    }
    double getpembagiandasar(){
        return hasil2;
    }
}
