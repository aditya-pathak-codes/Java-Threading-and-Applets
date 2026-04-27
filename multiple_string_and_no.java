import java.io.*;
class Main
{
	public static void main(String s[])throws IOException
	{
		String name;
		int roll;
		FileWriter fw=new FileWriter("Demo1.txt");
		name="AMIT\n";
		roll=11;
		fw.write(name);
		fw.write(roll);
		name="BANEET\n";
		roll=12;
		fw.write(name);
		fw.write(roll);
		name="CHARAN\n";
		roll=13;
		fw.write(name);
		fw.write(roll);
		name="DEEP\n";
		roll=14;
		fw.write(name);
		fw.write(roll);
		fw.close();
		FileReader fr=new FileReader("Demo1.txt");
		BufferedReader br=new BufferedReader(fr);
		while((name=br.readLine()) != null)
		{
			roll=br.read();
			System.out.println(name + " " + roll);
		}
		br.close();
		fr.close();
	}}
