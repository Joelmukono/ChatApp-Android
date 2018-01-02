package com.rohan.chatapp.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

import com.rohan.chatapp.ui.ChatActivity;
import com.rohan.chatapp.util.Constants;

import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;

import java.io.IOException;

/**
 * Created by rohan on 02/01/18.
 */

public class ConnectionService extends IntentService {

    public ConnectionService() {
        super("ConnectionService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        String username = intent.getStringExtra(Constants.USERNAME);
        String password = intent.getStringExtra(Constants.PASSWORD);

//        try {
        Intent i = new Intent(this, ChatActivity.class);
        i.putExtra(Constants.USERNAME, username);
        i.putExtra(Constants.PASSWORD, password);
        startActivity(i);
//            ChatActivity.setupConnection(username, password);
//        } catch (IOException | InterruptedException | XMPPException | SmackException e) {
//            Log.v(getClass().getName(), "Exception: " + e.getMessage());
//        }
    }
}
