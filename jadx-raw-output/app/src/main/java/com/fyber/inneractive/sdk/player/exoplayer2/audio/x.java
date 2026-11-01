package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f16405d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f16408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ShortBuffer f16409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ByteBuffer f16410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16413l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16406e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16407f = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16403b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16404c = -1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        if (i12 != 2) {
            throw new b(i10, i11, i12);
        }
        if (this.f16404c == i10 && this.f16403b == i11) {
            return false;
        }
        this.f16404c = i10;
        this.f16403b = i11;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        this.f16405d = null;
        ByteBuffer byteBuffer = c.f16297a;
        this.f16408g = byteBuffer;
        this.f16409h = byteBuffer.asShortBuffer();
        this.f16410i = byteBuffer;
        this.f16403b = -1;
        this.f16404c = -1;
        this.f16411j = 0L;
        this.f16412k = 0L;
        this.f16413l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        int i10;
        w wVar = this.f16405d;
        int i11 = wVar.f16395q;
        float f10 = wVar.f16393o;
        float f11 = wVar.f16394p;
        int i12 = wVar.f16396r + ((int) ((((i11 / (f10 / f11)) + wVar.f16397s) / f11) + 0.5f));
        wVar.a((wVar.f16383e * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = wVar.f16383e * 2;
            int i14 = wVar.f16380b;
            if (i13 >= i10 * i14) {
                break;
            }
            wVar.f16386h[(i14 * i11) + i13] = 0;
            i13++;
        }
        wVar.f16395q = i10 + wVar.f16395q;
        wVar.a();
        if (wVar.f16396r > i12) {
            wVar.f16396r = i12;
        }
        wVar.f16395q = 0;
        wVar.f16398t = 0;
        wVar.f16397s = 0;
        this.f16413l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        w wVar;
        return this.f16413l && ((wVar = this.f16405d) == null || wVar.f16396r == 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return Math.abs(this.f16406e - 1.0f) >= 0.01f || Math.abs(this.f16407f - 1.0f) >= 0.01f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.f16403b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        w wVar = new w(this.f16404c, this.f16403b);
        this.f16405d = wVar;
        wVar.f16393o = this.f16406e;
        wVar.f16394p = this.f16407f;
        this.f16410i = c.f16297a;
        this.f16411j = 0L;
        this.f16412k = 0L;
        this.f16413l = false;
    }

    public x() {
        ByteBuffer byteBuffer = c.f16297a;
        this.f16408g = byteBuffer;
        this.f16409h = byteBuffer.asShortBuffer();
        this.f16410i = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f16411j += (long) iRemaining;
            w wVar = this.f16405d;
            wVar.getClass();
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = wVar.f16380b;
            int i11 = iRemaining2 / i10;
            wVar.a(i11);
            shortBufferAsShortBuffer.get(wVar.f16386h, wVar.f16395q * wVar.f16380b, ((i10 * i11) * 2) / 2);
            wVar.f16395q += i11;
            wVar.a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i12 = this.f16405d.f16396r * this.f16403b * 2;
        if (i12 > 0) {
            if (this.f16408g.capacity() < i12) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                this.f16408g = byteBufferOrder;
                this.f16409h = byteBufferOrder.asShortBuffer();
            } else {
                this.f16408g.clear();
                this.f16409h.clear();
            }
            w wVar2 = this.f16405d;
            ShortBuffer shortBuffer = this.f16409h;
            wVar2.getClass();
            int iMin = Math.min(shortBuffer.remaining() / wVar2.f16380b, wVar2.f16396r);
            shortBuffer.put(wVar2.f16388j, 0, wVar2.f16380b * iMin);
            int i13 = wVar2.f16396r - iMin;
            wVar2.f16396r = i13;
            short[] sArr = wVar2.f16388j;
            int i14 = wVar2.f16380b;
            System.arraycopy(sArr, iMin * i14, sArr, 0, i13 * i14);
            this.f16412k += (long) i12;
            this.f16408g.limit(i12);
            this.f16410i = this.f16408g;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f16410i;
        this.f16410i = c.f16297a;
        return byteBuffer;
    }
}
