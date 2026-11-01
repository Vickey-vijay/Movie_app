package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import q1.f;
import q1.t;

/* JADX INFO: compiled from: CurrentAccessTokenExpirationBroadcastReceiver.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/facebook/CurrentAccessTokenExpirationBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Intent;", "intent", "Lmj/r;", "onReceive", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(intent, "intent");
        if (p.e("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && t.F()) {
            f.INSTANCE.e().g();
        }
    }
}
