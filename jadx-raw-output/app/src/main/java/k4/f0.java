package k4;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: ProgressiveMediaSource.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends b implements e0.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f62462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f62463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q3.k f62464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a<?> f62465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e5.m f62466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final String f62467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f62468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Object f62469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f62470o = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f62471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f62472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public e5.q f62473r;

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f62474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public q3.k f62475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f62476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Object f62477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.google.android.exoplayer2.drm.a<?> f62478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e5.m f62479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f62480g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f62481h;

        public a(com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a) {
            this(interfaceC0188a, new q3.e());
        }

        public f0 a(Uri uri) {
            this.f62481h = true;
            return new f0(uri, this.f62474a, this.f62475b, this.f62478e, this.f62479f, this.f62476c, this.f62480g, this.f62477d);
        }

        public a(com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a, q3.k kVar) {
            this.f62474a = interfaceC0188a;
            this.f62475b = kVar;
            this.f62478e = com.google.android.exoplayer2.drm.a.a();
            this.f62479f = new com.google.android.exoplayer2.upstream.f();
            this.f62480g = 1048576;
        }
    }

    @Override // k4.r
    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    @Override // k4.r
    public void c(q qVar) {
        ((e0) qVar).N();
    }

    @Override // k4.r
    @Nullable
    public Object getTag() {
        return this.f62469n;
    }

    @Override // k4.r
    public q j(r.a aVar, e5.b bVar, long j10) {
        com.google.android.exoplayer2.upstream.a aVarCreateDataSource = this.f62463h.createDataSource();
        e5.q qVar = this.f62473r;
        if (qVar != null) {
            aVarCreateDataSource.b(qVar);
        }
        return new e0(this.f62462g, aVarCreateDataSource, this.f62464i.createExtractors(), this.f62465j, this.f62466k, n(aVar), this, bVar, this.f62467l, this.f62468m);
    }

    @Override // k4.b
    public void s(@Nullable e5.q qVar) {
        this.f62473r = qVar;
        this.f62465j.prepare();
        v(this.f62470o, this.f62471p, this.f62472q);
    }

    @Override // k4.b
    public void u() {
        this.f62465j.release();
    }

    public final void v(long j10, boolean z10, boolean z11) {
        this.f62470o = j10;
        this.f62471p = z10;
        this.f62472q = z11;
        t(new l0(this.f62470o, this.f62471p, false, this.f62472q, null, this.f62469n));
    }

    public f0(Uri uri, com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188a, q3.k kVar, com.google.android.exoplayer2.drm.a<?> aVar, e5.m mVar, @Nullable String str, int i10, @Nullable Object obj) {
        this.f62462g = uri;
        this.f62463h = interfaceC0188a;
        this.f62464i = kVar;
        this.f62465j = aVar;
        this.f62466k = mVar;
        this.f62467l = str;
        this.f62468m = i10;
        this.f62469n = obj;
    }

    @Override // k4.e0.c
    public void onSourceInfoRefreshed(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f62470o;
        }
        if (this.f62470o == j10 && this.f62471p == z10 && this.f62472q == z11) {
            return;
        }
        v(j10, z10, z11);
    }
}
