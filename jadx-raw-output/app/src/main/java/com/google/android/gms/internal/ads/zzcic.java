package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcic extends zzgt implements zzhu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzht zzg;
    private zzhf zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcic(String str, zzhz zzhzVar, int i10, int i11, int i12) {
        super(true);
        this.zzc = new zzcib(this);
        this.zzr = new HashSet();
        zzdg.zza(str);
        this.zzf = str;
        this.zzg = new zzht();
        this.zzd = i10;
        this.zze = i11;
        this.zzq = i12;
        if (zzhzVar != null) {
            zze(zzhzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzhq(e10, this.zzh, 2000, 3);
                }
            }
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        } catch (Throwable th2) {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
            throw th2;
        }
    }

    public final /* synthetic */ int zzm() {
        return this.zzq;
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e10);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075 A[Catch: IOException -> 0x008c, TryCatch #0 {IOException -> 0x008c, blocks: (B:2:0x0000, B:21:0x0054, B:23:0x005c, B:26:0x0067, B:27:0x006d, B:29:0x0075, B:32:0x007c, B:33:0x0081, B:34:0x0082, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[Catch: IOException -> 0x008c, TryCatch #0 {IOException -> 0x008c, blocks: (B:2:0x0000, B:21:0x0054, B:23:0x005c, B:26:0x0067, B:27:0x006d, B:29:0x0075, B:32:0x007c, B:33:0x0081, B:34:0x0082, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: IOException -> 0x008c, TRY_LEAVE, TryCatch #0 {IOException -> 0x008c, blocks: (B:2:0x0000, B:21:0x0054, B:23:0x005c, B:26:0x0067, B:27:0x006d, B:29:0x0075, B:32:0x007c, B:33:0x0081, B:34:0x0082, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzhq {
        int i12;
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j10 = this.zzo;
                    long j11 = this.zzm;
                    if (j10 == j11) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i13 = this.zzj.read(bArr2, 0, (int) Math.min(j11 - j10, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i13 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long) i13;
                    zzh(i13);
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.zzn;
            if (j12 != -1) {
                long j13 = j12 - this.zzp;
                if (j13 != 0) {
                    i11 = (int) Math.min(i11, j13);
                    i12 = this.zzj.read(bArr, i10, i11);
                    if (i12 == -1) {
                        this.zzp += (long) i12;
                        zzh(i12);
                        return i12;
                    }
                    if (this.zzn == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i12 = this.zzj.read(bArr, i10, i11);
                if (i12 == -1) {
                    this.zzp += (long) i12;
                    zzh(i12);
                    return i12;
                }
                if (this.zzn == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e10) {
            throw new zzhq(e10, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4 A[Catch: IOException -> 0x02f8, TryCatch #1 {IOException -> 0x02f8, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002b, B:8:0x003b, B:9:0x0043, B:10:0x005b, B:12:0x0061, B:20:0x0091, B:22:0x00b7, B:23:0x00d6, B:24:0x00db, B:26:0x00e4, B:27:0x00eb, B:40:0x0113, B:94:0x0295, B:96:0x02a2, B:98:0x02b3, B:101:0x02bc, B:102:0x02c9, B:104:0x02d2, B:105:0x02d9, B:106:0x02da, B:107:0x02f7), top: B:113:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0267  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a2 A[Catch: IOException -> 0x02f8, TryCatch #1 {IOException -> 0x02f8, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002b, B:8:0x003b, B:9:0x0043, B:10:0x005b, B:12:0x0061, B:20:0x0091, B:22:0x00b7, B:23:0x00d6, B:24:0x00db, B:26:0x00e4, B:27:0x00eb, B:40:0x0113, B:94:0x0295, B:96:0x02a2, B:98:0x02b3, B:101:0x02bc, B:102:0x02c9, B:104:0x02d2, B:105:0x02d9, B:106:0x02da, B:107:0x02f7), top: B:113:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws zzhq {
        long j10;
        int iHttpUrlConnectionGetResponseCode;
        String headerField;
        String protocol;
        int iHttpUrlConnectionGetResponseCode2;
        zzhs zzhsVar;
        long j11;
        long jMax;
        this.zzh = zzhfVar;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzhfVar.zza.toString());
            long j12 = zzhfVar.zze;
            long j13 = zzhfVar.zzf;
            boolean zZza = zzhfVar.zza(1);
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 > 20) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 20);
                    sb2.append("Too many redirects: ");
                    sb2.append(i11);
                    throw new NoRouteToHostException(sb2.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Iterator it = this.zzg.zza().entrySet().iterator(); it.hasNext(); it = it) {
                    Map.Entry entry = (Map.Entry) it.next();
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j12 == 0) {
                    if (j13 != -1) {
                        j10 = 0;
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                    if (!zZza) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    if (iHttpUrlConnectionGetResponseCode != 300 && iHttpUrlConnectionGetResponseCode != 301 && iHttpUrlConnectionGetResponseCode != 302 && iHttpUrlConnectionGetResponseCode != 303 && iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            iHttpUrlConnectionGetResponseCode2 = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                            this.zzl = iHttpUrlConnectionGetResponseCode2;
                            if (iHttpUrlConnectionGetResponseCode2 >= 200 || iHttpUrlConnectionGetResponseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzhsVar = new zzhs(this.zzl, null, null, headerFields, zzhfVar, zzfj.zzb);
                                if (this.zzl == 416) {
                                    throw zzhsVar;
                                }
                                zzhsVar.initCause(new zzhc(2008));
                                throw zzhsVar;
                            }
                            if (iHttpUrlConnectionGetResponseCode2 == 200) {
                                j11 = zzhfVar.zze;
                                if (j11 == 0) {
                                    j11 = 0;
                                }
                            } else {
                                j11 = 0;
                            }
                            this.zzm = j11;
                            if (zzhfVar.zza(1)) {
                                this.zzn = zzhfVar.zzf;
                            } else {
                                long j14 = zzhfVar.zzf;
                                if (j14 != -1) {
                                    this.zzn = j14;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                    if (TextUtils.isEmpty(headerField2)) {
                                        jMax = -1;
                                    } else {
                                        try {
                                            jMax = Long.parseLong(headerField2);
                                        } catch (NumberFormatException unused) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(headerField2).length() + 28);
                                            sb3.append("Unexpected Content-Length [");
                                            sb3.append(headerField2);
                                            sb3.append(C3426d4.j.f28588e);
                                            String string = sb3.toString();
                                            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
                                            jMax = -1;
                                        }
                                    }
                                    String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        Matcher matcher = zza.matcher(headerField3);
                                        if (matcher.find()) {
                                            try {
                                                long j15 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (jMax < 0) {
                                                    jMax = j15;
                                                } else if (jMax != j15) {
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(headerField2).length() + 25 + String.valueOf(headerField3).length() + 1);
                                                    sb4.append("Inconsistent headers [");
                                                    sb4.append(headerField2);
                                                    sb4.append("] [");
                                                    sb4.append(headerField3);
                                                    sb4.append(C3426d4.j.f28588e);
                                                    String string2 = sb4.toString();
                                                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string2);
                                                    jMax = Math.max(jMax, j15);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                StringBuilder sb5 = new StringBuilder(String.valueOf(headerField3).length() + 27);
                                                sb5.append("Unexpected Content-Range [");
                                                sb5.append(headerField3);
                                                sb5.append(C3426d4.j.f28588e);
                                                String string3 = sb5.toString();
                                                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzf(string3);
                                            }
                                        }
                                    }
                                    this.zzn = jMax != -1 ? jMax - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = AdMobNetworkBridge.urlConnectionGetInputStream(this.zzi);
                                this.zzk = true;
                                zzg(zzhfVar);
                                return this.zzn;
                            } catch (IOException e10) {
                                zzn();
                                throw new zzhq(e10, zzhfVar, 2000, 1);
                            }
                        } catch (IOException e11) {
                            zzn();
                            throw new zzhq("Unable to connect to ".concat(String.valueOf(zzhfVar.zza.toString())), e11, zzhfVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i10 = i11;
                    j12 = j12;
                } else {
                    j10 = j12;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 7);
                sb6.append("bytes=");
                long j16 = j10;
                sb6.append(j16);
                sb6.append("-");
                String string4 = sb6.toString();
                if (j13 != -1) {
                    long j17 = (j16 + j13) - 1;
                    StringBuilder sb7 = new StringBuilder(string4.length() + String.valueOf(j17).length());
                    sb7.append(string4);
                    sb7.append(j17);
                    string4 = sb7.toString();
                }
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string4);
                httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                if (!zZza) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                if (iHttpUrlConnectionGetResponseCode != 300) {
                    this.zzi = httpURLConnection;
                    iHttpUrlConnectionGetResponseCode2 = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    this.zzl = iHttpUrlConnectionGetResponseCode2;
                    if (iHttpUrlConnectionGetResponseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.zzi.getHeaderFields();
                    zzn();
                    zzhsVar = new zzhs(this.zzl, null, null, headerFields2, zzhfVar, zzfj.zzb);
                    if (this.zzl == 416) {
                        throw zzhsVar;
                    }
                    zzhsVar.initCause(new zzhc(2008));
                    throw zzhsVar;
                }
                headerField = httpURLConnection.getHeaderField("Location");
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i10 = i11;
                j12 = j12;
            }
        } catch (IOException e12) {
            throw new zzhq("Unable to connect to ".concat(String.valueOf(zzhfVar.zza.toString())), e12, zzhfVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    @Nullable
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzk(int i10) {
        this.zzq = i10;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e10) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e10);
                }
            }
        }
    }

    public final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }
}
