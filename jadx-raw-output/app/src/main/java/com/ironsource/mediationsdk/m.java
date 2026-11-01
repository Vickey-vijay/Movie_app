package com.ironsource.mediationsdk;

import com.ironsource.Bb;
import com.ironsource.C3450ea;
import com.ironsource.C3605n2;
import com.ironsource.Z8;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<ImpressionDataListener> f29871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.ironsource.r f29872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3450ea f29873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdInfo f29874d;

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f29871a.remove(impressionDataListener);
        }
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f29871a.add(impressionDataListener);
        }
    }

    public void c() {
        synchronized (this) {
            this.f29871a.clear();
        }
    }

    public void f() {
        this.f29874d = null;
    }

    public String e() {
        return "fallback_" + System.currentTimeMillis();
    }

    public m(HashSet<ImpressionDataListener> hashSet, C3450ea c3450ea) {
        new HashSet();
        this.f29871a = hashSet;
        this.f29872b = new com.ironsource.r();
        this.f29873c = c3450ea;
    }

    public void a(C3450ea c3450ea) {
        this.f29873c = c3450ea;
    }

    public void a(Z8 z10, Bb bb2) {
        if (z10 != null) {
            this.f29874d = new AdInfo(z10, bb2);
        }
    }

    public void a(C3605n2 c3605n2, String str) {
        HashSet<ImpressionDataListener> hashSet;
        if (c3605n2 != null) {
            Z8 z8A = c3605n2.a(str);
            if (z8A != null) {
                synchronized (this) {
                    hashSet = (HashSet) this.f29871a.clone();
                }
                for (ImpressionDataListener impressionDataListener : hashSet) {
                    IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + z8A);
                    impressionDataListener.onImpressionSuccess(z8A);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    public void a(JSONObject jSONObject, IronSource.a aVar) {
        this.f29872b.a(aVar, jSONObject != null ? jSONObject.optBoolean(d.f29594f, false) : false);
    }

    public void a(IronSource.a aVar) {
        this.f29872b.a(aVar, false);
    }
}
