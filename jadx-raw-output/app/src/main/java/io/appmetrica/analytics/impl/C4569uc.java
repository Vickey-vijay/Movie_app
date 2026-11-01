package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4569uc implements G8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rg f57762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xe f57763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57764c = "activation_unlock_event_sending";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f57765d;

    public final void a(String str) {
        try {
            Rj rj2 = AbstractC4452pj.f57520a;
            String str2 = this.f57764c;
            JSONObject jSONObjectPut = new JSONObject().put("source", str).put("framework", FrameworkDetector.framework());
            N9 n9I = C4418oa.I.i();
            Bundle applicationMetaData = n9I.f55620d.getApplicationMetaData(n9I.f55617a);
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C4403nk c4403nk = C4418oa.I.D;
            String string = jSONObjectPut2.put("activation_offset", TimeUnit.SECONDS.convert(c4403nk.f57363a.currentTimeMillis() - c4403nk.f57364b, TimeUnit.MILLISECONDS)).toString();
            rj2.getClass();
            rj2.a(new Pj(str2, string));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final boolean b() {
        String str;
        if (!this.f57765d.get() && (str = ((C4350lh) this.f57762a.a()).f57209m) != null && !ck.p.e(str, "629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f57765d.compareAndSet(false, true)) {
            this.f57763b.b(true);
            a("activation");
        }
        return this.f57765d.get();
    }

    public C4569uc(Rg rg2, C4437p4 c4437p4, Xe xe2) {
        this.f57762a = rg2;
        this.f57763b = xe2;
        this.f57765d = new AtomicBoolean(xe2.a(false) || a(c4437p4));
    }

    public final void a() {
        if (this.f57765d.compareAndSet(false, true)) {
            this.f57763b.b(true);
            a("timer");
        }
    }

    public static boolean a(C4437p4 c4437p4) {
        String str = c4437p4.f57475a;
        return (str == null || ck.p.e(str, "629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
