package rk;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import qk.u;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class s extends SharedFlowImpl<Integer> implements u<Integer> {
    @Override // qk.u
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(L().intValue());
        }
        return numValueOf;
    }

    public final boolean Z(int i10) {
        boolean zH;
        synchronized (this) {
            zH = h(Integer.valueOf(L().intValue() + i10));
        }
        return zH;
    }

    public s(int i10) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        h(Integer.valueOf(i10));
    }
}
