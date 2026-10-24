package Problem3;

import java.util.Scanner;
import java.lang.StringBuilder;
public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the capacity of the library");

        Library library = new Library(scan.nextInt());

        Novel novel = new Novel("Pride and Prejudice", "Jane Austen",448, 50.0);
        Magazine magazine = new Magazine("Science & Vie", "January", 2015);

        library.add(novel);
        library.add(magazine);

        StringBuilder menu = new StringBuilder();
        menu.append("Select the operation to do:\n")
                .append("1: Add a document to the library\n")
                .append("2: Display all documents in the library\n")
                .append("3: Delete an document from the library\n")
                .append("4: Find document by NumRec\n")
                .append("5: Display all authors in the library\n")
                .append("6: Exit Menu");

        int n;
        do {
            System.out.println(menu.toString());
            n = scan.nextInt();
            scan.nextLine();
            switch (n) {
                case 1:
                    System.out.println("Enter document title: ");
                    addDocument(scan, library);
                    break;
                case 2:
                    library.displayDocuments();
                    break;
                case 3: {
                    System.out.println("Enter the NumRec of the document to delete");
                    Document toDelete = library.document(scan.nextInt());
                    scan.nextLine();
                    if (toDelete != null && library.delete(toDelete)) {
                        System.out.println("Document deleted");
                    } else {
                        System.out.println("Failure: document not found");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter the NumRec of the document to find");
                    Document found = library.document(scan.nextInt());
                    scan.nextLine();
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Document not found");
                    }
                    break;
                }
                case 5:
                    library.displayAuthors();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (n!=6);

        scan.close();
    }

    private static void addDocument(Scanner scan, Library library) {
        System.out.println("Type of document: 1: Novel  2: Textbook  3: Magazine  4: Dictionary");
        int type = scan.nextInt();
        scan.nextLine();

        System.out.println("Title: ");
        String title = scan.nextLine();

        Document doc;
        switch (type) {
            case 1: {
                System.out.println("Author: ");
                String author = scan.nextLine();
                System.out.println("Number of pages: ");
                int pages = scan.nextInt();
                System.out.println("Price: ");
                double price = scan.nextDouble();
                scan.nextLine();
                doc = new Novel(title, author, pages, price);
                break;
            }
            case 2: {
                System.out.println("Author: ");
                String author = scan.nextLine();
                System.out.println("Number of pages: ");
                int pages = scan.nextInt();
                scan.nextLine();
                System.out.println("Level: ");
                String level = scan.nextLine();
                doc = new Textbook(title, author, pages, level);
                break;
            }
            case 3: {
                System.out.println("Month: ");
                String month = scan.nextLine();
                System.out.println("Year: ");
                int year = scan.nextInt();
                scan.nextLine();
                doc = new Magazine(title, month, year);
                break;
            }
            case 4: {
                System.out.println("Language: ");
                String language = scan.nextLine();
                doc = new Dictionary(title, language);
                break;
            }
            default:
                System.out.println("Invalid type");
                return;
        }

        if (library.add(doc)) {
            System.out.println("Document added");
        } else {
            System.out.println("Failure: the library is full or the document already exists");
        }
    }
}
