package com.explorestack.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
abstract class AllocatedBuffer {
    public static AllocatedBuffer wrap(byte[] bArr) {
        return wrapNoCheck(bArr, 0, bArr.length);
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    public abstract AllocatedBuffer position(int i10);

    public abstract int remaining();

    public static AllocatedBuffer wrap(byte[] bArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        return wrapNoCheck(bArr, i10, i11);
    }

    private static AllocatedBuffer wrapNoCheck(final byte[] bArr, final int i10, final int i11) {
        return new AllocatedBuffer() { // from class: com.explorestack.protobuf.AllocatedBuffer.2
            private int position;

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return true;
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return false;
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public int position() {
                return this.position;
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public byte[] array() {
                return bArr;
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return i10;
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public int limit() {
                return i11;
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                throw new UnsupportedOperationException();
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public AllocatedBuffer position(int i12) {
                if (i12 >= 0 && i12 <= i11) {
                    this.position = i12;
                    return this;
                }
                throw new IllegalArgumentException("Invalid position: " + i12);
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public int remaining() {
                return i11 - this.position;
            }
        };
    }

    public static AllocatedBuffer wrap(final ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        return new AllocatedBuffer() { // from class: com.explorestack.protobuf.AllocatedBuffer.1
            @Override // com.explorestack.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return true;
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public int position() {
                return byteBuffer.position();
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public byte[] array() {
                return byteBuffer.array();
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return byteBuffer.arrayOffset();
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return byteBuffer.hasArray();
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public int limit() {
                return byteBuffer.limit();
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                return byteBuffer;
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public AllocatedBuffer position(int i10) {
                byteBuffer.position(i10);
                return this;
            }

            @Override // com.explorestack.protobuf.AllocatedBuffer
            public int remaining() {
                return byteBuffer.remaining();
            }
        };
    }
}
