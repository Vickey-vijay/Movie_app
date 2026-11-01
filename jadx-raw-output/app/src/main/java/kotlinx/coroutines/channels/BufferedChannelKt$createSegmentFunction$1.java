package kotlinx.coroutines.channels;

import bk.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import pk.i;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1<E> extends FunctionReferenceImpl implements p<Long, i<E>, i<E>> {
    public static final BufferedChannelKt$createSegmentFunction$1 INSTANCE = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo1invoke(Long l10, Object obj) {
        return invoke(l10.longValue(), (i) obj);
    }

    public final i<E> invoke(long j10, i<E> iVar) {
        return BufferedChannelKt.x(j10, iVar);
    }
}
