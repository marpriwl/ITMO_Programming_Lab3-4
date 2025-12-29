package enums;

public enum Children {
    MORNING_DAWN ("Утренняя Заря"),
    BRIGHT_DAY ("Ясный день");
    private final String name;
    Children (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

