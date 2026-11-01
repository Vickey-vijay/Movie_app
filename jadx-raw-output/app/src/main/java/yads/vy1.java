package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class vy1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1 f84042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f84043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy1 f84044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy1(yy1 yy1Var, rj.c cVar) {
        super(cVar);
        this.f84044d = yy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f84043c = obj;
        this.f84045e |= Integer.MIN_VALUE;
        return this.f84044d.a((Context) null, (ry1) null, this);
    }
}
