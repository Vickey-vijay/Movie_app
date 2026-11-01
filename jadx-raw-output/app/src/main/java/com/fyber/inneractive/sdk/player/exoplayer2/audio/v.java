package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16373b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16374c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16375d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f16376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f16377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16378g;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        if (i12 != 3 && i12 != 2 && i12 != Integer.MIN_VALUE && i12 != 1073741824) {
            throw new b(i10, i11, i12);
        }
        if (this.f16373b == i10 && this.f16374c == i11 && this.f16375d == i12) {
            return false;
        }
        this.f16373b = i10;
        this.f16374c = i11;
        this.f16375d = i12;
        if (i12 != 2) {
            return true;
        }
        this.f16376e = c.f16297a;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.f16378g = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.f16378g && this.f16377f == c.f16297a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        int i10 = this.f16375d;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.f16374c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        ByteBuffer byteBuffer = c.f16297a;
        this.f16377f = byteBuffer;
        this.f16378g = false;
        this.f16376e = byteBuffer;
        this.f16373b = -1;
        this.f16374c = -1;
        this.f16375d = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.f16377f = c.f16297a;
        this.f16378g = false;
    }

    public v() {
        ByteBuffer byteBuffer = c.f16297a;
        this.f16376e = byteBuffer;
        this.f16377f = byteBuffer;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[ADDED_TO_REGION, LOOP:0: B:19:0x0047->B:20:0x0049, LOOP_START, PHI: r0
  0x0047: PHI (r0v6 int) = (r0v0 int), (r0v7 int) binds: [B:18:0x0045, B:20:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049 A[LOOP:0: B:19:0x0047->B:20:0x0049, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[ADDED_TO_REGION, LOOP:1: B:23:0x0068->B:24:0x006a, LOOP_START, PHI: r0
  0x0068: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:17:0x0043, B:24:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:23:0x0068->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0081 A[ADDED_TO_REGION, LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_START, PHI: r0
  0x0081: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0041, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0083 A[LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_END] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        int i13 = this.f16375d;
        if (i13 == Integer.MIN_VALUE) {
            i12 /= 3;
        } else {
            if (i13 != 3) {
                if (i13 == 1073741824) {
                    i10 = i12 / 2;
                } else {
                    throw new IllegalStateException();
                }
            }
            if (this.f16376e.capacity() < i10) {
                this.f16376e = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
            } else {
                this.f16376e.clear();
            }
            i11 = this.f16375d;
            if (i11 != Integer.MIN_VALUE) {
                while (iPosition < iLimit) {
                    this.f16376e.put(byteBuffer.get(iPosition + 1));
                    this.f16376e.put(byteBuffer.get(iPosition + 2));
                    iPosition += 3;
                }
            } else if (i11 != 3) {
                while (iPosition < iLimit) {
                    this.f16376e.put((byte) 0);
                    this.f16376e.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                    iPosition++;
                }
            } else {
                if (i11 == 1073741824) {
                    throw new IllegalStateException();
                }
                while (iPosition < iLimit) {
                    this.f16376e.put(byteBuffer.get(iPosition + 2));
                    this.f16376e.put(byteBuffer.get(iPosition + 3));
                    iPosition += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.f16376e.flip();
            this.f16377f = this.f16376e;
        }
        i10 = i12 * 2;
        if (this.f16376e.capacity() < i10) {
            this.f16376e = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f16376e.clear();
        }
        i11 = this.f16375d;
        if (i11 != Integer.MIN_VALUE) {
            while (iPosition < iLimit) {
                this.f16376e.put(byteBuffer.get(iPosition + 1));
                this.f16376e.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i11 != 3) {
            while (iPosition < iLimit) {
                this.f16376e.put((byte) 0);
                this.f16376e.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else {
            if (i11 == 1073741824) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                this.f16376e.put(byteBuffer.get(iPosition + 2));
                this.f16376e.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f16376e.flip();
        this.f16377f = this.f16376e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f16377f;
        this.f16377f = c.f16297a;
        return byteBuffer;
    }
}
