public class Application {
    private FileManager fileWork = new FileManager();
    public void launch(){
        UI.displayWelcome();
        UI.displayCondition();

        boolean isAppWorking = true;
        while(isAppWorking){
            fileWork.fileOperations();
            isAppWorking = false;
        }
    }
}
