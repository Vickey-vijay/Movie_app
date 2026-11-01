package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C09483i extends C1186Dc {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C1980dO A01;
    public boolean A02;
    public final AbstractC1600Tf<C09433d> A03;
    public final AbstractC1600Tf<C3Y> A04;
    public final AbstractC1600Tf<DQ> A05;
    public final AbstractC1600Tf<C3Q> A06;
    public final AbstractC1600Tf<DL> A07;
    public final AbstractC1600Tf<DJ> A08;
    public final AbstractC1600Tf<DI> A09;
    public final AbstractC1600Tf<DD> A0A;
    public final AbstractC1600Tf<DC> A0B;
    public final E1 A0C;
    public final DN A0D;
    public final DE A0E;

    public C09483i(C1977dL c1977dL, US us, E1 e10, String str) {
        this(c1977dL, us, e10, str, 0, 0, false, null, null);
    }

    public C09483i(C1977dL c1977dL, US us, E1 e10, String str, int i10, int i11, boolean z10, Bundle bundle, Map<String, String> map) {
        super(c1977dL, us, e10, str, !e10.A0p(), i10, i11, z10, bundle, map, new C1185Db(c1977dL, e10));
        this.A0E = new DE() { // from class: com.facebook.ads.redexgen.X.3j
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1600Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DF df2) {
                this.A00.A0f();
            }
        };
        this.A08 = new C1196Dm(this);
        this.A04 = new C1195Dl(this);
        this.A05 = new C1194Dk(this);
        this.A06 = new C1193Dj(this);
        this.A03 = new C1192Di(this);
        this.A07 = new C1191Dh(this);
        this.A0A = new C1190Dg(this);
        this.A0B = new C1189Df(this);
        this.A09 = new C1201Dr(this);
        this.A0D = new DN() { // from class: com.facebook.ads.redexgen.X.3k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1600Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r10) {
                this.A00.A00 = this.A00.A0C.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = e10;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (U7.A2m(c1977dL)) {
            this.A01 = new C1980dO(e10, str, z10, null);
        }
    }

    public C09483i(C1977dL c1977dL, US us, E1 e10, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c1977dL, us, e10, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1186Dc
    public final void A0n(EnumC1984dS enumC1984dS, Map<String, String> map) {
        super.A0n(enumC1984dS, map);
        if (this.A01 != null && enumC1984dS == EnumC1984dS.A09) {
            Map<String, String> params = this.A01.A06();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        C1198Do c1198Do = new C1198Do(this);
        if (this.A0C.A0t()) {
            XJ.A00(c1198Do);
            return;
        }
        E1 e10 = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        e10.getStateHandler().post(c1198Do);
    }
}
