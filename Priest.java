
public class Priest extends Character implements MarryCouple {
    public Priest(String name, String traits) {
        super(name, traits);
    }

    @Override
    public void say() {
        System.out.println();
    }

    @Override
    public void hasNoClue() {
        System.out.println("Всегда внимательный священник не смог понять, что Королевич был окутан страхом разоблачения его лжи");
    }

    @Override
    public void marryCouple(Prince prince, Princess princess) {
        System.out.println(getName() + " обвенчал " + prince.getName() + "а и " + princess.getName().substring(0, princess.getName().length() - 1) + "у");

    }

    @Override
    public String toString() {
        return "Персонаж" + getName() + getTraits();
    }
}