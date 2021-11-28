import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {

	static class Node{
		char data;
		Node right;
		Node left;
		Node(char data){
			this.data = data;
		}
	}

	static Node top;
	public static void makeNode(char data,char left, char right) {
		if(top==null) {
			top=new Node(data);

			if(left!='.') {top.left=new Node(left);}
			if(right!='.') {top.right=new Node(right);}
		}
		else {
			find(top,data,left,right);
		}

	}
	public static void find(Node top,char value, char left,char right) {
		if(top==null) {
			return;
		}
		if(top.data==value) {
			if(left!='.') {top.left=new Node(left);}
			if(right!='.') {top.right=new Node(right);}

		}
		else {
			find(top.left,value,left,right);
			find(top.right,value,left,right);	
		}
	}




	public static void preoder(Node top) {
		System.out.print(top.data);
		if(top.left!=null)preoder(top.left);
		if(top.right!=null)preoder(top.right);


	}public static void inorder(Node top){
		if(top.left!=null) inorder(top.left); 
		System.out.print(top.data); 
		if(top.right!=null) inorder(top.right); 
	}

	public static void postorder(Node top){
		if(top.left!=null) postorder(top.left); 
		if(top.right!=null) postorder(top.right); 
		System.out.print(top.data);
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			char[] tmp;
			tmp = br.readLine().replaceAll(" ", "").toCharArray();
			makeNode(tmp[0],tmp[1],tmp[2]);
		}

		preoder(top);
		System.out.println();
		inorder(top);
		System.out.println();
		postorder(top);

		br.close();

	}

}
