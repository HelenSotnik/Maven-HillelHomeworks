package hillel.elementary.homework14.part1;

public interface DanceRumba {
    default String dance() {
        return "I can dance Rumba";
    }

    static void getRumbaDescription() {
        System.out.println("Rumba is a Cuban dance, but it can also be found in " +
                "other Caribbean islands. It is slower, with a time signature of 4/4. " +
                "Like many of the other dances, the syncopated rhythms are of African origin.");
    }

    String getNameOfRumbaSong();

    String getDescriptionOfRumbaCostume();
}
