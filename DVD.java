public class DVD {
    int DVDCost = 0;
    private String DVDName = "";



    /**
     * @param DVDCost
     * @param DVDName
     */
    public DVD(int DVDCost, String DVDName){
        this.DVDCost = DVDCost;
        this.DVDName = DVDName;

    }


    /**
     * @return
     */
    public int getDVDCost(){
        return DVDCost;
    }

    /**
     * @param DVDCost
     */
    public void setDVDCost(int DVDCost){
        this.DVDCost = DVDCost;
    }

    /**
     * @return
     */
    public String getDVDName(){
        return DVDName;
    }

    /**
     * @param DVDName
     */
    public void setDVDNane(String DVDName){
        this.DVDName = DVDName;
    }

    @Override

    public String toString(){
        return "Item: " + DVDName + " - $" + DVDCost + "(DVD)";
    }
}
