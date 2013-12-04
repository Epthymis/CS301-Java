import java.util.Set;
import java.util.Vector;
import java.lang.Integer;

/**
 * Created with IntelliJ IDEA.
 * User: Thomas
 * Date: 12/4/13
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rico {

    // Variables
    // The table that holds all of the data entries a 2-d array
    static String[][] dataTable;
    // The lookup table for values of attributes
    static Vector<String>[] attributeValues;
    // List of Decision Attributes
    static int[] decAttr;
    // List of Non-Decision Attributes
    static int[] nonDecAttr;
    // List of subsets that form a minimal coverage
    static Vector<Subset> closures;

    // Constants
    static int MAX_PARTITION_SIZE = 7;

    // Classes
    public class Subset {
        private int size;
        protected Set<Set<Integer>> partitions;

        public Subset(Set attributes){
            size = attributes.size();
            switch (size){
                case 1: // Calls partitionOf1Attr
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        }

        public boolean properSubset(Subset otherSubset){
            for(Set<Integer> part: otherSubset.partitions){
                if(!included(part)){
                    return false;
                }
            }
            return true;
        }

        private boolean included(Set<Integer> item){
            for( Set<Integer> part: partitions){
                if( part.containsAll(item))
                    return true;
            }
            return false;
        }

    }


    public static void main(String[] args) // Not Done
    {
    //Get filename
    //Load table into dataTable
    //Create attributeValues
    //find number of attributes
    //Get list of decision attributes
    //Add these attributes to decAttr
    //Sort values in decAttr
    //for i = 0 -> num-attr
        //add i to nonDecAttr if not in decAttr
    //Ask for max subset size. Let this be max-subset-size
//////////////////////Code this shit Tom
//(let (main-part (partition-1-attribute *da*))
//Code shits in this
//)
//For i = 2 -> m
//Generate subset of size i
////////////////Code
//check if a portion of the subset is included in *coverings*
//then check (proper-subset (partition #|subset|#) main-part)
//if yes add subset to *coverings*
/////////////////////File IO again!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//Print coverings when done
















    }

    private static int lookup( String value, int attrNum ){
        Vector<String> attributeValues = Rico.attributeValues[attrNum]; // The row of the lookup table
        int numValues = attributeValues.size(); // Get size of the look up row
        for( int i = 0; i < numValues; i++ ){
            if( value.equals(attributeValues.get(i))){ // Check if the value is found
                return i; // Set the offset to be returned
            }
        }
        return -1;
    }

    private static void findSubset() // Not Done
    {

    }
}
