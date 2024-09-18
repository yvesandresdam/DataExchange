import java.util.List;

public class Author {
    private static String name;
    private static String nacionality;
    private List<Obra> obraList;

    public Author(String name, String nacionality){
        Author.name = name;
        Author.nacionality = nacionality;
    }
    public static String getNacionality() {
        return nacionality;
    }

    public static void setNacionality(String nacionality) {
        Author.nacionality = nacionality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Author.name = name;
    }

    public void addObra(Obra obra) throws NullPointerException{
        if(obra == null)
            throw new NullPointerException("La obra no existe");
        else
        {
            obraList.add(obra);
            UI.addObraMessage();
        }
    }
}
