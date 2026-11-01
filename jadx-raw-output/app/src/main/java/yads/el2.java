package yads;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public abstract class el2 {
    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static dl2 a(byte[] bArr) {
        jb2 jb2Var = new jb2(bArr);
        if (jb2Var.f78968c < 32) {
            return null;
        }
        jb2Var.e(0);
        if (jb2Var.b() != (jb2Var.f78968c - jb2Var.f78967b) + 4 || jb2Var.b() != 1886614376) {
            return null;
        }
        int iB = (jb2Var.b() >> 24) & 255;
        if (iB > 1) {
            kf1.a("Unsupported pssh version: ", iB, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(jb2Var.i(), jb2Var.i());
        if (iB == 1) {
            jb2Var.e(jb2Var.f78967b + (jb2Var.p() * 16));
        }
        int iP = jb2Var.p();
        if (iP != jb2Var.f78968c - jb2Var.f78967b) {
            return null;
        }
        byte[] bArr2 = new byte[iP];
        jb2Var.a(bArr2, 0, iP);
        return new dl2(uuid, iB, bArr2);
    }
}
