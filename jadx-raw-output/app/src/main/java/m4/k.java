package m4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import e5.o;
import g5.k0;
import java.io.IOException;
import q3.r;

/* JADX INFO: compiled from: InitializationChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r f64103m = new r();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f64104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e.b f64105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f64106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f64107l;

    public k(com.google.android.exoplayer2.upstream.a aVar, e5.h hVar, Format format, int i10, @Nullable Object obj, e eVar) {
        super(aVar, hVar, 2, format, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f64104i = eVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void cancelLoad() {
        this.f64107l = true;
    }

    public void e(e.b bVar) {
        this.f64105j = bVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void load() throws InterruptedException, IOException {
        if (this.f64106k == 0) {
            this.f64104i.c(this.f64105j, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            e5.h hVarE = this.f64041a.e(this.f64106k);
            o oVar = this.f64048h;
            q3.d dVar = new q3.d(oVar, hVarE.f52378e, oVar.a(hVarE));
            try {
                q3.g gVar = this.f64104i.f64049b;
                int iA = 0;
                while (iA == 0 && !this.f64107l) {
                    iA = gVar.a(dVar, f64103m);
                }
                g5.a.f(iA != 1);
                this.f64106k = dVar.getPosition() - this.f64041a.f52378e;
                k0.m(this.f64048h);
            } catch (Throwable th2) {
                this.f64106k = dVar.getPosition() - this.f64041a.f52378e;
                throw th2;
            }
        } catch (Throwable th3) {
            k0.m(this.f64048h);
            throw th3;
        }
    }
}
