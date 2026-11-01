package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class ty2 extends Cdo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f83242i = 150000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f83243j = 20000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f83244k = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f83245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f83246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f83247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f83248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f83249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f83250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f83251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f83252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f83253t;

    @Override // yads.Cdo
    public final void e() {
        this.f83246m = false;
        this.f83251r = 0;
        byte[] bArr = ib3.f78561f;
        this.f83247n = bArr;
        this.f83248o = bArr;
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        if (zkVar.f85462c == 2) {
            return this.f83246m ? zkVar : zk.f85459e;
        }
        throw new al(zkVar);
    }

    @Override // yads.Cdo
    public final void c() {
        if (this.f83246m) {
            zk zkVar = this.f76740b;
            int i10 = zkVar.f85463d;
            this.f83245l = i10;
            long j10 = this.f83242i;
            long j11 = zkVar.f85460a;
            int i11 = ((int) ((j10 * j11) / 1000000)) * i10;
            if (this.f83247n.length != i11) {
                this.f83247n = new byte[i11];
            }
            int i12 = ((int) ((this.f83243j * j11) / 1000000)) * i10;
            this.f83251r = i12;
            if (this.f83248o.length != i12) {
                this.f83248o = new byte[i12];
            }
        }
        this.f83249p = 0;
        this.f83253t = 0L;
        this.f83250q = 0;
        this.f83252s = false;
    }

    @Override // yads.Cdo
    public final void d() {
        int i10 = this.f83250q;
        if (i10 > 0) {
            a(i10).put(this.f83247n, 0, i10).flip();
            if (i10 > 0) {
                this.f83252s = true;
            }
        }
        if (this.f83252s) {
            return;
        }
        this.f83253t += (long) (this.f83251r / this.f83245l);
    }

    @Override // yads.Cdo, yads.bl
    public final boolean isActive() {
        return this.f83246m;
    }

    public ty2(int i10) {
        byte[] bArr = ib3.f78561f;
        this.f83247n = bArr;
        this.f83248o = bArr;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int iLimit2;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f76745g.hasRemaining()) {
            int i10 = this.f83249p;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iLimit3 = byteBuffer.limit();
                        int iPosition2 = byteBuffer.position();
                        while (true) {
                            if (iPosition2 < byteBuffer.limit()) {
                                if (Math.abs((int) byteBuffer.getShort(iPosition2)) > this.f83244k) {
                                    int i11 = this.f83245l;
                                    iLimit = (iPosition2 / i11) * i11;
                                    break;
                                }
                                iPosition2 += 2;
                            } else {
                                iLimit = byteBuffer.limit();
                                break;
                            }
                        }
                        byteBuffer.limit(iLimit);
                        this.f83253t += (long) (byteBuffer.remaining() / this.f83245l);
                        byte[] bArr = this.f83248o;
                        int i12 = this.f83251r;
                        int iMin = Math.min(byteBuffer.remaining(), this.f83251r);
                        int i13 = this.f83251r - iMin;
                        System.arraycopy(bArr, i12 - i13, this.f83248o, 0, i13);
                        byteBuffer.position(byteBuffer.limit() - iMin);
                        byteBuffer.get(this.f83248o, i13, iMin);
                        if (iLimit < iLimit3) {
                            byte[] bArr2 = this.f83248o;
                            int i14 = this.f83251r;
                            a(i14).put(bArr2, 0, i14).flip();
                            if (i14 > 0) {
                                this.f83252s = true;
                            }
                            this.f83249p = 0;
                            byteBuffer.limit(iLimit3);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int iLimit4 = byteBuffer.limit();
                    int iPosition3 = byteBuffer.position();
                    while (true) {
                        if (iPosition3 < byteBuffer.limit()) {
                            if (Math.abs((int) byteBuffer.getShort(iPosition3)) > this.f83244k) {
                                int i15 = this.f83245l;
                                iLimit2 = (iPosition3 / i15) * i15;
                                break;
                            }
                            iPosition3 += 2;
                        } else {
                            iLimit2 = byteBuffer.limit();
                            break;
                        }
                    }
                    int iPosition4 = iLimit2 - byteBuffer.position();
                    byte[] bArr3 = this.f83247n;
                    int length = bArr3.length;
                    int i16 = this.f83250q;
                    int i17 = length - i16;
                    if (iLimit2 < iLimit4 && iPosition4 < i17) {
                        a(i16).put(bArr3, 0, i16).flip();
                        if (i16 > 0) {
                            this.f83252s = true;
                        }
                        this.f83250q = 0;
                        this.f83249p = 0;
                    } else {
                        int iMin2 = Math.min(iPosition4, i17);
                        byteBuffer.limit(byteBuffer.position() + iMin2);
                        byteBuffer.get(this.f83247n, this.f83250q, iMin2);
                        int i18 = this.f83250q + iMin2;
                        this.f83250q = i18;
                        byte[] bArr4 = this.f83247n;
                        if (i18 == bArr4.length) {
                            if (this.f83252s) {
                                int i19 = this.f83251r;
                                a(i19).put(bArr4, 0, i19).flip();
                                if (i19 > 0) {
                                    this.f83252s = true;
                                }
                                this.f83253t += (long) ((this.f83250q - (this.f83251r * 2)) / this.f83245l);
                            } else {
                                this.f83253t += (long) ((i18 - this.f83251r) / this.f83245l);
                            }
                            byte[] bArr5 = this.f83247n;
                            int i20 = this.f83250q;
                            int iMin3 = Math.min(byteBuffer.remaining(), this.f83251r);
                            int i21 = this.f83251r - iMin3;
                            System.arraycopy(bArr5, i20 - i21, this.f83248o, 0, i21);
                            byteBuffer.position(byteBuffer.limit() - iMin3);
                            byteBuffer.get(this.f83248o, i21, iMin3);
                            this.f83250q = 0;
                            this.f83249p = 2;
                        }
                        byteBuffer.limit(iLimit4);
                    }
                }
            } else {
                int iLimit5 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit5, byteBuffer.position() + this.f83247n.length));
                int iLimit6 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit6 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(iLimit6)) > this.f83244k) {
                            int i22 = this.f83245l;
                            iPosition = ((iLimit6 / i22) * i22) + i22;
                            break;
                        }
                        iLimit6 -= 2;
                    } else {
                        iPosition = byteBuffer.position();
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f83249p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    a(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f83252s = true;
                    }
                }
                byteBuffer.limit(iLimit5);
            }
        }
    }
}
