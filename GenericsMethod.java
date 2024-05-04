public class GenericsMethod {
    public static void main(String[] args)
{
        Choosecourse c1 = new Choosecourse();
        c1.<String> getcourse("Java developer");
        c1.<Boolean> getcourse(true);
        c1.<Integer> getcourse(20);

}
    }



class Choosecourse
{
    public <T> void getcourse(T Coursename)
    {
        System.out.println("your course got selected" + " " + Coursename);
    }
}

