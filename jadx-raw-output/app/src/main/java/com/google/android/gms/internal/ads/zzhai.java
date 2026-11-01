package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzhai implements Runnable {
    public zzhak zza;

    public zzhai(zzhak zzhakVar) {
        this.zza = zzhakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5.i iVarZzf;
        zzhak zzhakVar = this.zza;
        if (zzhakVar == null || (iVarZzf = zzhakVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (iVarZzf.isDone()) {
            zzhakVar.zzk(iVarZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzhakVar.zzx();
            zzhakVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb2.append("Timed out");
                        sb2.append(" (timeout delayed by ");
                        sb2.append(jAbs);
                        sb2.append(" ms after scheduled time)");
                        string = sb2.toString();
                    }
                } catch (Throwable th2) {
                    zzhakVar.zzb(new zzhaj(string, null));
                    throw th2;
                }
            }
            String string2 = iVarZzf.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 2 + string2.length());
            sb3.append(string);
            sb3.append(": ");
            sb3.append(string2);
            zzhakVar.zzb(new zzhaj(sb3.toString(), null));
            iVarZzf.cancel(true);
        } catch (Throwable th3) {
            iVarZzf.cancel(true);
            throw th3;
        }
    }
}
