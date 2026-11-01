package com.inmobi.media;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: renamed from: com.inmobi.media.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3230uc extends ContentObserver implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f25457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3280wc f25459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3230uc(C3280wc c3280wc, String str, Context context, Handler handler) {
        super(handler);
        ck.p.j(str, "mJsCallbackNamespace");
        this.f25459d = c3280wc;
        this.f25456a = str;
        this.f25457b = context;
        this.f25458c = -1;
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        context.getContentResolver().unregisterContentObserver(this);
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        nk.j.d(A9.f22351c, null, null, new C3205tc(this, this.f25459d, z10, null), 3, null);
    }
}
