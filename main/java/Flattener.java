import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.lang.reflect.Array;
import java.util.*;

public class Flattener
{


    public List flatten(List aList)
    {
        Object[] anArray = aList.toArray();
        List answer = new ArrayList();


        for (int i=0; i<anArray.length; i++)
        {
            Object e = anArray[i];
            if (e instanceof List)
            {
                List returnedList = flatten((List)e);
                Collections.addAll(returnedList, answer);
                //sendBackList(returnedList, answer);
            } else if (e != null)
            {
                answer.add(e);
            }
        }

        return answer;
    }


    public void sendBackList(List aList, List answer)
    {
        for (Object e : aList)
        {
            if (e != null)
            {
                answer.add(e);
            }
        }
    }
}


class FlattenTesters
{


    public static void main(String[] argsgsg)
    {
        ArrayList aList = new ArrayList();

        aList.add(1);
        aList.add(null);

        ArrayList numbers = new ArrayList();



        aList.add(Arrays.asList(numbers));

        Flattener flatten = new Flattener();

        List cleanList = flatten.flatten(aList);

    }
}