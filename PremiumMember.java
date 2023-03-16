

public class PremiumMember extends Member {

    private String MemberName;
    private String MemberStatus;
    private int MemberID;
    private String PremMemberName;
    private String PremMemberStatus;
    private int PremMemberID;


    public PremiumMember(String MemberName, String MemberStatus, int MemberID) {
        super(MemberName, MemberStatus, MemberID);
        //TODO Auto-generated constructor stub
    }


    public String getMemberName(){
        return MemberName;
    }

    public void setMemberName(String MemberName){
        this.MemberName = PremMemberName;
    }

    public int getMemberID(){
        return MemberID;
    }

    public void setPremMemberID(int MemberID){
        this.MemberID = PremMemberID;
    }

    public String getPremMemberStatus(){
        return MemberStatus;
    }

    public void setPremMemberName(String MemberStatus){
        this.MemberStatus = PremMemberStatus;
    }




    



}
