class Demo_Singleton {
    public static void main(String[] args) {

        // Same instance (Singleton)
        DB_Connection db1 = DB_Connection.getInstance();
        DB_Connection db2 = DB_Connection.getInstance();

        // DB_Connection db1 = new DB_Connection();
        // DB_Connection db2 = new DB_Connection();

        
        if(db1 == db2) {
            System.out.println("Same instance");
        }
        else {
            System.out.println("Different instances");
        }
    }
}