package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzamy {
    public final String zza;
    public final int zzb;

    @Nullable
    @ColorInt
    public final Integer zzc;

    @Nullable
    @ColorInt
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzamy(String str, int i10, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = i11;
    }

    private static boolean zze(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
            sb2.append("Failed to parse boolean value: '");
            sb2.append(str);
            sb2.append("'");
            zzee.zzd("SsaStyle", sb2.toString(), e10);
            return false;
        }
    }

    @Nullable
    public static zzamy zza(String str, zzamw zzamwVar) {
        int i10;
        zzgrc.zza(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), StringUtils.COMMA);
        int length = strArrSplit.length;
        int i11 = zzamwVar.zzk;
        if (length != i11) {
            Object[] objArr = {Integer.valueOf(i11), Integer.valueOf(length), str};
            String str2 = zzfj.zza;
            zzee.zzc("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            String strTrim = strArrSplit[zzamwVar.zza].trim();
            int i12 = zzamwVar.zzb;
            int iZzd = i12 != -1 ? zzd(strArrSplit[i12].trim()) : -1;
            int i13 = zzamwVar.zzc;
            Integer numZzb = i13 != -1 ? zzb(strArrSplit[i13].trim()) : null;
            int i14 = zzamwVar.zzd;
            Integer numZzb2 = i14 != -1 ? zzb(strArrSplit[i14].trim()) : null;
            int i15 = zzamwVar.zze;
            float f10 = -3.4028235E38f;
            if (i15 != -1) {
                String strTrim2 = strArrSplit[i15].trim();
                try {
                    f10 = Float.parseFloat(strTrim2);
                } catch (NumberFormatException e10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strTrim2).length() + 29);
                    sb2.append("Failed to parse font size: '");
                    sb2.append(strTrim2);
                    sb2.append("'");
                    zzee.zzd("SsaStyle", sb2.toString(), e10);
                }
            }
            int i16 = zzamwVar.zzf;
            boolean z10 = i16 != -1 && zze(strArrSplit[i16].trim());
            int i17 = zzamwVar.zzg;
            boolean z11 = i17 != -1 && zze(strArrSplit[i17].trim());
            int i18 = zzamwVar.zzh;
            boolean z12 = i18 != -1 && zze(strArrSplit[i18].trim());
            int i19 = zzamwVar.zzi;
            boolean z13 = i19 != -1 && zze(strArrSplit[i19].trim());
            int i20 = zzamwVar.zzj;
            if (i20 != -1) {
                String strTrim3 = strArrSplit[i20].trim();
                try {
                    int i21 = Integer.parseInt(strTrim3.trim());
                    if (i21 == 1 || i21 == 3) {
                        i10 = i21;
                    } else {
                        zzee.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                        i10 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                i10 = -1;
            }
            return new zzamy(strTrim, iZzd, numZzb, numZzb2, f10, z10, z11, z12, z13, i10);
        } catch (RuntimeException e11) {
            StringBuilder sb3 = new StringBuilder(str.length() + 36);
            sb3.append("Skipping malformed 'Style:' line: '");
            sb3.append(str);
            sb3.append("'");
            zzee.zzd("SsaStyle", sb3.toString(), e11);
            return null;
        }
    }

    @Nullable
    @ColorInt
    public static Integer zzb(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgrc.zza(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgxz.zza(((j10 >> 24) & 255) ^ 255), zzgxz.zza(j10 & 255), zzgxz.zza((j10 >> 8) & 255), zzgxz.zza((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
            sb2.append("Failed to parse color expression: '");
            sb2.append(str);
            sb2.append("'");
            zzee.zzd("SsaStyle", sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i10;
                default:
                    zzee.zzc("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }
}
