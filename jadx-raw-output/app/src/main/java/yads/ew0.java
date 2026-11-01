package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class ew0 extends Cdo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f77211i = Float.floatToIntBits(Float.NaN);

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        int i10 = zkVar.f85462c;
        if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 4 ? new zk(zkVar.f85460a, zkVar.f85461b, 4) : zk.f85459e;
        }
        throw new al(zkVar);
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f76740b.f85462c;
        if (i11 != 536870912) {
            if (i11 == 805306368) {
                byteBufferA = a(i10);
                while (iPosition < iLimit) {
                    int iFloatToIntBits = Float.floatToIntBits((float) (((double) ((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24))) * 4.656612875245797E-10d));
                    if (iFloatToIntBits == f77211i) {
                        iFloatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    byteBufferA.putInt(iFloatToIntBits);
                    iPosition += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            byteBufferA = a((i10 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((double) (((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == f77211i) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferA.putInt(iFloatToIntBits2);
                iPosition += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }
}
