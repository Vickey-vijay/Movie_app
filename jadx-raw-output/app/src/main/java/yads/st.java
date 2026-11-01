package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class st extends Cdo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f82742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f82743j;

    @Override // yads.Cdo
    public final void e() {
        this.f82743j = null;
        this.f82742i = null;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f82743j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f76740b.f85463d) * this.f76741c.f85463d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f76740b.f85463d;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        int[] iArr = this.f82742i;
        if (iArr == null) {
            return zk.f85459e;
        }
        if (zkVar.f85462c != 2) {
            throw new al(zkVar);
        }
        boolean z10 = zkVar.f85461b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= zkVar.f85461b) {
                throw new al(zkVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new zk(zkVar.f85460a, iArr.length, 2) : zk.f85459e;
    }

    @Override // yads.Cdo
    public final void c() {
        this.f82743j = this.f82742i;
    }
}
