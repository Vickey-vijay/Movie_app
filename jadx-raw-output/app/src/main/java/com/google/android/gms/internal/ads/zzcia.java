package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcia extends zzchr implements zzcfu {
    public static final /* synthetic */ int zzd = 0;
    private zzcfv zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzchj zzi;
    private long zzj;
    private long zzk;

    public final zzcfv zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzcfv zzcfvVar = this.zze;
        this.zze = null;
        return zzcfvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzs(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzt(int i10, int i11) {
    }

    private final void zzd(long j10) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.zza.zzb();
            }
        }, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzchr, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcfv zzcfvVar = this.zze;
        if (zzcfvVar != null) {
            zzcfvVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzD() {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.android.gms.internal.ads.zzchr, com.google.android.gms.internal.ads.zzcia] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [com.google.android.gms.internal.ads.zzcia] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzbhc] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    public final /* synthetic */ void zzb() throws Throwable {
        String strZzc;
        zzcia zzciaVarBooleanValue;
        zzcia zzciaVar;
        zzcia zzciaVar2;
        long j10;
        String str;
        long j11;
        String strZzc2 = zzc(this.zzf);
        String str2 = "error";
        try {
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzw)).intValue();
            zzbgv zzbgvVar = zzbhe.zzcw;
            strZzc = com.google.android.gms.ads.internal.client.zzbd.zzc();
            zzciaVarBooleanValue = ((Boolean) strZzc.zzd(zzbgvVar)).booleanValue();
            try {
                synchronized (this) {
                    try {
                        strZzc = ((com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj) > jLongValue ? 1 : ((com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj) == jLongValue ? 0 : -1));
                        if (strZzc <= 0) {
                            try {
                                if (this.zzg) {
                                    throw new IOException("Abort requested before buffering finished. ");
                                }
                                if (!this.zzh) {
                                    if (!this.zze.zzB()) {
                                        throw new IOException("ExoPlayer was released during preloading.");
                                    }
                                    long jZzH = this.zze.zzH();
                                    if (jZzH > 0) {
                                        long jZzN = this.zze.zzN();
                                        if (jZzN != this.zzk) {
                                            try {
                                                str = strZzc2;
                                                try {
                                                    zzm(this.zzf, strZzc2, jZzN, jZzH, jZzN > 0, zzciaVarBooleanValue != 0 ? this.zze.zzI() : -1L, zzciaVarBooleanValue != 0 ? this.zze.zzJ() : -1L, zzciaVarBooleanValue != 0 ? this.zze.zzK() : -1L, zzcfv.zzP(), zzcfv.zzQ());
                                                    zzciaVarBooleanValue = this;
                                                    j10 = jZzN;
                                                    try {
                                                        zzciaVarBooleanValue.zzk = j10;
                                                        j11 = jZzH;
                                                        zzciaVarBooleanValue = zzciaVarBooleanValue;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        strZzc = str;
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    zzciaVarBooleanValue = this;
                                                    strZzc = str;
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                zzciaVarBooleanValue = this;
                                                strZzc = strZzc2;
                                                throw th;
                                            }
                                        } else {
                                            j10 = jZzN;
                                            str = strZzc2;
                                            zzciaVarBooleanValue = this;
                                            j11 = jZzH;
                                        }
                                        if (j10 >= j11) {
                                            zzciaVarBooleanValue.zzp(zzciaVarBooleanValue.zzf, str, j11);
                                            zzciaVar = zzciaVarBooleanValue;
                                        } else if (zzciaVarBooleanValue.zze.zzO() >= jIntValue && j10 > 0) {
                                            zzciaVar = zzciaVarBooleanValue;
                                        }
                                    } else {
                                        zzciaVar2 = this;
                                    }
                                    zzciaVar2.zzd(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue());
                                    return;
                                }
                                zzciaVar = this;
                                com.google.android.gms.ads.internal.zzt.zzB().zzd(zzciaVar.zzi);
                            } catch (Throwable th5) {
                                th = th5;
                                str2 = "Timeout reached. Limit: ";
                            }
                        } else {
                            strZzc = strZzc2;
                            zzciaVarBooleanValue = this;
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                                sb2.append("Timeout reached. Limit: ");
                                sb2.append(jLongValue);
                                sb2.append(" ms");
                                throw new IOException(sb2.toString());
                            } catch (Throwable th6) {
                                th = th6;
                                str2 = "downloadTimeout";
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        strZzc = strZzc2;
                        zzciaVarBooleanValue = this;
                    }
                    try {
                        throw th;
                    } catch (Exception e10) {
                        e = e10;
                        String str3 = str2;
                        String str4 = zzciaVarBooleanValue.zzf;
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 34 + String.valueOf(message).length());
                        sb3.append("Failed to preload url ");
                        sb3.append(str4);
                        sb3.append(" Exception: ");
                        sb3.append(message);
                        String string = sb3.toString();
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
                        release();
                        zzciaVarBooleanValue.zzq(zzciaVarBooleanValue.zzf, strZzc, str3, zzx(str3, e));
                        zzciaVar = zzciaVarBooleanValue;
                        com.google.android.gms.ads.internal.zzt.zzB().zzd(zzciaVar.zzi);
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Exception e11) {
            e = e11;
            strZzc = strZzc2;
            zzciaVarBooleanValue = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.zzcge] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.zzchr, com.google.android.gms.internal.ads.zzcia] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.zzcia] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [long] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzchr] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zzf(String str, String[] strArr) throws Throwable {
        ?? r10;
        String str2;
        ?? r11;
        String str3;
        String str4;
        long j10;
        ?? r12;
        String str5;
        long j11;
        ?? r13;
        ?? r15 = this;
        ?? r14 = str;
        r15.zzf = r14;
        ?? r17 = "error";
        String strZzc = zzc(str);
        String str6 = " ms";
        String str7 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            r15.zze.zzq(uriArr, r15.zzb);
            ?? r16 = (zzcge) r15.zzc.get();
            if (r16 != 0) {
                r16.zzt(strZzc, r15);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzw)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue();
            ?? r18 = -1;
            long j12 = jLongValue2;
            r14 = r14;
            r15 = r15;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > j12) {
                            long j13 = j12;
                            String str8 = str6;
                            String str9 = str7;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j13).length() + 27);
                            sb2.append(str9);
                            sb2.append(j13);
                            sb2.append(str8);
                            throw new IOException(sb2.toString());
                        }
                        if (r15.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!r15.zzh) {
                            if (!r15.zze.zzB()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            str3 = str6;
                            str4 = str7;
                            long jZzH = r15.zze.zzH();
                            if (jZzH > 0) {
                                long jZzN = r15.zze.zzN();
                                if (jZzN != r18) {
                                    try {
                                        long j14 = jZzH;
                                        str5 = strZzc;
                                        try {
                                            zzm(str, strZzc, jZzN, j14, jZzN > 0, zBooleanValue ? r15.zze.zzI() : -1L, zBooleanValue ? r15.zze.zzJ() : -1L, zBooleanValue ? r15.zze.zzK() : -1L, zzcfv.zzP(), zzcfv.zzQ());
                                            r13 = jZzN;
                                            j11 = jZzH;
                                            r10 = j14;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r11 = this;
                                            r10 = str;
                                            str2 = str5;
                                            try {
                                                throw th;
                                            } catch (Exception e10) {
                                                e = e10;
                                                ?? r19 = r17;
                                                String message = e.getMessage();
                                                ?? sb3 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                                                sb3.append("Failed to preload url ");
                                                sb3.append(r10);
                                                sb3.append(" Exception: ");
                                                sb3.append(message);
                                                String string = sb3.toString();
                                                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
                                                release();
                                                r11.zzq(r10, str2, r19, zzx(r19, e));
                                                return false;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r11 = this;
                                        r10 = str;
                                        str2 = strZzc;
                                    }
                                } else {
                                    str5 = strZzc;
                                    j11 = jZzH;
                                    r13 = r18;
                                    r10 = j12;
                                }
                                r11 = (jZzN > j11 ? 1 : (jZzN == j11 ? 0 : -1));
                                if (r11 >= 0) {
                                    zzp(str, str5, j11);
                                } else {
                                    try {
                                        zzcia zzciaVar = this;
                                        r10 = str;
                                        str2 = str5;
                                        if (zzciaVar.zze.zzO() < jIntValue || jZzN <= 0) {
                                            r12 = r13;
                                            r11 = zzciaVar;
                                            j10 = j12;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        throw th;
                                    }
                                }
                            } else {
                                clockZzk = clockZzk;
                                jIntValue = jIntValue;
                                j10 = j12;
                                r10 = r14;
                                str2 = strZzc;
                                r11 = r15;
                                str4 = str4;
                                str3 = str3;
                                r12 = r18;
                            }
                            try {
                                try {
                                    r11.wait(jLongValue);
                                } catch (InterruptedException unused) {
                                    throw new IOException("Wait interrupted.");
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r17 = r12;
                                throw th;
                            }
                        }
                        return true;
                    } catch (Throwable th6) {
                        th = th6;
                        r10 = r14;
                        str2 = strZzc;
                        r11 = r15;
                    }
                }
                return true;
                str7 = str4;
                jLongValue = jLongValue;
                r15 = r11;
                r14 = r10;
                strZzc = str2;
                str6 = str3;
                jIntValue = jIntValue;
                j12 = j10;
                clockZzk = clockZzk;
                r18 = r12;
            }
        } catch (Exception e11) {
            e = e11;
            r10 = r14;
            str2 = strZzc;
            r11 = r15;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zzg(String str, String[] strArr, zzchj zzchjVar) {
        this.zzf = str;
        this.zzi = zzchjVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcge zzcgeVar = (zzcge) this.zzc.get();
            if (zzcgeVar != null) {
                zzcgeVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e10) {
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            String string = sb2.toString();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzh(int i10) {
        this.zze.zzG(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzi(int i10) {
        this.zze.zzF(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzj(int i10) {
        this.zze.zzy(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzk(int i10) {
        this.zze.zzz(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzr(final boolean z10, final long j10) {
        final zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null) {
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgeVar.zzu(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzu(String str, Exception exc) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzv(String str, Exception exc) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }

    public zzcia(zzcge zzcgeVar, zzcgd zzcgdVar) {
        super(zzcgeVar);
        zzcit zzcitVar = new zzcit(zzcgeVar.getContext(), zzcgdVar, (zzcge) this.zzc.get(), null);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzcitVar;
        zzcitVar.zzs(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(canonicalName);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(message);
        return sb2.toString();
    }
}
