package hillel.elementary.homework21.adapter;

public class HelmetVR implements PlaystationVR {
    private GamePlayer player;

    public HelmetVR(GamePlayer player) {
        this.player = player;
    }

    @Override
    public void connectToVirtualReality() {
        System.out.println("Helmet is on.");
        this.player.startVideoGame();
    }

    @Override
    public void disconnectFromVirtualReality() {
        System.out.println("Helmet is off.");
        this.player.finishVideoGame();
    }
}
