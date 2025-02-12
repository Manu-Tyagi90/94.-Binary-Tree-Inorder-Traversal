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
while(root!=null || !stack.isEmpty()){
while(root!=null) {
stack.push(root);
root = root.l;
}
root = stack.pop();
res.add(root.val);
root = root.r;
}
return res;
}
}
