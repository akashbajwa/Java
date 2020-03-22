/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import java.util.Scanner;
import java.*
/**
 *
 * @author l176341
 */
class Date{

    private
            int Day;
            int Month;
            int Year;
    public
            Date()
            {
                Day =0;
                Month =0;
                Year =0;
                
            }
            Date(int _Day,int _Month,int _Year)
            {
                        Day= _Day;
                        Month = _Month;
                        Year = _Year;
            }
        void printDate()
        {
            if(Day != 0 && Month != 0 && Year != 0)
                System.out.println(Day +"/" + Month +"/"+Year);
            else
                System.out.println("\tDate is not Available\n");
        }
        public void setDate(int day,int month,int year)
        {
            Day= day;
            Month = month;
            Year =year;
        }
}
class Employee
{
   private String Name;
   private String Department;
   private String Designation;
   private int age;
   Cabin  []myCabins;
    Employee()
    {
        Name = null;
        Department = null;
        Designation = null;
        age =0;
        myCabins=null;
        
    }
    Employee(String _Name,String _Department, String _Designation,int _age,Cabin _myCabins[])
    {
        Name = _Name;
        Department = _Department;
        Designation =_Designation;
        age = _age;
        myCabins = _myCabins;
    }
    void getEnployeeInfo()
    {
        System.out.println("Name: " + Name + "\n");
        System.out.println("Department: " + Department + "\n");
        System.out.println("Designation: " + Designation + "\n");
        System.out.println("Age = " + age + "\n");

    }
}
class Cabin
{
    private Employee owner;
    private Date allocationDate;
    private Date expireDate;
    boolean Possesion;
    public Cabin()
    {
        owner = null;
        allocationDate =null;
        expireDate = null;
        Possesion = false;
        
    }
    public void setAllocationDate(){ // setting expire and alloted time
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Enter Days: ");
        String Day = myObj.nextLine();
        
        System.out.print("Enter Month: ");
        String Month = myObj.nextLine();
        
        System.out.print("Enter Year: ");
        String Year = myObj.nextLine();
        
        allocationDate.setDate(Integer.parseInt(Day),Integer.parseInt(Month),Integer.parseInt(Year));
        
        if(Integer.parseInt(Day) + 7 > 30)
        {
            int month = Integer.parseInt(Month);
            month++;
            expireDate.setDate(Integer.parseInt(Day) + 7,month,Integer.parseInt(Year));
        }
        else
              expireDate.setDate(Integer.parseInt(Day) + 7,Integer.parseInt(Month),Integer.parseInt(Year));
    }
    public  Cabin(Employee _owner, Date _allocationDate,Date _expireDate,boolean _Possesion)
    {
        owner = _owner;
        allocationDate = _allocationDate;
        expireDate = _expireDate;
        Possesion = _Possesion;
    }
    public boolean checkAvilable()
     {
        if(Possesion == false)
            return true;
        
        return false;
     }
     public void deleteCabin()
     {
        owner = null;
        allocationDate = null;
        expireDate = null;
        Possesion = false;
     }
}
class Room
{
    private Cabin []totalCabins;
    private int Count =0;
    
    Room()
    {
        totalCabins = null;
        Count = 0;
    }
    Room(Cabin _totalCabins[], int _Count)
    {
        totalCabins = _totalCabins;
        Count = _Count;
    }
    void getCabinInfo()
    {
        if(totalCabins != null)
        {
            for(int i  = 0 ;  i < Count; i++)
            {
                if(!totalCabins[i].checkAvilable())
                {
                  System.out.println("Cabin # " + (i+1) + " is Available!");
                }
            }
        }
        else
            System.out.println("Empty Cabins!");
       
    }
    boolean AddCabin()
    {
      if(Count !=0)
      {
          int i =0;
          while(totalCabins[i] != null)
          {
              i++;
          }// add info
          totalCabins[i] = new Cabin() ;
          
          return true;
      }
      else
          System.out.println("Room is Full!");
      
      return false;
    }
    void AddEmployees(Employee addEmployee)
    {
        if(AddCabin())
    }
    
}
class Building
{
    private Room []totalRooms;
    private RoomCount;
    
