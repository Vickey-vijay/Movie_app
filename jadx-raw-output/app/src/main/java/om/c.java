package om;

import java.nio.ByteBuffer;
import mm.h;

/* JADX INFO: compiled from: IndirectNIOBuffer.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends h implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ByteBuffer f65430p;

    public c(int i10) {
        super(i10, 2, false);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f64608n);
        this.f65430p = byteBufferWrap;
        byteBufferWrap.position(0);
        byteBufferWrap.limit(byteBufferWrap.capacity());
    }

    @Override // om.d
    public ByteBuffer Z() {
        return this.f65430p;
    }

    public c(ByteBuffer byteBuffer, boolean z10) {
        super(byteBuffer.array(), 0, 0, z10 ? 0 : 2, false);
        if (!byteBuffer.isDirect()) {
            this.f65430p = byteBuffer;
            this.f64585d = byteBuffer.position();
            this.f64586e = byteBuffer.limit();
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            return;
        }
        throw new IllegalArgumentException();
    }
}
