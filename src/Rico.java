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
    static Set<Integer> decAttr;
    // List of Non-Decision Attributes
    static Set<Integer> nonDecAttr;
    // List of subsets that form a minimal coverage
    static Vector<Set<Integer>> coverings;

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
        int numAttr = 78;
    //Get list of decision attributes
    //Add these attributes to decAttr
        decAttr.add(3);
        Subset dAPartition; // Initialize da partition

        //for i = 0 -> num-attr
        //add i to nonDecAttr if not in decAttr
    //Ask for max subset size. Let this be max-subset-size
        int maxSubsetSize = 3;
//////////////////////Code this shit Tom
        for( int i = 1; i <= maxSubsetSize; i++){
            switch (i){
                case 1:
                    for(int attr : nonDecAttr){
                        Set<Integer> attrSet; // Initialize this set
                        attrSet.add(attr);
                        Subset testSubset; // Initialize this subset using attrSet
                        if(dAPartition.properSubset(testSubset)){
                            coverings.add(attrSet);
                            nonDecAttr.remove(attrSet);
                        }
                    }
                    break;
                case 2:
                    for(int i = 0; i < numAttr - 1; i++){
                        for(int j = i+1; j < numAttr; j++){
                            // Make a set containing those items
                            Set<Integer> currentSet;
                            // Check if the set is minimal
                            boolean minimal = true;
                            for( int covNum = 0; covNum < coverings.size() && minimal; covNum++){
                                if(coverings.get(covNum).containsAll(currentSet)){
                                    minimal = false;
                                }
                            }
                            if(minimal){
                                // Make subset from currentSubset
                                Subset currentSubset;
                                if(dAPartition.properSubset(currentSubset)){
                                    coverings.add(currentSet);
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    for(int i = 0; i < numAttr - 1; i++){
                        for(int j = i+1; j < numAttr; j++){
                            // Make a set containing those items
                            Set<Integer> currentSet;
                            // Check if the set is minimal
                            boolean minimal = true;
                            for( int covNum = 0; covNum < coverings.size() && minimal; covNum++){
                                if(coverings.get(covNum).containsAll(currentSet)){
                                    minimal = false;
                                }
                            }
                            if(minimal){
                                for( int k = j + 1; k < )
                                // Make subset from currentSubset
                                Subset currentSubset;
                                if(dAPartition.properSubset(currentSubset)){
                                    coverings.add(currentSet);
                                }
                            }
                        }
                    }
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
