package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends q {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18239f;

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.s
    public final void a(int i10, byte[] bArr) {
        System.arraycopy(this.f18259d, this.f18238e, bArr, 0, i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.s
    public final byte c(int i10) {
        int i11 = this.f18239f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f18259d[this.f18238e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.s
    public final byte d(int i10) {
        return this.f18259d[this.f18238e + i10];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q
    public final int g() {
        return this.f18238e;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.s
    public final int size() {
        return this.f18239f;
    }

    public n(byte[] bArr, int i10, int i11) {
        super(bArr);
        s.a(i10, i10 + i11, bArr.length);
        this.f18238e = i10;
        this.f18239f = i11;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = l1.f18233b;
        } else {
            byte[] bArr2 = new byte[size];
            a(size, bArr2);
            bArr = bArr2;
        }
        return new q(bArr);
    }
}
