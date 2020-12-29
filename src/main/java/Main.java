import java.io.FileNotFoundException;

public class Main extends FileNotFoundException {

    //boolean items i need to disable them somehow ¯\_(ツ)_/¯
    private boolean ManagerDisabled = false;
    private boolean PluginsDisabled = false;
    private boolean ExceptionsDisabled = false;

    private String base = "/structures";

    private String[] Plugins = {"Exceptions.java", "Managers.java"};
    public void main(String[] args) {

        //folder base
        String ManagerSrc = "./managers" + base;
        String pluginSrc = "./plugins" + base;
        String exceptionSrc = "./exceptions" + base;

        String[] SrcArray = {ManagerSrc, pluginSrc, exceptionSrc};

        String processManager = ManagerSrc;
        String processManager2 = pluginSrc;
        String processManager3 = exceptionSrc;

        // Required Errors ¯\_(ツ)_/¯
        if(ManagerSrc == null) {
            System.out.println(this.getStackTrace());
        } else if (pluginSrc == null) {
            System.out.println(this.getStackTrace());
        } else if (exceptionSrc == null) {
            System.out.println(this.getStackTrace());
        }
    }
}
