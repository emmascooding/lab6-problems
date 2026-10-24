package Problem3;

public class Document {
    private int numRec;
    private String title;
    private static int counter = 0;

    public Document(String title){
        counter++;
        this.title=title;
        this.numRec= counter;
    }

    public int getNumRec(){
        return this.numRec;
    }

    public String toString(){
        return numRec + "  Title: " + title;
    }
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        Document doc = (Document) o;
        if (this.numRec == doc.numRec){
            return true;
        }
        return false;
    }
}
