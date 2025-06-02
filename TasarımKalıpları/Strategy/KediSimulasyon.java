public class KediSimulasyon {
   public static void main(String[] args) {
     Kedi nankor = new Sarman();
     nankor.gorunum();
     nankor.seslenmeIslemi();
     nankor.avlanmaIslemi();
     System.out.println();

     Kedi minnos = new VanKedisi();
     minnos.gorunum();
     minnos.seslenmeIslemi();
     minnos.avlanmaIslemi();
     System.out.println();
     minnos.setAvlanmaYetenegi(new Avlanabilir());
     minnos.setSeslenmeYetenegi(new Miyav());
     minnos.seslenmeIslemi();
     minnos.avlanmaIslemi();
     System.out.println();

     minnos.setSeslenmeYetenegi(new Konusma());
     minnos.seslenmeIslemi();
     System.out.println();
     
     Kedi pelus = new PelusKedi();
     pelus.gorunum();
     pelus.seslenmeIslemi();
     pelus.avlanmaIslemi();
     System.out.println();
     
     Kedi nankor2 = new Kedi();
     nankor2.gorunum();
     nankor2.seslenmeIslemi();
     nankor2.avlanmaIslemi();
     nankor2.setAvlanmaYetenegi(new Avlanamaz());
     nankor2.avlanmaIslemi();
   }
}
