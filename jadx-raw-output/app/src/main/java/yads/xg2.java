package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class xg2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yg2 f84585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f84586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f84587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg2 f84588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f84589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yg2 f84590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f84591h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg2(yg2 yg2Var, rj.c cVar) {
        super(cVar);
        this.f84590g = yg2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f84589f = obj;
        this.f84591h |= Integer.MIN_VALUE;
        return this.f84590g.a((Context) null, (List) null, this);
    }
}
