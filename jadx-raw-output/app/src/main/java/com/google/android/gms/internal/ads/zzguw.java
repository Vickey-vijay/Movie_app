package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
enum zzguw implements Iterator {
    INSTANCE;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgrc.zzj(false, "no calls to next() since the last call to remove()");
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }
}
