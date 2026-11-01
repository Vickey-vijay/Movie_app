package yads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xx implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84735d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cy f84736e;

    public abstract Object a(int i10);

    public xx(cy cyVar) {
        this.f84736e = cyVar;
        this.f84733b = cyVar.f76467f;
        this.f84734c = cyVar.b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f84734c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f84736e.f76467f != this.f84733b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f84734c;
        this.f84735d = i10;
        Object objA = a(i10);
        cy cyVar = this.f84736e;
        int i11 = this.f84734c + 1;
        if (i11 >= cyVar.f76468g) {
            i11 = -1;
        }
        this.f84734c = i11;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        cy cyVar = this.f84736e;
        int i10 = cyVar.f76467f;
        int i11 = this.f84733b;
        if (i10 != i11) {
            throw new ConcurrentModificationException();
        }
        int i12 = this.f84735d;
        if (!(i12 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f84733b = i11 + 32;
        cyVar.remove(cyVar.b(i12));
        cy cyVar2 = this.f84736e;
        int i13 = this.f84734c;
        cyVar2.getClass();
        this.f84734c = i13 - 1;
        this.f84735d = -1;
    }
}
