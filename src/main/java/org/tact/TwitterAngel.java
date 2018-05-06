package org.tact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

public class TwitterAngel {
	
	private static String twtConsumerKey = "m19IMoIFCdSmCeKOA43K0SuuD";

	private static String twtConsumerSecret = "D56NklMyKAgtgp3ZxdQNQITsxugpS54P44vVS9rWA5wQ3Fekgh";

	private static String twtAccessToken = "3387978868-bzW7KiZZmuAGD9EhdI81GgHZDu7f9rPjuqNHqzQ";

	private static String twtAccessTokenSecret = "kmJjsVp5Vz7obs0alZBnwvBhsr9hOt5mn3fSddFF91F8o";
	
	private static String[] handdles = {"guptpuneet", "andreazurek", "swethareddy", "sanjaymodi", "RajanAnandan", "andreazurek", "Healthstarter", "shayna7", "ajaychopra", "leitersdorf"};
	
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
	
	public void insert(String username, String twitteraccountname) {
        String sql = "INSERT INTO TwitterAngle(username,twitteraccountname) VALUES(?,?)";
        
 
        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, twitteraccountname);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
	}
	
	public void insert1(String arrli){
        String sql1 = "INSERT INTO Twittertweets(twittertweets) VALUES(?)";
        try (Connection conn = this.connect();
	         PreparedStatement pstmt = conn.prepareStatement(sql1)) {
	         pstmt.setString(1, arrli);
	         pstmt.executeUpdate();
	    }catch (SQLException e) {
	         System.out.println(e.getMessage());
	    }
    }




	public static void main(String[] args) {
		for (String handdles : handdles) {
			 getTwitterFeeds(handdles);
			}
		}
		
		private static void getTwitterFeeds(String handle) {
			ArrayList<String> arrli = new ArrayList<String>();
			 			
			try {

				 TwitterTemplate twitterTemplate = new TwitterTemplate(
						twtConsumerKey, twtConsumerSecret, twtAccessToken,
						twtAccessTokenSecret);
				 List<Tweet> tweets = twitterTemplate.timelineOperations().getUserTimeline(handle, 200);	
				 //System.out.println("------------------------------------------------"+handle+"--------------------------------------------------------------------");
				
				TwitterAngle app = new TwitterAngle();
		        // insert three new rows
		        app.insert(handle, handle);
		        String s = " ";
				for(Tweet tweet: tweets){
					
				//System.out.println(tweet.getText());	
		        arrli.add(tweet.getText());
		        s +=tweet.getText()+"\n";
		     	}
				
		        app.insert1(s);
		        s = " ";
				
				
			}catch(Exception e) {
				 e.printStackTrace();
				 System.err.println("{getTwitterFeeds} error occured  : "+ e.getMessage());
			}
		

	}



	}


