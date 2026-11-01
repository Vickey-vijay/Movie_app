package com.inmobi.media;

import java.io.IOException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3208tf extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Je f25391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3208tf(Je je2, rj.c cVar) {
        super(2, cVar);
        this.f25391b = je2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3208tf(this.f25391b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3208tf(this.f25391b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25390a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3227u9 c3227u9 = (C3227u9) He.f22812c.getValue();
            Je je2 = this.f25391b;
            this.f25390a = 1;
            obj = c3227u9.f25449a.a(je2, this);
            if (obj == objF) {
                return objF;
            }
        }
        Ne ne2 = (Ne) obj;
        if (AbstractC2891gl.a(ne2)) {
            ik.i iVar = Se.f23518a;
            ck.p.j(ne2, "<this>");
            return ne2.d().string(lk.c.f63591b);
        }
        throw new IOException();
    }
}
