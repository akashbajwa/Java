package lab;

public class Society {
    private
    String nameOfSociety;
    Actor President;
    Actor members[];
    int totalMembers;

    public Society(String nameOfSociety) {
        this.nameOfSociety = nameOfSociety;
    }

    public Society(String nameOfSociety, Actor president, Actor[] members, int totalMembers) {
        this.nameOfSociety = nameOfSociety;
        this.President = president;
        this.members = members;
        this.totalMembers = totalMembers;
    }

    public void PrintInfo() {

        if (nameOfSociety != null) {
            System.out.println("Society: " + nameOfSociety);

        } else
            System.out.println("Society name is not available\n");

        if (President != null) {
            System.out.print("President is: ");
            President.prints();
        } else
            System.out.println("President not Available");

        if (totalMembers != 0) {
            int i = 0;
            System.out.print("Members Are:\n");
            while (members[i] != null) {
                members[i].prints();
                i++;
            }

        } else {
            System.out.println("Society have not any member\n");
        }
    }
    public void AppointPresident(Actor obj){

        if(President.getRating() <= obj.getRating())
        {
            President = obj;
        }
        else
            System.out.println("President having low rating\n");
    }
}

