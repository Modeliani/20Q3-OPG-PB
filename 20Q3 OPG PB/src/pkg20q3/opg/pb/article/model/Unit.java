package pkg20q3.opg.pb.article.model;

public enum Unit {
    NO_UNIT("No unit"), 
    PIECE("Pieces"), 
    LITER("Liters"), 
    KILO("Kilos");

    private final String name;

    Unit(String name) {
        this.name = name;
    }

    public static String[] names() {
        Unit[] units = values();
        String[] unitNames = new String[units.length];

        int i = 0;
        for (Unit unit : units) {
            unitNames[i] = unit.toString();
            i++;
        }
        return unitNames;
    }

    public static Unit parse(String string) {
        switch (string) {
            case "Pieces": {
                return PIECE;
            }
            case "Liters": {
                return LITER;
            }
            case "Kilos": {
                return KILO;
            }
            default: {
                return NO_UNIT;
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
