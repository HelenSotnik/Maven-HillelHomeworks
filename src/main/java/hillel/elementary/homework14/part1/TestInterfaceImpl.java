package hillel.elementary.homework14.part1;


public class TestInterfaceImpl {
    public static void main(String[] args) {
        LatinAmericanDancer latinDancer = new LatinAmericanDancer();

        System.out.println(latinDancer.dance());
        DanceSalsa.getSalsaDescription();
        DanceRumba.getRumbaDescription();

        System.out.println(latinDancer.getAddressOfSalsaDanceSchool());
        System.out.println(latinDancer.getDescriptionOfRumbaCostume());
        System.out.println(latinDancer.getDescriptionOfSalsaShoes());
        System.out.println(latinDancer.getNameOfRumbaSong());

        ClassicDancer classicDancer = new ClassicDancer();

        System.out.println(classicDancer.dance());
        DanceWaltz.getWaltzDescription();
        DanceBallet.getBalletDescription();

        System.out.println(classicDancer.getAddressOfBalletStudio());
        System.out.println(classicDancer.getNameOfBalletShow());
        System.out.println(classicDancer.getWaltzCostumeDescription());
        System.out.println(classicDancer.getNameOfWaltzSong());
    }
}
