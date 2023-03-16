public class Book {

    private String BookName = "";
    int BookCost = 0;



    /**
     * @param BookName
     * @param BookCost
     */
    public Book(String BookName, int BookCost){

        this.BookName = BookName;
        this.BookCost = BookCost;

    }



    //Getters and Setters

    /**
     * @return
     */
    public String getBookName(){
        return BookName;
    }

    /**
     * @param BookName
     */
    public void setBookName(String BookName){
        this.BookName = BookName;
    }

    /**
     * @return
     */
    public int getBookCost(){
        return BookCost;
    }

    /**
     * @param BookCost
     */
    public void setBookCost(int BookCost){
        this.BookCost = BookCost;
    }

    @Override

    public String toString(){
        return "Item: " + BookName + " - $" + BookCost +  "(Book)";
    }



}
