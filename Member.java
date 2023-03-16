
public class Member {
    private String MemberName = "";
    private String MemberStatus = "";
    private int MemberID = 0;


    public Member(String MemberName, String MemberStatus, int MemberID){
        this.MemberName = MemberName;
        this.MemberStatus = MemberStatus;
        this.MemberID = MemberID;

    }


    /**
     * @return
     */
    public String getMemberName(){
        return MemberName;
    }

    public void setMemberName(String MemberName){
        this.MemberName = MemberName;
    }

    /**
     * @return
     */
    public String getMemberStatus(){
        return MemberStatus;
    }

    /**
     * @param MemberStatus
     */
    public void setMemberStatus(String MemberStatus){
        this.MemberStatus = MemberStatus;
    }

    /**
     * @return
     */
    public int getMemberID(){
        return MemberID;
    }

    /**
     * @param MemberID
     */
    public void setMemberName(int MemberID){
        this.MemberID = MemberID;
    }

    @Override

    public String toString(){
        return "Name: " + MemberName + " - Status:" + MemberStatus + " ID: " + MemberID;
    }

   



}
