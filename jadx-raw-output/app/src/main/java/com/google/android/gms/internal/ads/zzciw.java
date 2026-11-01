package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzciw extends zzgt implements zzhu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzht zze;
    private zzhf zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzciw(String str, zzhz zzhzVar, int i10, int i11, long j10, long j11) {
        super(true);
        zzdg.zza(str);
        this.zzd = str;
        this.zze = new zzht();
        this.zzb = i10;
        this.zzc = i11;
        this.zzh = new ArrayDeque();
        this.zzq = j10;
        this.zzr = j11;
        if (zzhzVar != null) {
            zze(zzhzVar);
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
                    throw new zzhq(e10, this.zzf, 2000, 3);
                }
            }
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        } catch (Throwable th2) {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            throw th2;
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                AdMobNetworkBridge.httpUrlConnectionDisconnect((HttpURLConnection) queue.remove());
            } catch (Exception e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzhq {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzl;
            long j11 = this.zzm;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.zzn + j11;
            long j13 = i11;
            long j14 = this.zzr;
            long j15 = j12 + j13 + j14;
            long j16 = this.zzp;
            long j17 = j16 + 1;
            if (j15 > j17) {
                long j18 = this.zzo;
                if (j16 < j18) {
                    long jMin = Math.min(j18, Math.max(((this.zzq + j17) - j14) - 1, (-1) + j17 + j13));
                    zzk(j17, jMin, 2);
                    this.zzp = jMin;
                    j16 = jMin;
                }
            }
            int i12 = this.zzi.read(bArr, i10, (int) Math.min(j13, ((j16 + 1) - this.zzn) - this.zzm));
            if (i12 == -1) {
                throw new EOFException();
            }
            this.zzm += (long) i12;
            zzh(i12);
            return i12;
        } catch (IOException e10) {
            throw new zzhq(e10, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws zzhq {
        this.zzf = zzhfVar;
        this.zzm = 0L;
        long j10 = zzhfVar.zze;
        long j11 = zzhfVar.zzf;
        long jMin = j11 == -1 ? this.zzq : Math.min(this.zzq, j11);
        this.zzn = j10;
        HttpURLConnection httpURLConnectionZzk = zzk(j10, (jMin + j10) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j12 = Long.parseLong(matcher.group(2));
                    long j13 = Long.parseLong(matcher.group(3));
                    long j14 = zzhfVar.zzf;
                    if (j14 != -1) {
                        this.zzl = j14;
                        this.zzo = Math.max(j12, (this.zzn + j14) - 1);
                    } else {
                        this.zzl = j13 - this.zzn;
                        this.zzo = j13 - 1;
                    }
                    this.zzp = j12;
                    this.zzj = true;
                    zzg(zzhfVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb2.append("Unexpected Content-Range [");
                    sb2.append(headerField);
                    sb2.append(C3426d4.j.f28588e);
                    String string = sb2.toString();
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
                }
            }
        }
        throw new zzciu(headerField, zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    @Nullable
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @VisibleForTesting
    public final HttpURLConnection zzk(long j10, long j11, int i10) throws zzhq {
        String string = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 7 + String.valueOf(j11).length());
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append("-");
            sb2.append(j11);
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, sb2.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                this.zzk = iHttpUrlConnectionGetResponseCode;
                if (iHttpUrlConnectionGetResponseCode < 200 || iHttpUrlConnectionGetResponseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzciv(this.zzk, headerFields, this.zzf, i10);
                }
                try {
                    InputStream inputStreamUrlConnectionGetInputStream = AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                    if (this.zzi != null) {
                        inputStreamUrlConnectionGetInputStream = new SequenceInputStream(this.zzi, inputStreamUrlConnectionGetInputStream);
                    }
                    this.zzi = inputStreamUrlConnectionGetInputStream;
                    return httpURLConnection;
                } catch (IOException e10) {
                    zzl();
                    throw new zzhq(e10, this.zzf, 2000, i10);
                }
            } catch (IOException e11) {
                zzl();
                String strValueOf = String.valueOf(string2);
                throw new zzhq("Unable to connect to ".concat(strValueOf), e11, this.zzf, 2000, i10);
            }
        } catch (IOException e12) {
            String strValueOf2 = String.valueOf(string);
            throw new zzhq("Unable to connect to ".concat(strValueOf2), e12, this.zzf, 2000, i10);
        }
    }
}
