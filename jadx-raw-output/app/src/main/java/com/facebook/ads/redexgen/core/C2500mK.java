package com.facebook.ads.redexgen.core;

import android.net.Uri;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2500mK implements InterfaceC1219Ej, CD {
    public static String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public AnonymousClass56 A01;
    public H1 A02;
    public boolean A04;
    public final Uri A06;
    public final C3W A07;
    public final C10849b A08;
    public final InterfaceC1159Cb A09;
    public final GY A0A;
    public volatile boolean A0C;
    public final /* synthetic */ C9A A0D;
    public final C1281Gt A0B = new C1281Gt();
    public boolean A03 = true;
    public final long A05 = CE.A00();

    public C2500mK(C9A c9a, Uri uri, InterfaceC2589nl interfaceC2589nl, InterfaceC1159Cb interfaceC1159Cb, GY gy, C3W c3w) {
        this.A0D = c9a;
        this.A06 = uri;
        this.A08 = new C10849b(interfaceC2589nl);
        this.A09 = interfaceC1159Cb;
        this.A0A = gy;
        this.A07 = c3w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j10, long j11) {
        this.A0B.A00 = j10;
        this.A00 = j11;
        this.A03 = true;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1219Ej
    public final void A4j() {
        this.A0C = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x011b */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1219Ej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AAi() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2500mK.AAi():void");
    }

    @Override // com.facebook.ads.redexgen.core.CD
    public final void ADR(C4J c4j) {
        long jMax;
        if (this.A04) {
            jMax = Math.max(this.A0D.A03(true), this.A00);
        } else {
            jMax = this.A00;
        }
        int iA07 = c4j.A07();
        H1 h10 = (H1) C3M.A01(this.A02);
        h10.AI7(c4j, iA07);
        h10.AIA(jMax, 1, iA07, 0, null);
        this.A04 = true;
    }
}
