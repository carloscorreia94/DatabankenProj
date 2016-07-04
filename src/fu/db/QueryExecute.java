package fu.db;

import java.util.HashMap;
import java.util.Map;

public class QueryExecute {

	public HashMap<String,String> _results;

	public QueryExecute(QueryInputReader query) {
		_results = query.getResults();
	}
	
	public void execute() {
		/**
		* KEYS IN HASHMAP:
		* query: Query Type
		* value: Value which we are lookng for
		**/
		System.out.println("Executing some weird stuff...");
		for (Map.Entry<String, String> entry : _results.entrySet()) {
    		String key = entry.getKey();
    		String value = entry.getValue();
    		System.out.println (key + ": " + value);
		}
	}
}