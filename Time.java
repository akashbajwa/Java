package lab;

public class Time{
    double hr;
    double min;
    double seconds;

    Time(double _hr,double _min, double _seconds)
    {
        hr = _hr;
        min=_min;
        seconds = _seconds;
    }
    public void Sethr(double _hr){

        hr = _hr;
    }
    public void Setmin(double _min){
        min = _min;
    }
    public void Setseconds(double _sec){
        seconds = _sec;
    }
    public double Gethr(){

        return hr;
    }
    public double Getmin(){

        return min;
    }
    public double Getseconds(){

        return seconds;
    }

    public boolean SetTime(double hr,double min, double seconds){
        if(hr >= 0 && hr < 24 && min >=0 && min <=59 && seconds >=0 && seconds < 59 )
        {
            System.out.println("Hours: " + hr);
            System.out.println("Mintues: " + min);
            System.out.println("Seconds: " + seconds);

            return true;
        }

        return false;

    }
}