package e5;

import androidx.annotation.Nullable;
import g5.k0;
import java.util.ArrayList;

/* JADX INFO: compiled from: BaseDataSource.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d implements com.google.android.exoplayer2.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f52360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<q> f52361b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public h f52363d;

    public final void e(h hVar) {
        for (int i10 = 0; i10 < this.f52362c; i10++) {
            this.f52361b.get(i10).d(this, hVar, this.f52360a);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final void b(q qVar) {
        if (this.f52361b.contains(qVar)) {
            return;
        }
        this.f52361b.add(qVar);
        this.f52362c++;
    }

    public final void c(int i10) {
        h hVar = (h) k0.i(this.f52363d);
        for (int i11 = 0; i11 < this.f52362c; i11++) {
            this.f52361b.get(i11).a(this, hVar, this.f52360a, i10);
        }
    }

    public final void d() {
        h hVar = (h) k0.i(this.f52363d);
        for (int i10 = 0; i10 < this.f52362c; i10++) {
            this.f52361b.get(i10).f(this, hVar, this.f52360a);
        }
        this.f52363d = null;
    }

    public final void f(h hVar) {
        this.f52363d = hVar;
        for (int i10 = 0; i10 < this.f52362c; i10++) {
            this.f52361b.get(i10).c(this, hVar, this.f52360a);
        }
    }

    public d(boolean z10) {
        this.f52360a = z10;
    }
}
