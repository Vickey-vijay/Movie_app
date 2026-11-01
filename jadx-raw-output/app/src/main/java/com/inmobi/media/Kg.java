package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Kg extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23017a;

    public Kg(rj.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Kg(cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Kg((rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f23017a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                Og og2 = Og.f23290a;
                og2.getClass();
                Context context = Ji.f22951a;
                JSONObject jSONObject = null;
                if (context != null) {
                    if (Og.f23293d == null) {
                        Og.f23293d = new C3359zg(context, "pub_signals_store");
                    }
                    C3359zg c3359zg = Og.f23293d;
                    if (c3359zg == null) {
                        ck.p.B("prefDao");
                        c3359zg = null;
                    }
                    String strA = c3359zg.a("saved_signals");
                    if (strA != null) {
                        jSONObject = new JSONObject(strA);
                    }
                }
                if (jSONObject == null) {
                    return mj.r.f64562a;
                }
                SignalsConfig.PublisherConfig publisherConfigC = Og.c();
                JSONObject jSONObjectA = Pg.a(Pg.a(Pg.a(jSONObject, "obj_", publisherConfigC.getObj().getExpiry()), "auto_", publisherConfigC.getAuto().getExpiry()), "dir_", publisherConfigC.getDirect().getExpiry());
                this.f23017a = 1;
                if (og2.a(jSONObjectA, this) == objF) {
                    return objF;
                }
            }
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
        return mj.r.f64562a;
    }
}
