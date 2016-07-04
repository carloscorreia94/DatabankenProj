package fu.db;

public final class Messages {
	public static String DRIVER_NOT_LOADED = "SQL Driver not loaded. \n Details: \n";

	public static String INVALID_INPUT_QUERY = "Invalid Input Query. Terminating";

	public static String UNABLE_CONNECT_DB = "There was an error while performing a database operation. Details: \n";

	public static String HELP_MESSAGE = "Supported API Commands: \n " +
										"-q <query_type> <argument>: Queries the Database \n \n " +
										"Supported Queries: \n" + 
										"birthyear <Dog Name>";
}