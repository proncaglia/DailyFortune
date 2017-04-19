package net.roncaglia.dailyfortune;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by pabloroncaglia on 19/4/17.
 */

public class CallListener extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                Toast.makeText(context,"Phone Is Ringing",Toast.LENGTH_SHORT).show();
            }
        }catch(Exception e) {
            
        }
    }
}
