package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f16363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f16365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f16366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f16367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16368i;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        boolean z10 = !Arrays.equals(this.f16363d, this.f16365f);
        int[] iArr = this.f16363d;
        this.f16365f = iArr;
        if (iArr == null) {
            this.f16364e = false;
            return z10;
        }
        if (i12 != 2) {
            throw new b(i10, i11, i12);
        }
        if (!z10 && this.f16362c == i10 && this.f16361b == i11) {
            return false;
        }
        this.f16362c = i10;
        this.f16361b = i11;
        this.f16364e = i11 != iArr.length;
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.f16365f;
            if (i13 >= iArr2.length) {
                return true;
            }
            int i14 = iArr2[i13];
            if (i14 >= i11) {
                throw new b(i10, i11, i12);
            }
            this.f16364e = (i14 != i13) | this.f16364e;
            i13++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.f16368i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.f16368i && this.f16367h == c.f16297a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return this.f16364e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        int[] iArr = this.f16365f;
        return iArr == null ? this.f16361b : iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        ByteBuffer byteBuffer = c.f16297a;
        this.f16367h = byteBuffer;
        this.f16368i = false;
        this.f16366g = byteBuffer;
        this.f16361b = -1;
        this.f16362c = -1;
        this.f16365f = null;
        this.f16364e = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.f16367h = c.f16297a;
        this.f16368i = false;
    }

    public s() {
        ByteBuffer byteBuffer = c.f16297a;
        this.f16366g = byteBuffer;
        this.f16367h = byteBuffer;
        this.f16361b = -1;
        this.f16362c = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.f16361b * 2)) * this.f16365f.length * 2;
        if (this.f16366g.capacity() < length) {
            this.f16366g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f16366g.clear();
        }
        while (iPosition < iLimit) {
            for (int i10 : this.f16365f) {
                this.f16366g.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f16361b * 2;
        }
        byteBuffer.position(iLimit);
        this.f16366g.flip();
        this.f16367h = this.f16366g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f16367h;
        this.f16367h = c.f16297a;
        return byteBuffer;
    }
}
