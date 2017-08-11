package com.creative.pushnotification;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

/**
 * Created by comsol on 08-Aug-17.
 */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "FCM Service";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // TODO: Handle FCM messages here.
        // If the application is in the foreground handle both data and notification messages here.
        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated.
      //  Log.d(TAG, "From: " + remoteMessage.getFrom());
      //  Log.d(TAG, "Notification Message Body: " + remoteMessage.getNotification().getBody());

        Map<String, String> data = remoteMessage.getData();
        String myCustomKey = data.get("my_custom_key");
        Log.d(TAG, "DEBUG_MSG" + myCustomKey);
    }
}