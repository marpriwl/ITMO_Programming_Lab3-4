

public class Mother extends Character {
    public Mother(String name, String traits) {
        super(name, traits);
    }


    public void askQuestions(Prince prince) {
        System.out.println(getName() + " расспрашивала " + prince.getName() + "а");
    }

    public void suspect() {
        System.out.println(getName() + " подозревает сына и просит остаться подольше");
    }

    public void sendToImprisonment(Prince prince) {
        System.out.println(getName() + " отправляет " + prince.getName() + "а" + " в заточение");
        prince.setImprisoned(true);
    }
    @Override
    public void say() {}

    @Override
    public void hasNoClue() {
        System.out.println(getTraits() + " " + getName() + " не выпытала секрет сына, так и не узнав о его венчании с Принцессой");
    }

    @Override
    public String toString() {
        return "Персонаж" + getName() + getTraits();
    }
}