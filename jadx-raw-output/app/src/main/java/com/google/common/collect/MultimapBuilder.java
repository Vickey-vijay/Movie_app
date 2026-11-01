package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MultimapBuilder<K0, V0> {

    public static final class ArrayListSupplier<V> implements m5.p<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        @Override // m5.p
        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }

        public ArrayListSupplier(int i10) {
            this.expectedValuesPerKey = j1.b(i10, "expectedValuesPerKey");
        }
    }

    public static final class LinkedHashSetSupplier<V> implements m5.p<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        @Override // m5.p
        public Set<V> get() {
            return h2.e(this.expectedValuesPerKey);
        }

        public LinkedHashSetSupplier(int i10) {
            this.expectedValuesPerKey = j1.b(i10, "expectedValuesPerKey");
        }
    }

    public class a extends e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f20495a;

        public a(int i10) {
            this.f20495a = i10;
        }

        @Override // com.google.common.collect.MultimapBuilder.e
        public <K, V> Map<K, Collection<V>> c() {
            return h2.c(this.f20495a);
        }
    }

    public class b extends e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f20496a;

        public b(int i10) {
            this.f20496a = i10;
        }

        @Override // com.google.common.collect.MultimapBuilder.e
        public <K, V> Map<K, Collection<V>> c() {
            return h2.d(this.f20496a);
        }
    }

    public class c extends e<K0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f20497a;

        public c(Comparator comparator) {
            this.f20497a = comparator;
        }

        @Override // com.google.common.collect.MultimapBuilder.e
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f20497a);
        }
    }

    public static abstract class d<K0, V0> extends MultimapBuilder<K0, V0> {
        public d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> z1<K, V> g();
    }

    public static abstract class e<K0> {

        public class a extends d<K0, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f20498a;

            public a(int i10) {
                this.f20498a = i10;
            }

            @Override // com.google.common.collect.MultimapBuilder.d
            public <K extends K0, V> z1<K, V> g() {
                return Multimaps.b(e.this.c(), new ArrayListSupplier(this.f20498a));
            }
        }

        public class b extends f<K0, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f20500a;

            public b(int i10) {
                this.f20500a = i10;
            }

            @Override // com.google.common.collect.MultimapBuilder.f
            public <K extends K0, V> k2<K, V> g() {
                return Multimaps.c(e.this.c(), new LinkedHashSetSupplier(this.f20500a));
            }
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> c();

        public f<K0, Object> d() {
            return e(2);
        }

        public d<K0, Object> b(int i10) {
            j1.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        public f<K0, Object> e(int i10) {
            j1.b(i10, "expectedValuesPerKey");
            return new b(i10);
        }
    }

    public static abstract class f<K0, V0> extends MultimapBuilder<K0, V0> {
        public f() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> k2<K, V> g();
    }

    public MultimapBuilder() {
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i10) {
        j1.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e<Object> c() {
        return d(8);
    }

    public static e<Object> d(int i10) {
        j1.b(i10, "expectedKeys");
        return new b(i10);
    }

    public /* synthetic */ MultimapBuilder(a aVar) {
        this();
    }

    public static e<Comparable> e() {
        return f(Ordering.natural());
    }

    public static <K0> e<K0> f(Comparator<K0> comparator) {
        m5.l.m(comparator);
        return new c(comparator);
    }
}
