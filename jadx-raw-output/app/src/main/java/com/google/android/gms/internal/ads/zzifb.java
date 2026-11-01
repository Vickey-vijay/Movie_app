package com.google.android.gms.internal.ads;

import ck.p;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzifb extends zziew implements Set {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzifb(Collection collection) {
        super(collection);
        p.j(collection, "delegate");
    }
}
