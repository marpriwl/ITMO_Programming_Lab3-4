
public class Maid extends Character {
    public Maid(String name, String traits) {
        super(name, traits);
    }

    @Override
    public void say() {
        System.out.println(getName() + " объявила об обеде");
    }

    @Override
    public void hasNoClue() {
        System.out.println("Фрейлина - самая приближенная слуга Королевича и Принцессы, но и она не смогла разглядеть и намека на тайну Королевича");
    }
    @Override
    public String toString() {
        return "Персонаж" + getName() + getTraits();
    }
}
