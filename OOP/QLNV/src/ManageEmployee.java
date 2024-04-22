import java.util.ArrayList;
import java.util.List;

public class ManageEmployee {
	private List<Employee> _employees;

	public ManageEmployee() {
		this._employees = new ArrayList<>(List.of(
				new Employee(1, "PhanQ", 21, "CNTT", 10000, 30000),
				new Employee(2, "PhanW", 21, "HTTT", 20000, 30000),
				new Employee(3, "PhanE", 21, "CDT", 30000, 30000),
				new Employee(4, "PhanR", 21, "TDH", 40000, 30000),
				new Employee(5, "PhanT", 21, "CNTT", 50000, 30000),
				new Employee(6, "PhanY", 21, "KTDN", 60000, 30000),
				new Employee(7, "PhanU", 21, "HTTT", 70000, 30000),
				new Employee(8, "PhanI", 21, "CNTT", 11000, 30000),
				new Employee(9, "PhanO", 21, "NNA", 12000, 30000),
				new Employee(10, "PhanP", 21, "DTTC", 13000, 30000)
				));
	}
	
	public void ShowInfor() {
		this._employees.forEach(employee -> System.out.println(employee.toString()));
	}
	
	public void AddEmployee(Employee employee) {
		this._employees.add(employee);
	}
	
	public boolean DeleteById(int id) {
		Employee employee = this._employees.stream().filter(e -> e.get_id() == id).findFirst().orElse(null);
		if(employee == null) {
			return false;
		}
		this._employees.remove(employee);
		return true;
	}
}
