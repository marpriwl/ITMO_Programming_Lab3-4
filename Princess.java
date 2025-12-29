

import static enums.Children.BRIGHT_DAY;
import static enums.Children.MORNING_DAWN;

public class Princess extends Character implements LoversActions {
    private final Dress dress;
    private boolean lovesPrince = true;
    public Princess(String name, String traits, Dress dress) {
        super(name, traits);
        this.dress = dress;
    }

    public Dress getDress() {
        return dress;
    }

    public void setLovesPrince(boolean loves) {
        this.lovesPrince = loves;
    }
    public boolean lovesPrince() {
        return lovesPrince;
    }

    public void waitTooLong() {
        System.out.println(getName() + " ждала слишком долго...");
        lovesPrince = false;
    }


    @Override
    public void say() {
        System.out.println(getTraits() + " " + getName() + " прошептала: Как же долго я вас ждала, мой" + " Принц" );
    }


    @Override
    public void hasNoClue() {
        System.out.println("Побежденная чарами любви Принцесса даже не задумывалась о том, что Королевич мог врать");
    }

    @Override
    public void eatDinner() {
        System.out.println(getName() + " пообедала с Принцем в красивой дворцовой комнате");
    }

    @Override
    public void marry() {
        System.out.println(getName() + " обвенчалась с Принцем");
    }

    @Override
    public void birthKids() {
        System.out.println("У Королевича и Принцессы родилось двое детей " + MORNING_DAWN.getName() + " и " + BRIGHT_DAY.getName());
    }

    @Override
    public String toString() {
        return "Персонаж" + getName() + getTraits();
    }
}
