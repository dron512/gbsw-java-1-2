public class Database {

    private static Database database = new Database();
    static Database getInstance() {
        return database;
    }
}
