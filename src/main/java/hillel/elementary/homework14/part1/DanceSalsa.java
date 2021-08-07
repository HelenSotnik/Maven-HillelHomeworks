package hillel.elementary.homework14.part1;

public interface DanceSalsa {
    default String dance(){
        return "I can dance Salsa";
    }

    static void getSalsaDescription(){
        System.out.println("Salsa.Originating from Cuba, this dance has a time signature of 4/4. " +
                "It is based on a repeated rhythm, called clave rhythm, and follows a repeated " +
                "pattern of chords.");
    }

    String getAddressOfSalsaDanceSchool();

    String getDescriptionOfSalsaShoes();
}
