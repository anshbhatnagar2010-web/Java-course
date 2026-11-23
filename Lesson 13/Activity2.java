class Book { 
    private String title; 
    private String author; 
    private int numPages; 
    public Book(String title, String author, int numPages) { 
        this.title = title; 
        this.author = author; 
        this.numPages = numPages; 
    } 
public String getTitle(){ 
    return title; 
} 
public String getAuthor(){ 
    return author; 
} 
public int getNumPages(){ 
    return numPages; 
    } 
}

class Textbook extends Book {
    private int editionNumber;
    public Textbook (String title, String author, int numPages, int editionNumber){
        super(title, author, numPages);
        this.editionNumber = editionNumber;
    }
    public int getEditionNumber(){
        return editionNumber;
    }
    public getBookInfo(){
        return getTitle() + ", " + getAuthor() + ", " + getNumPages() + ", " + getEditionNumber();
    }
    public boolean canSubstituteFor(Textbook diff){
        return this.getTitle() == diff.getTitle() && this.getEditionNumber() >= diff.getEditionNumber();
    }
}
