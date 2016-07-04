package fu.db;

import java.util.HashMap;
import java.sql.SQLException;


public class QueryInputReader {

	private boolean _performs = true;
	private WorkingQuery _results;

	public QueryInputReader(String[] args) throws InvalidInputQuery, SQLException {

		try {
			switch(args[0]) {
				case "-help":
					System.out.println(Messages.HELP_MESSAGE);
					_performs = false;
					return;
				case "-q":
					analyzeQuery(args);
					break;
				default:
					throw new InvalidInputQuery();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new InvalidInputQuery();
		}
	}

	public boolean performs() {
		return _performs;
	}

	public WorkingQuery getValidatedInput() {
		return _results;
	}

	public void analyzeQuery(String[] args) throws InvalidInputQuery, SQLException {
		try {
			switch(args[1]) {
				case "birthyear":
					_results = new WorkingQuery(args[1],args[2]);
					break;
				default:
					throw new InvalidInputQuery();

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new InvalidInputQuery();
		}
	}
}