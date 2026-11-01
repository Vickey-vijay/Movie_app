package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Ke {
    public final void a(Context context, C3720te c3720te, De de2, InterfaceC3686re interfaceC3686re) throws Throwable {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3720te, AdActivity.REQUEST_KEY_EXTRA);
        ck.p.j(de2, "tools");
        ck.p.j(interfaceC3686re, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String strF = c3720te.f();
        if (strF == null) {
            strF = "";
        }
        de2.a("userId", strF);
        de2.a("appKey", c3720te.d());
        de2.c().i(c3720te.f());
        de2.a();
        InterfaceC3805ye interfaceC3805yeB = b(context, de2, c3720te);
        if (interfaceC3805yeB instanceof InterfaceC3805ye.b) {
            interfaceC3686re.a(new C3579le(((InterfaceC3805ye.b) interfaceC3805yeB).b()));
        } else if (interfaceC3805yeB instanceof InterfaceC3805ye.a) {
            InterfaceC3805ye.a aVar = (InterfaceC3805ye.a) interfaceC3805yeB;
            de2.a(aVar.d(), aVar.f(), aVar.e());
            interfaceC3686re.a(aVar.d());
        }
    }

    private final InterfaceC3805ye b(Context context, De de2, C3720te c3720te) throws Throwable {
        InterfaceC3805ye interfaceC3805yeA = a(context, de2, c3720te);
        if (interfaceC3805yeA instanceof InterfaceC3805ye.a) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
            Ne neA = de2.a(context, c3720te.d());
            if (neA != null && neA.q()) {
                InterfaceC3805ye.b bVar = new InterfaceC3805ye.b(new C3737ue(neA));
                IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(c3720te.d(), c3720te.f());
                IronSourceLoggerManager.getLogger().log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError + ": " + bVar.b(), 1);
                de2.g();
                return bVar;
            }
            return interfaceC3805yeA;
        }
        return interfaceC3805yeA;
    }

    private final InterfaceC3805ye a(Context context, De de2, C3720te c3720te) throws Throwable {
        C3617ne c3617ne;
        try {
            String strA = de2.a(context);
            if (TextUtils.isEmpty(strA)) {
                strA = de2.b(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = strA;
            C3450ea c3450eaD = de2.d();
            String strA2 = Pe.a(context, c3720te.d(), c3720te.f(), str, null, true, c3450eaD != null ? c3450eaD.f() : null, false);
            String string = C3485g9.a().toString();
            ck.p.i(string, "createRequestData().toString()");
            InterfaceC3554k7 interfaceC3554k7A = C3519i7.a(strA2, string);
            if (interfaceC3554k7A instanceof InterfaceC3554k7.a) {
                IronLog.INTERNAL.warning("HTTP init request failed: " + ((InterfaceC3554k7.a) interfaceC3554k7A).a());
                ck.p.i(interfaceC3554k7A, "serverResponse");
                return new InterfaceC3805ye.a(a((InterfaceC3554k7.a) interfaceC3554k7A), strA2, string);
            }
            if (interfaceC3554k7A instanceof InterfaceC3554k7.b) {
                String strD = ((InterfaceC3554k7.b) interfaceC3554k7A).d();
                if (de2.e()) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("encrypt");
                    JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(strD);
                    String strOptString = jSONObjectJsonObjectInit.optString("response");
                    if (TextUtils.isEmpty(strOptString)) {
                        ironLog.warning("encryptedResponse is empty - return null");
                        return new InterfaceC3805ye.a(new C3617ne(2100, C3670qe.f30561h), strA2, string);
                    }
                    boolean zOptBoolean = jSONObjectJsonObjectInit.optBoolean("compression", false);
                    ck.p.i(strOptString, "encryptedResponse");
                    strD = a(strOptString, zOptBoolean);
                    if (TextUtils.isEmpty(strD)) {
                        ironLog.warning("encoded response invalid - return null");
                        de2.f();
                        return new InterfaceC3805ye.a(new C3617ne(C3617ne.f30313f, C3670qe.f30560g), strA2, string);
                    }
                }
                Ne ne2 = new Ne(context, c3720te.d(), c3720te.f(), strD);
                ne2.a(Ne.a.SERVER);
                if (!ne2.q()) {
                    IronLog.INTERNAL.warning("response invalid - return null");
                    String strE = ne2.e();
                    if (strE == null) {
                        strE = "Unknown";
                    }
                    return new InterfaceC3805ye.a(new C3617ne(C3617ne.f30312e, strE), strA2, string);
                }
                return new InterfaceC3805ye.b(new C3737ue(ne2));
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.warning("exception = " + e10);
            if (e10 instanceof JSONException) {
                c3617ne = new C3617ne(C3617ne.f30312e, "serverResponseIsNotValid");
            } else {
                c3617ne = new C3617ne(510, "internal error");
            }
            return new InterfaceC3805ye.a(c3617ne, null, null, 6, null);
        }
    }

    private final String a(String str, boolean z10) {
        if (z10) {
            String strD = N9.d(C3644p5.b().c(), str);
            ck.p.i(strD, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
            return strD;
        }
        String strB = N9.b(C3644p5.b().c(), str);
        ck.p.i(strB, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return strB;
    }

    private final C3617ne a(InterfaceC3554k7.a aVar) {
        return new C3617ne(aVar.b() ? C3617ne.f30311d : C3617ne.f30315h, aVar.a());
    }
}
