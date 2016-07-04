package fu.db;

import java.util.HashMap;

public class QueryInputReader {

	private boolean _performs = true;
	private HashMap<String,String> _results;

	public QueryInputReader(String[] args) throws InvalidInputQuery {

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

	public HashMap<String,String> getResults() {
		return _results;
	}

	public void analyzeQuery(String[] args) throws InvalidInputQuery {
		try {
			switch(args[1]) {
				case "birthyear":
					_results = new HashMap<>();
					_results.put("query",args[1]);
					_results.put("value",args[2]);
					break;
				default:
					throw new InvalidInputQuery();

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new InvalidInputQuery();
		}
	}
}