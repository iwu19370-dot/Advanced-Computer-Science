public class Mythara extends Monster {
	
	public Mythara() {
		super("M2", ElementType.EARTH, 50, 50, 75, 50, "M2 Super Attack 1", "M2 Super Attack 2", ElementType.AIR, ElementType.EARTH);
	}
	
	@Override
	public String victoryNoise() {
		return "MYTHOARRRR";
	}
}