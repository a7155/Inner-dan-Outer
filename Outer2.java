public class Outer2 {
   int number = 10;

// instance method dari outer class 
   void outerMethod() {
      
      // method-local inner class
      class Inner {
         public void print() {
            System.out.println("Mengakses Inner class yang ke: "+ (number++));	   
         }   
      } // end of inner class
	   
      // Accessing the inner class
      Inner inner = new Inner();
      inner.print();
   }
}
class OuterAccess{
   public static void main(String args[]) {
      Outer2 out = new Outer2();
      out.outerMethod();
      out.outerMethod();
      out.outerMethod();
   }
}

/**
 * nilai variabel number akan menampilkan nilai awal sesuai yg di deklarasikan atau di inputkan
 * seperti diatas nilai awal bernilai 0 dan nilai seterus nya akan di tambah 1,
 * Di Java, bisa menulis sebuah class di dalam sebuah method dan ini akan menjadi tipe local. 
 * Seperti variabel local, ruang lingkup class Inner dibatasi dalam methode.
   class inner methode-local dapat dibuat hanya dalam method di mana class inner didefinisikan. 
   * Program diatas menunjukkan cara menggunakan inner class method-local.
 */
