package kotlinx.coroutines.sync;

import bk.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import wk.i;
import wk.j;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 extends FunctionReferenceImpl implements p<Long, j, j> {
    public static final SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 INSTANCE = new SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1();

    public SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, i.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ j mo1invoke(Long l10, j jVar) {
        return invoke(l10.longValue(), jVar);
    }

    public final j invoke(long j10, j jVar) {
        return i.h(j10, jVar);
    }
}
