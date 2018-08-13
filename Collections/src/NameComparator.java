import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getFirstname().compareTo(e2.getFirstname());
	}

}
