package com.ironsource;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C3483g7 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.ironsource.g7$a */
    public static final class a<T> implements fk.d<Object, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<T> f28986a;

        public final WeakReference<T> a() {
            return this.f28986a;
        }

        public final void a(WeakReference<T> weakReference) {
            ck.p.j(weakReference, "<set-?>");
            this.f28986a = weakReference;
        }

        @Override // fk.d
        public T getValue(Object obj, jk.k<?> kVar) {
            ck.p.j(obj, "thisRef");
            ck.p.j(kVar, "property");
            return this.f28986a.get();
        }

        @Override // fk.d
        public void setValue(Object obj, jk.k<?> kVar, T t10) {
            ck.p.j(obj, "thisRef");
            ck.p.j(kVar, "property");
            this.f28986a = new WeakReference<>(t10);
        }

        public a(T t10) {
            this.f28986a = new WeakReference<>(t10);
        }
    }

    public static /* synthetic */ fk.d a(Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final <T> fk.d<Object, T> a(T t10) {
        return new a(t10);
    }
}
