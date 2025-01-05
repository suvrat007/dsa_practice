package OOPs.video1;


class pen{
    String colour;                               //STRUCTURE
    String type;

    public void write(){                         //MEATHOD
        System.out.println("kuch bhi");
    }
    pen(){                                         //normal contructor
        System.out.println("this is contructor");
    }
    pen(String colour, String type){
        this.colour=colour;
        this.type=type;
    }
    public void peninfo(){
        System.out.println(this.colour);
        System.out.println(this.type);
    }

}
public class OOPS {
    public static void main(String[] args) {
//        pen one=new pen();                       //pen()--constructor...only called once
//        one.colour="blue";
//        one.type="gel";
//        one.write();
        pen pen1=new pen("red","ball");
        pen1.peninfo();
    }


    // java has no destructor coz it has garbage collector

}
