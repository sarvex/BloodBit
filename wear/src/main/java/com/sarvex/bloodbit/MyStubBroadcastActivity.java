package com.sarvex.bloodbit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

/**
 * Example shell activity which simply broadcasts to our receiver and exits.
 */
public class MyStubBroadcastActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Fabric.with(this, new Crashlytics());

    Intent i = new Intent();
    i.setAction("com.sarvex.bloodbit.SHOW_NOTIFICATION");
    i.putExtra(MyPostNotificationReceiver.CONTENT_KEY, getString(R.string.title));
    sendBroadcast(i);
    finish();
  }
}
