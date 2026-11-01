package com.ironsource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface H5<T> {

    public static final class a<T> implements H5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<T> f26706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<T> f26707b;

        public a(ArrayList<T> arrayList, ArrayList<T> arrayList2) {
            ck.p.j(arrayList, "a");
            ck.p.j(arrayList2, "b");
            this.f26706a = arrayList;
            this.f26707b = arrayList2;
        }

        @Override // com.ironsource.H5
        public boolean contains(T t10) {
            return this.f26706a.contains(t10) || this.f26707b.contains(t10);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.f26706a.size() + this.f26707b.size();
        }

        @Override // com.ironsource.H5
        public List<T> value() {
            return nj.b0.y0(this.f26706a, this.f26707b);
        }
    }

    public static final class b<T> implements H5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final H5<T> f26708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Comparator<T> f26709b;

        public b(H5<T> h10, Comparator<T> comparator) {
            ck.p.j(h10, "collection");
            ck.p.j(comparator, "comparator");
            this.f26708a = h10;
            this.f26709b = comparator;
        }

        @Override // com.ironsource.H5
        public boolean contains(T t10) {
            return this.f26708a.contains(t10);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.f26708a.size();
        }

        @Override // com.ironsource.H5
        public List<T> value() {
            return nj.b0.H0(this.f26708a.value(), this.f26709b);
        }
    }

    public static final class c<T> implements H5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<T> f26711b;

        public c(H5<T> h10, int i10) {
            ck.p.j(h10, "collection");
            this.f26710a = i10;
            this.f26711b = h10.value();
        }

        public final List<T> a() {
            int size = this.f26711b.size();
            int i10 = this.f26710a;
            if (size <= i10) {
                return nj.s.k();
            }
            List<T> list = this.f26711b;
            return list.subList(i10, list.size());
        }

        public final List<T> b() {
            List<T> list = this.f26711b;
            return list.subList(0, ik.k.g(list.size(), this.f26710a));
        }

        @Override // com.ironsource.H5
        public boolean contains(T t10) {
            return this.f26711b.contains(t10);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.f26711b.size();
        }

        @Override // com.ironsource.H5
        public List<T> value() {
            return this.f26711b;
        }
    }

    boolean contains(T t10);

    int size();

    List<T> value();
}
