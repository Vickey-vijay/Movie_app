package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzamz implements zzamf {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzer zze = new zzer();

    @VisibleForTesting(otherwise = 2)
    public static float zzb(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = j10 + (Long.parseLong(strGroup2) * 60000);
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = j11 + (Long.parseLong(strGroup3) * 1000);
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x018c  */
    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i10, int i11, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar;
        String str;
        byte b10;
        byte b11;
        int i12;
        zzcx zzcxVarZzr;
        zzamz zzamzVar = this;
        zzer zzerVar2 = zzamzVar.zze;
        zzerVar2.zzb(bArr, i10 + i11);
        zzerVar2.zzh(i10);
        Charset charsetZzR = zzerVar2.zzR();
        if (charsetZzR == null) {
            charsetZzR = StandardCharsets.UTF_8;
        }
        while (true) {
            String strZzN = zzerVar2.zzN(charsetZzR);
            if (strZzN == null) {
                return;
            }
            if (strZzN.isEmpty()) {
                zzerVar = zzerVar2;
            } else {
                try {
                    Integer.parseInt(strZzN);
                    zzer zzerVar3 = zzamzVar.zze;
                    String strZzN2 = zzerVar3.zzN(charsetZzR);
                    if (strZzN2 == null) {
                        zzee.zzc("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(strZzN2);
                    if (matcher.matches()) {
                        long jZzc = zzc(matcher, 1);
                        long jZzc2 = zzc(matcher, 6);
                        StringBuilder sb2 = zzamzVar.zzc;
                        int i13 = 0;
                        sb2.setLength(0);
                        ArrayList arrayList = zzamzVar.zzd;
                        arrayList.clear();
                        String strZzN3 = zzerVar3.zzN(charsetZzR);
                        while (!TextUtils.isEmpty(strZzN3)) {
                            if (sb2.length() > 0) {
                                sb2.append("<br>");
                            }
                            String strTrim = strZzN3.trim();
                            StringBuilder sb3 = new StringBuilder(strTrim);
                            Matcher matcher2 = zzb.matcher(strTrim);
                            int i14 = i13;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i14;
                                int length = strGroup.length();
                                sb3.replace(iStart, iStart + length, "");
                                i14 += length;
                                zzerVar2 = zzerVar2;
                            }
                            sb2.append(sb3.toString());
                            strZzN3 = zzerVar3.zzN(charsetZzR);
                            i13 = 0;
                        }
                        zzerVar = zzerVar2;
                        Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList.size()) {
                                str = (String) arrayList.get(i15);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i15++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcw zzcwVar = new zzcw();
                        zzcwVar.zza(spannedFromHtml);
                        if (str == null) {
                            zzcxVarZzr = zzcwVar.zzr();
                        } else {
                            switch (str) {
                                case "{\an1}":
                                    b10 = 0;
                                    break;
                                case "{\an3}":
                                    b10 = 3;
                                    break;
                                case "{\an4}":
                                    b10 = 1;
                                    break;
                                case "{\an6}":
                                    b10 = 4;
                                    break;
                                case "{\an7}":
                                    b10 = 2;
                                    break;
                                case "{\an9}":
                                    b10 = 5;
                                    break;
                                default:
                                    b10 = -1;
                                    break;
                            }
                            if (b10 == 0 || b10 == 1 || b10 == 2) {
                                zzcwVar.zzj(0);
                            } else if (b10 == 3 || b10 == 4 || b10 == 5) {
                                zzcwVar.zzj(2);
                            } else {
                                zzcwVar.zzj(1);
                            }
                            switch (str) {
                                case "{\an1}":
                                    b11 = 0;
                                    break;
                                case "{\an2}":
                                    b11 = 1;
                                    break;
                                case "{\an3}":
                                    b11 = 2;
                                    break;
                                case "{\an7}":
                                    b11 = 3;
                                    break;
                                case "{\an8}":
                                    b11 = 4;
                                    break;
                                case "{\an9}":
                                    b11 = 5;
                                    break;
                                default:
                                    b11 = -1;
                                    break;
                            }
                            if (b11 == 0 || b11 == 1) {
                                i12 = 2;
                            } else {
                                if (b11 == 2) {
                                    i12 = 2;
                                } else if (b11 == 3 || b11 == 4 || b11 == 5) {
                                    zzcwVar.zzg(0);
                                } else {
                                    zzcwVar.zzg(1);
                                }
                                zzcwVar.zzi(zzb(zzcwVar.zzk()));
                                zzcwVar.zzf(zzb(zzcwVar.zzh()), 0);
                                zzcxVarZzr = zzcwVar.zzr();
                            }
                            zzcwVar.zzg(i12);
                            zzcwVar.zzi(zzb(zzcwVar.zzk()));
                            zzcwVar.zzf(zzb(zzcwVar.zzh()), 0);
                            zzcxVarZzr = zzcwVar.zzr();
                        }
                        zzdrVar.zza(new zzalx(zzguf.zzj(zzcxVarZzr), jZzc, jZzc2 - jZzc));
                    } else {
                        zzerVar = zzerVar2;
                        zzee.zzc("SubripParser", "Skipping invalid timing: ".concat(strZzN2));
                    }
                } catch (NumberFormatException unused) {
                    zzerVar = zzerVar2;
                    zzee.zzc("SubripParser", "Skipping invalid index: ".concat(strZzN));
                }
            }
            zzamzVar = this;
            zzerVar2 = zzerVar;
        }
    }
}
