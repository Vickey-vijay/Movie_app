package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzchu extends zzchr {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
        this.zzh = true;
    }

    private final File zza(File file) {
        return new File(zzfxl.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code duplicated, block: B:168:0x047f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0491  */
    /* JADX WARN: Code duplicated, block: B:173:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:176:0x04de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.text.DecimalFormat] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r36v0, types: [com.google.android.gms.internal.ads.zzchr, com.google.android.gms.internal.ads.zzchu] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zze(final String str) {
        int i10;
        Object obj;
        Object obj2;
        String str2;
        FileOutputStream fileOutputStream;
        ?? r10;
        ?? r11;
        Object obj3;
        ?? r12;
        int i11;
        int iHttpUrlConnectionGetResponseCode;
        boolean zDelete;
        String str3 = " sec";
        String str4 = "Preloaded ";
        if (this.zzg == null) {
            zzq(str, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file = this.zzg;
            if (file == null) {
                i10 = 0;
            } else {
                File[] fileArrListFiles = file.listFiles();
                int length = fileArrListFiles.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    File[] fileArr = fileArrListFiles;
                    int i14 = length;
                    if (!fileArrListFiles[i12].getName().endsWith(".done")) {
                        i13++;
                    }
                    i12++;
                    length = i14;
                    fileArrListFiles = fileArr;
                }
                i10 = i13;
            }
            if (i10 > ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzu)).intValue()) {
                File file2 = this.zzg;
                if (file2 != null) {
                    File[] fileArrListFiles2 = file2.listFiles();
                    int length2 = fileArrListFiles2.length;
                    long j10 = Long.MAX_VALUE;
                    int i15 = 0;
                    String str5 = str3;
                    File file3 = null;
                    while (i15 < length2) {
                        File file4 = fileArrListFiles2[i15];
                        File[] fileArr2 = fileArrListFiles2;
                        int i16 = length2;
                        if (!file4.getName().endsWith(".done")) {
                            long jLastModified = file4.lastModified();
                            if (jLastModified < j10) {
                                file3 = file4;
                                j10 = jLastModified;
                            }
                        }
                        i15++;
                        fileArrListFiles2 = fileArr2;
                        length2 = i16;
                    }
                    if (file3 != null) {
                        boolean zDelete2 = file3.delete();
                        File fileZza = zza(file3);
                        zDelete = fileZza.isFile() ? fileZza.delete() & zDelete2 : zDelete2;
                    } else {
                        zDelete = false;
                    }
                    if (zDelete) {
                        str4 = str4;
                        str3 = str5;
                    }
                }
                int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to expire stream cache");
                zzq(str, null, "expireFailed", null);
                return false;
            }
            String str6 = str3;
            File file5 = new File(zzfxl.zza().zza(this.zzg, com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
            File fileZza2 = zza(file5);
            if (file5.isFile() && fileZza2.isFile()) {
                int length3 = (int) file5.length();
                String strValueOf = String.valueOf(str);
                int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Stream cache hit at ".concat(strValueOf));
                zzo(str, file5.getAbsolutePath(), length3);
                return true;
            }
            String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
            String strValueOf3 = String.valueOf(str);
            Set set = zze;
            String strConcat = strValueOf2.concat(strValueOf3);
            synchronized (set) {
                if (set.contains(strConcat)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
                    sb2.append("Stream cache already in progress at ");
                    sb2.append(str);
                    String string = sb2.toString();
                    int i19 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                    zzq(str, file5.getAbsolutePath(), "inProgress", null);
                    return false;
                }
                set.add(strConcat);
                try {
                    obj = "error";
                    try {
                        HttpURLConnection httpURLConnectionZzh = zzfxx.zza().zzh(new zzfxz() { // from class: com.google.android.gms.internal.ads.zzcht
                            @Override // com.google.android.gms.internal.ads.zzfxz
                            public final /* synthetic */ URLConnection zza() throws IOException {
                                int i20 = zzchu.zzd;
                                com.google.android.gms.ads.internal.zzt.zzq();
                                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaj)).intValue();
                                URL url = new URL(str);
                                int i21 = 0;
                                while (true) {
                                    i21++;
                                    if (i21 > 20) {
                                        throw new IOException("Too many redirects (20)");
                                    }
                                    int i22 = zzfxs.zzb;
                                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                                    uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                    uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                        throw new IOException("Invalid protocol.");
                                    }
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                    zzlVar.zza(httpURLConnection, null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int iHttpUrlConnectionGetResponseCode2 = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                                    zzlVar.zzc(httpURLConnection, iHttpUrlConnectionGetResponseCode2);
                                    if (iHttpUrlConnectionGetResponseCode2 / 100 != 3) {
                                        return httpURLConnection;
                                    }
                                    String headerField = httpURLConnection.getHeaderField("Location");
                                    if (headerField == null) {
                                        throw new IOException("Missing Location header in redirect");
                                    }
                                    URL url2 = new URL(url, headerField);
                                    String protocol = url2.getProtocol();
                                    if (protocol == null) {
                                        throw new IOException("Protocol is null");
                                    }
                                    if (!protocol.equals("http") && !protocol.equals("https")) {
                                        throw new IOException("Unsupported scheme: ".concat(protocol));
                                    }
                                    String strConcat2 = "Redirecting to ".concat(headerField);
                                    int i23 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzd(strConcat2);
                                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                    url = url2;
                                }
                            }
                        }, 265, -1);
                        if ((httpURLConnectionZzh instanceof HttpURLConnection) && (iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionZzh)) >= 400) {
                            try {
                                String string2 = Integer.toString(iHttpUrlConnectionGetResponseCode);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 27);
                                sb3.append("HTTP request failed. Code: ");
                                sb3.append(string2);
                                String string3 = sb3.toString();
                                try {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iHttpUrlConnectionGetResponseCode).length() + 21 + String.valueOf(str).length());
                                    sb4.append("HTTP status code ");
                                    sb4.append(iHttpUrlConnectionGetResponseCode);
                                    sb4.append(" at ");
                                    sb4.append(str);
                                    throw new IOException(sb4.toString());
                                } catch (IOException | RuntimeException e10) {
                                    e = e10;
                                    strConcat = strConcat;
                                    obj3 = "badUrl";
                                    str2 = string3;
                                    fileOutputStream = null;
                                    r11 = obj3;
                                    r10 = str2;
                                    if (e instanceof RuntimeException) {
                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                    }
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException | NullPointerException unused) {
                                    }
                                    if (this.zzh) {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 26);
                                        sb5.append("Preload aborted for URL \"");
                                        sb5.append(str);
                                        sb5.append("\"");
                                        String string4 = sb5.toString();
                                        int i20 = com.google.android.gms.ads.internal.util.zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzh(string4);
                                    } else {
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 25);
                                        sb6.append("Preload failed for URL \"");
                                        sb6.append(str);
                                        sb6.append("\"");
                                        String string5 = sb6.toString();
                                        int i21 = com.google.android.gms.ads.internal.util.zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzj(string5, e);
                                    }
                                    if (file5.exists()) {
                                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                    }
                                    zzq(str, file5.getAbsolutePath(), r11, r10);
                                    zze.remove(strConcat);
                                    return false;
                                }
                            } catch (IOException | RuntimeException e11) {
                                e = e11;
                                strConcat = strConcat;
                                obj2 = "badUrl";
                                str2 = null;
                                obj3 = obj2;
                                fileOutputStream = null;
                                r11 = obj3;
                                r10 = str2;
                                if (e instanceof RuntimeException) {
                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                }
                                fileOutputStream.close();
                                if (this.zzh) {
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 26);
                                    sb7.append("Preload aborted for URL \"");
                                    sb7.append(str);
                                    sb7.append("\"");
                                    String string6 = sb7.toString();
                                    int i22 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzh(string6);
                                } else {
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 25);
                                    sb8.append("Preload failed for URL \"");
                                    sb8.append(str);
                                    sb8.append("\"");
                                    String string7 = sb8.toString();
                                    int i23 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj(string7, e);
                                }
                                if (file5.exists()) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                }
                                zzq(str, file5.getAbsolutePath(), r11, r10);
                                zze.remove(strConcat);
                                return false;
                            }
                        }
                        int contentLength = httpURLConnectionZzh.getContentLength();
                        if (contentLength < 0) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 55);
                            sb9.append("Stream cache aborted, missing content-length header at ");
                            sb9.append(str);
                            String string8 = sb9.toString();
                            int i24 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(string8);
                            zzq(str, file5.getAbsolutePath(), "contentLengthMissing", null);
                            set.remove(strConcat);
                            return false;
                        }
                        DecimalFormat decimalFormat = zzf;
                        String str7 = decimalFormat.format(contentLength);
                        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzv)).intValue();
                        String str8 = "File too big for full file cache. Size: ";
                        if (contentLength > iIntValue) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(str7).length() + 33 + String.valueOf(str).length());
                            sb10.append("Content length ");
                            sb10.append(str7);
                            sb10.append(" exceeds limit at ");
                            sb10.append(str);
                            String string9 = sb10.toString();
                            int i25 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(string9);
                            StringBuilder sb11 = new StringBuilder(String.valueOf(str7).length() + 40);
                            sb11.append("File too big for full file cache. Size: ");
                            sb11.append(str7);
                            zzq(str, file5.getAbsolutePath(), "sizeExceeded", sb11.toString());
                            set.remove(strConcat);
                            return false;
                        }
                        StringBuilder sb12 = new StringBuilder(String.valueOf(str7).length() + 20 + String.valueOf(str).length());
                        sb12.append("Caching ");
                        sb12.append(str7);
                        sb12.append(" bytes from ");
                        sb12.append(str);
                        String string10 = sb12.toString();
                        int i26 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzd(string10);
                        ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnectionZzh));
                        FileOutputStream fileOutputStreamFileOutputStreamCtor = AdMobFilesBridge.fileOutputStreamCtor(file5);
                        try {
                            FileChannel channel = fileOutputStreamFileOutputStreamCtor.getChannel();
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
                            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
                            com.google.android.gms.ads.internal.util.zzbu zzbuVar = new com.google.android.gms.ads.internal.util.zzbu(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue());
                            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue();
                            ?? r13 = 0;
                            while (true) {
                                int i27 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                if (i27 >= 0) {
                                    int i28 = i27 + r13;
                                    try {
                                        try {
                                            if (i28 > iIntValue) {
                                                String str9 = str8;
                                                String string11 = Integer.toString(i28);
                                                StringBuilder sb13 = new StringBuilder(String.valueOf(string11).length() + 40);
                                                sb13.append(str9);
                                                sb13.append(string11);
                                                sb13.toString();
                                                throw new IOException("stream cache file size limit exceeded");
                                            }
                                            byteBufferAllocate.flip();
                                            while (channel.write(byteBufferAllocate) > 0) {
                                            }
                                            byteBufferAllocate.clear();
                                            if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue) {
                                                String string12 = Long.toString(jLongValue);
                                                StringBuilder sb14 = new StringBuilder(String.valueOf(string12).length() + 29);
                                                sb14.append("Timeout exceeded. Limit: ");
                                                sb14.append(string12);
                                                sb14.append(str6);
                                                sb14.toString();
                                                throw new IOException("stream cache time limit exceeded");
                                            }
                                            if (this.zzh) {
                                                throw new IOException("abort requested");
                                            }
                                            if (zzbuVar.zza()) {
                                                i11 = i28;
                                                strConcat = strConcat;
                                                try {
                                                    try {
                                                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchl(this, str, file5.getAbsolutePath(), i11, contentLength, false));
                                                    } catch (RuntimeException e12) {
                                                        e = e12;
                                                        strConcat = strConcat;
                                                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                                        r11 = obj;
                                                        r10 = 0;
                                                        if (e instanceof RuntimeException) {
                                                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                        }
                                                        fileOutputStream.close();
                                                        if (this.zzh) {
                                                            StringBuilder sb15 = new StringBuilder(String.valueOf(str).length() + 26);
                                                            sb15.append("Preload aborted for URL \"");
                                                            sb15.append(str);
                                                            sb15.append("\"");
                                                            String string13 = sb15.toString();
                                                            int i29 = com.google.android.gms.ads.internal.util.zze.zza;
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzh(string13);
                                                        } else {
                                                            StringBuilder sb16 = new StringBuilder(String.valueOf(str).length() + 25);
                                                            sb16.append("Preload failed for URL \"");
                                                            sb16.append(str);
                                                            sb16.append("\"");
                                                            String string14 = sb16.toString();
                                                            int i210 = com.google.android.gms.ads.internal.util.zze.zza;
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzj(string14, e);
                                                        }
                                                        if (file5.exists()) {
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                                        }
                                                        zzq(str, file5.getAbsolutePath(), r11, r10);
                                                        zze.remove(strConcat);
                                                        return false;
                                                    }
                                                } catch (IOException e13) {
                                                    e = e13;
                                                    strConcat = strConcat;
                                                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                                    r11 = obj;
                                                    r10 = 0;
                                                    if (e instanceof RuntimeException) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.zzh) {
                                                        StringBuilder sb17 = new StringBuilder(String.valueOf(str).length() + 26);
                                                        sb17.append("Preload aborted for URL \"");
                                                        sb17.append(str);
                                                        sb17.append("\"");
                                                        String string15 = sb17.toString();
                                                        int i211 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzh(string15);
                                                    } else {
                                                        StringBuilder sb18 = new StringBuilder(String.valueOf(str).length() + 25);
                                                        sb18.append("Preload failed for URL \"");
                                                        sb18.append(str);
                                                        sb18.append("\"");
                                                        String string16 = sb18.toString();
                                                        int i212 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzj(string16, e);
                                                    }
                                                    if (file5.exists()) {
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                                    }
                                                    zzq(str, file5.getAbsolutePath(), r11, r10);
                                                    zze.remove(strConcat);
                                                    return false;
                                                }
                                            } else {
                                                i11 = i28;
                                                strConcat = strConcat;
                                            }
                                            str8 = str8;
                                            channel = channel;
                                            iIntValue = iIntValue;
                                            readableByteChannelNewChannel = readableByteChannelNewChannel;
                                            r13 = i11;
                                            zzbuVar = zzbuVar;
                                            byteBufferAllocate = byteBufferAllocate;
                                            strConcat = strConcat;
                                            contentLength = contentLength;
                                        } catch (IOException | RuntimeException e14) {
                                            e = e14;
                                            r12 = 0;
                                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                            r11 = decimalFormat;
                                            r10 = r12;
                                            if (e instanceof RuntimeException) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                            }
                                            fileOutputStream.close();
                                            if (this.zzh) {
                                                StringBuilder sb19 = new StringBuilder(String.valueOf(str).length() + 26);
                                                sb19.append("Preload aborted for URL \"");
                                                sb19.append(str);
                                                sb19.append("\"");
                                                String string17 = sb19.toString();
                                                int i213 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzh(string17);
                                            } else {
                                                StringBuilder sb110 = new StringBuilder(String.valueOf(str).length() + 25);
                                                sb110.append("Preload failed for URL \"");
                                                sb110.append(str);
                                                sb110.append("\"");
                                                String string18 = sb110.toString();
                                                int i214 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzj(string18, e);
                                            }
                                            if (file5.exists()) {
                                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                            }
                                            zzq(str, file5.getAbsolutePath(), r11, r10);
                                            zze.remove(strConcat);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e15) {
                                        e = e15;
                                        r12 = r13;
                                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                        r11 = decimalFormat;
                                        r10 = r12;
                                        if (e instanceof RuntimeException) {
                                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                        }
                                        fileOutputStream.close();
                                        if (this.zzh) {
                                            StringBuilder sb111 = new StringBuilder(String.valueOf(str).length() + 26);
                                            sb111.append("Preload aborted for URL \"");
                                            sb111.append(str);
                                            sb111.append("\"");
                                            String string19 = sb111.toString();
                                            int i215 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzh(string19);
                                        } else {
                                            StringBuilder sb112 = new StringBuilder(String.valueOf(str).length() + 25);
                                            sb112.append("Preload failed for URL \"");
                                            sb112.append(str);
                                            sb112.append("\"");
                                            String string110 = sb112.toString();
                                            int i216 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzj(string110, e);
                                        }
                                        if (file5.exists()) {
                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                        }
                                        zzq(str, file5.getAbsolutePath(), r11, r10);
                                        zze.remove(strConcat);
                                        return false;
                                    }
                                } else {
                                    strConcat = strConcat;
                                    fileOutputStreamFileOutputStreamCtor.close();
                                    if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
                                        String str10 = decimalFormat.format((long) r13);
                                        StringBuilder sb20 = new StringBuilder(String.valueOf(str10).length() + 22 + String.valueOf(str).length());
                                        sb20.append(str4);
                                        sb20.append(str10);
                                        sb20.append(" bytes from ");
                                        sb20.append(str);
                                        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb20.toString());
                                    }
                                    file5.setReadable(true, false);
                                    if (fileZza2.isFile()) {
                                        fileZza2.setLastModified(System.currentTimeMillis());
                                    } else {
                                        try {
                                            fileZza2.createNewFile();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    zzo(str, file5.getAbsolutePath(), r13);
                                    strConcat = strConcat;
                                    try {
                                        zze.remove(strConcat);
                                        return true;
                                    } catch (IOException e16) {
                                        e = e16;
                                    } catch (RuntimeException e17) {
                                        e = e17;
                                    }
                                }
                                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                r11 = obj;
                                r10 = 0;
                                if (e instanceof RuntimeException) {
                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                }
                                fileOutputStream.close();
                                if (this.zzh) {
                                    StringBuilder sb113 = new StringBuilder(String.valueOf(str).length() + 26);
                                    sb113.append("Preload aborted for URL \"");
                                    sb113.append(str);
                                    sb113.append("\"");
                                    String string111 = sb113.toString();
                                    int i217 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzh(string111);
                                } else {
                                    StringBuilder sb114 = new StringBuilder(String.valueOf(str).length() + 25);
                                    sb114.append("Preload failed for URL \"");
                                    sb114.append(str);
                                    sb114.append("\"");
                                    String string112 = sb114.toString();
                                    int i218 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj(string112, e);
                                }
                                if (file5.exists() && !file5.delete()) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                }
                                zzq(str, file5.getAbsolutePath(), r11, r10);
                                zze.remove(strConcat);
                                return false;
                            }
                        } catch (IOException | RuntimeException e18) {
                            e = e18;
                            strConcat = strConcat;
                        }
                    } catch (IOException | RuntimeException e19) {
                        e = e19;
                        obj2 = obj;
                        str2 = null;
                        obj3 = obj2;
                        fileOutputStream = null;
                        r11 = obj3;
                        r10 = str2;
                        if (e instanceof RuntimeException) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                        }
                        fileOutputStream.close();
                        if (this.zzh) {
                            StringBuilder sb115 = new StringBuilder(String.valueOf(str).length() + 26);
                            sb115.append("Preload aborted for URL \"");
                            sb115.append(str);
                            sb115.append("\"");
                            String string113 = sb115.toString();
                            int i219 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh(string113);
                        } else {
                            StringBuilder sb116 = new StringBuilder(String.valueOf(str).length() + 25);
                            sb116.append("Preload failed for URL \"");
                            sb116.append(str);
                            sb116.append("\"");
                            String string114 = sb116.toString();
                            int i2110 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj(string114, e);
                        }
                        if (file5.exists()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                        }
                        zzq(str, file5.getAbsolutePath(), r11, r10);
                        zze.remove(strConcat);
                        return false;
                    }
                } catch (IOException | RuntimeException e20) {
                    e = e20;
                    obj = "error";
                }
            }
        }
    }

    public zzchu(zzcge zzcgeVar) {
        super(zzcgeVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfxl.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }
}
