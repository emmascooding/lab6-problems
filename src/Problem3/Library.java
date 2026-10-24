package Problem3;

import java.util.ArrayList;
import java.lang.StringBuilder;

public class Library {
    private int capacity;
    int docCount=0;
    ArrayList<Document> documents;

    public Library(int capacity){
        this.capacity=capacity;
        documents = new ArrayList<>(capacity);
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void displayDocuments(){
        for (Document doc : documents){
            System.out.println(doc.toString());
        }
    }
    public boolean add(Document doc){
        if (docCount < capacity && !documents.contains(doc)){
            documents.add(doc);
            docCount++;
            return true;
        }
        else { return false; }
    }
    public boolean delete(Document doc){
        for (int i=0; i<docCount;i++){
            if (documents.get(i).getNumRec()==doc.getNumRec()){
                documents.remove(i);
                docCount--;
                return true;
            }
        }
        return false;
    }

    public Document document(int numRec){
        for (Document doc : documents){
            if (doc.getNumRec()==numRec){
                return doc;
            }
        }
        return null;
    }
    public void displayAuthors(){
        for (Document doc : documents){
            if (doc instanceof Book){
                Book book = (Book) doc;
                System.out.println(book.getAuthor());
            }
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Document doc : documents){
            sb.append(doc.toString());
        }
        return sb.toString();
    }
}
