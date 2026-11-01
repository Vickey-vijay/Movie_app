package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Il f22871a = new Il();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, C3292x c3292x, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        Hl hl2;
        C3065nl c3065nl;
        C3214tl e10;
        C3065nl c3065nl2;
        if (continuationImpl instanceof Hl) {
            hl2 = (Hl) continuationImpl;
            int i10 = hl2.f22826d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hl2.f22826d = i10 - Integer.MIN_VALUE;
            } else {
                hl2 = new Hl(this, continuationImpl);
            }
        } else {
            hl2 = new Hl(this, continuationImpl);
        }
        Object obj = hl2.f22824b;
        Object objF = sj.a.f();
        int i11 = hl2.f22826d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            G g10 = c3292x.f25677b;
            c3065nl = new C3065nl(g10);
            Fl fl2 = new Fl(c3292x.f25677b.f22692a.f25028b.getVastVideo(), c3065nl, c3292x.f25676a.f24939c);
            try {
                Map mapA = AbstractC2939ik.a(g10);
                Wj wj2 = Wj.f23753a;
                Wj.b("VastParseStart", mapA, EnumC2735ak.SDK);
                hl2.f22823a = c3065nl;
                try {
                    hl2.f22826d = 1;
                    Object objA = fl2.a(str, arrayList, hl2);
                    if (objA == objF) {
                        return objF;
                    }
                    obj = objA;
                    c3065nl2 = c3065nl;
                } catch (C3214tl e11) {
                    e10 = e11;
                    short s10 = e10.f25404a;
                    Map mapA2 = AbstractC2939ik.a(c3065nl.f24911a);
                    mapA2.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
                    Wj wj3 = Wj.f23753a;
                    Wj.b("VastParseFailure", mapA2, EnumC2735ak.SDK);
                    throw e10;
                }
            } catch (C3214tl e12) {
                e10 = e12;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3065nl2 = hl2.f22823a;
            try {
                kotlin.c.b(obj);
            } catch (C3214tl e13) {
                e10 = e13;
                c3065nl = c3065nl2;
                short s11 = e10.f25404a;
                Map mapA3 = AbstractC2939ik.a(c3065nl.f24911a);
                mapA3.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s11));
                Wj wj4 = Wj.f23753a;
                Wj.b("VastParseFailure", mapA3, EnumC2735ak.SDK);
                throw e10;
            }
        }
        Map mapA4 = AbstractC2939ik.a(c3065nl2.f24911a);
        Wj wj5 = Wj.f23753a;
        Wj.b("VastParseSuccess", mapA4, EnumC2735ak.SDK);
        return obj;
    }
}
