package l3;

public class Employee {
	private String mane;
	private float rate;
	private int hour;
	
	private static float totalSum;
	

	public Employee() {
	}
	
	public Employee(String mane, float rate) {
		super();
		this.mane = mane;
		this.rate = rate;
	}

	public Employee(String mane, float rate, int hour) {
		super();
		this.mane = mane;
		this.rate = rate;
		this.hour = hour;
		totalSum += this.rate * this.hour;
	}

	public String getMane() {
		return mane;
	}

	public void setMane(String mane) {
		this.mane = mane;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		totalSum -= this.rate * this.hour;
		this.rate = rate;
		totalSum += this.rate * this.hour;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		totalSum -= this.rate * this.hour;
		this.hour = hour;
		totalSum += this.rate * this.hour;
	}
		
	public static float getTotalSum() {
		return totalSum;
	}

	public float salary (){
		
		return this.rate * this.hour;
	}
	
	public void changeRate (float rate){
		totalSum -= this.rate * this.hour;
		this.rate = rate;
		totalSum += this.rate * this.hour;
	}
	
	public float bonuses (){
		return (0.1f*salary());
	}

	@Override
	public String toString() {
		return "Employee [mane=" + mane + ", rate=" + rate + ", hour=" + hour +   ", bonus=" + bonuses() +  "]";
	}
	

}
