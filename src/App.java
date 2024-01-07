public class App {
    public static void main(String[] args) throws Exception {
        IphoneSetting settings = IphoneSetting.getInstance();
        settings.setisWifiEnable(false);
        System.out.println("is wifi connected?" + settings.getWifiEnable());

        settings.setBrightness(89);
        System.out.println("brightness is:" + settings.getBrightness());
    }
}
