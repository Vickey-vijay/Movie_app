package yads;

import android.net.Uri;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class qb2 implements bg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f81793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r33 f81795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pb2 f81796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f81797f;

    public qb2(int i10, p30 p30Var, u30 u30Var, pb2 pb2Var) {
        this.f81795d = new r33(p30Var);
        this.f81793b = u30Var;
        this.f81794c = i10;
        this.f81796e = pb2Var;
        this.f81792a = vf1.a();
    }

    @Override // yads.bg1
    public final void b() {
    }

    @Override // yads.bg1
    public final void a() {
        this.f81795d.f82097b = 0L;
        r30 r30Var = new r30(this.f81795d, this.f81793b);
        try {
            r30Var.f82087a.a(r30Var.f82088b);
            r30Var.f82090d = true;
            Uri uri = this.f81795d.f82096a.getUri();
            uri.getClass();
            this.f81797f = this.f81796e.a(uri, r30Var);
        } finally {
            ib3.a((Closeable) r30Var);
        }
    }

    public qb2(p30 p30Var, Uri uri, int i10, pb2 pb2Var) {
        this(i10, p30Var, new t30().a(uri).a(1).a(), pb2Var);
    }
}
