package com.google.common.base;

import com.google.common.base.Suppliers;
import java.io.Serializable;
import m5.h;
import m5.l;
import m5.p;

/* JADX INFO: loaded from: classes8.dex */
public final class Suppliers {

    public static class MemoizingSupplier<T> implements p<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final p<T> delegate;
        public volatile transient boolean initialized;
        public transient T value;

        @Override // m5.p
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        T t10 = this.delegate.get();
                        this.value = t10;
                        this.initialized = true;
                        return t10;
                    }
                }
            }
            return (T) h.a(this.value);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.initialized) {
                obj = "<supplier that returned " + this.value + ">";
            } else {
                obj = this.delegate;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }

        public MemoizingSupplier(p<T> pVar) {
            this.delegate = (p) l.m(pVar);
        }
    }

    public static class a<T> implements p<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final p<Void> f20260d = new p() { // from class: m5.q
            @Override // m5.p
            public final Object get() {
                return Suppliers.a.b();
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile p<T> f20261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f20262c;

        public static /* synthetic */ Void b() {
            throw new IllegalStateException();
        }

        @Override // m5.p
        public T get() {
            p<T> pVar = this.f20261b;
            p<T> pVar2 = (p<T>) f20260d;
            if (pVar != pVar2) {
                synchronized (this) {
                    if (this.f20261b != pVar2) {
                        T t10 = this.f20261b.get();
                        this.f20262c = t10;
                        this.f20261b = pVar2;
                        return t10;
                    }
                }
            }
            return (T) h.a(this.f20262c);
        }

        public String toString() {
            Object obj = this.f20261b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f20260d) {
                obj = "<supplier that returned " + this.f20262c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }

        public a(p<T> pVar) {
            this.f20261b = (p) l.m(pVar);
        }
    }

    public static <T> p<T> a(p<T> pVar) {
        if ((pVar instanceof a) || (pVar instanceof MemoizingSupplier)) {
            return pVar;
        }
        return pVar instanceof Serializable ? new MemoizingSupplier(pVar) : new a(pVar);
    }
}
