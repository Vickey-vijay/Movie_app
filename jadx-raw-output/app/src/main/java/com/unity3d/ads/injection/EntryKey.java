package com.unity3d.ads.injection;

import ck.i;
import ck.p;
import jk.c;

/* JADX INFO: compiled from: EntryKey.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class EntryKey {
    private final c<?> instanceClass;
    private final String named;

    public EntryKey(String str, c<?> cVar) {
        p.j(str, "named");
        p.j(cVar, "instanceClass");
        this.named = str;
        this.instanceClass = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = entryKey.named;
        }
        if ((i10 & 2) != 0) {
            cVar = entryKey.instanceClass;
        }
        return entryKey.copy(str, cVar);
    }

    public final String component1() {
        return this.named;
    }

    public final c<?> component2() {
        return this.instanceClass;
    }

    public final EntryKey copy(String str, c<?> cVar) {
        p.j(str, "named");
        p.j(cVar, "instanceClass");
        return new EntryKey(str, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        return p.e(this.named, entryKey.named) && p.e(this.instanceClass, entryKey.instanceClass);
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public final c<?> getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public /* synthetic */ EntryKey(String str, c cVar, int i10, i iVar) {
        this((i10 & 1) != 0 ? "" : str, cVar);
    }
}
