package org.tact;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sqllite {
	
	private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:/sqllite/chinook.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
	
	public void insert(String name, double capacity) {
        String sql = "INSERT INTO table1(name,capacity) VALUES(?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, capacity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	
	public static void main(String[] args) {
		
		
	/*	Connection conn = null;
		String url = "jdbc:sqlite:D:/sqllite/chinook.db";
		
		try{
			conn = DriverManager.getConnection(url);
			System.out.println("openDatabase");
		}catch(Exception e){
			System.out.println(e);
			
		}
		*/
		 
	        Sqllite app = new Sqllite();
	        // insert three new rows
	        app.insert("Raw Materials", 3000);
	        app.insert("Semifinished Goods", 4000);
	        app.insert("Finished Goods", 5000);
	    }
		

	}


