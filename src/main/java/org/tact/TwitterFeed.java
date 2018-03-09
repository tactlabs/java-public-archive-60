package org.tact;

import java.util.List;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

public class TwitterFeed {

	private static String twtConsumerKey = "m19IMoIFCdSmCeKOA43K0SuuD";

	private static String twtConsumerSecret = "D56NklMyKAgtgp3ZxdQNQITsxugpS54P44vVS9rWA5wQ3Fekgh";

	private static String twtAccessToken = "3387978868-bzW7KiZZmuAGD9EhdI81GgHZDu7f9rPjuqNHqzQ";

	private static String twtAccessTokenSecret = "kmJjsVp5Vz7obs0alZBnwvBhsr9hOt5mn3fSddFF91F8o";

	// https://twitter.com/rajacsp

	private static String[] handdles = { "chargebee", "inkmonk", "walletkit",
			"velocloude Networks", "Avocare", "flintobox", "avaz", "instant",
			"runway2street", "customerLabs", "openTap", "smartGladiator",
			"uparkIndia", "driversKart", "simplemoney", "Apollo", "HealthCasa",
			"LiveWell", "Livpact", "BlackHealth", "Thrive", "Keritan",
			"Myovue", "CareTeam", "BlueMesa", "CircleLink", "SparkCapital",
			"NextViewVentures", "DormRoom Fund ", "EverTrue", "LeadPages",
			"Engagio",

	};

	public static void main(String[] args) throws Exception {

		for (String handdles : handdles) {

			getTwitterFeeds(handdles);
		}
	}

	// add handle param
	private static void getTwitterFeeds(String handle) {
		try {

			TwitterTemplate twitterTemplate = new TwitterTemplate(
					twtConsumerKey, twtConsumerSecret, twtAccessToken,
					twtAccessTokenSecret);

			List<Tweet> tweets = twitterTemplate.timelineOperations()
					.getUserTimeline(handle, 150);
			
			// List<Tweet> tweets =
			// twitterTemplate.timelineOperations().getFavorites(twtHandle,
			// 1000);

			for (Tweet tweet : tweets) {

				// String strFeedId = tweet.getId() + "";
				// System.out.println("Created at : "+tweet.getCreatedAt());
				// if(tweet.gettype("hiring"))

				String tweetContent = tweet.getText();

				if (tweetContent.toLowerCase().contains("hiring")) {
					System.out.println("TWEET HIRING TEXT :" + tweetContent);
				}

				/*
				 * sf.setFeedId(strFeedId); sf.setSource("Twitter");
				 * sf.setLink("https://twitter.com/statuses/" + strFeedId);
				 * sf.setMessage(tweet.getText()); sf.setSync_date(new Date());
				 * sf.setTitle(""); sf.setType("TWEET");
				 * sf.setUploaded_date(tweet.getCreatedAt());
				 * sf.setUser_id(""+tweet.getFromUserId());
				 * sf.setUser(tweet.getFromUser());
				 */

			}
			// System.out.println("{getTwitterFeeds} Completed getTwitterFeeds");

		} catch (Exception e) {
			// e.printStackTrace();
			//System.err.println("{getTwitterFeeds} error occured  : "+ e.getMessage());
		}
	}

	public static void getFollowers(String twtHandle) {
		TwitterTemplate twitterTemplate = new TwitterTemplate(twtConsumerKey,
				twtConsumerSecret, twtAccessToken, twtAccessTokenSecret);
		List<TwitterProfile> followers = twitterTemplate.friendOperations()
				.getFollowers(twtHandle);// fix twtH

		for (TwitterProfile twitterProfile : followers) {
			System.out.println(twitterProfile.getName());
		}
	}

}
