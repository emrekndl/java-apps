public class Sarman extends Kedi{
  public void gorunum(){
    System.out.println("Ben Sarman kedisiyim...");
  }

  public Sarman(){
    seslenmeYetenegi = new Miyav();
    avlanmaYetenegi = new Avlanabilir();
  }
}
