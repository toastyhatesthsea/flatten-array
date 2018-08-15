import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flattener
{


    public List flatten(List aList)
    {
        Object[] anArray = aList.toArray();
        List answer = new ArrayList();


        for (Object e : anArray)
        {
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
    public List cleanList(List aList)
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


}


class FlattenTesters
{


    public static void main(String[] argsgsg)
    {
        ArrayList aList = new ArrayList();

        aList.add(1);
        aList.add(null);

        int[] numbers = {4, 5, 6, 7, 8};

        aList.add(Arrays.asList(numbers));

        Flattener flatten = new Flattener();

        List cleanList = flatten.flatten(aList);

    }
}