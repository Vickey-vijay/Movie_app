package com.bytedance.sdk.openadsdk.core.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.ko;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<Object> ouw;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ko.vt("ThemeStatusBroadcastReceiver", "====Theme status updated====");
        if (intent == null) {
            return;
        }
        intent.getIntExtra("theme_status_change", 0);
        WeakReference<Object> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get();
    }
}
