package kotlinx.coroutines;

import bk.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mj.r;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements q<JobSupport, vk.f<?>, Object, r> {
    public static final JobSupport$onJoin$1 INSTANCE = new JobSupport$onJoin$1();

    public JobSupport$onJoin$1() {
        super(3, JobSupport.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // bk.q
    public /* bridge */ /* synthetic */ r invoke(JobSupport jobSupport, vk.f<?> fVar, Object obj) {
        invoke2(jobSupport, fVar, obj);
        return r.f64562a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(JobSupport jobSupport, vk.f<?> fVar, Object obj) {
        jobSupport.R0(fVar, obj);
    }
}
