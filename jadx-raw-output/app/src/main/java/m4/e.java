package m4;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import g5.t;
import java.io.IOException;
import q3.s;
import q3.u;

/* JADX INFO: compiled from: ChunkExtractorWrapper.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements q3.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3.g f64049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Format f64051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray<a> f64052e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f64054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f64055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f64056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Format[] f64057j;

    /* JADX INFO: compiled from: ChunkExtractorWrapper.java */
    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Format f64060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final q3.f f64061d = new q3.f();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Format f64062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public u f64063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f64064g;

        @Override // q3.u
        public void a(Format format) {
            Format format2 = this.f64060c;
            if (format2 != null) {
                format = format.i(format2);
            }
            this.f64062e = format;
            this.f64063f.a(format);
        }

        @Override // q3.u
        public int b(q3.h hVar, int i10, boolean z10) throws InterruptedException, IOException {
            return this.f64063f.b(hVar, i10, z10);
        }

        @Override // q3.u
        public void c(t tVar, int i10) {
            this.f64063f.c(tVar, i10);
        }

        @Override // q3.u
        public void d(long j10, int i10, int i11, int i12, u.a aVar) {
            long j11 = this.f64064g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f64063f = this.f64061d;
            }
            this.f64063f.d(j10, i10, i11, i12, aVar);
        }

        public void e(b bVar, long j10) {
            if (bVar == null) {
                this.f64063f = this.f64061d;
                return;
            }
            this.f64064g = j10;
            u uVarTrack = bVar.track(this.f64058a, this.f64059b);
            this.f64063f = uVarTrack;
            Format format = this.f64062e;
            if (format != null) {
                uVarTrack.a(format);
            }
        }

        public a(int i10, int i11, Format format) {
            this.f64058a = i10;
            this.f64059b = i11;
            this.f64060c = format;
        }
    }

    /* JADX INFO: compiled from: ChunkExtractorWrapper.java */
    public interface b {
        u track(int i10, int i11);
    }

    public Format[] a() {
        return this.f64057j;
    }

    public s b() {
        return this.f64056i;
    }

    public void c(@Nullable b bVar, long j10, long j11) {
        this.f64054g = bVar;
        this.f64055h = j11;
        if (!this.f64053f) {
            this.f64049b.c(this);
            if (j10 != -9223372036854775807L) {
                this.f64049b.seek(0L, j10);
            }
            this.f64053f = true;
            return;
        }
        q3.g gVar = this.f64049b;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        gVar.seek(0L, j10);
        for (int i10 = 0; i10 < this.f64052e.size(); i10++) {
            this.f64052e.valueAt(i10).e(bVar, j11);
        }
    }

    @Override // q3.i
    public void e(s sVar) {
        this.f64056i = sVar;
    }

    @Override // q3.i
    public void endTracks() {
        Format[] formatArr = new Format[this.f64052e.size()];
        for (int i10 = 0; i10 < this.f64052e.size(); i10++) {
            formatArr[i10] = this.f64052e.valueAt(i10).f64062e;
        }
        this.f64057j = formatArr;
    }

    @Override // q3.i
    public u track(int i10, int i11) {
        a aVar = this.f64052e.get(i10);
        if (aVar == null) {
            g5.a.f(this.f64057j == null);
            aVar = new a(i10, i11, i11 == this.f64050c ? this.f64051d : null);
            aVar.e(this.f64054g, this.f64055h);
            this.f64052e.put(i10, aVar);
        }
        return aVar;
    }

    public e(q3.g gVar, int i10, Format format) {
        this.f64049b = gVar;
        this.f64050c = i10;
        this.f64051d = format;
    }
}
