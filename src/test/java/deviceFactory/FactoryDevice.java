package deviceFactory;

public class FactoryDevice {
    public static IDevice make (String type) {
        IDevice device;
        switch (type) {
            case "android":
                device = new Android();
                break;
            case "browserStack":
             device = new BrowserStack();
             break;
            default:
              device = new BrowserStack();
             break;
        }
        return device;
    }
}
