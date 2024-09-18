public class Obra {
    private static String title;
    private Author author;
    private Room room;

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Obra.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        if(author == null)
            throw new IllegalArgumentException("El autor es nulo");
        this.author = author;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
