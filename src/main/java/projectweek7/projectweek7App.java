package projectweek7;

import projectweek7.dao.DbConnection;
import projectweek7.exception.DbException;

import java.sql.Connection;
import java.sql.SQLException;

public class projectweek7App {
    public static void main(String[] args) {
        try {
            Connection connection = DbConnection.getConnection();
            // You can perform database operations using the 'connection' object here if needed.
            // For testing purposes, you can close the connection after use.
            connection.close();
        } catch (DbException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., show an error message to the user.
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}