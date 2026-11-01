package kotlinx.coroutines;

import bk.q;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements q<JobSupport, Object, Object, Object> {
    public static final JobSupport$onAwaitInternal$2 INSTANCE = new JobSupport$onAwaitInternal$2();

    public JobSupport$onAwaitInternal$2() {
        super(3, JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // bk.q
    public final Object invoke(JobSupport jobSupport, Object obj, Object obj2) {
        return jobSupport.K0(obj, obj2);
    }
}
