package pk;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class g {
    public static final <E> d<E> a(int i10, BufferOverflow bufferOverflow, bk.l<? super E, mj.r> lVar) {
        d<E> bufferedChannel;
        if (i10 != -2) {
            if (i10 == -1) {
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                    return new kotlinx.coroutines.channels.b(1, BufferOverflow.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i10 != 0) {
                if (i10 != Integer.MAX_VALUE) {
                    return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i10, lVar) : new kotlinx.coroutines.channels.b(i10, bufferOverflow, lVar);
                }
                return new BufferedChannel(Integer.MAX_VALUE, lVar);
            }
            bufferedChannel = bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel<>(0, lVar) : new kotlinx.coroutines.channels.b<>(1, bufferOverflow, lVar);
        } else {
            bufferedChannel = bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel<>(d.G8.a(), lVar) : new kotlinx.coroutines.channels.b<>(1, bufferOverflow, lVar);
        }
        return bufferedChannel;
    }

    public static /* synthetic */ d b(int i10, BufferOverflow bufferOverflow, bk.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, bufferOverflow, lVar);
    }
}
