package structual.flyweight;

public class TextEditor {
    public void runFlyweight() {
        String document = "AAZZBBZ";

        CharacterFactory factory = new CharacterFactory();

        for (char c : document.toCharArray()) {
            FlyweightCharacter character = factory.getCharacter(c);
            character.printCharacter();
        }
    }

    public static void main(String[] args) {
        new TextEditor().runFlyweight();
    }
}