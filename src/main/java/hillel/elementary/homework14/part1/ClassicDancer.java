package hillel.elementary.homework14.part1;

public class ClassicDancer implements DanceBallet, DanceWaltz {
    @Override
    public String dance() {
        return "I am classic dancer. I can dance Ballet and Waltz";
    }

    @Override
    public String getNameOfWaltzSong() {
        return "Name Of song for Waltz Dance: Evgenii Doga - Moy laskoviy nezhniy zver";
    }

    @Override
    public String getWaltzCostumeDescription() {
        return "Waltz Costume Description: For a slow waltz, men wear trousers, a shirt and a tailcoat. " +
                "For a women, you need a long dress. " +
                "Closed shoes with heels from 3 to 7 centimeters.";
    }

    @Override
    public String getAddressOfBalletStudio() {
        return "Address of Ballet Studio: Lva Tolstoho 18-A, 2nd Floor";
    }

    @Override
    public String getNameOfBalletShow() {
        return "Name of Ballet Show: The Nutcracker";
    }
}
