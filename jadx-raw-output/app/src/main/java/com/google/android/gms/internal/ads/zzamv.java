package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzamv implements zzamf {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;

    @Nullable
    private final zzamu zzc;
    private final zzer zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzamv() {
        this(null);
    }

    private static float zzd(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:141:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01af  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bf  */
    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i10, int i11, zzame zzameVar, zzdr zzdrVar) {
        zzamu zzamuVarZza;
        int i12;
        zzamu zzamuVar;
        int i13;
        int i14;
        Layout.Alignment alignment;
        int i15;
        int i16;
        int i17;
        Integer num;
        int i18;
        zzamv zzamvVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzer zzerVar = zzamvVar.zzd;
        zzerVar.zzb(bArr, i10 + i11);
        zzerVar.zzh(i10);
        Charset charsetZzR = zzerVar.zzR();
        if (charsetZzR == null) {
            charsetZzR = StandardCharsets.UTF_8;
        }
        if (zzamvVar.zzb) {
            zzamuVarZza = zzamvVar.zzc;
        } else {
            zzamvVar.zzb(zzerVar, charsetZzR);
            zzamuVarZza = null;
        }
        while (true) {
            String strZzN = zzerVar.zzN(charsetZzR);
            if (strZzN == null) {
                int i19 = 0;
                while (i19 < arrayList.size()) {
                    List list = (List) arrayList.get(i19);
                    if (!list.isEmpty()) {
                        if (i19 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i19)).longValue();
                        zzdrVar.zza(new zzalx(list, jLongValue, ((Long) arrayList2.get(i19 + 1)).longValue() - jLongValue));
                        i12 = 1;
                    } else if (i19 != 0) {
                        i12 = 1;
                    } else {
                        i19 = 0;
                        if (i19 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue2 = ((Long) arrayList2.get(i19)).longValue();
                        zzdrVar.zza(new zzalx(list, jLongValue2, ((Long) arrayList2.get(i19 + 1)).longValue() - jLongValue2));
                        i12 = 1;
                    }
                    i19 += i12;
                }
                return;
            }
            if (strZzN.startsWith("Format:")) {
                zzamuVarZza = zzamu.zza(strZzN);
            } else {
                if (strZzN.startsWith("Dialogue:")) {
                    if (zzamuVarZza == null) {
                        zzee.zzc("SsaParser", "Skipping dialogue line before complete format: ".concat(strZzN));
                    } else {
                        zzgrc.zza(strZzN.startsWith("Dialogue:"));
                        String strSubstring = strZzN.substring(9);
                        int i20 = zzamuVarZza.zzf;
                        String[] strArrSplit = strSubstring.split(StringUtils.COMMA, i20);
                        if (strArrSplit.length != i20) {
                            zzee.zzc("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strZzN));
                        } else {
                            int i21 = zzamuVarZza.zza;
                            if (i21 != -1) {
                                try {
                                    i13 = Integer.parseInt(strArrSplit[i21].trim());
                                } catch (RuntimeException unused) {
                                    zzee.zzc("SsaParser", "Fail to parse layer: ".concat(String.valueOf(strArrSplit[zzamuVarZza.zza])));
                                    i13 = 0;
                                }
                            } else {
                                i13 = 0;
                            }
                            long jZzc = zzc(strArrSplit[zzamuVarZza.zzb]);
                            if (jZzc == -9223372036854775807L) {
                                zzee.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                            } else {
                                long jZzc2 = zzc(strArrSplit[zzamuVarZza.zzc]);
                                if (jZzc2 == -9223372036854775807L || jZzc2 <= jZzc) {
                                    zzamuVar = zzamuVarZza;
                                    zzerVar = zzerVar;
                                    zzee.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                                } else {
                                    Map map = zzamvVar.zze;
                                    zzamy zzamyVar = (map == null || (i18 = zzamuVarZza.zzd) == -1) ? null : (zzamy) map.get(strArrSplit[i18].trim());
                                    String str = strArrSplit[zzamuVarZza.zze];
                                    zzamx zzamxVarZza = zzamx.zza(str);
                                    String strReplace = zzamx.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f10 = zzamvVar.zzf;
                                    float f11 = zzamvVar.zzg;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    zzcw zzcwVar = new zzcw();
                                    zzcwVar.zza(spannableString);
                                    zzcwVar.zzq(i13);
                                    if (zzamyVar != null) {
                                        Integer num2 = zzamyVar.zzc;
                                        zzamuVar = zzamuVarZza;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (zzamyVar.zzj == 3 && (num = zzamyVar.zzd) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f12 = zzamyVar.zze;
                                        if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                                            zzcwVar.zzl(f12 / f11, 1);
                                        }
                                        if (!zzamyVar.zzf) {
                                            i16 = 33;
                                            i17 = 0;
                                            if (zzamyVar.zzg) {
                                                i14 = 2;
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                            if (zzamyVar.zzh) {
                                                spannableString.setSpan(new UnderlineSpan(), i17, spannableString.length(), i16);
                                            }
                                            if (zzamyVar.zzi) {
                                                spannableString.setSpan(new StrikethroughSpan(), i17, spannableString.length(), i16);
                                            }
                                        } else if (zzamyVar.zzg) {
                                            i16 = 33;
                                            i17 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i16 = 33;
                                            i17 = 0;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        i14 = 2;
                                        if (zzamyVar.zzh) {
                                            spannableString.setSpan(new UnderlineSpan(), i17, spannableString.length(), i16);
                                        }
                                        if (zzamyVar.zzi) {
                                            spannableString.setSpan(new StrikethroughSpan(), i17, spannableString.length(), i16);
                                        }
                                    } else {
                                        zzamuVar = zzamuVarZza;
                                        zzerVar = zzerVar;
                                        jZzc2 = jZzc2;
                                        i14 = 2;
                                    }
                                    int i22 = zzamxVarZza.zza;
                                    if (i22 == -1) {
                                        i22 = zzamyVar != null ? zzamyVar.zzb : -1;
                                    }
                                    switch (i22) {
                                        case 0:
                                        default:
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(i22).length() + 19);
                                            sb2.append("Unknown alignment: ");
                                            sb2.append(i22);
                                            zzee.zzc("SsaParser", sb2.toString());
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzcwVar.zzd(alignment);
                                    int i23 = Integer.MIN_VALUE;
                                    switch (i22) {
                                        case 0:
                                        default:
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i22).length() + 19);
                                            sb3.append("Unknown alignment: ");
                                            sb3.append(i22);
                                            zzee.zzc("SsaParser", sb3.toString());
                                        case -1:
                                            i15 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i15 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i15 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i15 = i14;
                                            break;
                                    }
                                    zzcwVar.zzj(i15);
                                    switch (i22) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(i22).length() + 19);
                                            sb4.append("Unknown alignment: ");
                                            sb4.append(i22);
                                            zzee.zzc("SsaParser", sb4.toString());
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i23 = i14;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i23 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i23 = 0;
                                            break;
                                    }
                                    zzcwVar.zzg(i23);
                                    PointF pointF = zzamxVarZza.zzb;
                                    if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                        zzcwVar.zzi(zzd(zzcwVar.zzk()));
                                        zzcwVar.zzf(zzd(zzcwVar.zzh()), 0);
                                    } else {
                                        zzcwVar.zzi(pointF.x / f10);
                                        zzcwVar.zzf(pointF.y / f11, 0);
                                    }
                                    zzcx zzcxVarZzr = zzcwVar.zzr();
                                    int iZze = zze(jZzc2, arrayList2, arrayList);
                                    for (int iZze2 = zze(jZzc, arrayList2, arrayList); iZze2 < iZze; iZze2++) {
                                        ((List) arrayList.get(iZze2)).add(zzcxVarZzr);
                                    }
                                }
                            }
                        }
                    }
                    zzamuVar = zzamuVarZza;
                    zzerVar = zzerVar;
                } else {
                    zzamuVar = zzamuVarZza;
                    zzerVar = zzerVar;
                }
                zzamvVar = this;
                charsetZzR = charsetZzR;
                zzamuVarZza = zzamuVar;
                zzerVar = zzerVar;
            }
        }
    }

    public zzamv(@Nullable List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzer();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzi = zzfj.zzi((byte[]) list.get(0));
        zzgrc.zza(strZzi.startsWith("Format:"));
        zzamu zzamuVarZza = zzamu.zza(strZzi);
        zzamuVarZza.getClass();
        this.zzc = zzamuVarZza;
        zzb(new zzer((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = zzfj.zza;
        long j10 = Long.parseLong(strGroup) * 3600000000L;
        long j11 = Long.parseLong(matcher.group(2)) * 60000000;
        return j10 + j11 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void zzb(zzer zzerVar, Charset charset) {
        while (true) {
            String strZzN = zzerVar.zzN(charset);
            if (strZzN != null) {
                if ("[Script Info]".equalsIgnoreCase(strZzN)) {
                    while (true) {
                        String strZzN2 = zzerVar.zzN(charset);
                        if (strZzN2 == null || (zzerVar.zzd() != 0 && zzerVar.zzp(charset) == 91)) {
                            break;
                        }
                        String[] strArrSplit = strZzN2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        if (strArrSplit.length == 2) {
                            byte b10 = 0;
                            String strZza = zzgql.zza(strArrSplit[0].trim());
                            switch (strZza.hashCode()) {
                                case 1879649548:
                                    if (!strZza.equals("playresx")) {
                                        b10 = -1;
                                    }
                                    break;
                                case 1879649549:
                                    if (strZza.equals("playresy")) {
                                        b10 = 1;
                                    } else {
                                        b10 = -1;
                                    }
                                    break;
                                default:
                                    b10 = -1;
                                    break;
                            }
                            if (b10 != 0) {
                                if (b10 == 1) {
                                    try {
                                        this.zzg = Float.parseFloat(strArrSplit[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            } else {
                                this.zzf = Float.parseFloat(strArrSplit[1].trim());
                            }
                        }
                    }
                } else if ("[V4+ Styles]".equalsIgnoreCase(strZzN)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    zzamw zzamwVarZza = null;
                    while (true) {
                        String strZzN3 = zzerVar.zzN(charset);
                        if (strZzN3 != null && (zzerVar.zzd() == 0 || zzerVar.zzp(charset) != 91)) {
                            if (strZzN3.startsWith("Format:")) {
                                zzamwVarZza = zzamw.zza(strZzN3);
                            } else if (strZzN3.startsWith("Style:")) {
                                if (zzamwVarZza == null) {
                                    zzee.zzc("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzN3));
                                } else {
                                    zzamy zzamyVarZza = zzamy.zza(strZzN3, zzamwVarZza);
                                    if (zzamyVarZza != null) {
                                        linkedHashMap.put(zzamyVarZza.zza, zzamyVarZza);
                                    }
                                }
                            }
                        }
                    }
                    this.zze = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(strZzN)) {
                    zzee.zzb("SsaParser", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strZzN)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private static int zze(long j10, List list, List list2) {
        int i10;
        ArrayList arrayList;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) list.get(size)).longValue() == j10) {
                    return size;
                }
                if (((Long) list.get(size)).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
            } else {
                i10 = 0;
                break;
            }
        }
        list.add(i10, Long.valueOf(j10));
        if (i10 == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((Collection) list2.get(i10 - 1));
        }
        list2.add(i10, arrayList);
        return i10;
    }
}
