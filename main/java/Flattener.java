import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flattener
{


    public List flatten(List aList)
    {
        List answer = new ArrayList();

        for (Object e : aList)
        {
            if (e instanceof List)
            {
                cleanList((List)e);
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