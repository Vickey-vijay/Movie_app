package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f7705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.applovin.impl.sdk.o f7707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f7708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7710f;

    public i5(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false, null);
    }

    public Context a() {
        return this.f7708d;
    }

    public com.applovin.impl.sdk.k b() {
        return this.f7705a;
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, boolean z10) {
        this(str, kVar, z10, null);
    }

    public void a(String str) {
        this.f7709e = str;
    }

    public ScheduledFuture b(final Thread thread, final long j10) {
        if (j10 <= 0) {
            return null;
        }
        return this.f7705a.q0().b(new r6(this.f7705a, "timeout:" + this.f7706b, new Runnable() { // from class: com.applovin.impl.bb
            @Override // java.lang.Runnable
            public final void run() {
                this.f7086b.a(thread, j10);
            }
        }), d6.b.TIMEOUT, j10);
    }

    public String c() {
        return this.f7706b;
    }

    public boolean d() {
        return this.f7710f;
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    public void a(boolean z10) {
        this.f7710f = z10;
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, boolean z10, String str2) {
        this.f7706b = str;
        this.f7705a = kVar;
        this.f7707c = kVar.O();
        this.f7708d = com.applovin.impl.sdk.k.o();
        this.f7710f = z10;
        this.f7709e = str2;
    }

    public void a(Throwable th2) {
        Map map = CollectionUtils.map("source", this.f7706b);
        map.put("top_main_method", th2.toString());
        map.put("details", StringUtils.emptyIfNull(this.f7709e));
        this.f7705a.D().d(d2.X0, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f7709e)) {
            mapHashMap.put("details", this.f7709e);
        }
        this.f7705a.D().a(d2.Y0, this.f7706b, mapHashMap);
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.k(this.f7706b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds");
        }
    }
}
