package k4;

import android.net.Uri;
import androidx.annotation.Nullable;
import k3.v0;

/* JADX INFO: compiled from: ExtractorMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class l extends e<Void> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f0 f62554j;

    /* JADX INFO: compiled from: ExtractorMediaSource.java */
    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f62555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public q3.k f62556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f62557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Object f62558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e5.m f62559e = new com.google.android.exoplayer2.upstream.f();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f62560f = 1048576;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f62561g;

        public l a(Uri uri) {
            this.f62561g = true;
            if (this.f62556b == null) {
                this.f62556b = new q3.e();
            }
            return new l(uri, this.f62555a, this.f62556b, this.f62559e, this.f62557c, this.f62560f, this.f62558d);
        }

        public b b(String str) {
            g5.a.f(!this.f62561g);
            this.f62557c = str;
            return this;
        }

        public b c(q3.k kVar) {
            g5.a.f(!this.f62561g);
            this.f62556b = kVar;
            return this;
        }

        public b d(e5.m mVar) {
            g5.a.f(!this.f62561g);
            this.f62559e = mVar;
            return this;
        }

        @Deprecated
        public b e(int i10) {
            return d(new com.google.android.exoplayer2.upstream.f(i10));
        }

        public b(com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a) {
            this.f62555a = interfaceC0188a;
        }
    }

    public l(Uri uri, com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a, q3.k kVar, e5.m mVar, @Nullable String str, int i10, @Nullable Object obj) {
        this.f62554j = new f0(uri, interfaceC0188a, kVar, com.google.android.exoplayer2.drm.a.a(), mVar, str, i10, obj);
    }

    @Override // k4.r
    public void c(q qVar) {
        this.f62554j.c(qVar);
    }

    @Override // k4.r
    @Nullable
    public Object getTag() {
        return this.f62554j.getTag();
    }

    @Override // k4.r
    public q j(r.a aVar, e5.b bVar, long j10) {
        return this.f62554j.j(aVar, bVar, j10);
    }

    @Override // k4.e
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void B(@Nullable Void r10, r rVar, v0 v0Var) {
        t(v0Var);
    }

    @Override // k4.e, k4.b
    public void s(@Nullable e5.q qVar) {
        super.s(qVar);
        D(null, this.f62554j);
    }
}
