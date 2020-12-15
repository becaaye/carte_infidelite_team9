import java.util.List;

public interface BonusFinder {

	List<Carte> getCarte();

	/**
	 * 
	 * @param idCarte
	 */
	List<Bonus> findBonus(int idCarte);

	List<Achat> getAllBonuses();

}