
public class Product {
	private String transactionNumber;
	private String name;
	private String periodDay;
	private String weekDay;

	public Product(String transactionNumber, String name, String periodDay, String weekDay) {
		this.transactionNumber = transactionNumber;
		this.name = name;
		this.periodDay = periodDay;
		this.weekDay = weekDay;
	}

	public String getName() {
		return name;
	}

	public int getTrans() {
		return trans;
	}

	public String getPeriodDay() {
		return periodDay;
	}

	public String getWeekDay() {
		return weekDay;
	}
	
	@Override
	public String toString() {
		return "Transaction: " + trans + ", Product: " + name + ", Period_day: " + periodDay + ", Week_day: "
				+ weekDay;
	}

}
