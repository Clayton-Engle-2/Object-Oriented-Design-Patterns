package structual.flyweight;

//Flyweight class
public class FlyweightCharacter {

    private char character;
    private String font;
    private int size;
    private String color;

    public FlyweightCharacter(char character, String font, int size, String color) {
        this.character = character;
        this.font = font;
        this.size = size;
        this.color = color;
    }
    
    public FlyweightCharacter(char character) {
        this.character = character;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void printCharacter() {
        System.out.println("Character: " + character + ", Font: " + font + ", Size: " + size + ", Color: " + color);
    }

}