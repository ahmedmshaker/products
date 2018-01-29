package com.assignment.businessboomertask.notifications.view;

import android.content.Context;
import android.content.Intent;

import com.assignment.businessboomertask.productdetails.view.DetailsActivity;
import com.assignment.businessboomertask.utils.NotificationUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFirebaseMessagingService extends FirebaseMessagingService {
 
    private static final String TAG = MyFirebaseMessagingService.class.getSimpleName();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        showNotificationMessage(this ,remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody(),new Intent(this , DetailsActivity.class));

    }

 
    /**
     * Showing notification with text only
     */
    private void showNotificationMessage(Context context, String title, String message , Intent intent) {
        NotificationUtils notificationUtils = new NotificationUtils(context);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        notificationUtils.showNotificationMessage(message, intent,11);
    }

}