

package nest;

public class StaticNestedTest
{
    public static void main(String[] args)
    {

      //  StaticNestedExemple.StaticNestedClass nest= new StaticNestedExemple.StaticNestedClass();
       // nest.show();




       StaticNestedExemple nest=new StaticNestedExemple();
       StaticNestedExemple.StaticNestedClass ne = nest.new StaticNestedClass();
       ne.show();




    }

}
