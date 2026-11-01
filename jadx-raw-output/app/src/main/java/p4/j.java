package p4;

import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import java.io.IOException;
import k3.f0;
import k4.i0;

/* JADX INFO: compiled from: HlsSampleStream.java */
/* JADX INFO: loaded from: classes8.dex */
public final class j implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f65960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f65961d = -1;

    public void a() {
        g5.a.a(this.f65961d == -1);
        this.f65961d = this.f65960c.l(this.f65959b);
    }

    @Override // k4.i0
    public int b(f0 f0Var, o3.e eVar, boolean z10) {
        if (this.f65961d == -3) {
            eVar.addFlag(4);
            return -4;
        }
        if (c()) {
            return this.f65960c.M(this.f65961d, f0Var, eVar, z10);
        }
        return -3;
    }

    public final boolean c() {
        int i10 = this.f65961d;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void d() {
        if (this.f65961d != -1) {
            this.f65960c.X(this.f65959b);
            this.f65961d = -1;
        }
    }

    @Override // k4.i0
    public boolean isReady() {
        return this.f65961d == -3 || (c() && this.f65960c.A(this.f65961d));
    }

    @Override // k4.i0
    public void maybeThrowError() throws IOException {
        int i10 = this.f65961d;
        if (i10 == -2) {
            throw new SampleQueueMappingException(this.f65960c.getTrackGroups().a(this.f65959b).a(0).f18970j);
        }
        if (i10 == -1) {
            this.f65960c.D();
        } else if (i10 != -3) {
            this.f65960c.E(i10);
        }
    }

    public j(n nVar, int i10) {
        this.f65960c = nVar;
        this.f65959b = i10;
    }

    @Override // k4.i0
    public int skipData(long j10) {
        if (c()) {
            return this.f65960c.W(this.f65961d, j10);
        }
        return 0;
    }
}
