
/**
 * Write a description of class WearableManger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WearableManger
{
    /** the array that holds the wearables*/
    Wearable[] wearables;
    /** the index array returned by the sorting methods*/
    int[] sortedData;

    /**
     * constructor for the class
     */
    public WearableManger(){
    }

    /**
     * returns an array of indexes sorted by Ranking Data
     * 
     * @return array of index
     */
    public int[] getRankingPositionData(){

        return sortedData;
    }

    /**
     * retunrs an array of indexes sorted by Price data
     * 
     * @return array of index
     */
    public int[] getPricePositionData(){

        return sortedData;
    }

    /**
     * returns an array of indexes sorted by Company Name Data
     * 
     * @returns array of index
     */
    public int[] getCoNamePositionData(){

        return sortedData;
    }

    /**
     * generates a CSV of the data
     * 
     * @returns the filename created
     */
    public String generateCSV(int[] sortedData){
        String r = "";
        return r;
    }
}
