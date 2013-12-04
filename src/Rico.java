import javax.swing.table.TableCellEditor;
import java.util.Set;
import java.util.Vector;

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
    // The Partition of the Decision Attributes
    static int[] nonDecAttr;
    // List of subsets that for a minimal coverage
    static Vector<Set> dAPartition;
    // List of Non-Decision Attributes
    static Vector<Set> closures;

    // Constants
    static int MAX_PARTITION_SIZE = 7;

    // Classes
    public class Subset {
        private int size;
        private Set<Set> partition;

        public boolean properSubset(String[] part, String[] dAPart) // Can be edited
        {

            for( int i = 0; i < part.length; i++){ // Look into for each
                if( !included(part[i], dAPart)){
                    return false;
                }
            }
            return true;
        }

        private boolean included(String item, String[] dAPart){ // Not Done
            if( dAPart.length != 0){
                boolean bacon = true;
                return (bacon || included(item, dAPart) );
            }
            return true;
        }

    }


    public static void main(String[] args) // Not Done
    {

    }

    private static int lookup( String value, int attrNum ){
        int offset = -1; // Exit condition for loop
        Vector<String> attrLookupVect = attributeValues[attrNum]; // The row of the lookup table
        int iterations = attrLookupVect.size(); // Get size of the look up row
        for( int i = 0; i < iterations && offset == -1; i++ ){
            if( value.equals(attrLookupVect.get(i))){ // Check if the value is found
                return i; // Set the offset to be returned
            }
        }
        return -1;
    }

    private static void findSubset() // Not Done
    {

    }

    private static void partitionSize1() // Not Done
    {

    }

    private static boolean properSubset(String[] part, String[] dAPart) // Can be edited
    {

        for( int i = 0; i < part.length; i++){ // Look into for each
            if( !included(part[i], dAPart)){
                return false;
            }
        }
        return true;
    }

    private static boolean included(String item, String[] dAPart){ // Not Done
        if( dAPart.length != 0){
            boolean bacon = true;
            return (bacon || included(item, dAPart) );
        }
        return true;
    }

}
