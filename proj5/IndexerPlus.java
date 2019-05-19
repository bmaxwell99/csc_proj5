
/**
 * IndexerPlus class
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IndexerPlus<E extends Comparable<E>>{

    /**constan for output*/
    private static final String NODE_OUTPUT_SEPARATOR = ",";
    /** root node */
    private BstNode<E> root;

    /**
     * constructor 
     */
    public IndexerPlus(E nodeData)
    {
        root = null;
    }

    /**
     * Adds a new node to the tree
     *
     * @param   data     the data to add to the tree
     */
    public void add(E data) {
        root = add(root, data);
    }

    /**
     * Adds a new node to the binary tree.  It begins the search for the right spot at the specified point in the tree.  
     * This is the private, recursive helper function that actually does the work.
     * 
     * @param   data     the value to be added to the new node's data field
     * @param   root       the existing tree node at which to start searching for the proper spot for the data
     */
    private BstNode<E> add(BstNode<E> root, E data){
        if(root == null)    {
            root = new BstNode<E>(data);
        }
        else if (root.nodeData.compareTo(data) == 0){
            //
        }
        else if(root.nodeData.compareTo(data) > 0){
            root.left = add(root.left, data);
        }
        else {
            root.right = add(root.right, data);
        }
        return root;
    }

    /**
     * Searches the binary tree for the specified data
     * 
     * @param   data  the data field to search for within tree nodes
     * @returns                 true if the node data is found within a node in the binary tree, false if not found
     */
    public boolean contains(E data) {
        return contains(root, data);
    }   

    /**
     * Recursive helper function for finding data within nodes of the tree
     * 
     * @param   data  the data field to search for within tree nodes
     * @param   root       the node at which to start searching for the data within nodes
     */
    private boolean contains(BstNode<E> root, E data) {
        if (root == null) {
            return false;
        } else {
            if (data.compareTo(root.nodeData) == 0) {
                return true;
            } else if (data.compareTo(root.nodeData) < 0) {
                return contains(root.left, data);
            } else {   
                return contains(root.right, data);
            }
        }
    }

    /**
     * Prints contents of tree, in order
     */
    public void display() {
        display(root);
    }

    /**
     * Recursive helper function for displaying data within nodes of the tree, using in-order traversal
     * 
     * @param   root       the node at which to start searching for the data within nodes
     */
    private void display(BstNode root) {
        if (root != null) {
            display(root.left);
            System.out.print(root + NODE_OUTPUT_SEPARATOR);
            display(root.right);
        }
    }

    private class BstNode<E> {
        /** the data the tree was ranked by*/
        public E nodeData;
        /** the side car index ranking*/
        public int indexData;
        /**node to the left*/
        public BstNode left;
        /**node to the right*/
        public BstNode right;
        /**node thats a duplicate*/
        public NodeDupe next;

        /**
         * Constructor
         * 
         * @param   the data the node holds
         */
        public BstNode(E data)   {
            nodeData = data;
            left = null;
            right = null;
        }

        /**
         * to string overide
         */
        public String toString() {
            return String.format("%d", nodeData);
        }

    }

    private class NodeDupe{
        /** the side car index ranking*/
        public int indexData;
        /**node thats a duplicate*/
        public NodeDupe next;
        /**node thats a duplicate*/
        public NodeDupe prev;

        public NodeDupe(){
        }
    }

}
