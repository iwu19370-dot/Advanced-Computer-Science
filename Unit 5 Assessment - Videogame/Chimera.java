public class Chimera extends Monster {

    public Chimera() {
        super("M1", ElementType.FIRE, 100, 50, 50, 50, "M1 Super Attack 1", "M1 Super Attack 2", ElementType.FIRE, ElementType.WATER);
    }

    @Override
    public String victoryNoise() {
        return "CHIOARRR";
    }
}
