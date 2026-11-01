package ah;

import io.bidmachine.media3.common.util.ParsableByteArray;

/* JADX INFO: compiled from: StreamNameChunk.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements a {
    public final String name;

    @Override // ah.a
    public int getType() {
        return 1852994675;
    }

    public static g parseFrom(ParsableByteArray parsableByteArray) {
        return new g(parsableByteArray.readString(parsableByteArray.bytesLeft()));
    }

    private g(String str) {
        this.name = str;
    }
}
