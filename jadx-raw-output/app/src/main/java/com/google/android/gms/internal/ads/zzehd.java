package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzehd implements zzfmu {
    private static final Pattern zzd = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zza;
    private final zzfoe zzb;
    private final zzfoo zzc;

    public zzehd(String str, zzfoo zzfooVar, zzfoe zzfoeVar) {
        this.zza = str;
        this.zzc = zzfooVar;
        this.zzb = zzfoeVar;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x014a A[PHI: r0
  0x014a: PHI (r0v10 byte[]) = (r0v9 byte[]), (r0v20 byte[]), (r0v20 byte[]) binds: [B:45:0x00f3, B:47:0x010b, B:61:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzfmu
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzecr zzecrVar;
        byte[] bArr;
        byte[] byteArray;
        JSONObject jSONObjectZza;
        String strConcat;
        zzehc zzehcVar = (zzehc) obj;
        int iOptInt = zzehcVar.zza().optInt("http_timeout_millis", 60000);
        zzbzw zzbzwVarZzb = zzehcVar.zzb();
        String strJoin = "";
        if (zzbzwVarZzb.zza() != -2) {
            if (zzbzwVarZzb.zza() == 1) {
                if (zzbzwVarZzb.zzb() != null) {
                    strJoin = TextUtils.join(", ", zzbzwVarZzb.zzb());
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strJoin);
                }
                zzecrVar = new zzecr(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzecrVar = new zzecr(1);
            }
            zzfoo zzfooVar = this.zzc;
            zzfoe zzfoeVar = this.zzb;
            zzfoeVar.zzj(zzecrVar);
            zzfoeVar.zzd(false);
            zzfooVar.zza(zzfoeVar);
            throw zzecrVar;
        }
        HashMap map = new HashMap();
        if (zzehcVar.zzb().zzg()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbv)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = zzd.matcher(str);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str);
                }
            }
        }
        if (zzehcVar.zzb().zzf() && (jSONObjectZza = zzehcVar.zza()) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObjectZza.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        byte[] bytes = new byte[0];
        if (TextUtils.isEmpty(zzehcVar.zzb().zzd())) {
            bArr = bytes;
        } else {
            bytes = zzehcVar.zzb().zzd().getBytes(StandardCharsets.UTF_8);
            if (zzehcVar.zzb().zzm()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e10);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "PrepareRequestFunction.apply");
                    byteArray = null;
                }
                if (byteArray != null) {
                    map.put("Content-Encoding", "gzip");
                    bArr = byteArray;
                } else {
                    bArr = bytes;
                }
            } else {
                bArr = bytes;
            }
        }
        String strZzl = !TextUtils.isEmpty(zzehcVar.zzb().zzl()) ? zzehcVar.zzb().zzl() : "";
        zzfoo zzfooVar2 = this.zzc;
        zzfoe zzfoeVar2 = this.zzb;
        zzfoeVar2.zzd(true);
        zzfooVar2.zza(zzfoeVar2);
        return new zzegy(zzehcVar.zzb().zze(), iOptInt, map, bArr, strZzl, zzehcVar.zzb().zzf());
    }
}
