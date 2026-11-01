package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.inmobi.media.Jj;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class Jj extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(intent, "intent");
        Runnable runnable = new Runnable() { // from class: b7.c2
            @Override // java.lang.Runnable
            public final void run() {
                Jj.a(intent, context);
            }
        };
        Context context2 = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static final void a(Intent intent, Context context) {
        Lj.a(context, intent);
    }
}
