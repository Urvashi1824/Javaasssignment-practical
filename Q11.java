import universityadmission.UnderGraduate;
import universityadmission.PostGraduate;

public class Q11
{
    public static void main(String args[])
    {
        UnderGraduate u = new UnderGraduate("gujarat",90);
        u.display();
        u.show();

        PostGraduate p = new PostGraduate("nirma",80);
        p.display();
        p.show();
    }
}
