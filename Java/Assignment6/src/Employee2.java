import java.util.Comparator;
import java.util.*;

class Employee1 implements Comparable<Employee1> {

	int empId;
	String empName;
	String dept;
	double salary;

	public Employee1(int empId, String empName, String dept, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, empId, empName, salary);
	}

	@Override
	public String toString() {
		return "CFG [empId=" + empId + ", empName=" + empName + ", dept=" + dept + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return this.empName.compareTo(o.getEmpName());

	}

}

class IdComparator implements Comparator<Employee1> {

	public int compare(Employee1 e1, Employee1 e2) {
		return e1.getEmpId() - e2.getEmpId();
	}
}

class NameComparator implements Comparator<Employee1> {
	public int compare(Employee1 e1, Employee1 e2) {
		return e1.getEmpName().compareTo(e2.getEmpName());
	}
}

class SalaryComparator implements Comparator<Employee1> {

	public int compare(Employee1 e1, Employee1 e2) {
		return (int) (e1.getSalary() - e2.getSalary());
	}
}

class DeptComparator implements Comparator<Employee1> {
	public int compare(Employee1 e1, Employee1 e2) {
		return e1.getDept().compareTo(e2.getDept());
	}
}

public class Employee2 {

}
