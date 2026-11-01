package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public interface qz {
    static long a(jc0 jc0Var) {
        byte[] bArr = (byte[]) jc0Var.f78972b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
