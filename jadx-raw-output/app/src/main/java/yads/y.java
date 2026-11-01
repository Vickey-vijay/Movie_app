package yads;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes11.dex */
public final class y extends w implements ListIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f84764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar) {
        super(zVar);
        this.f84764e = zVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, int i10) {
        super(zVar, zVar.e().listIterator(i10));
        this.f84764e = zVar;
    }

    public final ListIterator a() {
        this.f84062d.c();
        if (this.f84062d.f84390c == this.f84061c) {
            return (ListIterator) this.f84060b;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f84764e.isEmpty();
        a().add(obj);
        z zVar = this.f84764e;
        zVar.f85158g.f75345g++;
        if (zIsEmpty) {
            zVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return a().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return a().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return a().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a().set(obj);
    }
}
