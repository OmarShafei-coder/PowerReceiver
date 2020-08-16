package com.omarshafei.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {
    private static final String ACTION_CUSTOM_BROADCAST =
            "com.omarshafei.powerreceiver.ACTION_CUSTOM_BROADCAST";

    @Override
    public void onReceive(Context context, Intent intent) {
        //Get the Intent action from the intent parameter and store it in a String variable called intentAction.
        String intentAction = intent.getAction();
        String toastMessage = "unknown intent action";

        //do a null check
        if(intentAction != null){

            switch (intentAction){
                case Intent.ACTION_POWER_CONNECTED:
                    toastMessage = "Power connected"; break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "Power disconnected"; break;
                case ACTION_CUSTOM_BROADCAST:
                    toastMessage = "Custom Broadcast Received"; break;
                default: break;
            }
        }
        Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
    }
}
