public class Player {
    protected int id;
    protected int strenght;
    protected String name;

    public Player(int id, int strenght, String name) {
        this.id = id;
        this.strenght = strenght;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
