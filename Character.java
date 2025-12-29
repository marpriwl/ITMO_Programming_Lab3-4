public abstract class Character {
    private String name;
    private String traits;

    public Character (String name, String traits) {
        this.name = name;
        this.traits = traits;
    }

    public abstract void say();
    public abstract void hasNoClue();

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setTraits( String traits){
        this.traits = traits;
    }

    public String getTraits() {
        return traits;
    }
}
