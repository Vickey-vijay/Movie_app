package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1676Wh {
    public static String[] A05 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC2252hy A02;
    public final C1977dL A03;
    public final Wf A04;

    public C1676Wh(C1977dL c1977dL, AbstractC2252hy abstractC2252hy, Wf wf2) {
        this.A03 = c1977dL;
        this.A04 = wf2;
        this.A02 = abstractC2252hy;
    }

    public static C1676Wh A00(C1977dL c1977dL, AbstractC2252hy abstractC2252hy, Wf wf2) {
        Object creativeAsCtaLoggingHelper = c1977dL.A0I();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new C1676Wh(c1977dL, abstractC2252hy, wf2);
            c1977dL.A0P(creativeAsCtaLoggingHelper);
        }
        return (C1676Wh) creativeAsCtaLoggingHelper;
    }

    public static boolean A01(C1977dL c1977dL) {
        return U7.A1b(c1977dL) && WN.A0I(c1977dL);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    public final C1675Wg A02(AbstractC2252hy abstractC2252hy) {
        boolean z10;
        if (U7.A1h(this.A03)) {
            z10 = abstractC2252hy.A1W() && A01(this.A03);
            return new C1675Wg(z10, z10);
        }
        boolean zA1W = abstractC2252hy.A1W();
        if (zA1W) {
            boolean zA01 = A01(this.A03);
            String[] strArr = A05;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g";
            strArr2[4] = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA";
            z10 = zA01;
        }
        return new C1675Wg(zA1W, z10);
    }

    public final void A03() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }
}
