public class UI {
    private static String informationMessage;
    public static void addObraMessage(){
        informationMessage = "La obra ha sido añadida";
    }
    public static void displayMessage(){
        System.out.println(informationMessage);
    }
}
