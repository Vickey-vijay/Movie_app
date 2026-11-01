package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class wg2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yg2 f84198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sg2 f84199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uu f84200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f84201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yg2 f84202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84203g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg2(yg2 yg2Var, rj.c cVar) {
        super(cVar);
        this.f84202f = yg2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f84201e = obj;
        this.f84203g |= Integer.MIN_VALUE;
        return this.f84202f.a((Context) null, (sg2) null, this);
    }
}
