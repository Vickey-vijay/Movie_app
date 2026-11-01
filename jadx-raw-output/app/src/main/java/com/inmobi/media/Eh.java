package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Eh extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gh f22597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ab f22598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f22599c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eh(Gh gh2, Ab ab2, JSONObject jSONObject, rj.c cVar) {
        super(1, cVar);
        this.f22597a = gh2;
        this.f22598b = ab2;
        this.f22599c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Eh(this.f22597a, this.f22598b, this.f22599c, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((Eh) create((rj.c) obj)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0045 A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0006, B:11:0x0025, B:14:0x002a, B:15:0x002f, B:16:0x0030, B:18:0x0034, B:21:0x0039, B:23:0x003d, B:25:0x0041, B:27:0x0045), top: B:33:0x0006 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        try {
            Cb cb2 = this.f22597a.f22740e;
            Ab ab2 = this.f22598b;
            cb2.getClass();
            ck.p.j(ab2, "eventLogLevel");
            int iOrdinal = cb2.f22462a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (ab2 == Ab.STATE) {
                                this.f22597a.f22742g.add(this.f22599c);
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (ab2 == Ab.ERROR || ab2 == Ab.STATE) {
                        this.f22597a.f22742g.add(this.f22599c);
                    }
                } else if (ab2 == Ab.DEBUG || ab2 == Ab.ERROR || ab2 == Ab.STATE) {
                    this.f22597a.f22742g.add(this.f22599c);
                }
            } else {
                this.f22597a.f22742g.add(this.f22599c);
            }
        } catch (Exception e10) {
            this.f22597a.getClass();
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
        return mj.r.f64562a;
    }
}
