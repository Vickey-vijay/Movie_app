package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cj f25207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3267w f25209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f25211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f25213g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C3267w c3267w, String str, int i10, int i11, int i12, rj.c cVar) {
        super(2, cVar);
        this.f25209c = c3267w;
        this.f25210d = str;
        this.f25211e = i10;
        this.f25212f = i11;
        this.f25213g = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new r(this.f25209c, this.f25210d, this.f25211e, this.f25212f, this.f25213g, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((r) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Cj cj2;
        Object objF = sj.a.f();
        int i10 = this.f25208b;
        if (i10 != 0) {
            if (i10 == 1) {
                cj2 = this.f25207a;
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            Cj cj3 = new Cj(this.f25209c.f25601a);
            cj3.setLayoutParams(new ViewGroup.LayoutParams(this.f25212f, this.f25213g));
            C3267w c3267w = this.f25209c;
            String str = this.f25210d;
            int i11 = this.f25211e;
            this.f25207a = cj3;
            this.f25208b = 1;
            Object objA = C3267w.a(c3267w, cj3, str, i11, this);
            if (objA == objF) {
                return objF;
            }
            cj2 = cj3;
            obj = objA;
        }
        if (((Boolean) obj).booleanValue()) {
            return cj2;
        }
        throw new C2805dc();
    }
}
