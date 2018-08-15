import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                flatten((List)e);
            }
            else
            {
                answer.add(e);
            }
        }

        return answer;
    }

       /**
     * Cleans a list of null entries
     * @param aList List
     * @return List
     */
    public List cleanList(List aList, List answer)
    {
        int count = 0;
        for (Object e : aList)
        {
            if (e == null)
            {
                aList.remove(count);
            }
            count++;
        }

        //alist.
        return aList;
    }


    public List sendBackList(List aList, List answer)
    {

        for (Object e : aList)
        {

        }


        return null;
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