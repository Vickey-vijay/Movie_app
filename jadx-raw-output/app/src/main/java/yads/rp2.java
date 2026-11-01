package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class rp2 extends Cdo {
    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        int i10 = zkVar.f85462c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 2 ? new zk(zkVar.f85460a, zkVar.f85461b, 2) : zk.f85459e;
        }
        throw new al(zkVar);
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f76740b.f85462c;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 268435456) {
                    if (i11 != 536870912) {
                        if (i11 != 805306368) {
                            throw new IllegalStateException();
                        }
                        i10 /= 2;
                    } else {
                        i10 /= 3;
                        i10 *= 2;
                    }
                }
            } else {
                i10 /= 2;
            }
        } else {
            i10 *= 2;
        }
        ByteBuffer byteBufferA = a(i10);
        int i12 = this.f76740b.f85462c;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 != 268435456) {
                    if (i12 != 536870912) {
                        if (i12 == 805306368) {
                            while (iPosition < iLimit) {
                                byteBufferA.put(byteBuffer.get(iPosition + 2));
                                byteBufferA.put(byteBuffer.get(iPosition + 3));
                                iPosition += 4;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        while (iPosition < iLimit) {
                            byteBufferA.put(byteBuffer.get(iPosition + 1));
                            byteBufferA.put(byteBuffer.get(iPosition + 2));
                            iPosition += 3;
                        }
                    }
                } else {
                    while (iPosition < iLimit) {
                        byteBufferA.put(byteBuffer.get(iPosition + 1));
                        byteBufferA.put(byteBuffer.get(iPosition));
                        iPosition += 2;
                    }
                }
            } else {
                while (iPosition < iLimit) {
                    float f10 = byteBuffer.getFloat(iPosition);
                    int i13 = ib3.f78556a;
                    short sMax = (short) (Math.max(-1.0f, Math.min(f10, 1.0f)) * 32767.0f);
                    byteBufferA.put((byte) (sMax & 255));
                    byteBufferA.put((byte) ((sMax >> 8) & 255));
                    iPosition += 4;
                }
            }
        } else {
            while (iPosition < iLimit) {
                byteBufferA.put((byte) 0);
                byteBufferA.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }
}
