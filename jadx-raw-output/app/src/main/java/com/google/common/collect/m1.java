package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.util.Comparator;

/* JADX INFO: compiled from: ComparisonChain.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f20624a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f20625b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m1 f20626c = new b(1);

    /* JADX INFO: compiled from: ComparisonChain.java */
    public class a extends m1 {
        public a() {
            super(null);
        }

        @Override // com.google.common.collect.m1
        public int j() {
            return 0;
        }

        public m1 l(int i10) {
            if (i10 < 0) {
                return m1.f20625b;
            }
            return i10 > 0 ? m1.f20626c : m1.f20624a;
        }

        @Override // com.google.common.collect.m1
        public m1 d(int i10, int i11) {
            return l(Ints.e(i10, i11));
        }

        @Override // com.google.common.collect.m1
        public m1 e(long j10, long j11) {
            return l(p5.f.a(j10, j11));
        }

        @Override // com.google.common.collect.m1
        public m1 f(Comparable<?> comparable, Comparable<?> comparable2) {
            return l(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.m1
        public <T> m1 g(T t10, T t11, Comparator<T> comparator) {
            return l(comparator.compare(t10, t11));
        }

        @Override // com.google.common.collect.m1
        public m1 h(boolean z10, boolean z11) {
            return l(p5.a.a(z10, z11));
        }

        @Override // com.google.common.collect.m1
        public m1 i(boolean z10, boolean z11) {
            return l(p5.a.a(z11, z10));
        }
    }

    /* JADX INFO: compiled from: ComparisonChain.java */
    public static final class b extends m1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20627d;

        public b(int i10) {
            super(null);
            this.f20627d = i10;
        }

        @Override // com.google.common.collect.m1
        public m1 d(int i10, int i11) {
            return this;
        }

        @Override // com.google.common.collect.m1
        public m1 e(long j10, long j11) {
            return this;
        }

        @Override // com.google.common.collect.m1
        public m1 f(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.m1
        public <T> m1 g(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.m1
        public m1 h(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.m1
        public m1 i(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.m1
        public int j() {
            return this.f20627d;
        }
    }

    public m1() {
    }

    public abstract m1 d(int i10, int i11);

    public abstract m1 e(long j10, long j11);

    public abstract m1 f(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> m1 g(T t10, T t11, Comparator<T> comparator);

    public abstract m1 h(boolean z10, boolean z11);

    public abstract m1 i(boolean z10, boolean z11);

    public abstract int j();

    public static m1 k() {
        return f20624a;
    }

    public /* synthetic */ m1(a aVar) {
        this();
    }
}
