package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzatt extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzatt(zzats zzatsVar, zzatq zzatqVar, long j10) {
        int[] iArr = {2143124030, 85005376, 430547086, 878451808, 1894615585, -1294155075, 737454769, 1747844822, 1617876982};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        iArr[0] = 1434433518;
        iArr[1] = 1229726181;
        iArr[2] = 671269892;
        iArr[3] = 1096561121;
        iArr[4] = 546312716;
        iArr[5] = 1929952353;
        iArr[6] = 157272379;
        iArr[7] = 1830539036;
        iArr[8] = 1290127955;
        int i18 = (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 1617876982);
        Locale locale = Locale.US;
        Object[] objArr = new Object[i18];
        objArr[0] = Long.valueOf(zzatsVar.zza());
        objArr[1] = Long.valueOf(zzatqVar.zza());
        int i19 = (157272379 + (((((~1434433518) & 1229726181) | 671269892) + ((1434433518 & 1096561121) | 546312716)) - 1929952353)) ^ (1830539036 % 1290127955);
        Long lValueOf = Long.valueOf(j10);
        objArr[i19] = lValueOf;
        super(String.format(locale, zzaui.zza("bk3t6gFTc30="), objArr));
        Optional.of(zzatqVar);
        Optional.of(lValueOf);
    }

    public zzatt(zzats zzatsVar, Throwable th2) {
        super(String.format(Locale.US, zzaui.zza("bk0="), Long.valueOf(zzatsVar.zza())), th2);
        Optional.empty();
        Optional.empty();
    }
}
