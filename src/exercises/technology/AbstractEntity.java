package exercises.technology;

public abstract class AbstractEntity {

    public int iD;
    public static int nextID = 22;

    public AbstractEntity() {
        this.iD = nextID;
        nextID ++;
    }
}
