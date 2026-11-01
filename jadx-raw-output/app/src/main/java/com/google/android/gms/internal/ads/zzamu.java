package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzamu {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzamu(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
    }

    @Nullable
    public static zzamu zza(String str) {
        byte b10;
        zzgrc.zza(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i10 >= length) {
                if (i12 == -1 || i13 == -1 || i15 == -1) {
                    return null;
                }
                return new zzamu(i11, i12, i13, i14, i15, length);
            }
            switch (zzgql.zza(strArrSplit[i10].trim())) {
                case "end":
                    b10 = 2;
                    break;
                case "text":
                    b10 = 4;
                    break;
                case "layer":
                    b10 = 0;
                    break;
                case "start":
                    b10 = 1;
                    break;
                case "style":
                    b10 = 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                i11 = i10;
            } else if (b10 == 1) {
                i12 = i10;
            } else if (b10 == 2) {
                i13 = i10;
            } else if (b10 == 3) {
                i14 = i10;
            } else if (b10 == 4) {
                i15 = i10;
            }
            i10++;
        }
    }
}
