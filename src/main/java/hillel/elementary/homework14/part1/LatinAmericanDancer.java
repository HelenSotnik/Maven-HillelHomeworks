package hillel.elementary.homework14.part1;

import hillel.elementary.homework14.part1.DanceRumba;
import hillel.elementary.homework14.part1.DanceSalsa;

public class LatinAmericanDancer implements DanceSalsa, DanceRumba {
    @Override
    public String dance() {
        return "I am a Latin American Dancer. I can dance Salsa and Rumba";
    }

    @Override
    public String getAddressOfSalsaDanceSchool() {
        return "Address Of Salsa Dance School: Sahaidachnoho 101";
    }

    @Override
    public String getDescriptionOfSalsaShoes() {
        return "Description of shoes for Salsa: The style has soft suede leather sole and a soft insole. " +
                "Forefoot is made with plates. The shoe features a covered 7cm heel." +
                " Latin shoes for men should have a heel as well.";
    }

    @Override
    public String getNameOfRumbaSong() {
        return "Name of song for Rumba Dance: Cantinero de Cuba";
    }

    @Override
    public String getDescriptionOfRumbaCostume() {
        return "Description of Rumba Costume: The woman‘s bata cubana ensemble is not a dress but consists of a " +
                "long flamenco-style skirt cut low on her hips and a bustier. " +
                "The man is wearing a pair of narrow high-waisted white cotton trousers. " +
                "He has on a  rumba shirt (guarachera) whose body is made of black velvet " +
                "and is decorated with red braid down the front. ";
    }
}
