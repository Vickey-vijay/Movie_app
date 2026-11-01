package com.inmobi.media;

import android.content.Context;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3106pc extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3131qc f25066b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3106pc(C3131qc c3131qc, rj.c cVar) {
        super(2, cVar);
        this.f25066b = c3131qc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3106pc(this.f25066b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3106pc(this.f25066b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        Object objF = sj.a.f();
        int i10 = this.f25065a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3131qc c3131qc = this.f25066b;
            String str = c3131qc.f25167a;
            int i11 = c3131qc.f25168b;
            int i12 = c3131qc.f25169c;
            ik.i iVar = Se.f23518a;
            c3131qc.f25173g = new Je(str, null, null, null, new Ai(i11, i12 * 1000, 0), false, 46);
            C3131qc c3131qc2 = this.f25066b;
            Je je2 = c3131qc2.f25173g;
            Context context = Ji.f22951a;
            if (context != null) {
                ck.p.j(context, GAMConfig.KEY_CONTEXT);
                ck.p.j("mraid_js_store", "sharePrefFile");
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "mraid_js_store");
                ck.p.j("last_ts", C3426d4.i.W);
                if ((System.currentTimeMillis() / ((long) 1000)) - eaA.f22577a.getLong("last_ts", 0L) > c3131qc2.f25170d && je2 != null) {
                    C3227u9 c3227u9 = (C3227u9) He.f22812c.getValue();
                    this.f25065a = 1;
                    objA = c3227u9.f25449a.a(je2, this);
                    if (objA == objF) {
                        return objF;
                    }
                }
            }
            return mj.r.f64562a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        objA = obj;
        Ne ne2 = (Ne) objA;
        Context context2 = Ji.f22951a;
        if (!AbstractC2891gl.a(ne2)) {
            C3131qc c3131qc3 = this.f25066b;
            InterfaceC3028m9 interfaceC3028m9 = c3131qc3.f25171e;
            if (interfaceC3028m9 != null) {
                String str2 = c3131qc3.f25172f;
                ck.p.i(str2, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).b(str2, "Getting MRAID Js from server failed.");
            }
        } else if (context2 != null) {
            ck.p.j(context2, GAMConfig.KEY_CONTEXT);
            ck.p.j("mraid_js_store", "sharePrefFile");
            ConcurrentHashMap concurrentHashMap2 = Ea.f22576b;
            Ea eaA2 = Da.a(context2, "mraid_js_store");
            ik.i iVar2 = Se.f23518a;
            ck.p.j(ne2, "<this>");
            String strString = ne2.d().string(lk.c.f63591b);
            ck.p.j("mraid_js_string", C3426d4.i.W);
            ck.p.j(strString, "value");
            eaA2.a("mraid_js_string", strString, false);
            eaA2.a("last_ts", System.currentTimeMillis() / ((long) 1000), false);
        }
        return mj.r.f64562a;
    }
}
