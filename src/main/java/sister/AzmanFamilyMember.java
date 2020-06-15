package sister;

/**
 * @author Kerem
 * 6/15/2020
 */
public abstract class AzmanFamilyMember implements SisterObserver  {
    private String memberName;
    public void update(SisterLocationType sisterLocationType) {
        System.out.println( "Azman Family Member :"+memberName+" is know Sister Location which is "+sisterLocationType);
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
