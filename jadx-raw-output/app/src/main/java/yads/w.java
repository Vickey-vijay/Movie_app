package yads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes11.dex */
public class w implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f84060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f84061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f84062d;

    public w(x xVar) {
        this.f84062d = xVar;
        Collection collection = xVar.f84390c;
        this.f84061c = collection;
        this.f84060b = a0.a(collection);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.f84062d.c();
        if (this.f84062d.f84390c == this.f84061c) {
            return this.f84060b.hasNext();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f84062d.c();
        if (this.f84062d.f84390c == this.f84061c) {
            return this.f84060b.next();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f84060b.remove();
        x xVar = this.f84062d;
        xVar.f84393f.f75345g--;
        xVar.d();
    }

    public w(x xVar, ListIterator listIterator) {
        this.f84062d = xVar;
        this.f84061c = xVar.f84390c;
        this.f84060b = listIterator;
    }
}
