import java.util.Date;
import java.util.List;

public class RegistreAchat implements AchatFinder, OperationFinder {

	/**
	 * 
	 * @param idPartenaire
	 * @param idCarte
	 */
	public RegistreAchat(int idPartenaire, int idCarte) {
		// TODO - implement RegistreAchat.RegistreAchat
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param totalAchat
	 */
	public double calculerPoints(double totalAchat) {
		// TODO - implement RegistreAchat.calculerPoints
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idPartenaire
	 * @param idCarte
	 * @param totalAchat
	 */
	public int ajouterAchat(int idPartenaire, int idCarte, double totalAchat) {
		// TODO - implement RegistreAchat.ajouterAchat
		throw new UnsupportedOperationException();
	}


	/**
	 * 
	 * @param idTrack
	 */
	public void findIdTrack(int idTrack) {
		// TODO - implement RegistreAchat.findIdTrack
		throw new UnsupportedOperationException();
	}


	@Override
	public List<Achat> getOperationsDebit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Achat> getOperationsCredit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Achat> getAllOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Achat> findAchat(int idCarte, Date month) {
		// TODO Auto-generated method stub
		return null;
	}

}