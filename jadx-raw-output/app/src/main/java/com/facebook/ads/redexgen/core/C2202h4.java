package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2202h4 extends MQ {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C2198gz A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, 63, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public C2202h4(C2198gz c2198gz) {
        this.A00 = c2198gz;
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A02() {
        if (this.A00.A01 == null) {
            this.A00.A04 = false;
            this.A00.A07.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A04() {
        if (this.A00.A01 != null) {
            this.A00.A01.show();
            return;
        }
        this.A00.A04 = false;
        if (this.A00.A03 != null && U7.A26(this.A00.A06)) {
            this.A00.A03.A0S(new C2203h5(this));
            this.A00.A03.A0N();
            this.A00.A03.A0K();
            this.A00.A03 = null;
        }
        this.A00.A07.onInterstitialDismissed(this.A00.A08.A6c());
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A05() {
        this.A00.A07.onInterstitialDisplayed(this.A00.A08.A6c());
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A06() {
        this.A00.A07.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A07() {
        this.A00.A07.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A08() {
        this.A00.A07.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0C() {
        this.A00.A06.A0F().A3C();
        this.A00.A07.onAdClicked(this.A00.A08.A6c());
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0D() {
        this.A00.A07.onLoggingImpression(this.A00.A08.A6c());
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0E(View view) {
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0F(MP mp) {
        if (this.A00.A03 != null) {
            this.A00.A05 = true;
            this.A00.A02 = this.A00.A03.A0I();
            if (!(this.A00.A02 instanceof AbstractC2252hy)) {
                InterstitialAdExtendedListener interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    interstitialAdExtendedListener.onAdLoaded(this.A00.A08.A6c());
                    return;
                }
            } else {
                AbstractC2252hy abstractC2252hy = (AbstractC2252hy) this.A00.A02;
                if (abstractC2252hy.A1x() > 0) {
                    WR wr = new WR();
                    if (wr.A09(this.A00.A06, this.A00.A08.A08(), abstractC2252hy.A1x())) {
                        wr.A08(this.A00.A06, true);
                        this.A00.A01 = wr.A06(this.A00.A06, this.A00.A08.A0A(), this.A00.A08.A08());
                    } else {
                        C2198gz c2198gz = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            wr.A08(c2198gz.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            wr.A08(c2198gz.A06, false);
                        }
                    }
                }
                C2198gz c2198gz2 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    if (c2198gz2.A01 != null) {
                        abstractC2252hy.A2A(true);
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = this.A00.A01.buildLoadAdConfig().withAdListener(new C1445Nd(this, abstractC2252hy)).withCacheFlags(this.A00.A08.A0B()).withRewardData(this.A00.A08.A03()).build();
                        this.A00.A01.loadAd(loadAdConfig);
                        return;
                    }
                    C2198gz c2198gz3 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        c2198gz3.A07.onAdLoaded(this.A00.A08.A6c());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        c2198gz3.A07.onAdLoaded(this.A00.A08.A6c());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().AAy(A00(0, 3, 98), AbstractC1590Sv.A0N, new C1591Sw(A00(3, 18, 46)));
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0G(V1 v10) {
        this.A00.A06.A0F().A3F(XG.A01(this.A00.A00), v10.A03().getErrorCode(), v10.A04());
        this.A00.A07.onError(this.A00.A08.A6c(), WT.A00(v10));
    }
}
