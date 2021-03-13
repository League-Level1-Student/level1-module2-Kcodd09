package _02_smurf;

public class smurfRunner {
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		Smurf papa = new Smurf ("Papa");
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(handy.getName());
		handy.eat();
		System.out.println(papa.getName());
		papa.eat();
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		System.out.println(smurfette.getName());
		smurfette.eat();
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
		
	}
}
