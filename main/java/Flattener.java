import java.util.*;

public class Flattener
{

    public List flatten(List aList)
    {
        List answer = new ArrayList();

        for (Object e: aList)
        {
            if (e instanceof List)
            {
                List returnedList = flatten((List)e);
                combineLists(returnedList, answer);
            } else if (e != null)
            {
                answer.add(e);
            }
        }

        return answer;
    }

    /**
     * Combine two lists to the second list
     * @param aList List
     * @param answer List
     */
    public void combineLists(List aList, List answer)
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


