package com.inmobi.media;

import android.app.Activity;

/* JADX INFO: loaded from: classes7.dex */
public final class K8 implements S5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M8 f23006a;

    public K8(M8 m10) {
        this.f23006a = m10;
    }

    public final void a(String str, R5 r10, float f10, boolean z10, long j10, Ya ya2) {
        String adType;
        String creativeId;
        String impressionId;
        Q5 q10;
        ck.p.j(str, "expandInput");
        ck.p.j(r10, "inputType");
        M8 m10 = this.f23006a;
        Activity activity = (Activity) m10.f23141a.get();
        if (activity == null) {
            return;
        }
        if (m10.f23145e == null) {
            Q5 q11 = new Q5(activity);
            InterfaceC3028m9 interfaceC3028m9 = m10.f23148h;
            if (interfaceC3028m9 != null) {
                q11.setLogger(interfaceC3028m9);
            }
            q11.setId(65518);
            q11.setEmbeddedBrowserUpdateListener(m10.f23149i);
            m10.f23145e = q11;
        }
        C c10 = m10.f23142b;
        if ((c10 instanceof GestureDetectorOnGestureListenerC2785ci) && (q10 = m10.f23145e) != null) {
            q10.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC2785ci) c10).getListener());
        }
        Q5 q12 = m10.f23145e;
        if (q12 != null) {
            C c11 = m10.f23142b;
            if (c11 == null || (adType = ((GestureDetectorOnGestureListenerC2785ci) c11).getAdType()) == null) {
                adType = "banner";
            }
            String str2 = adType;
            C c12 = m10.f23142b;
            String str3 = (c12 == null || (impressionId = ((GestureDetectorOnGestureListenerC2785ci) c12).getImpressionId()) == null) ? "" : impressionId;
            C c13 = m10.f23142b;
            q12.a(str, r10, z10, j10, str2, str3, (c13 == null || (creativeId = ((GestureDetectorOnGestureListenerC2785ci) c13).getCreativeId()) == null) ? "" : creativeId, ya2);
        }
        float f11 = 1 - f10;
        m10.f23147g = f11;
        C3150r7 c3150r7 = m10.f23143c;
        if (c3150r7 != null) {
            c3150r7.f25242c = f11;
            c3150r7.c();
        }
        m10.b();
    }
}
