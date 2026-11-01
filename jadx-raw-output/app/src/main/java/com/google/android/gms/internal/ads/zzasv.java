package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.download.Command;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzasv {
    @Nullable
    public static zzarh zza(zzaru zzaruVar) {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzaruVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZzb = str != null ? zzb(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(StringUtils.COMMA, 0);
            int i11 = 0;
            j10 = 0;
            j11 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
            z10 = true;
        } else {
            z10 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZzb2 = str3 != null ? zzb(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long jZzb3 = str4 != null ? zzb(str4) : 0L;
        String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
        if (z10) {
            j13 = jCurrentTimeMillis + (j11 * 1000);
            j12 = i10 != 0 ? j13 : (j10 * 1000) + j13;
        } else {
            j12 = 0;
            if (jZzb <= 0 || jZzb2 < jZzb) {
                j13 = 0;
            } else {
                j13 = jCurrentTimeMillis + (jZzb2 - jZzb);
                j12 = j13;
            }
        }
        zzarh zzarhVar = new zzarh();
        zzarhVar.zza = zzaruVar.zzb;
        zzarhVar.zzb = str5;
        zzarhVar.zzf = j13;
        zzarhVar.zze = j12;
        zzarhVar.zzc = jZzb;
        zzarhVar.zzd = jZzb3;
        zzarhVar.zzg = map;
        zzarhVar.zzh = zzaruVar.zzd;
        return zzarhVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || Y1.f27894f.equals(str)) {
                zzask.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzask.zzd(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static String zzc(long j10) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
