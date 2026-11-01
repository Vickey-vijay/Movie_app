package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class BaseVector {

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    public ByteBuffer f3910bb;
    private int element_size;
    private int length;
    private int vector;

    public void reset() {
        __reset(0, 0, null);
    }

    public int __element(int i10) {
        return this.vector + (i10 * this.element_size);
    }

    public void __reset(int i10, int i11, ByteBuffer byteBuffer) {
        this.f3910bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i10;
            this.length = byteBuffer.getInt(i10 - 4);
            this.element_size = i11;
        } else {
            this.vector = 0;
            this.length = 0;
            this.element_size = 0;
        }
    }

    public int __vector() {
        return this.vector;
    }

    public int length() {
        return this.length;
    }
}
