package raktar.model;

public class Termek {
   private int termekKod;
   private String name;
   private int ar;
   private int mennyiseg;

   public Termek(int termekKod, String name, int ar, int mennyiseg){
      this.termekKod = termekKod;
	  this.name = name;
	  this.ar = ar;
	  this.mennyiseg = mennyiseg;
   }

   public int getTermekKod() 
   {
      return termekKod;
   }

   public void settermekKod(int termekKod) 
   {
      this.termekKod = termekKod;
   }
   
   public String getName() 
   {
	   return name;
   }

   public void setName(String name) 
   {
	   this.name = name;
   }
   
   public int getAr()
   {
	   return ar;
   }
   
   public void setAr(int ar)
   {
	   this.ar=ar;
   }
   
   public int getMennyiseg()
   {
	   return mennyiseg;
   }
   
   public void setMennyiseg(int mennyiseg)
   {
	   this.mennyiseg = mennyiseg;
   }
}