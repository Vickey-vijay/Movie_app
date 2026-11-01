package m4;

import com.google.android.exoplayer2.Format;
import e5.o;
import g5.k0;
import java.io.IOException;
import q3.r;

/* JADX INFO: compiled from: ContainerMediaChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f64094t = new r();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f64095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f64096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f64097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f64098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f64099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f64100s;

    public i(com.google.android.exoplayer2.upstream.a aVar, e5.h hVar, Format format, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, e eVar) {
        super(aVar, hVar, format, i10, obj, j10, j11, j12, j13, j14);
        this.f64095n = i11;
        this.f64096o = j15;
        this.f64097p = eVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void cancelLoad() {
        this.f64099r = true;
    }

    public e.b j(c cVar) {
        return cVar;
    }

    @Override // m4.l
    public long e() {
        return this.f64108i + ((long) this.f64095n);
    }

    @Override // m4.l
    public boolean f() {
        return this.f64100s;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() throws InterruptedException, IOException {
        if (this.f64098q == 0) {
            c cVarH = h();
            cVarH.b(this.f64096o);
            e eVar = this.f64097p;
            e.b bVarJ = j(cVarH);
            long j10 = this.f64032j;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f64096o;
            long j12 = this.f64033k;
            eVar.c(bVarJ, j11, j12 == -9223372036854775807L ? -9223372036854775807L : j12 - this.f64096o);
        }
        try {
            e5.h hVarE = this.f64041a.e(this.f64098q);
            o oVar = this.f64048h;
            q3.d dVar = new q3.d(oVar, hVarE.f52378e, oVar.a(hVarE));
            try {
                q3.g gVar = this.f64097p.f64049b;
                int iA = 0;
                while (iA == 0 && !this.f64099r) {
                    iA = gVar.a(dVar, f64094t);
                }
                g5.a.f(iA != 1);
                this.f64098q = dVar.getPosition() - this.f64041a.f52378e;
                k0.m(this.f64048h);
                this.f64100s = true;
            } catch (Throwable th2) {
                this.f64098q = dVar.getPosition() - this.f64041a.f52378e;
                throw th2;
            }
        } catch (Throwable th3) {
            k0.m(this.f64048h);
            throw th3;
        }
    }
}
