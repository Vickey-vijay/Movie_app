package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import m5.e;
import m5.l;
import m5.p;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public class a implements Iterable<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f20257b;

        /* JADX INFO: renamed from: com.google.common.base.Optional$a$a, reason: collision with other inner class name */
        public class C0197a extends AbstractIterator<T> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Iterator<? extends Optional<? extends T>> f20258d;

            public C0197a() {
                this.f20258d = (Iterator) l.m(a.this.f20257b.iterator());
            }

            @Override // com.google.common.base.AbstractIterator
            public T a() {
                while (this.f20258d.hasNext()) {
                    Optional<? extends T> next = this.f20258d.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return b();
            }
        }

        public a(Iterable iterable) {
            this.f20257b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C0197a();
        }
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(T t10);

    public abstract T or(p<? extends T> pVar);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(e<? super T, V> eVar);

    public static <T> Optional<T> fromNullable(T t10) {
        return t10 == null ? absent() : new Present(t10);
    }

    public static <T> Optional<T> of(T t10) {
        return new Present(l.m(t10));
    }

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        l.m(iterable);
        return new a(iterable);
    }
}
