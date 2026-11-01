package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import androidx.annotation.VisibleForTesting;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzazb {

    @VisibleForTesting
    public volatile Boolean zzb;
    private final zzbak zzc;
    private static final ConditionVariable zzd = new ConditionVariable();

    @VisibleForTesting
    public static volatile zzfxd zza = null;
    private static volatile Random zze = null;

    public final /* synthetic */ zzbak zzb() {
        return this.zzc;
    }

    public final void zza(int i10, int i11, long j10, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzavm zzavmVarZza = zzavq.zza();
            zzavmVarZza.zza(this.zzc.zza.getPackageName());
            zzavmVarZza.zzb(j10);
            if (str != null) {
                zzavmVarZza.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzavmVarZza.zzc(stringWriter.toString());
                zzavmVarZza.zzd(exc.getClass().getName());
            }
            zzfxc zzfxcVarZza = zza.zza(((zzavq) zzavmVarZza.zzbu()).zzaN());
            zzfxcVarZza.zzc(i10);
            if (i11 != -1) {
                zzfxcVarZza.zzb(i11);
            }
            zzfxcVarZza.zza();
        } catch (Exception unused) {
        }
    }

    public zzazb(zzbak zzbakVar) {
        this.zzc = zzbakVar;
        zzbakVar.zzd().execute(new zzaza(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzazb.class) {
                    if (zze == null) {
                        zze = new Random();
                    }
                }
            }
            return zze.nextInt();
        }
    }
}
