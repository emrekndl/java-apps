public class Kedi {
    public int canSayisi = 9;
    Seslenebilme seslenmeYetenegi;
    Avlanabilme avlanmaYetenegi;
    
    public Kedi() {
    	seslenmeYetenegi = new Miyav();
        avlanmaYetenegi = new Avlanabilir();
    }
    
    public void seslenmeIslemi(){
        seslenmeYetenegi.seslenme();
    }

    public void avlanmaIslemi(){
        avlanmaYetenegi.avlanma();
    }

    public void gorunum(){
        System.out.println("Ben Kediyim.");
    }

    public void setSeslenmeYetenegi(Seslenebilme ses){
      seslenmeYetenegi = ses;
    }
    public void setAvlanmaYetenegi(Avlanabilme avla){
      avlanmaYetenegi = avla;
    }
    public static void main(String[] args){
        Kedi sarman = new Kedi();
        sarman.gorunum();
    }
}
