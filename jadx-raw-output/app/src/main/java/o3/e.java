package o3;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: DecoderInputBuffer.java */
/* JADX INFO: loaded from: classes10.dex */
public class e extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f64968b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ByteBuffer f64969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f64970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f64971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ByteBuffer f64972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f64973g;

    public static e f() {
        return new e(0);
    }

    public final ByteBuffer a(int i10) {
        int i11 = this.f64973g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f64969c;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + ")");
    }

    public void b(int i10) {
        ByteBuffer byteBuffer = this.f64969c;
        if (byteBuffer == null) {
            this.f64969c = a(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.f64969c.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            return;
        }
        ByteBuffer byteBufferA = a(i11);
        byteBufferA.order(this.f64969c.order());
        if (iPosition > 0) {
            this.f64969c.flip();
            byteBufferA.put(this.f64969c);
        }
        this.f64969c = byteBufferA;
    }

    public final void c() {
        this.f64969c.flip();
        ByteBuffer byteBuffer = this.f64972f;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
    }

    public final boolean d() {
        return getFlag(1073741824);
    }

    public final boolean e() {
        return this.f64969c == null && this.f64973g == 0;
    }

    public void g(int i10) {
        ByteBuffer byteBuffer = this.f64972f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f64972f = ByteBuffer.allocate(i10);
        } else {
            this.f64972f.clear();
        }
    }

    public e(int i10) {
        this.f64973g = i10;
    }

    @Override // o3.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f64969c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f64972f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f64970d = false;
    }
}
