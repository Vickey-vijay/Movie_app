package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3235uh extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ref$ObjectRef f25483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3260vh f25486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3235uh(C3260vh c3260vh, rj.c cVar) {
        super(2, cVar);
        this.f25486e = c3260vh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3235uh c3235uh = new C3235uh(this.f25486e, cVar);
        c3235uh.f25485d = obj;
        return c3235uh;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        C3235uh c3235uh = new C3235uh(this.f25486e, (rj.c) obj2);
        c3235uh.f25485d = (qk.d) obj;
        return c3235uh.invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        qk.d dVar;
        String str;
        Ref$ObjectRef ref$ObjectRef;
        Object objF = sj.a.f();
        int i10 = this.f25484c;
        if (i10 != 0) {
            if (i10 == 1) {
                ref$ObjectRef = this.f25483b;
                str = this.f25482a;
                dVar = (qk.d) this.f25485d;
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            dVar = (qk.d) this.f25485d;
            str = Ji.f22953c;
            if (str == null) {
                return mj.r.f64562a;
            }
            ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = C3260vh.a(this.f25486e);
        }
        String str2 = str;
        qk.d dVar2 = dVar;
        while (!((Collection) ref$ObjectRef.element).isEmpty()) {
            List list = (List) ref$ObjectRef.element;
            ref$ObjectRef.element = nj.s.k();
            Bh bh2 = (Bh) this.f25486e.f25576b.getValue();
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(RootConfig.class, "clazz");
            RootConfig rootConfig = (RootConfig) Y3.f23815a.a(RootConfig.class);
            bh2.getClass();
            ck.p.j(str2, "accountId");
            ck.p.j(rootConfig, "rootConfig");
            ck.p.j(list, "configRequestContexts");
            qk.c cVarH = qk.e.h(new C3335yh(list, bh2, str2, rootConfig, null));
            C3210th c3210th = new C3210th(this.f25486e, dVar2, ref$ObjectRef);
            this.f25485d = dVar2;
            this.f25482a = str2;
            this.f25483b = ref$ObjectRef;
            this.f25484c = 1;
            if (cVarH.collect(c3210th, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
