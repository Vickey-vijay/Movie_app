package yads;

import android.view.View;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class xa0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f84515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ya0 f84516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(ya0 ya0Var, rj.c cVar) {
        super(cVar);
        this.f84516c = ya0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f84515b = obj;
        this.f84517d |= Integer.MIN_VALUE;
        return this.f84516c.a((View) null, (wa0) null, this);
    }
}
