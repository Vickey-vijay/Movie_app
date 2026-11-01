package com.google.android.gms.internal.ads;

import com.ironsource.C3426d4;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzgyh<V> extends zzgyi<V> {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    /* JADX INFO: loaded from: classes5.dex */
    final class zza {
        public static final zza zza;
        public static final zza zzb;
        public final boolean zzc;
        public final Throwable zzd;

        public zza(boolean z10, Throwable th2) {
            this.zzc = z10;
            this.zzd = th2;
        }

        static {
            if (zzgyi.zzg) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    /* JADX INFO: loaded from: classes5.dex */
    final class zzb<V> implements Runnable {
        public final zzgyh<V> zza;
        public final q5.i<? extends V> zzb;

        public zzb(zzgyh zzgyhVar, q5.i iVar) {
            this.zza = zzgyhVar;
            this.zzb = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzgyi.zzr(this.zza, this, zzgyh.zze(this.zzb))) {
                zzgyh.zzw(this.zza, false);
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    /* JADX INFO: loaded from: classes5.dex */
    final class zzd {
        public static final zzd zza = new zzd();
        public zzd next;
        public final Runnable zzb;
        public final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    /* JADX INFO: loaded from: classes5.dex */
    interface zze<V> extends q5.i<V> {
        @Override // q5.i
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    /* JADX INFO: loaded from: classes5.dex */
    abstract class zzf<V> extends zzgyh<V> implements zze<V> {
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static boolean zzh(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzw(zzgyh zzgyhVar, boolean z10) {
        zzd zzdVar = null;
        while (true) {
            zzgyhVar.zzs();
            if (z10) {
                zzgyhVar.zzi();
            }
            zzgyhVar.zzc();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZzq = zzgyhVar.zzq(zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZzq != null) {
                zzd zzdVar4 = zzdVarZzq.next;
                zzdVarZzq.next = zzdVar3;
                zzdVar3 = zzdVarZzq;
                zzdVarZzq = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzgyhVar = zzbVar.zza;
                    if (zzgyhVar.valueField == zzbVar && zzgyi.zzr(zzgyhVar, zzbVar, zze(zzbVar.zzb))) {
                        z10 = false;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return zzu();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    public void zzc() {
    }

    public void zzi() {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    /* JADX INFO: loaded from: classes5.dex */
    final class zzc {
        public static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgyh.zzc.1
            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }

            {
                super("Failure occurred while trying to finish a future.");
            }
        });
        public final Throwable zzb;

        public zzc(Throwable th2) {
            th2.getClass();
            this.zzb = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(q5.i iVar) {
        Throwable thZzl;
        if (iVar instanceof zze) {
            Object zzaVar = ((zzgyh) iVar).valueField;
            if (zzaVar instanceof zza) {
                zza zzaVar2 = (zza) zzaVar;
                if (zzaVar2.zzc) {
                    Throwable th2 = zzaVar2.zzd;
                    zzaVar = th2 != null ? new zza(false, th2) : zza.zzb;
                }
            }
            Objects.requireNonNull(zzaVar);
            return zzaVar;
        }
        if ((iVar instanceof zzhaq) && (thZzl = ((zzhaq) iVar).zzl()) != null) {
            return new zzc(thZzl);
        }
        boolean zIsCancelled = iVar.isCancelled();
        if ((!zzgyi.zzg) && zIsCancelled) {
            zza zzaVar3 = zza.zzb;
            Objects.requireNonNull(zzaVar3);
            return zzaVar3;
        }
        try {
            Object objZzf = zzf(iVar);
            if (!zIsCancelled) {
                return objZzf == null ? zzgyi.zze : objZzf;
            }
            String strValueOf = String.valueOf(iVar);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 84);
            sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb2.append(strValueOf);
            return new zza(false, new IllegalArgumentException(sb2.toString()));
        } catch (Error e10) {
            e = e10;
            return new zzc(e);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(iVar)), e11)) : new zza(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(iVar)), e12)) : new zzc(e12.getCause());
        } catch (Exception e13) {
            e = e13;
            return new zzc(e);
        }
    }

    public static Object zzg(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th2 = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzgyi.zze) {
            return null;
        }
        return obj;
    }

    private final void zzx(StringBuilder sb2) {
        try {
            Object objZzf = zzf(this);
            sb2.append("SUCCESS, result=[");
            if (objZzf == null) {
                sb2.append("null");
            } else if (objZzf == this) {
                sb2.append("this future");
            } else {
                sb2.append(objZzf.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objZzf)));
            }
            sb2.append(C3426d4.j.f28588e);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append(C3426d4.j.f28588e);
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyi, q5.i
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzgrc.zzk(runnable, "Runnable was null.");
        zzgrc.zzk(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        zza zzaVar;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzgyi.zzg) {
            zzaVar = new zza(z10, new CancellationException("Future.cancel() was called."));
        } else {
            zzaVar = z10 ? zza.zza : zza.zzb;
            Objects.requireNonNull(zzaVar);
        }
        zzgyh<V> zzgyhVar = this;
        boolean z11 = false;
        while (true) {
            if (zzgyi.zzr(zzgyhVar, obj, zzaVar)) {
                zzw(zzgyhVar, z10);
                if (obj instanceof zzb) {
                    q5.i<? extends V> iVar = ((zzb) obj).zzb;
                    if (iVar instanceof zze) {
                        zzgyhVar = (zzgyh) iVar;
                        obj = zzgyhVar.valueField;
                        if ((obj == null) | (obj instanceof zzb)) {
                            z11 = true;
                        }
                    } else {
                        iVar.cancel(z10);
                    }
                }
                return true;
            }
            obj = zzgyhVar.valueField;
            if (zzh(obj)) {
                return z11;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return zzt(j10, timeUnit);
    }

    public String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzx(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb2.append(", setFuture=[");
                q5.i<? extends V> iVar = ((zzb) obj).zzb;
                try {
                    if (iVar == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(iVar);
                    }
                } catch (Throwable th2) {
                    zzhag.zzb(th2);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append(C3426d4.j.f28588e);
            } else {
                try {
                    strConcat = zzgrt.zzb(zzd());
                } catch (Throwable th3) {
                    zzhag.zzb(th3);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
                }
                if (strConcat != null) {
                    sb2.append(", info=[");
                    sb2.append(strConcat);
                    sb2.append(C3426d4.j.f28588e);
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                zzx(sb2);
            }
        }
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }

    public boolean zza(Object obj) {
        if (obj == null) {
            obj = zzgyi.zze;
        }
        if (!zzgyi.zzr(this, null, obj)) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public boolean zzb(Throwable th2) {
        th2.getClass();
        if (!zzgyi.zzr(this, null, new zzc(th2))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zzd() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + 21);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    public final boolean zzj() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final Throwable zzl() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public final void zzm(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzj());
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger loggerZza = zzgyi.zzf.zza();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(strValueOf);
            sb2.append(" with executor ");
            sb2.append(strValueOf2);
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb2.toString(), (Throwable) e10);
        }
    }

    public final boolean zzk(q5.i iVar) {
        zzc zzcVar;
        iVar.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (iVar.isDone()) {
                if (!zzgyi.zzr(this, null, zze(iVar))) {
                    return false;
                }
                zzw(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, iVar);
            if (zzgyi.zzr(this, null, zzbVar)) {
                try {
                    iVar.addListener(zzbVar, zzgzd.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        zzcVar = new zzc(th2);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzgyi.zzr(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            iVar.cancel(((zza) obj).zzc);
        }
        return false;
    }
}
