package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzano {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzer zzc = new zzer();
    private final StringBuilder zzd = new StringBuilder();

    public static void zzb(zzer zzerVar) {
        while (true) {
            for (boolean z10 = true; zzerVar.zzd() > 0 && z10; z10 = false) {
                char c10 = (char) zzerVar.zzi()[zzerVar.zzg()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    zzerVar.zzk(1);
                } else {
                    int iZzg = zzerVar.zzg();
                    int iZze = zzerVar.zze();
                    byte[] bArrZzi = zzerVar.zzi();
                    if (iZzg + 2 <= iZze) {
                        int i10 = iZzg + 1;
                        if (bArrZzi[iZzg] == 47) {
                            int i11 = i10 + 1;
                            if (bArrZzi[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzi[i11]) == '*' && ((char) bArrZzi[i12]) == '/') {
                                        iZze = i12 + 1;
                                        i11 = iZze;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                zzerVar.zzk(iZze - zzerVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzer zzerVar, StringBuilder sb2) {
        char c10;
        sb2.setLength(0);
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        loop0: while (true) {
            boolean z10 = false;
            while (true) {
                if (iZzg < iZze && !z10) {
                    c10 = (char) zzerVar.zzi()[iZzg];
                    if ((c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || ((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                        break;
                    }
                    z10 = true;
                } else {
                    break loop0;
                }
            }
            sb2.append(c10);
            iZzg++;
        }
        zzerVar.zzk(iZzg - zzerVar.zzg());
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:116:0x0212  */
    /* JADX WARN: Code duplicated, block: B:118:0x0218  */
    /* JADX WARN: Code duplicated, block: B:120:0x0220  */
    /* JADX WARN: Code duplicated, block: B:122:0x0228  */
    /* JADX WARN: Code duplicated, block: B:123:0x022d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0235  */
    /* JADX WARN: Code duplicated, block: B:126:0x023a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0242  */
    /* JADX WARN: Code duplicated, block: B:130:0x024a  */
    /* JADX WARN: Code duplicated, block: B:131:0x024f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0257  */
    /* JADX WARN: Code duplicated, block: B:135:0x025f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0264  */
    /* JADX WARN: Code duplicated, block: B:138:0x026c  */
    /* JADX WARN: Code duplicated, block: B:140:0x027c  */
    /* JADX WARN: Code duplicated, block: B:141:0x029e  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x02d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x02db  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003c  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cb  */
    public final List zza(zzer zzerVar) {
        String strTrim;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        byte b10;
        boolean z10;
        StringBuilder sb2 = this.zzd;
        int i10 = 0;
        sb2.setLength(0);
        int iZzg = zzerVar.zzg();
        while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
        }
        zzer zzerVar2 = this.zzc;
        zzerVar2.zzb(zzerVar.zzi(), zzerVar.zzg());
        zzerVar2.zzh(iZzg);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzb(zzerVar2);
            if (zzerVar2.zzd() >= 5 && "::cue".equals(zzerVar2.zzK(5, StandardCharsets.UTF_8))) {
                int iZzg2 = zzerVar2.zzg();
                String strZzc = zzc(zzerVar2, sb2);
                if (strZzc == null) {
                    strTrim = null;
                } else if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d.equals(strZzc)) {
                    zzerVar2.zzh(iZzg2);
                    strTrim = "";
                } else {
                    if ("(".equals(strZzc)) {
                        int iZzg3 = zzerVar2.zzg();
                        int iZze = zzerVar2.zze();
                        int i11 = i10;
                        while (iZzg3 < iZze && i11 == 0) {
                            int i12 = iZzg3 + 1;
                            i11 = ((char) zzerVar2.zzi()[iZzg3]) == ')' ? 1 : i10;
                            iZzg3 = i12;
                        }
                        strTrim = zzerVar2.zzK((iZzg3 - 1) - zzerVar2.zzg(), StandardCharsets.UTF_8).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(zzc(zzerVar2, sb2))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d.equals(zzc(zzerVar2, sb2))) {
                break;
            }
            zzanp zzanpVar = new zzanp();
            if (!strTrim.isEmpty()) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != -1) {
                    Matcher matcher2 = zza.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        zzanpVar.zzd(strGroup2);
                    }
                    strTrim = strTrim.substring(i10, iIndexOf);
                }
                String str = zzfj.zza;
                String[] strArrSplit = strTrim.split("\\.", -1);
                String str2 = strArrSplit[i10];
                int iIndexOf2 = str2.indexOf(35);
                if (iIndexOf2 != -1) {
                    zzanpVar.zzb(str2.substring(i10, iIndexOf2));
                    zzanpVar.zza(str2.substring(iIndexOf2 + 1));
                } else {
                    zzanpVar.zzb(str2);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    zzanpVar.zzc((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i13 = i10;
            String strZzc2 = null;
            while (i13 == 0) {
                int iZzg4 = zzerVar2.zzg();
                strZzc2 = zzc(zzerVar2, sb2);
                int i14 = (strZzc2 == null || com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(strZzc2)) ? 1 : i10;
                if (i14 == 0) {
                    zzerVar2.zzh(iZzg4);
                    zzb(zzerVar2);
                    String strZzd = zzd(zzerVar2, sb2);
                    if (!strZzd.isEmpty() && StringUtils.PROCESS_POSTFIX_DELIMITER.equals(zzc(zzerVar2, sb2))) {
                        zzb(zzerVar2);
                        StringBuilder sb3 = new StringBuilder();
                        int i15 = i10;
                        while (true) {
                            if (i15 != 0) {
                                string = sb3.toString();
                                break;
                            }
                            int iZzg5 = zzerVar2.zzg();
                            String strZzc3 = zzc(zzerVar2, sb2);
                            if (strZzc3 == null) {
                                string = null;
                                break;
                            }
                            if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(strZzc3) || ";".equals(strZzc3)) {
                                zzerVar2.zzh(iZzg5);
                                i15 = 1;
                            } else {
                                sb3.append(strZzc3);
                            }
                        }
                        if (string != null && !string.isEmpty()) {
                            int iZzg6 = zzerVar2.zzg();
                            String strZzc4 = zzc(zzerVar2, sb2);
                            if (";".equals(strZzc4)) {
                                if ("color".equals(strZzd)) {
                                    zzanpVar.zzn(zzdp.zzb(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzanpVar.zzq(zzdp.zzb(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzanpVar.zzw(1);
                                    } else if ("under".equals(string)) {
                                        zzanpVar.zzw(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string)) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    zzanpVar.zzy(z10);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if ("underline".equals(string)) {
                                        zzanpVar.zzh(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzanpVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if ("bold".equals(string)) {
                                        zzanpVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if ("italic".equals(string)) {
                                        zzanpVar.zzj(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzgql.zza(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592) {
                                                    b10 = -1;
                                                } else {
                                                    b10 = 0;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b10 = 1;
                                            } else {
                                                b10 = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b10 = 2;
                                        } else {
                                            b10 = -1;
                                        }
                                        if (b10 != 0) {
                                            zzanpVar.zzt(1);
                                        } else if (b10 != 1) {
                                            zzanpVar.zzt(2);
                                        } else {
                                            if (b10 == 2) {
                                                throw new IllegalStateException();
                                            }
                                            zzanpVar.zzt(3);
                                        }
                                        String strGroup3 = matcher.group(1);
                                        strGroup3.getClass();
                                        zzanpVar.zzs(Float.parseFloat(strGroup3));
                                    } else {
                                        StringBuilder sb4 = new StringBuilder(string.length() + 22);
                                        sb4.append("Invalid font-size: '");
                                        sb4.append(string);
                                        sb4.append("'.");
                                        zzee.zzc("WebvttCssParser", sb4.toString());
                                    }
                                } else {
                                    continue;
                                }
                            } else if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(strZzc4)) {
                                zzerVar2.zzh(iZzg6);
                                if ("color".equals(strZzd)) {
                                    zzanpVar.zzn(zzdp.zzb(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzanpVar.zzq(zzdp.zzb(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzanpVar.zzw(1);
                                    } else if ("under".equals(string)) {
                                        zzanpVar.zzw(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zzanpVar.zzy(z10);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if ("underline".equals(string)) {
                                        zzanpVar.zzh(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzanpVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if ("bold".equals(string)) {
                                        zzanpVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if ("italic".equals(string)) {
                                        zzanpVar.zzj(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzgql.zza(string));
                                    if (matcher.matches()) {
                                        StringBuilder sb5 = new StringBuilder(string.length() + 22);
                                        sb5.append("Invalid font-size: '");
                                        sb5.append(string);
                                        sb5.append("'.");
                                        zzee.zzc("WebvttCssParser", sb5.toString());
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592 && strGroup.equals("px")) {
                                                    b10 = 0;
                                                } else {
                                                    b10 = -1;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b10 = 1;
                                            } else {
                                                b10 = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b10 = 2;
                                        } else {
                                            b10 = -1;
                                        }
                                        if (b10 != 0) {
                                            zzanpVar.zzt(1);
                                        } else if (b10 != 1) {
                                            zzanpVar.zzt(2);
                                        } else {
                                            if (b10 == 2) {
                                                throw new IllegalStateException();
                                            }
                                            zzanpVar.zzt(3);
                                        }
                                        String strGroup4 = matcher.group(1);
                                        strGroup4.getClass();
                                        zzanpVar.zzs(Float.parseFloat(strGroup4));
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i13 = i14;
                i10 = 0;
            }
            if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(strZzc2)) {
                arrayList.add(zzanpVar);
            }
            i10 = 0;
        }
        return arrayList;
    }

    @Nullable
    public static String zzc(zzer zzerVar, StringBuilder sb2) {
        zzb(zzerVar);
        if (zzerVar.zzd() == 0) {
            return null;
        }
        String strZzd = zzd(zzerVar, sb2);
        if (!strZzd.isEmpty()) {
            return strZzd;
        }
        char cZzs = (char) zzerVar.zzs();
        StringBuilder sb3 = new StringBuilder(String.valueOf(cZzs).length());
        sb3.append(cZzs);
        return sb3.toString();
    }
}
