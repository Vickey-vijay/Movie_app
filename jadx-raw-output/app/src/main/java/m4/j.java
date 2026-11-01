package m4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import g5.k0;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: DataChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f64101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f64102j;

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void cancelLoad() {
        this.f64102j = true;
    }

    public abstract void e(byte[] bArr, int i10) throws IOException;

    public byte[] f() {
        return this.f64101i;
    }

    public final void g(int i10) {
        byte[] bArr = this.f64101i;
        if (bArr == null) {
            this.f64101i = new byte[16384];
        } else if (bArr.length < i10 + 16384) {
            this.f64101i = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() throws InterruptedException, IOException {
        try {
            this.f64048h.a(this.f64041a);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f64102j) {
                g(i11);
                i10 = this.f64048h.read(this.f64101i, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f64102j) {
                e(this.f64101i, i11);
            }
        } finally {
            k0.m(this.f64048h);
        }
    }

    public j(com.google.android.exoplayer2.upstream.a aVar, e5.h hVar, int i10, Format format, int i11, @Nullable Object obj, byte[] bArr) {
        super(aVar, hVar, i10, format, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f64101i = bArr;
    }
}
