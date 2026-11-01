package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2221hO implements InterfaceC1417Ma {
    public static byte[] A02;
    public final /* synthetic */ C10426y A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{64, 78, 68, 71, 78, 20, 79, 18, 77, 104, 109, 124, 120, 105, 126, 44, 101, 127, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, 69, 98, 120, 105, 126, 127, 120, 101, 120, 101, 109, 96, 77, 104, 59, 28, 6, 23, 0, 1, 6, 27, 6, 27, 19, 30, 82, 27, 31, 2, 0, 23, 1, 1, 27, 29, 28, 82, 20, 27, 0, 23, 22, 63, 48, 1, 63, 61, ExifInterface.START_CODE, 55, 40, 55, ExifInterface.START_CODE, 39, 101, 106, 96, 118, 107, 109, 96, ExifInterface.START_CODE, 109, 106, 112, 97, 106, 112, ExifInterface.START_CODE, 101, 103, 112, 109, 107, 106, ExifInterface.START_CODE, 82, 77, 65, 83, 34, 51, ExifInterface.START_CODE, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C2221hO(C10426y c10426y, Runnable runnable) {
        this.A00 = c10426y;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417Ma
    public final void ADY(C2278iS c2278iS, String str, boolean z10) {
        this.A00.A07.A0C();
        boolean z11 = !TextUtils.isEmpty(str);
        if (z10 && z11) {
            try {
                Intent intent = new Intent(A00(85, 26, 62));
                intent.setData(WQ.A00(str));
                WB.A0D(this.A00.A0B, intent);
            } catch (W9 e10) {
                Throwable cause = e10.getCause();
                W9 cause2 = e10;
                if (cause != null) {
                    cause2 = e10.getCause();
                }
                this.A00.A0B.A08().AAy(A00(74, 11, 100), AbstractC1590Sv.A04, new C1591Sw(cause2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417Ma
    public final void ADZ(C2278iS c2278iS) {
        this.A00.A07.A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417Ma
    public final void ADa(C2278iS c2278iS) {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417Ma
    public final void ADb(C2278iS c2278iS) {
        if (c2278iS != this.A00.A00) {
            return;
        }
        if (c2278iS == null) {
            this.A00.A0B.A08().AAy(A00(111, 3, 121), AbstractC1590Sv.A0X, new C1591Sw(A00(8, 37, 54)));
            ADc(c2278iS, AdError.internalError(2004));
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = c2278iS;
        this.A00.A0L();
        this.A00.A07.A0F(c2278iS);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417Ma
    public final void ADc(C2278iS c2278iS, AdError adError) {
        if (c2278iS != this.A00.A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(c2278iS);
        this.A00.A0B.A0F().A5Y(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new V1(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417Ma
    public final void ADd(C2278iS c2278iS) {
        VF.A05(A00(114, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417Ma
    public final void ADe() {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417Ma
    public final void ADf() {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417Ma
    public final void ADg() {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1417Ma
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
