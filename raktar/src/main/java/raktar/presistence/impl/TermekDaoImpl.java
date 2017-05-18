package raktar.presistence.impl;

import java.util.ArrayList;
import java.util.List;

import raktar.model.Termek;
import raktar.presistence.TermekDao;

public class TermekDaoImpl implements TermekDao {
	
   //list is working as a database
   List<Termek> Termeks;

   public TermekDaoImpl(){
      Termeks = new ArrayList<Termek>();
      Termek Termek1 = new Termek(0,"Kalapács",1000,50);
      Termek Termek2 = new Termek(1,"Szög",5,100000);
      Termeks.add(Termek1);
      Termeks.add(Termek2);		
   }

   public void deleteTermek(Termek Termek) {
      Termeks.remove(Termek.getTermekKod());
      System.out.println("Termék: Termékkód " + Termek.getTermekKod() + ", törölve az adatbázisból");
   }

   //retrive list of Termeks from the database
   public List<Termek> getAllTermek() {
      return Termeks;
   }


   public Termek getTermek(int getTermekKod) {
      return Termeks.get(getTermekKod);
   }

   public void updateTermek(Termek Termek) {
      Termeks.get(Termek.getTermekKod()).setName(Termek.getName());
      System.out.println("Termék: Termékkód " + Termek.getTermekKod() + ", frissítve az adatbázisban");
   }
}