package hillel.elementary.homework14.part1;

public interface DanceWaltz {
    default String dance(){
        return "I can dance Waltz";
    }

    static void getWaltzDescription(){
        System.out.println("The waltz  is a ballroom and folk dance, normally in triple time," +
                " performed primarily in closed position.");
    }

    String getNameOfWaltzSong();

    String getWaltzCostumeDescription();
}
