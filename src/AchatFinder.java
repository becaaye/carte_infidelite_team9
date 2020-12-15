import java.util.Date;
import java.util.List;

public interface AchatFinder {

	/**
	 * 
	 * @param idCarte
	 * @param month
	 */
	List<Achat> findAchat(int idCarte, Date month);

	/**
	 * 
	 * @param idTrack
	 */
	void findIdTrack(int idTrack);

}