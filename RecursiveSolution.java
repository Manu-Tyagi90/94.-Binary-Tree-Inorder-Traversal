class TreeNode {
int val;
TreeNode l;
TreeNode r;
TreeNode (int x, TreeNode y, TreeNode z) {
val=x;
l=y;
r = z;
}
}

public class RecursiveSolution {
public static List<Integer> InOrder(TreeNode t) {
List<Integer> res = new ArrayList<>();
if(t!=null) {
res.addAll(InOrder(t.l));
res.add(t.val);
res.addAll(InOrder(t.r));
}
return res;
} 
}
