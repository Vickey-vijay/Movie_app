package rk;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface j<T> extends qk.c<T> {

    /* JADX INFO: compiled from: ChannelFlow.kt */
    public static final class a {
        public static /* synthetic */ qk.c a(j jVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                dVar = EmptyCoroutineContext.INSTANCE;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return jVar.b(dVar, i10, bufferOverflow);
        }
    }

    qk.c<T> b(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow);
}
