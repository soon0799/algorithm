import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static class Tree{
		Tree left=null;
		Tree right=null;
		int data;
	}
	public static Tree head=null;
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while(true) {
            input = br.readLine();
            if (input == null || input.equals(""))
                break;
            push(Integer.parseInt(input),head);
		}
		
		postorder(head);
	}

	public static void push(int i,Tree tree) {
		if(head==null) {
			head= new Tree();
			head.data=i;
		}
		else {
			if(i>tree.data) {
				if(tree.right==null) {
					Tree tmp =new Tree();
					tmp.data=i;
					tree.right=tmp;
				}
				else {
					push(i,tree.right);
				}

			}
			else {
				if(tree.left==null) {
					Tree tmp =new Tree();
					tmp.data=i;
					tree.left=tmp;
				}
				else {
					push(i,tree.left);

				}
			}
		}

	}

	public static void postorder(Tree top){
		if(top.left!=null) postorder(top.left); 
		if(top.right!=null) postorder(top.right); 
		System.out.println(top.data);
	}

}





