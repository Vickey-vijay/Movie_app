package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ck.p;
import com.facebook.internal.d0;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: FacebookBroadcastReceiver.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0014J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0014¨\u0006\u0011"}, d2 = {"Lcom/facebook/FacebookBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Intent;", "intent", "Lmj/r;", "onReceive", "", "appCallId", "action", "Landroid/os/Bundle;", "extras", "b", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public class FacebookBroadcastReceiver extends BroadcastReceiver {
    public void a(String str, String str2, Bundle bundle) {
        p.j(str, "appCallId");
        p.j(str2, "action");
        p.j(bundle, "extras");
    }

    public void b(String str, String str2, Bundle bundle) {
        p.j(str, "appCallId");
        p.j(str2, "action");
        p.j(bundle, "extras");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(intent, "intent");
        String stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String stringExtra2 = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        Bundle extras = intent.getExtras();
        if (stringExtra == null || stringExtra2 == null || extras == null) {
            return;
        }
        if (d0.x(intent)) {
            a(stringExtra, stringExtra2, extras);
        } else {
            b(stringExtra, stringExtra2, extras);
        }
    }
}
