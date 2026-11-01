package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2890gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3144r1 f24451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24456f;

    public C2890gk(C3144r1 c3144r1, String str, String str2, String str3, String str4) {
        ck.p.j(str4, "markupType");
        this.f24451a = c3144r1;
        this.f24452b = str;
        this.f24453c = str2;
        this.f24454d = str3;
        this.f24455e = str4;
    }

    public final LinkedHashMap a() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3144r1 c3144r1 = this.f24451a;
        if (c3144r1 != null) {
            linkedHashMap.put("adType", c3144r1.f25217a.l());
        }
        C3144r1 c3144r2 = this.f24451a;
        if (c3144r2 != null) {
            linkedHashMap.put("plId", Long.valueOf(c3144r2.f25217a.f24720l.f25505a));
        }
        C3144r1 c3144r3 = this.f24451a;
        if (c3144r3 != null && (str = c3144r3.f25217a.f24720l.f25510f) != null) {
            linkedHashMap.put("plType", str);
        }
        C3144r1 c3144r4 = this.f24451a;
        String str2 = null;
        if (c3144r4 != null) {
            AdSet adSetR = c3144r4.f25217a.r();
            Boolean boolValueOf = adSetR != null ? Boolean.valueOf(adSetR.isRewarded()) : null;
            if (boolValueOf != null) {
                linkedHashMap.put("isRewarded", boolValueOf);
            }
        }
        String str3 = this.f24453c;
        if (str3 != null) {
            linkedHashMap.put("creativeId", str3);
        }
        String str4 = this.f24452b;
        if (str4 != null) {
            linkedHashMap.put("creativeType", str4);
        }
        linkedHashMap.put("markupType", this.f24455e);
        String str5 = this.f24456f;
        if (str5 != null) {
            str2 = str5;
        } else {
            ck.p.B("triggerSource");
        }
        linkedHashMap.put("trigger", str2);
        C3144r1 c3144r5 = this.f24451a;
        if (c3144r5 != null && c3144r5.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.f24451a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        C2915hk c2915hk;
        AtomicBoolean atomicBoolean;
        C3144r1 c3144r1 = this.f24451a;
        if (c3144r1 == null || (c2915hk = c3144r1.f25218b) == null || (atomicBoolean = c2915hk.f24515a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", C3298x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2177);
            String str = this.f24454d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj2 = Wj.f23753a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC2735ak.SDK);
        }
    }

    public final void c() {
        C2915hk c2915hk;
        AtomicBoolean atomicBoolean;
        C3144r1 c3144r1 = this.f24451a;
        if (c3144r1 == null || (c2915hk = c3144r1.f25218b) == null || (atomicBoolean = c2915hk.f24515a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", C3298x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0);
            String str = this.f24454d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj2 = Wj.f23753a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC2735ak.SDK);
        }
    }
}
