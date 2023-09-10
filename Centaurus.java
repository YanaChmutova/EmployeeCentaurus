
public class Centaurus extends Person implements Horse {

	@Override
	public void toJump() {
		System.out.println("Ability to jump with " + legs + " legs");
	}

}