    Building()
    {
        totalRooms = null;
    }
    
    Building(Room _totalRooms[])
    {
        totalRooms =  _totalRooms;
    }
   void printRoomInfo()
   {
       
   }
}


//----------------------------Question #2
class Auther
{
    private String Name;
    private String Gender;
    private Date DOB; // date of birth

    public Auther() {
        Name =null;
        Gender = null;
        DOB =null;
    }

    public Auther(String name, String gender, lab.Date DOB) {
        Name = name;
        this.Gender = gender;
        this.DOB = DOB;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public lab.Date getDOB() {
        return DOB;
    }

    public void setDOB(lab.Date DOB) {
        this.DOB = DOB;
    }
}
class Book
{
   String Name;
   String Genre;
   Date publishDate;
   float price;
   Auther []myAuther;
   Book()
   {
       Name =null;
       Genre = null;
       publishDate = null;
       price = 0;
       myAuther = null;
   }
   Book(String _name,String _Genre,Date _publishDate,float _price,Auther _myAuther[])
   {
       Name = _name;
       Genre = _Genre;
       publishDate = _publishDate;
       price = _price;
       myAuther = _myAuther;
   }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public lab.Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(lab.Date publishDate) {
        this.publishDate = publishDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public lab.Auther[] getMyAuther() {
        return myAuther;
    }

    public void setMyAuther(lab.Auther[] myAuther) {
        this.myAuther = myAuther;
    }

    void printBookInfo()
   {

       System.out.println("Name: " + Name);

       if(Genre)
       {
           System.out.println("Genre: " + Genre);
       }
       else
           System.out.println("Genre does not exist");
       if(publishDate)
       {
           System.out.println("Publish date is: "  + publishDate.printDate());
       }
       else
           System.out.println("Publish Date is not available");

       System.out.println("Price: Rs."+ price);
       if(myAuther)
       {
           int i=0;
           while(!myAuther[i])
           {
               System.out.println("Auther(s):\t\t" + "Gender\t\t" + "Date of Birth");
               System.out.println(myAuther[i].getName() + "\t\t" + myAuther[i].getGender() + "\t\t" + myAuther[i].getDOB());
                       i++;
           }

       }
       else
           System.out.println("Auther does not exist(Public Property): ");
       
   }

}
class Library
{
    String Name;
    String Address;
    Book []Books;
    Library()
    {
        Name = null;
        Address= null;
        Books = null;
    }
    Library(String _Name, String _Address,Book _Books[])
    {
        Name = _Name;
        Address = _Address;
        Books = _Books;
    }
    void printLibraryInfo()
    {
        System.out.println("Libary Name: \t\t" + "Address\t\t" + "Book Stock" );
        System.out.print(Name + "\t\t" + Address + "\t\t");
        if(Books)
        {
            int i = 0;
            while(!Books[i])
            {
                System.out.println("\t\t\t\t\t\t" + Books[i].Name);
                i++;
            }
        }
    }
}


// -----------------------Post Lab Question...........///// ///// ///
class Company {

    private
    Employee Employees;
    Building buildings;
    Department departments;
    public

}
class Department
{
    private String entrepriseName;  // common things among
    private int Expenses; // Default in $$

    public Department()
    {
        entrepriseName = null;
        Expenses = 0;

    }
    public Department(String _entrepriseName, int _Expenses)
    {
        entrepriseName = _entrepriseName;
        Expenses = _Expenses;
    }
}
class IT_Department extends Department
{
    private
    Laptop laptops;
    desktopPC PCs;
    Headphone headPhones;
    Mouse mouses;
    Keyboard keyboards;
    Router routers;
    Repeater repeaters;
    securityCamera camera;
    public
    IT_Department()
    {
        laptops = null;
        PCs = null;
        headPhones = null;
        mouses = null;
        keyboards = null;
        routers = null;
        repeaters = null;
        camera = null;
    }
    IT_Department( Laptop _laptops, desktopPC _PCs, Headphone _headPhones, Mouse _mouses, Keyboard _keyboards, Router _routers, Repeater _repeaters, securityCamera _camera)
    {
        laptops = _laptops;
        PCs = _PCs;
        headPhones = _headPhones;
        mouses = _mouses;
        keyboards = _keyboards
        routers = _routers
        repeaters = _repeaters;
        camera = _camera;

    }
    -- assigned Assets --borrowerEmployee

}
class Laptop
{
    String brandName;
    String modelNo;

