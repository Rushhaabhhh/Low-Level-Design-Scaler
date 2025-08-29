

class DB_Connection {

    // private static instance - only one allowed
    private static DB_Connection instance;

    // private constructor to prevent new DB_Connection()
    private DB_Connection() {
        // Could add code to initialize connection here
    }

    public static synchronized DB_Connection getInstance() {
        if (instance == null) {
            instance = new DB_Connection();
        }
        return instance;
    }

    // public static DB_Connection getInstance() {
    //     return new DB_Connection(); // always creates new object
    // }
    
    // Use volatile for double-checked locking, but more complex
    // Use synchronized for thread safety, but slower
    // Use enum for simplicity, serialization, and thread safety, but less flexible 
}
