public class Cat { // Made 'public' lowercase and changed to cat
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) { // cat upper case
		this.name = name; // changed name to this.name
		this.breed = breed; // I added this to breed and made the breed default to Tabby
		this.isHungry = true; // changed yes to true
		livesRemaining = 9; 
	}

	public String getName() {// changed to string instead of void
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean feed() {
		return false; // changed to return
	}

	public boolean getIsHungry(){ // changed ishungry to IsHungry
		return isHungry;
	}

	public boolean equals(Cat other) {
		return name.equals(other.name) && breed.equals(other.breed)
			&& livesRemaining == other.livesRemaining; // changed to name.equals(other.name) and one equal to 2 equals
	}

	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
	}
}