public class AppChecker {

    public static void main(String[] args) {

        App app = new App("App główna", "Model Testowy");
        app.appInfo();
        AndroidApp androidApp = new AndroidApp("Android", "Q20");
        androidApp.runAndroidApp();
        androidApp.appInfo();
        IphoneApp iphoneApp = new IphoneApp("Iphone", "13Pro");
        iphoneApp.runIphoneApp();


    }
}
