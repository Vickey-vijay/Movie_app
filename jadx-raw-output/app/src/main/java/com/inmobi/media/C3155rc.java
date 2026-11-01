package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3155rc extends BroadcastReceiver implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3280wc f25260b;

    public C3155rc(C3280wc c3280wc, String str) {
        ck.p.j(str, "jsCallbackNamespace");
        this.f25260b = c3280wc;
        this.f25259a = str;
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        context.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        F3.a(context, this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(intent, "intent");
        if (ck.p.e("android.intent.action.HEADSET_PLUG", intent.getAction())) {
            int intExtra = intent.getIntExtra("state", 0);
            InterfaceC3028m9 interfaceC3028m9 = this.f25260b.f25634b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("MraidMediaProcessor", "Headphone plugged state changed: " + intExtra);
            }
            this.f25260b.b(this.f25259a, 1 == intExtra);
        }
    }
}
