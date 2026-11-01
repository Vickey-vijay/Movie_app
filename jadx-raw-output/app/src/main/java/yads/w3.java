package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class w3 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x3 f84081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public if1 f84082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public oa2 f84083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f84084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x3 f84085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84086g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(x3 x3Var, rj.c cVar) {
        super(cVar);
        this.f84085f = x3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f84084e = obj;
        this.f84086g |= Integer.MIN_VALUE;
        return this.f84085f.a(null, null, null, null, this);
    }
}
