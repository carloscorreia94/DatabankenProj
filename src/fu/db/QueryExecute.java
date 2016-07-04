package fu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryExecute {

	public static final String url = "jdbc:postgresql://localhost/project";
	public static final String username = "carloscorreia";
	public static final String password = "";

	private WorkingQuery _results;
	private Connection _db;

	public QueryExecute(WorkingQuery queryValidated) throws SQLException {
		_results = queryValidated;

		_db = DriverManager.getConnection(url,username,password);
	}
	
	public void execute() throws SQLException {
		Statement stmt = _db.createStatement();
		ResultSet rs = null;
		String result = null;
		switch(_results.getQueryType()) {
			case "birthyear":
				rs = stmt.executeQuery("SELECT * FROM dogs WHERE birthyear = '" + _results.getQueryValue() + "';");
				result = "Dogs with BirthYear in " + _results.getQueryValue() + "\n";
				while(rs.next()) {
					result += rs.getString("name") + "\n"; 
				} 
				break;
		}
		System.out.println(result);
	}
}