package hillel.elementary.homework14.part1;

public interface DanceBallet {
    default String dance(){
        return "I can dance Ballet";
    }

    static void getBalletDescription(){
        System.out.println("Ballet is a classical dance form demanding grace and precision and " +
                "employing formalized steps and gestures set in intricate, flowing " +
                "patterns to create expression through movement.");
    }

    String getAddressOfBalletStudio();

    String getNameOfBalletShow();
}
