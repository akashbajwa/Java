package lab;

public class Main {

    public static void main(String[] args) {
        Time T = new Time(1,2,3);
        System.out.println( T.Gethr() + " : " + T.Getmin() + " : " + T.Getseconds());
        if(T.SetTime(21,12 , 20) == false) ;//change value here!
        System.out.println("Wrong Time Entered!");

//-----------------Question # 2
        System.out.println("Enter First Matrix: ");
        Matrix m1 =  new Matrix(2,2);
        m1.Input();
        m1.Print();

        System.out.println();
        System.out.println("Enter Second Matrix: ");
        Matrix m2 =  new Matrix(2,2);
        m2.Input();
        m2.Print();
        // For addition in matrix# 1
        if(m1.Addition(m2)== true); //if true means addition succeed
        m1.Print();

        if(m1.Getcols() == m2.Getrows()) //boundry checks
        {
            Matrix m3; //Please note: additioned m1 = m1+m2 and m2 now together
            m3 =  m1.Multiplication(m2); ; //to hold returned object
            m3.Print();
        }
        else
            System.out.println("Matrix Multiplication is not Possible!");

    }

    // Question # 3 Post lab attached as actor and Society

	Actor[] a = new Actor[6]; // for 6 Students

        //Objects of actor class
        a[0] = new Actor("Jon Snow","18L-1111", (float) 4.5);
        a[1] = new Actor("Cersei Lannister","18L-1112", (float) 2.32);
        a[2] = new Actor("Tyrion Lannister","18L-1234", (float) 5.0);
        a[3] = new Actor("Arya Stark","18L-4567", (float) 4.92);
        a[4] = new Actor("Daenerys Targaryen","18L-5621", (float) 1.77);
        a[5] = new Actor("Jamie Lannister","18L-1151", (float) 3.55);

        Society s = new Society();
        s.setName("Game of Thrones");
        s.setMembers(a);
        s.AppointPresident(); //Appoints an actor with highest rating as president -- > setpresident()
        s.printinfo(); // printing data
}
