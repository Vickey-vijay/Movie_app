package com.facebook.ads.redexgen.core;

import android.graphics.Rect;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VN {
    public static String[] A02 = {"P6MYZTOvDAaFen8GvswQ7TN6uAA4LWVv", "hYZBnkN7eg3Goj1fCi2fLRcc1xaBLP0T", "hgTfm2gsKyXruwHhjUk", "Xl5p6SNgJSz0NngEgDitAc249tQNQ8ta", "gXDmJbn0MXLGD1TV1woO3x4WUye", "irvXIfdrm7YhWQVUx8qen3XIyPBMomv3", "r42H5ZZ7hG", "IBnhtff"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C2701pu<UE, UJ> c2701pu) {
        if (c2701pu.A06.A05()) {
            return c2701pu.A07.A07();
        }
        if (!c2701pu.A06.A06()) {
            return true;
        }
        return c2701pu.A07.A06();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    private boolean A01(C2701pu<UE, UJ> c2701pu, InterfaceC2692pk interfaceC2692pk) {
        boolean z10;
        int i10;
        int i11;
        float fA9P = -1.0f;
        try {
            fA9P = interfaceC2692pk.A9P(c2701pu);
        } catch (IllegalStateException unused) {
        }
        if (A02[6].length() == 7) {
            throw new RuntimeException();
        }
        A02[5] = "l0GJDJ6h98NWCV6pJLy8cxtVoo076bMe";
        if (fA9P > 0.0f && A00(c2701pu)) {
            return true;
        }
        if (c2701pu.A06.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c2701pu)) {
            return true;
        }
        interfaceC2692pk.A9O(this.A00);
        if (A02[2].length() != 2) {
            A02[2] = "WH3ZGQ";
            interfaceC2692pk.A85(c2701pu, this.A01);
            if (this.A00.bottom - this.A00.top > 0) {
                i10 = this.A01.bottom;
                i11 = this.A00.top;
                if (A02[7].length() != 7) {
                    throw new RuntimeException();
                }
                A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
                z10 = i10 - i11 > 0;
            }
            return !z10 && A00(c2701pu);
        }
        interfaceC2692pk.A85(c2701pu, this.A01);
        if (this.A00.bottom - this.A00.top > 0) {
            i10 = this.A01.bottom;
            i11 = this.A00.top;
            if (A02[7].length() != 7) {
                throw new RuntimeException();
            }
            A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
            if (i10 - i11 > 0) {
            }
        }
        if (z10) {
        }
        if (z10) {
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C2701pu<UE, UJ> c2701pu, InterfaceC2692pk interfaceC2692pk) {
        if (c2701pu.A07.A04() && A01(c2701pu, interfaceC2692pk)) {
            c2701pu.A07.A01();
            c2701pu.A06.A02().ABP(c2701pu.A06.A03(), c2701pu.A06.A04());
        }
        if (c2701pu.A07.A05() && U7.A1g(c2701pu.A06.A01())) {
            c2701pu.A07.A02();
            c2701pu.A06.A02().AB7(c2701pu.A06.A03(), c2701pu.A06.A04());
        }
    }
}
