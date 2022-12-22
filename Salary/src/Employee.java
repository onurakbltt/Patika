
public class Employee {

	String name;
	double salary;
	int worksHour;
	int hireYear;
	int currentYear = 2021;
	double raise;

	public Employee(String name, int salary, int worksHour, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.worksHour = worksHour;
		this.hireYear = hireYear;
	}

	public double tax() {
		if (salary <= 1000) {
			return 0.0;
		} else {
			return this.salary * 0.03;
		}
	}

	public double bonus() {
		if (worksHour < 40) {
			return 0;
		} else {
			return (this.worksHour - 40) * 30;
		}
	}

	public double raiseSalary() {
		if ((currentYear - hireYear) < 10) {

			return this.salary * 0.05;
		} else if (((currentYear - hireYear) > 9) && (currentYear - hireYear) < 20) {
			return this.salary * 0.1;
		} else {
			return this.salary * 0.15;
		}
	}

	@Override
	public String toString() {
		System.out.println("Adı : " + name);
		System.out.println("Maaşı : " + salary);
		System.out.println("Çalışma Saati : " + worksHour);
		System.out.println("Başlangıç Yılı : " + hireYear);
		System.out.println("Vergi : " + tax());
		System.out.println("Bonus : " + bonus());
		System.out.println("Maaş Artışı : " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (salary - tax() + bonus()));
		System.out.println("Toplam Maaş : " + (salary - tax() + bonus() + raiseSalary()));
		return "";
	}

}
