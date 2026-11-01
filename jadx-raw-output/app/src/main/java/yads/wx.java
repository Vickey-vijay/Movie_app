package yads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class wx extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cy f84371b;

    public wx(cy cyVar) {
        this.f84371b = cyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f84371b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapA = this.f84371b.a();
        if (mapA != null) {
            return mapA.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int iA = this.f84371b.a(entry.getKey());
        return iA != -1 && l92.a(this.f84371b.c(iA), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        cy cyVar = this.f84371b;
        Map mapA = cyVar.a();
        return mapA != null ? mapA.entrySet().iterator() : new ux(cyVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapA = this.f84371b.a();
        if (mapA != null) {
            return mapA.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f84371b.c()) {
            return false;
        }
        int i10 = (1 << (this.f84371b.f76467f & 31)) - 1;
        int iA = dy.a(entry.getKey(), entry.getValue(), i10, this.f84371b.f(), this.f84371b.d(), this.f84371b.e(), this.f84371b.g());
        if (iA == -1) {
            return false;
        }
        this.f84371b.a(iA, i10);
        cy cyVar = this.f84371b;
        cyVar.f76468g--;
        cyVar.f76467f += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f84371b.size();
    }
}
