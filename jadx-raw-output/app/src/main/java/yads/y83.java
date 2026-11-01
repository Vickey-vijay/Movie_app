package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class y83 extends Cdo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f84848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f84849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f84850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f84851m = ib3.f78561f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f84852n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f84853o;

    @Override // yads.Cdo, yads.bl
    public final ByteBuffer a() {
        int i10;
        if (super.isEnded() && (i10 = this.f84852n) > 0) {
            a(i10).put(this.f84851m, 0, this.f84852n).flip();
            this.f84852n = 0;
        }
        ByteBuffer byteBuffer = this.f76745g;
        this.f76745g = bl.f75859a;
        return byteBuffer;
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        if (zkVar.f85462c != 2) {
            throw new al(zkVar);
        }
        this.f84849k = true;
        return (this.f84847i == 0 && this.f84848j == 0) ? zk.f85459e : zkVar;
    }

    @Override // yads.Cdo
    public final void c() {
        if (this.f84849k) {
            this.f84849k = false;
            int i10 = this.f84848j;
            int i11 = this.f76740b.f85463d;
            this.f84851m = new byte[i10 * i11];
            this.f84850l = this.f84847i * i11;
        }
        this.f84852n = 0;
    }

    @Override // yads.Cdo
    public final void d() {
        if (this.f84849k) {
            int i10 = this.f84852n;
            if (i10 > 0) {
                this.f84853o += (long) (i10 / this.f76740b.f85463d);
            }
            this.f84852n = 0;
        }
    }

    @Override // yads.Cdo
    public final void e() {
        this.f84851m = ib3.f78561f;
    }

    @Override // yads.Cdo, yads.bl
    public final boolean isEnded() {
        if (super.isEnded() && this.f84852n == 0) {
            return true;
        }
        return false;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f84850l);
        this.f84853o += (long) (iMin / this.f76740b.f85463d);
        this.f84850l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f84850l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f84852n + i11) - this.f84851m.length;
        ByteBuffer byteBufferA = a(length);
        int i12 = this.f84852n;
        int i13 = ib3.f78556a;
        int iMax = Math.max(0, Math.min(length, i12));
        byteBufferA.put(this.f84851m, 0, iMax);
        int iMax2 = Math.max(0, Math.min(length - iMax, i11));
        byteBuffer.limit(byteBuffer.position() + iMax2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i14 = i11 - iMax2;
        int i15 = this.f84852n - iMax;
        this.f84852n = i15;
        byte[] bArr = this.f84851m;
        System.arraycopy(bArr, iMax, bArr, 0, i15);
        byteBuffer.get(this.f84851m, this.f84852n, i14);
        this.f84852n += i14;
        byteBufferA.flip();
    }
}
