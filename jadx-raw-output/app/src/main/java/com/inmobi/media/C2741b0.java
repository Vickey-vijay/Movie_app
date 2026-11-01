package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2741b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f24024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3053n9 f24029f;

    public C2741b0(WeakReference weakReference, String str, boolean z10) {
        ck.p.j(weakReference, "adUnitEventListener");
        ck.p.j(str, "adtype");
        this.f24024a = weakReference;
        this.f24025b = str;
        this.f24026c = z10;
        this.f24027d = new AtomicBoolean(false);
        this.f24028e = String.valueOf(ck.s.b(C2741b0.class).i());
    }

    public final void a(C2890gk c2890gk) {
        Gh gh2;
        C2915hk c2915hk;
        AtomicBoolean atomicBoolean;
        if (!this.f24027d.getAndSet(true)) {
            Qi qi2 = Qi.f23392a;
            String str = this.f24025b;
            Boolean boolValueOf = Boolean.valueOf(this.f24026c);
            qi2.getClass();
            Qi.a(str, boolValueOf);
            AbstractC2871g1 abstractC2871g1 = (AbstractC2871g1) this.f24024a.get();
            if (abstractC2871g1 != null) {
                abstractC2871g1.a(c2890gk);
            } else if (c2890gk != null) {
                c2890gk.b();
            }
            C3053n9 c3053n9 = this.f24029f;
            if (c3053n9 != null) {
                c3053n9.a(this.f24028e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            C3053n9 c3053n10 = this.f24029f;
            if (c3053n10 == null || (gh2 = c3053n10.f24879a) == null) {
                return;
            }
            gh2.a();
            return;
        }
        C3053n9 c3053n11 = this.f24029f;
        if (c3053n11 != null) {
            c3053n11.c(this.f24028e, "skipping as Impression is already Called");
        }
        if (c2890gk != null) {
            C3144r1 c3144r1 = c2890gk.f24451a;
            if (c3144r1 == null || (c2915hk = c3144r1.f25218b) == null || (atomicBoolean = c2915hk.f24515a) == null || !atomicBoolean.getAndSet(true)) {
                LinkedHashMap linkedHashMapA = c2890gk.a();
                linkedHashMapA.put("networkType", C3298x5.m());
                linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2179);
                String str2 = c2890gk.f24454d;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMapA.put("impressionId", str2);
                Wj wj2 = Wj.f23753a;
                Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC2735ak.SDK);
            }
        }
    }
}
