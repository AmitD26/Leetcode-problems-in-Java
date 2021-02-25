package paypalInterview;

class InorderTraversal {
    List<Integer> l;
    public List<Integer> inorderTraversal(TreeNode root) {
        l = new ArrayList<>();
        traverse(root);
        return l;
    }
    public void traverse(TreeNode root){
        if(root == null){
            return;
        }
        traverse(root.left);
        l.add(root.val);
        traverse(root.right);
    }
}