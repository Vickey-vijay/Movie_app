package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.ko;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<ouw> ouw;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ko.vt("ThemeStatusBroadcastReceiver", "====object status update====");
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<ouw> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().onThemeChanged(intExtra);
    }

    public final void ouw(ouw ouwVar) {
        this.ouw = new WeakReference<>(ouwVar);
    }
}
