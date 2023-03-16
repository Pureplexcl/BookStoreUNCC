import java.util.ArrayList;

public class BookStore<Order> {
    private ArrayList<Order> OrderList;
    private static int nextOrderNum;


    /**
     * @param Book1
     * @param Book2
     */
    public BookStore(Order Book1, Order Book2, Order dvd1, Order dvd2, Order cd1, Order c2, Order member1, Order member2 ){
        this.OrderList = new ArrayList<Order>();
        this.OrderList.add(Book1);
        this.OrderList.add(Book2);
        this.OrderList.add(dvd1);
        this.OrderList.add(dvd2);
        this.OrderList.add(member2);
        this.OrderList.add(member2);






        BookStore.incrementNextOrderNum();
    }
    
    public static int getNextOrderNum(){
        return nextOrderNum;
    }

    private static void incrementNextOrderNum(){
        BookStore.nextOrderNum += 1;
    }

    

    


}


