package yads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ay extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cy f75654b;

    public ay(cy cyVar) {
        this.f75654b = cyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f75654b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        cy cyVar = this.f75654b;
        Map mapA = cyVar.a();
        return mapA != null ? mapA.values().iterator() : new vx(cyVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f75654b.size();
    }
}
