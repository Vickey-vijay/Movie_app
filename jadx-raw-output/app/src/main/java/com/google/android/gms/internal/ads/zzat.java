package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.Z7;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public class zzat extends IOException {
    public final boolean zza;
    public final int zzb;

    public static zzat zza(@Nullable String str, @Nullable Throwable th2) {
        return new zzat(str, th2, true, 0);
    }

    public static zzat zzb(@Nullable String str, @Nullable Throwable th2) {
        return new zzat(str, th2, true, 1);
    }

    public static zzat zzc(@Nullable String str) {
        return new zzat(str, null, false, 1);
    }

    public zzat(@Nullable String str, @Nullable Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.zza = z10;
        this.zzb = i10;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String strConcat;
        String message = super.getMessage();
        if (message != null) {
            strConcat = message.concat(Z7.f27998r);
        } else {
            strConcat = "";
        }
        boolean z10 = this.zza;
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(strConcat.length() + 20 + String.valueOf(z10).length() + 11 + String.valueOf(i10).length() + 1);
        sb2.append(strConcat);
        sb2.append("{contentIsMalformed=");
        sb2.append(z10);
        sb2.append(", dataType=");
        sb2.append(i10);
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
        return sb2.toString();
    }
}
