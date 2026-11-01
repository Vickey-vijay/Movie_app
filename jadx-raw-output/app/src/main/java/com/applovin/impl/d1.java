package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class d1 extends s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f7186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f7187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f7188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f7189h;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity activityU0;
        this.f7186e = kVar;
        this.f7187f = list;
        if (!(this.f9006a instanceof Activity) && (activityU0 = kVar.u0()) != null) {
            this.f9006a = activityU0;
        }
        if (list != null && this.f7188g.compareAndSet(false, true)) {
            this.f7189h = a(this.f7187f);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.l9
            @Override // java.lang.Runnable
            public final void run() {
                this.f7913b.notifyDataSetChanged();
            }
        });
    }

    public List d() {
        return this.f7187f;
    }

    public com.applovin.impl.sdk.k e() {
        return this.f7186e;
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i10) {
        return this.f7189h;
    }

    @Override // com.applovin.impl.s2
    public int d(int i10) {
        return this.f7189h.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i10) {
        return new v4("RECENT ADS");
    }

    public boolean f() {
        return this.f7189h.size() == 0;
    }

    public void g() {
        this.f7188g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f7188g.get() + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public d1(Context context) {
        super(context);
        this.f7188g = new AtomicBoolean();
        this.f7189h = new ArrayList();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new p1((q1) it.next(), this.f9006a));
        }
        return arrayList;
    }
}
