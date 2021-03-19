package SampleProject;

public class HouseDog extends Dog {

	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep();
		houseDog.sleep(3);
	}
	@Override
	public void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	public void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
}
