import java.util.List;

public interface OperationFinder {

	List<Achat> getOperationsDebit();

	List<Achat> getOperationsCredit();

	List<Achat> getAllOperations();

}