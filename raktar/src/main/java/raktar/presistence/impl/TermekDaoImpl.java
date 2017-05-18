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
      Termek Termek1 = new Termek("Robert",0);
      Termek Termek2 = new Termek("John",1);
      Termeks.add(Termek1);
      Termeks.add(Termek2);		
   }

   public void deleteTermek(Termek Termek) {
      Termeks.remove(Termek.getRollNo());
      System.out.println("Termek: Roll No " + Termek.getRollNo() + ", deleted from database");
   }

   //retrive list of Termeks from the database
   public List<Termek> getAllTermek() {
      return Termeks;
   }


   public Termek getTermek(int rollNo) {
      return Termeks.get(rollNo);
   }

   public void updateTermek(Termek Termek) {
      Termeks.get(Termek.getRollNo()).setName(Termek.getName());
      System.out.println("Termek: Roll No " + Termek.getRollNo() + ", updated in the database");
   }
}