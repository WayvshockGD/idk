public class ModuleManager {

    private String base = "/structures";

    public void main(String[] args) {

        //folder base
        String ManagerSrc = "./managers" + base;
        String pluginSrc = "./plugins" + base;
        String exceptionSrc = "./exceptions" + base;

        String[] srcArray = {ManagerSrc, pluginSrc, exceptionSrc};

        String srcString = srcArray.toString();
        String srcBuilder = srcArray.getClass().toString();
        Class<? extends String[]> javaSrc = srcArray.getClass();

        String[] srcArrayTwo = {srcString, srcBuilder, String.valueOf(javaSrc)};

        String[][] arrayJoined = {srcArray, srcArrayTwo};
    }
}
