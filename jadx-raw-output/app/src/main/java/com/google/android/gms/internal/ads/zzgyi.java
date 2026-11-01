package com.google.android.gms.internal.ads;

import com.ironsource.C3426d4;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
abstract class zzgyi<V> extends zzhaq implements q5.i<V> {
    private static final zza zzbp;
    public static final Object zze = new Object();
    public static final zzgzw zzf = new zzgzw(zzgyh.class);
    public static final boolean zzg;
    public volatile zzgyh.zzd listenersField;
    public volatile Object valueField;
    public volatile zze waitersField;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    /* JADX INFO: loaded from: classes11.dex */
    abstract class zza {
        public /* synthetic */ zza(byte[] bArr) {
        }

        public abstract void zza(zze zzeVar, Thread thread);

        public abstract void zzb(zze zzeVar, zze zzeVar2);

        public abstract boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2);

        public abstract boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2);

        public abstract zze zze(zzgyi zzgyiVar, zze zzeVar);

        public abstract zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar);

        public abstract boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    /* JADX INFO: loaded from: classes11.dex */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzgyi<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzgyi.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzgyi<?>, zzgyh.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzgyi.class, zzgyh.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzgyi<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzgyi.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        public /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2) {
            return androidx.concurrent.futures.a.a(zzc, zzgyiVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
            return androidx.concurrent.futures.a.a(zzd, zzgyiVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final zze zze(zzgyi zzgyiVar, zze zzeVar) {
            return zzc.getAndSet(zzgyiVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar) {
            return zzd.getAndSet(zzgyiVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.a.a(zze, zzgyiVar, obj, obj2);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    /* JADX INFO: loaded from: classes11.dex */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        public /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzgyiVar) {
                if (zzgyiVar.waitersField != zzeVar) {
                    return false;
                }
                zzgyiVar.waitersField = zzeVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
            synchronized (zzgyiVar) {
                if (zzgyiVar.listenersField != zzdVar) {
                    return false;
                }
                zzgyiVar.listenersField = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final zze zze(zzgyi zzgyiVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzgyiVar) {
                zzeVar2 = zzgyiVar.waitersField;
                if (zzeVar2 != zzeVar) {
                    zzgyiVar.waitersField = zzeVar;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar) {
            zzgyh.zzd zzdVar2;
            synchronized (zzgyiVar) {
                zzdVar2 = zzgyiVar.listenersField;
                if (zzdVar2 != zzdVar) {
                    zzgyiVar.listenersField = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2) {
            synchronized (zzgyiVar) {
                if (zzgyiVar.valueField != obj) {
                    return false;
                }
                zzgyiVar.valueField = obj2;
                return true;
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    /* JADX INFO: loaded from: classes11.dex */
    final class zzd extends zza {
        public static final Unsafe zza;
        public static final long zzb;
        public static final long zzc;
        public static final long zzd;
        public static final long zze;
        public static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        private zzd() {
            throw null;
        }

        public /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.ads.zzgyj
                        @Override // java.security.PrivilegedExceptionAction
                        public final /* synthetic */ Object run() throws IllegalAccessException {
                            Unsafe unsafe2 = zzgyi.zzd.zza;
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzgyi.class.getDeclaredField("waitersField"));
                    zzb = unsafe.objectFieldOffset(zzgyi.class.getDeclaredField("listenersField"));
                    zzd = unsafe.objectFieldOffset(zzgyi.class.getDeclaredField("valueField"));
                    zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2) {
            return i.a(zza, zzgyiVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
            return i.a(zza, zzgyiVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final zze zze(zzgyi zzgyiVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzgyiVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzgyiVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar) {
            zzgyh.zzd zzdVar2;
            do {
                zzdVar2 = zzgyiVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzgyiVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        public final boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2) {
            return i.a(zza, zzgyiVar, zzd, obj, obj2);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                        }
                    } else if (!zzbp.zzc(this, zzeVar2, zzeVar4)) {
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public abstract /* synthetic */ void addListener(Runnable runnable, Executor executor);

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    /* JADX INFO: loaded from: classes11.dex */
    final class zze {
        public static final zze zza = new zze(false);
        public volatile zze next;
        public volatile Thread thread;

        public zze(boolean z10) {
        }

        public zze() {
            zzgyi.zzv(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        zza zzcVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.ironsource.mediationsdk.metadata.a.f29886h));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zzg = z10;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains(C3426d4.f28386d)) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e10) {
                try {
                    th2 = e10;
                    th3 = null;
                    zzcVar = new zzb(bArr);
                } catch (Error | Exception e11) {
                    th2 = e10;
                    th3 = e11;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th3 = null;
        th2 = null;
        zzbp = zzcVar;
        if (th3 != null) {
            zzgzw zzgzwVar = zzf;
            Logger loggerZza = zzgzwVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzgzwVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th3);
        }
    }

    public static boolean zzr(zzgyi zzgyiVar, Object obj, Object obj2) {
        return zzbp.zzg(zzgyiVar, obj, obj2);
    }

    public static /* synthetic */ void zzv(zze zzeVar, Thread thread) {
        zzbp.zza(zzeVar, thread);
    }

    public final boolean zzp(zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
        return zzbp.zzd(this, zzdVar, zzdVar2);
    }

    public final zzgyh.zzd zzq(zzgyh.zzd zzdVar) {
        return zzbp.zzf(this, zzdVar);
    }

    public final void zzs() {
        for (zze zzeVarZze = zzbp.zze(this, zze.zza); zzeVarZze != null; zzeVarZze = zzeVarZze.next) {
            Thread thread = zzeVarZze.thread;
            if (thread != null) {
                zzeVarZze.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final Object zzt(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzgyh.zzh(obj)) {
            return zzgyh.zzg(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                while (true) {
                    zza zzaVar = zzbp;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzgyh.zzh(obj2)) {
                                return zzgyh.zzg(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                        break;
                    }
                    zzeVar = this.waitersField;
                    if (zzeVar == zze.zza) {
                    }
                }
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzgyh.zzg(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzgyh.zzh(obj4)) {
                return zzgyh.zzg(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 8 + String.valueOf(lowerCase2).length());
        sb2.append("Waited ");
        sb2.append(j10);
        sb2.append(Z7.f27998r);
        sb2.append(lowerCase2);
        String string3 = sb2.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb3 = new StringBuilder(strConcat.length() + String.valueOf(jConvert).length() + 1 + String.valueOf(lowerCase).length());
                sb3.append(strConcat);
                sb3.append(jConvert);
                sb3.append(Z7.f27998r);
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z10) {
                    string4 = string4.concat(StringUtils.COMMA);
                }
                strConcat = string4.concat(Z7.f27998r);
            }
            if (z10) {
                StringBuilder sb4 = new StringBuilder(strConcat.length() + String.valueOf(nanos2).length() + 13);
                sb4.append(strConcat);
                sb4.append(nanos2);
                sb4.append(" nanoseconds ");
                strConcat = sb4.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb5 = new StringBuilder(string3.length() + 5 + String.valueOf(string).length());
        sb5.append(string3);
        sb5.append(" for ");
        sb5.append(string);
        throw new TimeoutException(sb5.toString());
    }

    public final Object zzu() throws ExecutionException, InterruptedException {
        boolean z10;
        Object obj;
        boolean z11;
        if (!Thread.interrupted()) {
            Object obj2 = this.valueField;
            if (obj2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 & zzgyh.zzh(obj2)) {
                return zzgyh.zzg(obj2);
            }
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzbp;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.valueField;
                                if (obj != null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z11 & zzgyh.zzh(obj)));
                        return zzgyh.zzg(obj);
                    }
                    zzeVar = this.waitersField;
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzgyh.zzg(obj3);
        }
        throw new InterruptedException();
    }
}
