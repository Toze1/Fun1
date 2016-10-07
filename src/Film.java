/**
 * Created by Leitn on 07.10.2016.
 */
import java.util.Scanner;

public class Film {
    String title;
    String type;
    int price;
    String film_director;
    int created_year;

    public int seitwann (){
        int jahre;
        jahre= 2016-created_year;
        return jahre;
    }
    public void display (){
        System.out.println("The film title: "+ title);
        System.out.println("The film type: "+ type);
        System.out.println("The film cost: "+ price);
        System.out.println("The film director is: "+
                film_director);
        System.out.println("The film is created in: "+
                created_year);
    }
    public boolean oscar (){
        System.out.println("Has the film an Oscar ?");
        String s; boolean b=false;
        Scanner sn = new Scanner(System.in);
        s=sn.nextLine();
        if ((s.contentEquals("YES")) || (s.contentEquals("Yes"))||
                (s.contentEquals("yes")))
            b= true;
        return b;
    }
    public static void main (String[] arg){
        Film f1= new Film();
        f1.title="Titanic";
        f1.type="Drama";
        f1.price=20000;
        f1.film_director="James Cameron";
        f1.created_year=1997;
        f1.display();
        System.out.println("The film is created since "+f1.seitwann()+ " years");
                System.out.println(f1.oscar());

        Film e1 = new Film();
        e1.title="Lord of the Rings";
        e1.type="Fantasy";
        e1.price=15000;
        e1.film_director="Peter Jackson";
        f1.created_year=2001;
        e1.display();
        System.out.println("The film is created since "+e1.seitwann()+ " years");
        System.out.println(e1.oscar());

    }
}
