package ah;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.r2;
import io.bidmachine.media3.common.util.ParsableByteArray;

/* JADX INFO: compiled from: ListChunk.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements a {
    public final ImmutableList<a> children;
    private final int type;

    public static e parseFrom(int i10, ParsableByteArray parsableByteArray) {
        ImmutableList.a aVar = new ImmutableList.a();
        int iLimit = parsableByteArray.limit();
        int trackType = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            a from = littleEndianInt == 1414744396 ? parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray) : createBox(littleEndianInt, trackType, parsableByteArray);
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((c) from).getTrackType();
                }
                aVar.a(from);
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(iLimit);
        }
        return new e(i10, aVar.m());
    }

    @Nullable
    public <T extends a> T getChild(Class<T> cls) {
        r2<a> it = this.children.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // ah.a
    public int getType() {
        return this.type;
    }

    private e(int i10, ImmutableList<a> immutableList) {
        this.type = i10;
        this.children = immutableList;
    }

    @Nullable
    private static a createBox(int i10, int i11, ParsableByteArray parsableByteArray) {
        switch (i10) {
            case 1718776947:
                return f.parseFrom(i11, parsableByteArray);
            case 1751742049:
                return b.parseFrom(parsableByteArray);
            case 1752331379:
                return c.parseFrom(parsableByteArray);
            case 1852994675:
                return g.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }
}
