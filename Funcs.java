package eg.edu.alexu.csd.oop.calculator;
import java.util.*;
import java.io.*;

public class Funcs implements Calculator {
    String eq="";
    Stack<String> ST = new Stack<String>();
    Stack<String> ST2 = new Stack<String>();
    Stack<String> ST3 = new Stack<String>();
    
	public void input(String s) {
		if(s==null)
			eq="";
		else
		eq=eq+s;		
	}

	public String getResult() {
		String [] operators= new String[3];
				char[] chars=eq.toCharArray();
				operators[0]=Character.toString(chars[0]);
				int i=1;
				while((i<chars.length)&&(chars[i]!='+')&&(chars[i]!='-')&&(chars[i]!='*')&&(chars[i]!='/')) {
					operators[0]+=Character.toString(chars[i]);
					i++;
				}
				operators[1]=Character.toString(chars[i]);
				i++;
				operators[2]="";
				while(i<chars.length) {
					operators[2]+=Character.toString(chars[i]);
					i++;
				}				
		String ans=null;
		if(operators[1].equals("+")) 
			ans=Double.toString(Double.parseDouble(operators[0])+Double.parseDouble(operators[2]));
		else if(operators[1].equals("-"))
			ans=Double.toString(Double.parseDouble(operators[0])-Double.parseDouble(operators[2]));
		else if(operators[1].equals("*"))
			ans=Double.toString(Double.parseDouble(operators[0])*Double.parseDouble(operators[2]));
		else if(operators[1].equals("/")) {
			if(operators[2].equals("0"))
				ans="@";
			else
				ans=Double.toString(Double.parseDouble(operators[0])/Double.parseDouble(operators[2]));
		}
		if(ST.size()>=5) {
			while(!ST.isEmpty()) 
				ST2.push(ST.pop());
			ST2.pop();
			while(!ST2.isEmpty())
				ST.push(ST2.pop());
		}
		if(!ans.equals("@")) {
			if(ST.isEmpty())
				ST.push(eq);
			else {
				if(!eq.equals(ST.peek()))
					ST.push(eq);
			}
			eq=ans;
		}
		return ans;
	}

	public String current() {
		if(!ST3.isEmpty()) 
			ST.push(ST3.pop());
		eq=ST.peek();
		return ST.peek();
	}

	public String prev() {
		if(ST.isEmpty())
			return null;
		else {
			ST3.push(ST.pop());
			eq=ST.peek();
			return ST.peek();
		}
			
	}

	public String next() {
		if((ST3.isEmpty())||(ST.isEmpty()))
			return null;
		else {
			ST.push(ST3.pop());
			eq=ST.peek();
			return ST.peek();
		}
	}

	public void save() {
		FileWriter fw;
		try {
			fw = new FileWriter("calc.txt");
			PrintWriter pw=new PrintWriter(fw);
			while(!ST.isEmpty()) 
				pw.println(ST.pop());
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load() {
		FileReader fr;
		try {
			fr = new FileReader("calc.txt");
			BufferedReader br=new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null) 
				ST2.push(str);
			while(!ST2.isEmpty()) {
				System.out.println(ST2.peek());
				ST.push(ST2.pop());
			}
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		eq=ST.peek();
		
	}
	

}

