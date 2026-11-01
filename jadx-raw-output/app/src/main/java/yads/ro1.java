package yads;

import android.content.Context;
import com.ironsource.Z7;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ro1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo1 f82366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs1 f82367b;

    public /* synthetic */ ro1(xo1 xo1Var) {
        this(xo1Var, new hs1());
    }

    public final com.monetization.ads.mediation.base.a a(Context context, qq1 qq1Var, Class cls) {
        String str;
        com.monetization.ads.mediation.base.a aVar = null;
        try {
            String str2 = qq1Var.f81930b;
            this.f82367b.getClass();
            if (hs1.f78345a.contains(str2) && !pr0.a(context, or0.f81131d)) {
                return null;
            }
            Object objA = om2.a(str2, new Object[0]);
            com.monetization.ads.mediation.base.a aVar2 = (com.monetization.ads.mediation.base.a) cls.cast(objA);
            if (aVar2 == null) {
                try {
                    if (objA == null) {
                        ck.w wVar = ck.w.f6066a;
                        str = String.format("Instantiation failed for %s", Arrays.copyOf(new Object[]{str2}, 1));
                        ck.p.i(str, "format(...)");
                    } else {
                        ck.w wVar2 = ck.w.f6066a;
                        str = String.format("Cast from %s to %s is failed", Arrays.copyOf(new Object[]{objA.getClass().getName(), cls.getName()}, 2));
                        ck.p.i(str, "format(...)");
                    }
                    a(context, qq1Var, str);
                } catch (ClassCastException e10) {
                    e = e10;
                    aVar = aVar2;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = aVar2;
                    a(context, qq1Var, "could_not_create_adapter", th);
                    return aVar;
                }
            }
            return aVar2;
        } catch (ClassCastException e11) {
            e = e11;
        } catch (Throwable th3) {
            th = th3;
        }
        a(context, qq1Var, "does_not_conform_to_protocol", e);
        return aVar;
    }

    public ro1(xo1 xo1Var, hs1 hs1Var) {
        this.f82366a = xo1Var;
        this.f82367b = hs1Var;
    }

    public final void a(Context context, qq1 qq1Var, String str) {
        Map mapM = kotlin.collections.a.m(mj.h.a("reason", "could_not_create_adapter"), mj.h.a(UnifiedMediationParams.KEY_DESCRIPTION, str));
        xo1 xo1Var = this.f82366a;
        xo1Var.getClass();
        xo1Var.a(context, co2.f76355f, qq1Var, null, mapM);
    }

    public final void a(Context context, qq1 qq1Var, String str, Throwable th2) {
        Map mapO = kotlin.collections.a.o(mj.h.a("reason", str));
        String message = th2.getMessage();
        if (message == null) {
            message = "Unknown error message";
        }
        boolean z10 = ad1.f75480a;
        mapO.put(UnifiedMediationParams.KEY_DESCRIPTION, th2.getClass().getName() + Z7.f27998r + message);
        this.f82366a.a(context, qq1Var, mapO);
    }
}
