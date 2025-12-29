package locations;
import java.util.ArrayList;
import java.util.List;

public class CastleRoom {
    private String name;
    private List<String> contents;

    public CastleRoom(String name) {
        this.name = name;
        this.contents = new ArrayList<>();
    }

    public void addContent(String item) {
        contents.add(item);
    }

    public void describe() {
        System.out.println("В красивой дворцовой комнате были \"" + name + "\" ");
        for (String item : contents) {
            System.out.println("  - " + item);
        }
    }
}

