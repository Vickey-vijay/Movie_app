package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2683pb {
    public static C2683pb A03 = null;
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2694pm A02;

    public C2683pb(ViewpointQeConfig viewpointQeConfig, AbstractC2699ps abstractC2699ps, C2694pm c2694pm, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2694pm;
        abstractC2699ps.A03(new A4(c2694pm));
    }

    public static C2683pb A00(ViewpointQeConfig viewpointQeConfig, AbstractC2699ps abstractC2699ps, InterfaceC2704px interfaceC2704px, A6 a10) {
        C2683pb localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        return new C2683pb(viewpointQeConfig, abstractC2699ps, new C2694pm(viewpointQeConfig, interfaceC2704px, C1140Bg.A00, a10, viewpointRegistry, new Handler(Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(InterfaceC2698pr interfaceC2698pr) {
        this.A02.A0E(interfaceC2698pr);
    }

    public final void A02(InterfaceC2696pp interfaceC2696pp) {
        this.A02.A0F(interfaceC2696pp);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(DspViewableNode dspViewableNode, C2705q0 c2705q0) {
        if (this.A00.A00 && c2705q0 != null) {
            this.A01.A06(dspViewableNode, c2705q0);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A05(DspViewableNode dspViewableNode, C2705q0 c2705q0, C2701pu c2701pu) {
        if (this.A00.A00 && c2705q0 != null) {
            this.A01.A07(dspViewableNode, c2705q0, c2701pu);
        } else {
            this.A01.A08(dspViewableNode, c2701pu);
        }
    }

    public final void A06(DspViewableNode dspViewableNode, C2701pu c2701pu) {
        A05(dspViewableNode, null, c2701pu);
    }
}
