package fu.db;

public class WorkingQuery {
	private String _queryType, _queryValue;
	public String _queryResult;

	public WorkingQuery(String queryType, String queryValue) {
		this._queryType = queryType;
		this._queryValue = queryValue;

	}

	public String getQueryType() {
		return _queryType;
	}

	public String getQueryValue() {
		return _queryValue;
	}

	public String getQueryResult() {
		return _queryResult;
	}

	public void setQueryResult(String queryResult) {
		this._queryResult = queryResult;
	}

}