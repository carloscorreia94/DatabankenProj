package fu.db;

import java.sql.*;

public class Api {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			QueryInputReader reader = new QueryInputReader(args);
			if(reader.performs()) {
				QueryExecute performer = new QueryExecute(reader);
				performer.execute();
			}
		} catch (InvalidInputQuery e) {
			System.out.println(Messages.INVALID_INPUT_QUERY);	
		} catch (ClassNotFoundException e) {
			System.out.println(Messages.DRIVER_NOT_LOADED);
			System.out.println(e);
		}
	}
}