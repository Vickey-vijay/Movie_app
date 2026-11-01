package yads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s83 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f82550b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82550b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f82550b.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f82550b.remove();
    }

    public s83(Iterator it) {
        this.f82550b = (Iterator) ng2.a(it);
    }
}
