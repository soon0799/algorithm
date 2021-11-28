import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;


public class Main {
	public static Stack<Integer> top = new Stack<>();
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static Scanner sc= new Scanner(System.in);
	public static int cnt = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int command=Integer.parseInt(br.readLine());

		for(int i=0;i<command;i++) {
			String str = br.readLine();
			if(str.contains("push")) {
				String pstr[]=str.split(" ");
				top.push(Integer.parseInt(pstr[1]));
			}
			else if(str.equals("pop")) {
				if(top.empty()) {
					bw.write("-1\n");
				}
				else {
					bw.write(String.valueOf(top.pop()+"\n"));
				}
			}
			else if(str.equals("size")) {
				bw.write(String.valueOf(top.size()+"\n"));
			}
			else if(str.equals("empty")) {
				if(top.empty()) {
					bw.write("1\n");
				}
				else {
					bw.write("0\n");
				}
			}
			else if(str.equals("top")) {
				if(top.empty()) {
					bw.write("-1\n");
				}
				else {
					bw.write(String.valueOf(top.peek()+"\n"));
				}
			}

		}
		bw.flush();
		bw.close();
		br.close();
	}
}





