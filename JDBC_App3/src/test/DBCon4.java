package test;
import java.sql.*;
import java.util.*;
public class DBCon4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter the student roll no:");
				int rollNo = Integer.parseInt(s.nextLine());
				System.out.println("Enter the student Name:");
				String sName = s.nextLine();
				System.out.println("Enter the student Branch:");
				String sBranch  = s.nextLine();
				System.out.println("Enter the student cgpa:");
				float sCgpa = s.nextFloat();
				Connection con = DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
				Statement stm = con.createStatement();
				int k = stm.executeUpdate("insert into student values"+",'"+rollNo+"','"+sName+"','"+sBranch+"',"+sCgpa+"");
				if(k>0)
				System.out.println("Record inserted succesfully....");
				con.close();
			}
			catch(SQLException ob)
			{
				System.out.println("Record already exit..");
			}
		}
	}

}
