package com.fyber.inneractive.sdk.network;

import android.app.Application;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements com.fyber.inneractive.sdk.util.e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d1 f16018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16019e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f16015a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f16016b = new JSONArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16020f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16021g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f16017c = new HandlerThread("EventCollectorHandlerThread", 0);

    public final void a(Application application) {
        if (!this.f16021g) {
            this.f16021g = true;
            this.f16017c.start();
            com.fyber.inneractive.sdk.util.d1 d1Var = new com.fyber.inneractive.sdk.util.d1(this.f16017c.getLooper(), this);
            this.f16018d = d1Var;
            this.f16020f = true;
            this.f16019e = 30;
            if (d1Var.hasMessages(12312329)) {
                this.f16018d.removeMessages(12312329);
            }
            long j10 = this.f16019e * 1000;
            com.fyber.inneractive.sdk.util.d1 d1Var2 = this.f16018d;
            if (d1Var2 != null) {
                d1Var2.post(new c(this, 12312329, j10));
            }
        }
        application.registerActivityLifecycleCallbacks(new d(this));
    }
}
