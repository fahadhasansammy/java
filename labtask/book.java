// Source code is decompiled from a .class file using FernFlower decompiler.
package labtask;

public class book {
   private String isbn;
   private String bookTitle;
   private String authorName;
   private double price;
   private int availableQuantity;

   public book() {
   }

   public book(String var1, String var2, String var3, double var4, int var6) {
      this.isbn = var1;
      this.bookTitle = var2;
      this.authorName = var3;
      this.price = var4;
      this.availableQuantity = var6;
   }

   public void setisbn(String var1) {
      this.isbn = var1;
   }

   public void setbookTitle(String var1) {
      this.bookTitle = var1;
   }

   public void setauthorName(String var1) {
      this.authorName = var1;
   }

   public void setprice(double var1) {
      this.price = var1;
   }

   public void setavailableQuantity(int var1) {
      this.availableQuantity = var1;
   }

   public String getisbn() {
      return this.isbn;
   }

   public String getBookTitle() {
      return this.bookTitle;
   }

   public String getAuthorName() {
      return this.authorName;
   }

   public double getprice() {
      return this.price;
   }

   public int getavailableQuantity() {
      return this.availableQuantity;
   }

   public void addQuantity(int var1) {
      this.availableQuantity += var1;
      System.out.println("Available quantity" + this.availableQuantity);
   }

   public void sellQuantity(int var1) {
      if (this.availableQuantity >= var1) {
         this.availableQuantity -= var1;
         System.out.println("Available:" + this.availableQuantity);
      } else {
         System.out.println("Stock out.");
      }

   }

   public void showDetails() {
      System.out.println("ISBN:" + this.isbn);
      System.out.println("Book title:" + this.bookTitle);
      System.out.println("Author name:" + this.authorName);
      System.out.println("Price:" + this.price);
      System.out.println("Available quantity:" + this.availableQuantity);
   }

   public static void main(String[] var0) {
      book var1 = new book("NCTB", "Peradoxical sazid", "Arif azad", 230.0, 500);
      book var2 = new book();
      System.out.println("Book 1 information is:");
      var1.showDetails();
      var2.setisbn("isbn");
      var2.setbookTitle("peradoxical sazid");
      var2.setauthorName("Arif azad");
      var2.setprice(500.0);
      var2.setavailableQuantity(500);
      System.out.println("Book 2 information is:");
      var2.showDetails();
      var1.addQuantity(100);
      var1.sellQuantity(600);
   }
}
