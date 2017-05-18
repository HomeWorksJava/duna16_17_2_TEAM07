package due.haloalk.beadando.raktar;

import raktar.model.Termek;
import raktar.presistence.TermekDao;
import raktar.presistence.impl.TermekDaoImpl;

public class DaoPatternDemo {
	   public static void main(String[] args) {
	      TermekDao termekDao = new TermekDaoImpl();

	      //print all termeks
	      for (Termek termek : termekDao.getAllTermek()) {
	         System.out.println("Termék: [Termékkód: " + termek.getTermekKod() + ", Név: " + termek.getName() + ", Ár: " + termek.getAr() + ", Mennyiség: " + termek.getMennyiseg() + " ]");
	      }


	      //update termek
	      Termek termek =termekDao.getAllTermek().get(0);
	      termek.setName("Kalapács");
	      termekDao.updateTermek(termek);

	      //get the termek
	      termekDao.getTermek(0);
	      System.out.println("Termék: [Termékkód: " + termek.getTermekKod() + ", Név: " + termek.getName() + ", Ár: " + termek.getAr() + ", Mennyiség: " + termek.getMennyiseg() + " ]");		
	   }
	}