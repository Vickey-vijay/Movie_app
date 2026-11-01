package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import android.net.TrafficStats;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzfxs;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzu implements zze {
    private final Context zza;

    @Nullable
    private final String zzb;

    @Nullable
    private String zzc;

    public zzu(Context context, @Nullable String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzd(String str) throws MalformedURLException {
        URL urlZze = null;
        try {
            urlZze = new URI(str).toURL();
        } catch (IllegalArgumentException e10) {
            e = e10;
            zzf(str, e);
        } catch (MalformedURLException e11) {
            e = e11;
            zzf(str, e);
        } catch (URISyntaxException e12) {
            zzf(str, e12);
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzf)).booleanValue()) {
                urlZze = zze(str);
            }
        }
        if (urlZze != null) {
            return urlZze;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 47);
        sb2.append("Falling back to direct new URL(\"");
        sb2.append(str);
        sb2.append("\") constructor.");
        zzo.zzd(sb2.toString());
        return new URL(str);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    @WorkerThread
    public final zzt zza(String str) {
        return zzc(str, null);
    }

    @Nullable
    public final String zzb() {
        return this.zzc;
    }

    @Nullable
    private final URL zze(String str) {
        URL url;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
            try {
                String string = uri.toString();
                StringBuilder sb2 = new StringBuilder(str.length() + 114 + string.length());
                sb2.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                sb2.append(str);
                sb2.append("\" -> encoded URI: ");
                sb2.append(string);
                zzo.zzd(sb2.toString());
            } catch (IllegalArgumentException e10) {
                e = e10;
                zzf(str, e);
            } catch (MalformedURLException e11) {
                e = e11;
                zzf(str, e);
            } catch (URISyntaxException e12) {
                e = e12;
                zzf(str, e);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e13) {
            e = e13;
            url = null;
        }
        return url;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x016a A[PHI: r0
  0x016a: PHI (r0v5 com.google.android.gms.ads.internal.util.client.zzt) = 
  (r0v0 com.google.android.gms.ads.internal.util.client.zzt)
  (r0v4 com.google.android.gms.ads.internal.util.client.zzt)
  (r0v7 com.google.android.gms.ads.internal.util.client.zzt)
 binds: [B:61:0x0168, B:57:0x015e, B:41:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    @WorkerThread
    public final zzt zzc(String str, @Nullable Map map) {
        zzt zztVar;
        zzt zztVar2 = zzt.PERMANENT_FAILURE;
        if (str != null) {
            if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzg)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue() || !zzbb.zze()) {
                    try {
                        try {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.setThreadStatsTag(263);
                            }
                            StringBuilder sb2 = new StringBuilder(str.length() + 13);
                            sb2.append("Pinging URL: ");
                            sb2.append(str);
                            zzo.zzd(sb2.toString());
                            URL urlZzd = zzd(str);
                            int i10 = zzfxs.zzb;
                            HttpURLConnection httpURLConnection = (HttpURLConnection) urlZzd.openConnection();
                            try {
                                zzbb.zza();
                                String str2 = this.zzb;
                                httpURLConnection.setConnectTimeout(60000);
                                httpURLConnection.setInstanceFollowRedirects(true);
                                httpURLConnection.setReadTimeout(60000);
                                if (str2 != null) {
                                    httpURLConnection.setRequestProperty("User-Agent", str2);
                                }
                                httpURLConnection.setUseCaches(false);
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                zzl zzlVar = new zzl(null);
                                zzlVar.zza(httpURLConnection, null);
                                int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                                zzlVar.zzc(httpURLConnection, iHttpUrlConnectionGetResponseCode);
                                if (iHttpUrlConnectionGetResponseCode < 200 || iHttpUrlConnectionGetResponseCode >= 300) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iHttpUrlConnectionGetResponseCode).length() + 54 + str.length());
                                    sb3.append("Received non-success response code ");
                                    sb3.append(iHttpUrlConnectionGetResponseCode);
                                    sb3.append(" from pinging URL: ");
                                    sb3.append(str);
                                    zzo.zzi(sb3.toString());
                                    if (iHttpUrlConnectionGetResponseCode == 502) {
                                        zztVar = zzt.RETRIABLE_FAILURE;
                                    } else {
                                        AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                        if (ClientLibraryUtils.isPackageSide()) {
                                            TrafficStats.clearThreadStatsTag();
                                        }
                                    }
                                    return zztVar2;
                                }
                                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzjc)).booleanValue()) {
                                    this.zzc = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                zztVar = zzt.SUCCESS;
                                zztVar2 = zztVar;
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                if (ClientLibraryUtils.isPackageSide()) {
                                    TrafficStats.clearThreadStatsTag();
                                }
                            } catch (Throwable th2) {
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.clearThreadStatsTag();
                            }
                            throw th3;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        String message = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(str.length() + 27 + String.valueOf(message).length());
                        sb4.append("Error while pinging URL: ");
                        sb4.append(str);
                        sb4.append(". ");
                        sb4.append(message);
                        zzo.zzi(sb4.toString());
                        zztVar2 = zzt.RETRIABLE_FAILURE;
                        if (ClientLibraryUtils.isPackageSide()) {
                            TrafficStats.clearThreadStatsTag();
                        }
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                        zzf(str, e);
                        if (ClientLibraryUtils.isPackageSide()) {
                            TrafficStats.clearThreadStatsTag();
                        }
                    } catch (RuntimeException e12) {
                        e = e12;
                        String message2 = e.getMessage();
                        StringBuilder sb5 = new StringBuilder(str.length() + 27 + String.valueOf(message2).length());
                        sb5.append("Error while pinging URL: ");
                        sb5.append(str);
                        sb5.append(". ");
                        sb5.append(message2);
                        zzo.zzi(sb5.toString());
                        zztVar2 = zzt.RETRIABLE_FAILURE;
                        if (ClientLibraryUtils.isPackageSide()) {
                            TrafficStats.clearThreadStatsTag();
                        }
                    } catch (MalformedURLException e13) {
                        e = e13;
                        zzf(str, e);
                        if (ClientLibraryUtils.isPackageSide()) {
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    return zztVar2;
                }
            }
        }
        return zztVar2;
    }

    private final void zzf(String str, Throwable th2) {
        String message = th2.getMessage();
        StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb2.append("Error while parsing ping URL: ");
        sb2.append(str);
        sb2.append(". ");
        sb2.append(message);
        zzo.zzi(sb2.toString());
        zzbyp.zza(this.zza).zzi(th2, "HttpUrlPinger.pingUrl", ((Integer) zzbd.zzc().zzd(zzbhe.zzoi)).intValue() / 100.0f);
    }
}
