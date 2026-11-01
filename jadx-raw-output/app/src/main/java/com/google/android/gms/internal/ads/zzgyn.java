package com.google.android.gms.internal.ads;

import com.ironsource.C3426d4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
abstract class zzgyn extends zzgzf implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    public q5.i zza;
    public Object zzb;

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Object obj2) throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        q5.i iVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (iVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (iVar.isCancelled()) {
            zzk(iVar);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzgzo.zzs(iVar));
                this.zzb = null;
                zze(objZzf);
            } catch (Throwable th2) {
                try {
                    zzhag.zza(th2);
                    zzb(th2);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e10) {
            zzb(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            zzb(e11.getCause());
        } catch (Exception e12) {
            zzb(e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        String string;
        q5.i iVar = this.zza;
        Object obj = this.zzb;
        String strZzd = super.zzd();
        if (iVar != null) {
            String string2 = iVar.toString();
            StringBuilder sb2 = new StringBuilder(string2.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(string2);
            sb2.append("], ");
            string = sb2.toString();
        } else {
            string = "";
        }
        if (obj == null) {
            if (strZzd != null) {
                return string.concat(strZzd);
            }
            return null;
        }
        int length = string.length();
        String string3 = obj.toString();
        StringBuilder sb3 = new StringBuilder(length + 10 + string3.length() + 1);
        sb3.append(string);
        sb3.append("function=[");
        sb3.append(string3);
        sb3.append(C3426d4.j.f28588e);
        return sb3.toString();
    }

    public zzgyn(q5.i iVar, Object obj) {
        iVar.getClass();
        this.zza = iVar;
        this.zzb = obj;
    }
}
