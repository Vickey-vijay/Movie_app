package kl;

import java.util.Comparator;

/* JADX INFO: compiled from: IDanmakus.java */
/* JADX INFO: loaded from: classes11.dex */
public interface k {

    /* JADX INFO: compiled from: IDanmakus.java */
    public static class a implements Comparator<kl.c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f62927b;

        /* JADX INFO: renamed from: a */
        public int compare(kl.c cVar, kl.c cVar2) {
            if (this.f62927b && ql.a.g(cVar, cVar2)) {
                return 0;
            }
            return ql.a.d(cVar, cVar2);
        }

        public void b(boolean z10) {
            this.f62927b = z10;
        }

        public a(boolean z10) {
            b(z10);
        }
    }

    /* JADX INFO: compiled from: IDanmakus.java */
    public static abstract class b<Progress, Result> {
        public abstract int a(Progress progress);

        public void b() {
        }

        public void c() {
        }

        public Result d() {
            return null;
        }
    }

    /* JADX INFO: compiled from: IDanmakus.java */
    public static abstract class c<Progress> extends b<Progress, Void> {
    }

    /* JADX INFO: compiled from: IDanmakus.java */
    public static class e extends a {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a */
        public int compare(kl.c cVar, kl.c cVar2) {
            if (this.f62927b && ql.a.g(cVar, cVar2)) {
                return 0;
            }
            return Float.compare(cVar.l(), cVar2.l());
        }

        public e(boolean z10) {
            super(z10);
        }
    }

    /* JADX INFO: compiled from: IDanmakus.java */
    public static class f extends a {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a */
        public int compare(kl.c cVar, kl.c cVar2) {
            if (this.f62927b && ql.a.g(cVar, cVar2)) {
                return 0;
            }
            return Float.compare(cVar2.l(), cVar.l());
        }

        public f(boolean z10) {
            super(z10);
        }
    }

    boolean a(kl.c cVar);

    k b(long j10, long j11);

    void c(b<? super kl.c, ?> bVar);

    void clear();

    boolean d(kl.c cVar);

    k e(long j10, long j11);

    void f(b<? super kl.c, ?> bVar);

    kl.c first();

    boolean g(kl.c cVar);

    boolean isEmpty();

    kl.c last();

    int size();

    /* JADX INFO: compiled from: IDanmakus.java */
    public static class d extends a {
        public d(boolean z10) {
            super(z10);
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(kl.c cVar, kl.c cVar2) {
            return super.compare(cVar, cVar2);
        }
    }
}
