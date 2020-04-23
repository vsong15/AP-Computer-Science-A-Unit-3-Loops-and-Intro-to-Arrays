public class Year {
//fields
   private int year;
//constructor
   public Year(int y) {
      year = y;
   }
//methods
   public int getYear() {
      return year;
   }
   public void changeYear(int y) {
      year = y;
   }
   
   public boolean isLeapYear() {
      return year%400==0 || (year%100!=0 && year%4==0); 
   }
}
