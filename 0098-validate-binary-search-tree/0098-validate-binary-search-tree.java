class Solution {

    TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {

        if(root == null)
        {
            return true;
        }

    
        if(!isValidBST(root.left))
        {
            return false;
        }

        // Root
        if(prev != null && prev.val >= root.val)
        {
            return false;
        }

        prev = root;

  
        if(!isValidBST(root.right))
        {
            return false;
        }

        return true;
    }
}