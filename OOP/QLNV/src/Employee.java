
public class Employee {
	private int _id;
	private String _name;
	private int _age;
	private String _department;
	private long _code;
	private double _salaryRate;
	
	public Employee(int _id, String _name, int _age, String _department, long _code, double _salaryRate) {
		this._id = _id;
		this._name = _name;
		this._age = _age;
		this._department = _department;
		this._code = _code;
		this._salaryRate = _salaryRate;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public int get_age() {
		return _age;
	}

	public void set_age(int _age) {
		this._age = _age;
	}

	public String get_department() {
		return _department;
	}

	public void set_department(String _department) {
		this._department = _department;
	}

	public long get_code() {
		return _code;
	}

	public void set_code(int _code) {
		this._code = _code;
	}

	public double get_salaryRate() {
		return _salaryRate;
	}

	public void set_salaryRate(double _salaryRate) {
		this._salaryRate = _salaryRate;
	}
	
	@Override
	public String toString() {
		return String.format("Employee: %d, %s, %d, %s, %d, %.1f", this._id, this._name, this._age, this._department, this._code, this._salaryRate);
	}
}