    public Laptop() {
        brandName = null;
        modelNo =null;
    }

    public Laptop(String brandName, String modelNo) {
        this.brandName = brandName;
        this.modelNo = modelNo;
    }
}
class desktopPC
{
    String brandName;
    String modelNo;

    public desktopPC() {
        brandName = null;
        modelNo = null;
    }

    public desktopPC(String brandName, String modelNo) {
        this.brandName = brandName;
        this.modelNo = modelNo;
    }
}
class Headphone
{
    String brandName;
    String modelNo;

    public Headphone() {
        brandName =null;
        modelNo =null;
    }

    public Headphone(String brandName, String modelNo) {
        this.brandName = brandName;
        this.modelNo = modelNo;
    }
}
class Mouse
{
    private String brandName;
    private String modelNo;

    public Mouse() {
        brandName = null;
        modelNo = null;
    }

    public Mouse(String brandName, String modelNo) {
        this.brandName = brandName;
        this.modelNo = modelNo;
    }
}
class Keyboard
{
   private String brandName;
   private String modelNo;

    public Keyboard() {
        brandName = null;
        modelNo = null;
    }

    public Keyboard(String brandName, String modelNo) {
        this.brandName = brandName;
        this.modelNo = modelNo;
    }
}
class Router
{
    private String brandName;
    private String modelNo;

    public Router() {
        brandName =null;
        modelNo =null;
    }

    public Router(String brandName, String modelNo) {
        this.brandName = brandName;
        this.modelNo = modelNo;
    }

}
class Repeater
{
   private String brandName;
   private String modelNo;

    public Repeater() {
        brandName =null;
        modelNo =null;
    }

    public Repeater(String brandName, String modelNo) {
        this.brandName = brandName;
        this.modelNo = modelNo;
    }
}
class securityCamera
{
   private String brandName;
   private String modelNo;

    public securityCamera() {
        brandName =null;
        modelNo =null;
    }

    public securityCamera(String brandName, String modelNo) {
        this.brandName = brandName;
        this.modelNo = modelNo;
    }
}
class Infrastucture_Department extends Department
{
    private
    airConditioner ACs;
    Fan fans;
    Desk desks;
    Chair chairs;
    Stationary stationary;
    public

    public Infrastucture_Department(lab.airConditioner ACs, lab.Fan fans, lab.Desk desks, lab.Chair chairs, lab.Stationary stationary) {
        this.ACs = ACs;
        this.fans = fans;
        this.desks = desks;
        this.chairs = chairs;
        this.stationary = stationary;
    }

}
class airConditioner{

 private  String brandName;
 private  String modelNo;

    public airConditioner() {
        brandName =null;
        modelNo =null;
    }

    public airConditioner(String brandName, String modelNo) {
        this.brandName = brandName;
        this.modelNo = modelNo;
    }
}
class Fan{
    private String brandName;

    public Fan() {
        brandName =null;
    }

    public Fan(String brandName) {
        this.brandName = brandName;
    }
}
class Desk{
   private String brandName;

    public Desk() {
        brandName = null;
    }

    public Desk(String brandName) {
        this.brandName = brandName;
    }
}
class Chair{
    private String brandName;

    public Chair() {

        brandName = null;
    }

    public Chair(String brandName) {
        this.brandName = brandName;
    }
}
class Stationary{
    private String type;

    public Stationary() {
        type = null;
    }

    public Stationary(String type) {
        this.type = type;
    }
}

public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
