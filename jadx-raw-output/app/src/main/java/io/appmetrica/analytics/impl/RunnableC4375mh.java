package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4375mh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q5 f57287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f57288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4079b4 f57289d;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            I3 i3A = I3.a(this.f57286a, this.f57288c);
            if (i3A == null) {
                return;
            }
            Q3 q3A = Q3.a(i3A);
            C4197fj c4197fjV = C4418oa.I.v();
            c4197fjV.a(i3A.f55335b.getAppVersion(), i3A.f55335b.getAppBuildNumber());
            c4197fjV.a(i3A.f55335b.getDeviceType());
            C4462q4 c4462q4 = new C4462q4(new C4071am(i3A), new C4437p4(i3A.f55335b, AbstractC4241hb.c(i3A.f55334a.f55103a.getAsString("PROCESS_CFG_CLIDS"))), i3A.f55334a.f55104b);
            this.f57289d.a(q3A, c4462q4).a(this.f57287b, c4462q4);
        } catch (Throwable th2) {
            Rj rj2 = AbstractC4452pj.f57520a;
            String str = "Exception during processing event with type: " + this.f57287b.f55776d + " (" + this.f57287b.f55777e + "): " + th2.getMessage();
            rj2.getClass();
            rj2.a(new C4477qj(str, th2));
        }
    }

    public RunnableC4375mh(Context context, Q5 q10, Bundle bundle, C4079b4 c4079b4) {
        this.f57286a = context;
        this.f57287b = q10;
        this.f57288c = bundle;
        this.f57289d = c4079b4;
    }
}
