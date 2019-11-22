public class Rose extends Flowers {
    Rose(){}
    public Rose( double price,  String color, double lengthStem, int levelFresh) {
        super( price, color, lengthStem, levelFresh);

    }



    @Override
    public String toString() {
        return "Роза "  +
                super.toString();
    }
}
