import java.util.HashSet;

public class Room {
    private static String name;
    private HashSet<Obra> obraCollection;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Room.name = name;
    }

    public void addObra(Obra obra) {
        for (Obra obraCol : obraCollection) {
            if (obra.equals(obraCol)) {
                return;
            } else {
                obraCollection.add(obra);
            }
        }
    }
    public void addObraAlternative(Obra obra) {
        if (obra.getRoom() == this) {
            System.out.println("La obra ya existe en la sala");
            return;
        } if (obra == null) {
            System.out.println("La obra introducida es null");
            return;
        } else {
            obraCollection.add(obra);
        }
    }
}

