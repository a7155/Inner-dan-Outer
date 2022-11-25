
/**
 *
 * @author 4715
 */
public class Outer {

   int number =0;
   
   // inner class
   private class Inner {
      public void print() {
         System.out.println("Mengakses Inner class yang ke: "+ (++number));
      }
   }
   
   // Mengakses kelas dalam dari metode di dalamnya
   void displayFromMethod() {
      Inner in = new Inner();
      in.print();
   }
}
   
class Main {

   public static void main(String args[]) {
      // Instantiating outer class 
      Outer out = new Outer();
      
      // Akses dari method display_Inner()
      out.displayFromMethod();
      out.displayFromMethod();
   }
}    

/**
Membuat kelas inner cukup sederhana hanya perlu menulis class di dalam class. 
* Tidak seperti class, inner class bisa bersifat private dan setelah mendeklarasikan inner class private, 
* inner class tidak dapat diakses dari objek di luar class.Berikut adalah program untuk membuat inner class dan mengaksesnya. 
* Dalam contoh yang diberikan, menjadikan class dalam private dan mengakses class melalui methode.
* Di sini Anda dapat mengamati bahwa Outer adalah kelas luar, Inner adalah kelas dalam, displayFromMethode() 
* adalah metode dimana kita membuat instance kelas dalam, dan metode ini dipanggil dari metode utama.
* Jika Anda mengkompilasi dan menjalankan program di atas, Anda akan mendapatkan hasil sebagai berikut
* Mengakses Inner class yang ke: 1
  Mengakses Inner class yang ke: 2

*/
