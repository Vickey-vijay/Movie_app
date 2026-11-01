package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
abstract class zzgyu extends zzgyh.zzf {
    private static final zzgyr zzbn;
    private static final zzgzw zzbo = new zzgzw(zzgyu.class);
    public volatile int remainingField;
    public volatile Set<Throwable> seenExceptionsField = null;

    public zzgyu(int i10) {
        this.remainingField = i10;
    }

    public abstract void zzf(Set set);

    static {
        Throwable th2;
        zzgyr zzgytVar;
        byte[] bArr = null;
        try {
            zzgytVar = new zzgys(bArr);
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            zzgytVar = new zzgyt(bArr);
        }
        zzbn = zzgytVar;
        if (th2 != null) {
            zzbo.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbn.zza(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final int zzC() {
        return zzbn.zzb(this);
    }
}
