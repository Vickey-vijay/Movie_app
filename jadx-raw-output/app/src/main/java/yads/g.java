package yads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g extends ja3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77560b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f77561c;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f77560b;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iA = hg0.a(i10);
        if (iA == 0) {
            return true;
        }
        if (iA == 2) {
            return false;
        }
        this.f77560b = 4;
        this.f77561c = a();
        if (this.f77560b == 3) {
            return false;
        }
        this.f77560b = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f77560b = 2;
            Object obj = this.f77561c;
            this.f77561c = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
