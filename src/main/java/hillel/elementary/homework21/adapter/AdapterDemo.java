package hillel.elementary.homework21.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        PlaystationVR helmet = new HelmetVR(new GamePlayer());
        helmet.connectToVirtualReality();
        helmet.disconnectFromVirtualReality();
    }
}
