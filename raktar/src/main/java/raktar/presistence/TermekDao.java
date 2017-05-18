package raktar.presistence;
import java.util.List;
import raktar.model.Termek;

public interface TermekDao {
   public List<Termek> getAllTermek();
   public Termek getTermek(int rollNo);
   public void updateTermek(Termek student);
   public void deleteTermek(Termek student);
}