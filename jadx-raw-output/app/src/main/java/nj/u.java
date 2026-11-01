package nj;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: compiled from: IteratorsJVM.kt */
/* JADX INFO: loaded from: classes9.dex */
public class u extends t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: IteratorsJVM.kt */
    public static final class a<T> implements Iterator<T>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Enumeration<T> f64757b;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(Enumeration<T> enumeration) {
            this.f64757b = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64757b.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f64757b.nextElement();
        }
    }

    public static final <T> Iterator<T> y(Enumeration<T> enumeration) {
        ck.p.j(enumeration, "<this>");
        return new a(enumeration);
    }
}
