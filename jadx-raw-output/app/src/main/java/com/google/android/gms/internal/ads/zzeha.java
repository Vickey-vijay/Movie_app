package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.IOUtils;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzeha implements zzfmu {
    public final Context zza;
    public final String zzb;

    @Nullable
    private final String zzc;

    public zzeha(Context context, String str, zzcac zzcacVar, int i10, @Nullable String str2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzegz zza(zzegy zzegyVar) throws zzecr {
        return zzc(zzegyVar.zza, zzegyVar.zzb, zzegyVar.zzc, zzegyVar.zzd, zzegyVar.zze, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
    }

    public final zzegz zzc(String str, int i10, Map map, byte[] bArr, String str2, long j10) throws MalformedURLException, zzecr {
        HttpURLConnection httpURLConnection;
        URL url;
        try {
            zzegz zzegzVar = new zzegz();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue() && com.google.android.gms.ads.internal.client.zzbb.zze()) {
                zzegzVar.zza = 410;
            } else {
                String str3 = this.zzb;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 13);
                sb2.append("SDK version: ");
                sb2.append(str3);
                String string = sb2.toString();
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 39);
                sb3.append("AdRequestServiceImpl: Sending request: ");
                sb3.append(str);
                com.google.android.gms.ads.internal.util.client.zzo.zzd(sb3.toString());
                URL url2 = new URL(str);
                HashMap map2 = new HashMap();
                int i12 = 0;
                while (true) {
                    int i13 = zzfxs.zzb;
                    httpURLConnection = (HttpURLConnection) url2.openConnection();
                    String str4 = this.zzc;
                    if (str4 != null) {
                        httpURLConnection.setRequestMethod(str4);
                    }
                    try {
                        try {
                            com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zza, str3, false, httpURLConnection, false, i10);
                            for (Map.Entry entry : map.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                httpURLConnection.setRequestProperty("Content-Type", str2);
                            }
                            Closeable closeable = null;
                            com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                            try {
                                zzlVar.zza(httpURLConnection, bArr);
                            } catch (Throwable th2) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Network request logging failed.", th2);
                                com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "HttpRequestFunction.logAdRequest");
                            }
                            int length = bArr.length;
                            if (length > 0) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setFixedLengthStreamingMode(length);
                                try {
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AdMobNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                                    try {
                                        bufferedOutputStream.write(bArr);
                                        IOUtils.closeQuietly(bufferedOutputStream);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        closeable = bufferedOutputStream;
                                        IOUtils.closeQuietly(closeable);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                            int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                            for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                                String key = entry2.getKey();
                                List<String> value = entry2.getValue();
                                if (map2.containsKey(key)) {
                                    ((List) map2.get(key)).addAll(value);
                                } else {
                                    map2.put(key, new ArrayList(value));
                                }
                            }
                            zzlVar.zzc(httpURLConnection, iHttpUrlConnectionGetResponseCode);
                            zzegzVar.zza = iHttpUrlConnectionGetResponseCode;
                            zzegzVar.zzb = map2;
                            zzegzVar.zzc = "";
                            if (iHttpUrlConnectionGetResponseCode >= 200 && iHttpUrlConnectionGetResponseCode < 300) {
                                try {
                                    InputStreamReader inputStreamReader = new InputStreamReader(AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
                                    try {
                                        com.google.android.gms.ads.internal.zzt.zzc();
                                        StringBuilder sb4 = new StringBuilder(8192);
                                        char[] cArr = new char[2048];
                                        while (true) {
                                            int i14 = inputStreamReader.read(cArr);
                                            if (i14 == -1) {
                                                break;
                                            }
                                            sb4.append(cArr, 0, i14);
                                        }
                                        String string2 = sb4.toString();
                                        IOUtils.closeQuietly(inputStreamReader);
                                        zzlVar.zze(string2);
                                        zzegzVar.zzc = string2;
                                        if (TextUtils.isEmpty(string2)) {
                                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgz)).booleanValue()) {
                                                throw new zzecr(3);
                                            }
                                        }
                                        zzegzVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j10;
                                        break;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        closeable = inputStreamReader;
                                        IOUtils.closeQuietly(closeable);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } else {
                                if (iHttpUrlConnectionGetResponseCode < 300 || iHttpUrlConnectionGetResponseCode >= 400) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(iHttpUrlConnectionGetResponseCode).length() + 35);
                                    sb5.append("Received error HTTP response code: ");
                                    sb5.append(iHttpUrlConnectionGetResponseCode);
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb5.toString());
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(iHttpUrlConnectionGetResponseCode).length() + 35);
                                    sb6.append("Received error HTTP response code: ");
                                    sb6.append(iHttpUrlConnectionGetResponseCode);
                                    throw new zzecr(1, sb6.toString());
                                }
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("No location header to follow redirect.");
                                    throw new zzecr(1, "No location header to follow redirect");
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzja)).booleanValue()) {
                                    try {
                                        url = new URI(headerField).toURL();
                                    } catch (URISyntaxException e10) {
                                        throw new zzecr(1, e10.getMessage(), e10);
                                    }
                                } else {
                                    url = new URL(headerField);
                                }
                                int i15 = i12 + 1;
                                if (i15 > ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgi)).intValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Too many redirects.");
                                    throw new zzecr(1, "Too many redirects");
                                }
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                i12 = i15;
                                url2 = url;
                            }
                        } catch (Throwable th7) {
                            AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            throw th7;
                        }
                    } catch (zzecr e11) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjE)).booleanValue()) {
                            throw e11;
                        }
                        zzegzVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j10;
                    }
                }
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            }
            return zzegzVar;
        } catch (IOException e12) {
            String strValueOf = String.valueOf(e12.getMessage());
            int i16 = com.google.android.gms.ads.internal.util.zze.zza;
            String strConcat = "Error while connecting to ad server: ".concat(strValueOf);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            throw new zzecr(1, strConcat, e12);
        }
    }
}
