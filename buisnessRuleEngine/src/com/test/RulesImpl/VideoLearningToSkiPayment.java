package com.test.RulesImpl;

import com.test.Rule.Payment;
import com.test.Utility.FreeVideo;

public class VideoLearningToSkiPayment implements Payment{

	@Override
	public void doTask() {
		// Logic to send videos
		System.out.println("Payment received for the video 'Learning to Ski'");
		FreeVideo.addFreeVideo();
	}

}
