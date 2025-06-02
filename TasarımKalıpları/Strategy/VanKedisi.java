public class VanKedisi extends Kedi{
  public VanKedisi(){
    seslenmeYetenegi = new Seslenemez();
    avlanmaYetenegi = new Avlanamaz();
  }

  public void gorunum(){
    System.out.println("Ben Van kedisiyim...");
  }
}
