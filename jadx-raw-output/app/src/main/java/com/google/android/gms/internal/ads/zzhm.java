package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhm extends zzgt implements zzhu {
    private final boolean zza;
    private final int zzb;
    private final int zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final zzht zze;
    private final zzht zzf;

    @Nullable
    private zzhf zzg;

    @Nullable
    private HttpURLConnection zzh;

    @Nullable
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    public /* synthetic */ zzhm(String str, int i10, int i11, boolean z10, boolean z11, zzht zzhtVar, zzgrd zzgrdVar, boolean z12, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zza = z10;
        this.zze = zzhtVar;
        this.zzf = new zzht();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzhq {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzl;
            if (j10 != -1) {
                long j11 = j10 - this.zzm;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.zzi;
            String str = zzfj.zza;
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.zzm += (long) i12;
            zzh(i12);
            return i12;
        } catch (IOException e10) {
            zzhf zzhfVar = this.zzg;
            String str2 = zzfj.zza;
            throw zzhq.zza(e10, zzhfVar, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    zzhf zzhfVar = this.zzg;
                    String str = zzfj.zza;
                    throw new zzhq(e10, zzhfVar, 2000, 3);
                }
            }
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
        } catch (Throwable th2) {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            throw th2;
        }
    }

    private final URL zzl(URL url, @Nullable String str, zzhf zzhfVar) throws zzhq {
        if (str == null) {
            throw new zzhq("Null location redirect", zzhfVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzhq("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhfVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb2 = new StringBuilder(String.valueOf(protocol2).length() + 40 + protocol.length() + 1);
            sb2.append("Disallowed cross-protocol redirect (");
            sb2.append(protocol2);
            sb2.append(" to ");
            sb2.append(protocol);
            sb2.append(")");
            throw new zzhq(sb2.toString(), zzhfVar, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new zzhq(e10, zzhfVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e10) {
                zzee.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws zzhq {
        int i10;
        HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZza;
        long j10;
        this.zzg = zzhfVar;
        this.zzm = 0L;
        this.zzl = 0L;
        zzf(zzhfVar);
        try {
            URL url = new URL(zzhfVar.zza.toString());
            long j11 = zzhfVar.zze;
            long j12 = zzhfVar.zzf;
            boolean zZza = zzhfVar.zza(1);
            try {
                if (this.zza) {
                    URL urlZzl = url;
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        if (i11 > 20) {
                            i10 = 1;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 20);
                            sb2.append("Too many redirects: ");
                            sb2.append(i12);
                            throw new zzhq(new NoRouteToHostException(sb2.toString()), zzhfVar, 2001, 1);
                        }
                        long j13 = j12;
                        long j14 = j11;
                        URL url2 = urlZzl;
                        HttpURLConnection httpURLConnectionZzk2 = zzk(urlZzl, 1, null, j11, j12, zZza, false, zzhfVar.zzd);
                        int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionZzk2);
                        String headerField = httpURLConnectionZzk2.getHeaderField("Location");
                        if (iHttpUrlConnectionGetResponseCode != 300 && iHttpUrlConnectionGetResponseCode != 301 && iHttpUrlConnectionGetResponseCode != 302 && iHttpUrlConnectionGetResponseCode != 303 && iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308) {
                            httpURLConnectionZzk = httpURLConnectionZzk2;
                            break;
                        }
                        i10 = 1;
                        try {
                            AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionZzk2);
                            urlZzl = zzl(url2, headerField, zzhfVar);
                            i11 = i12;
                            j12 = j13;
                            j11 = j14;
                        } catch (IOException e10) {
                            e = e10;
                        }
                        e = e10;
                        zzm();
                        throw zzhq.zza(e, zzhfVar, i10);
                    }
                }
                httpURLConnectionZzk = zzk(url, 1, null, j11, j12, zZza, true, zzhfVar.zzd);
                this.zzh = httpURLConnectionZzk;
                this.zzk = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionZzk);
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i13 = this.zzk;
                if (i13 < 200 || i13 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (this.zzk == 416) {
                        if (zzhfVar.zze == zzhv.zza(httpURLConnectionZzk.getHeaderField("Content-Range"))) {
                            this.zzj = true;
                            zzg(zzhfVar);
                            long j15 = zzhfVar.zzf;
                            if (j15 != -1) {
                                return j15;
                            }
                            return 0L;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        bArrZza = errorStream != null ? zzgxf.zza(errorStream) : zzfj.zzb;
                    } catch (IOException unused) {
                        bArrZza = zzfj.zzb;
                    }
                    byte[] bArr = bArrZza;
                    zzm();
                    throw new zzhs(this.zzk, responseMessage, this.zzk == 416 ? new zzhc(2008) : null, headerFields, zzhfVar, bArr);
                }
                httpURLConnectionZzk.getContentType();
                if (this.zzk == 200) {
                    j10 = zzhfVar.zze;
                    if (j10 == 0) {
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    this.zzl = zzhfVar.zzf;
                } else {
                    long j16 = zzhfVar.zzf;
                    if (j16 != -1) {
                        this.zzl = j16;
                    } else {
                        long jZzb = zzhv.zzb(httpURLConnectionZzk.getHeaderField("Content-Length"), httpURLConnectionZzk.getHeaderField("Content-Range"));
                        this.zzl = jZzb != -1 ? jZzb - j10 : -1L;
                    }
                }
                try {
                    this.zzi = AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnectionZzk);
                    if (zEqualsIgnoreCase) {
                        this.zzi = new GZIPInputStream(this.zzi);
                    }
                    this.zzj = true;
                    zzg(zzhfVar);
                    if (j10 != 0) {
                        try {
                            byte[] bArr2 = new byte[4096];
                            while (j10 > 0) {
                                int iMin = (int) Math.min(j10, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                                InputStream inputStream = this.zzi;
                                String str = zzfj.zza;
                                int i14 = inputStream.read(bArr2, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzhq(new InterruptedIOException(), zzhfVar, 2000, 1);
                                }
                                if (i14 == -1) {
                                    throw new zzhq(zzhfVar, 2008, 1);
                                }
                                j10 -= (long) i14;
                                zzh(i14);
                            }
                        } catch (IOException e11) {
                            zzm();
                            if (e11 instanceof zzhq) {
                                throw ((zzhq) e11);
                            }
                            throw new zzhq(e11, zzhfVar, 2000, 1);
                        }
                    }
                    return this.zzl;
                } catch (IOException e12) {
                    zzm();
                    throw new zzhq(e12, zzhfVar, 2000, 1);
                }
            } catch (IOException e13) {
                e = e13;
                i10 = 1;
            }
        } catch (IOException e14) {
            e = e14;
            i10 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhf zzhfVar = this.zzg;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgui.zza() : new zzhl(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    private final HttpURLConnection zzk(URL url, int i10, @Nullable byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        StringBuilder sb2;
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap map2 = new HashMap();
        map2.putAll(this.zze.zza());
        map2.putAll(this.zzf.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j10 == 0) {
            if (j11 == -1) {
                string = null;
            } else {
                j10 = 0;
                sb2 = new StringBuilder();
                sb2.append("bytes=");
                sb2.append(j10);
                sb2.append("-");
                if (j11 != -1) {
                    sb2.append((j10 + j11) - 1);
                }
                string = sb2.toString();
            }
        } else {
            sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append("-");
            if (j11 != -1) {
                sb2.append((j10 + j11) - 1);
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        if (true != z10) {
            str = "identity";
        } else {
            str = "gzip";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(false);
        int i11 = zzhf.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }
}
