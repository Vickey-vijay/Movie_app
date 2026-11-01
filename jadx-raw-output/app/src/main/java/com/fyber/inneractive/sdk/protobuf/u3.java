package com.fyber.inneractive.sdk.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes9.dex */
public final class u3 extends w3 {
    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, byte b10) {
        if (x3.f18345h) {
            x3.a(obj, j10, b10);
        } else {
            x3.b(obj, j10, b10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(Object obj, long j10) {
        return x3.f18345h ? x3.a(obj, j10) : x3.b(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(Object obj, long j10) {
        return Double.longBitsToDouble(this.f18326a.getLong(obj, j10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f18326a.getInt(obj, j10));
    }

    public u3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(Object obj, long j10) {
        if (x3.f18345h) {
            return x3.a(obj, j10) != 0;
        }
        return x3.b(obj, j10) != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, boolean z10) {
        if (x3.f18345h) {
            x3.a(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            x3.b(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, float f10) {
        this.f18326a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, double d10) {
        this.f18326a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j10, byte[] bArr, long j11) {
        throw new UnsupportedOperationException();
    }
}
