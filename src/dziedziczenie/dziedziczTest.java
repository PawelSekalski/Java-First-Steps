package dziedziczenie;
import java.sql.*;

public class dziedziczTest {
		// url po³¹czenia z localhost (nazwaSterownika://adres/nazwaBazy)
		final static String connectionURL = "jdbc:mysql://localhost:3306/skoczkowie";
		// nazwa u¿ytkownika DB
		final static String name = "root";
		// has³o dla u¿ytkownika
		final static String pass = "miki123";
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		//rejestracja klasy sterownika
		Class.forName("com.mysql.jdbc.Driver");
		//utworzenie po³¹czenia
		Connection con = DriverManager.getConnection(connectionURL, name, pass);
		//utworzenie wyra¿enie SQL
		Statement stmt = con.createStatement();
		//wykonanie zapytania
		con.setAutoCommit(true);
		// update, delete, insert 
		stmt.executeUpdate("delete from zawodnicy where imie='Miki'");
		ResultSet rs=stmt.executeQuery("select * from zawodnicy");
		while(rs.next()){
			System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getString(4));
		}
		//zamkniêcie po³¹czenia
		con.close();
		}
}
