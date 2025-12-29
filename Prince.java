import exceptions.MothersAngerException;

public class Prince extends Character implements LoversActions {
    private boolean lovesPrincess = true;
    private boolean keepsSecret = true;
    private boolean imprisoned = false;

    public Prince(String name, String traits) {
        super(name, traits);
    }
    public void admire(Princess princess) {
        if (lovesPrincess) {
            System.out.println(getName() + " был восхищен красотой " + princess.getName().substring(0, princess.getName().length()-1) + "ы");
            System.out.println(getName() + " промолчал, что платье " + princess.getName().substring(0, princess.getName().length()-1) + "ы" +
                    " было " + princess.getDress().getDescription());
        } else {
            System.out.println(getName() + " больше не восхищен " + princess.getName());
            System.out.println("Платье теперь кажется ему " + princess.getDress().getDescription());
        }
    }
    public void goHome(ParentsHouse home) {
        System.out.println(getName() + " поехал в " + home.description());
    }

    public boolean answerMothersQuestions(boolean tellTruth) throws MothersAngerException {
        if (tellTruth) {
            System.out.println(getName() + " рассказал матери правду");
            throw new MothersAngerException("Мать разозлилась!");
        } else {
            System.out.println(getName() + " соврал, что заблудился на охоте и провел ночь в избушке лесника");
            keepsSecret = true;
            return true;
        }
    }
    public boolean keepSecretLonger() {
        System.out.println(getName() + " смог сохранить секрет");
        return true;
    }

    public void fallOutOfLove() {
        System.out.println("Чары любви ослабли...");
        lovesPrincess = false;
    }

    public void setImprisoned(boolean imprisoned) {
        this.imprisoned = imprisoned;
        if (imprisoned) {
            System.out.println(getName() + " был отправлен в заточение");
        }
    }
    public boolean isImprisoned() {
        return imprisoned;
    }

    public boolean lovesPrincess() {
        return lovesPrincess;
    }

    public void returnHome() {
        System.out.println(getName() + " возвращается домой");
    }


    @Override
    public void say() {}


    @Override
    public void hasNoClue() {
        System.out.println("Ни одна душа в Королевстве не догадалась о секрете Принца");
    }

    @Override
    public void eatDinner() {
        System.out.println(getName() + " был очарован старинными кушаньями и музыкой");
    }

    @Override
    public void marry() {}

    @Override
    public void birthKids() {
        System.out.println("Так и жили они - долго и счастливо!...");
    }

    @Override
    public String toString() {
        return "Персонаж" + getName() + getTraits();
    }
}
