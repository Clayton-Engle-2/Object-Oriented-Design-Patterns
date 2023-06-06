package structual.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterFactory {

    private Map<Character, FlyweightCharacter> characters = new HashMap<>();

    public FlyweightCharacter getCharacter(char characterKey, String font, int size, String color) {
        FlyweightCharacter character = characters.get(characterKey);
        if (character == null) {
            character = new FlyweightCharacter(characterKey, font, size, color);
            characters.put(characterKey, character);
        }
        return character;
    }

    public List<FlyweightCharacter> getCharacters(String font, int size, String color) {
        List<FlyweightCharacter> matchingCharacters = new ArrayList<>();
        for (FlyweightCharacter character : characters.values()) {
            if (character.getFont().equals(font) && character.getSize() == size && character.getColor().equals(color)) {
                matchingCharacters.add(character);
            }
        }
        return matchingCharacters;
    }
    
    public FlyweightCharacter getCharacter(char characterKey) {
        FlyweightCharacter character = characters.get(characterKey);
        if (character == null) {
            character = new FlyweightCharacter(characterKey);
            characters.put(characterKey, character);
        }
        return character;
    }
}