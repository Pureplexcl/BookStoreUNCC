public class CD {
    private String CDName = "";
    int  CDCost = 0;


    /**
     * @param CDName
     * @param CDCost
     */
    public CD(String CDName, int CDCost){
        this.CDCost = CDCost;
        this.CDName = CDName;

    }


    /**
     * @return
     */
    public int getCDCost(){
        return CDCost;
    }

    /**
     * @param CDCost
     */
    public void setCDCost(int CDCost){
        this.CDCost = CDCost;
    }

    
    /**
     * @return
     */
    public String getCDName(){
        return CDName;
    }

    /**
     * @param CDName
     */
    public void setCDName(String CDName){
        this.CDName = CDName;
    }

    @Override


    public String toString(){
        return "Item: " + CDName + " - $" + CDCost + "(CD)";
    }



}
