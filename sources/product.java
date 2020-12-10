
public class product {
	private int trans;
	private String name;
	private String periodDay;
	private String weekDay;

	public product(int trans, String name, String periodDay, String weekDay) {
		this.trans = trans;
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