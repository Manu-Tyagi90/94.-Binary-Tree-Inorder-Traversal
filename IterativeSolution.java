class TreeNode {
int val;
TreeNode l;
TreeNode r;
TreeNode (int x, TreeNode y,TreeNode z) {
val = x;
l = y;
r = z;
}
}
public List<Integer> IterativeSolution(TreeNode root) {
List<Integer> res = new ArrayList<>();
Stack<TreeNode> stack = new Stack<>();
stack.push(root);
while(!stack.isEmpty()){
root = stack.pop();
res.add(root.val);
if(root.r!=null) {
stack.push(root.r);
}
if(root.l!=null) {
stack.push(root.l);
}

}return res;
}
}
