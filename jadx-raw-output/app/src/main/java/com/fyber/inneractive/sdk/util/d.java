package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.iab.omid.library.fyber.ScriptInjector;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object[] f18570a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f18571b;

    public d(com.fyber.inneractive.sdk.web.e eVar) {
        this.f18571b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0154  */
    /* JADX WARN: Code duplicated, block: B:67:0x015b  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        String strB;
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.response.e eVarB;
        boolean z10;
        com.fyber.inneractive.sdk.measurement.e eVar;
        String string;
        StringBuilder sb2;
        com.fyber.inneractive.sdk.web.e eVar2 = this.f18571b;
        Object[] objArr = this.f18570a;
        eVar2.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string2 = eVar2.f18663g;
        if (eVar2.f18664h) {
            com.fyber.inneractive.sdk.web.i iVar = eVar2.f18668l;
            String str = eVar2.f18665i;
            String str2 = eVar2.f18666j;
            com.fyber.inneractive.sdk.web.i1 i1Var = (com.fyber.inneractive.sdk.web.i1) iVar;
            i1Var.getClass();
            StringBuilder sb3 = new StringBuilder("<html><title>DigitalTurbine Ad</title><head><link rel=\"icon\" href=\"data:,\">");
            if (TextUtils.isEmpty(string2)) {
                IAlog.a("loadHtml called with an empty HTML!", new Object[0]);
            } else if (i1Var.F) {
                String strB2 = o.b("ia_js_load_monitor.txt");
                if (!TextUtils.isEmpty(strB2)) {
                    sb3.append(strB2);
                    sb3.append("<script> window.iaPreCachedAd = true; </script>");
                    IAConfigManager iAConfigManager = IAConfigManager.O;
                    zA = iAConfigManager.f15026u.f15195b.a(false, "use_js_inline");
                    if (zA || iAConfigManager.H.f14933b == null) {
                        sb3.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                    } else {
                        sb3.append("<script type=\"text/javascript\">");
                        sb3.append(iAConfigManager.H.f14933b);
                        sb3.append("</script>");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        sb3.append(str);
                    }
                    sb3.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script></head><style>body{text-align:center !important;margin:0;padding:0;}");
                    if (!TextUtils.isEmpty(str2)) {
                        sb3.append(str2);
                    }
                    sb3.append("</style><body id=\"iaBody\">");
                    if (i1Var.B && i1Var.m()) {
                        if (zA || iAConfigManager.H.f14934c == null) {
                            sb3.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                        } else {
                            sb3.append("<style type=\"text/css\">");
                            sb3.append(iAConfigManager.H.f14934c);
                            sb3.append("</style>");
                        }
                        if (zA || iAConfigManager.H.f14935d == null) {
                            sb3.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                        } else {
                            sb3.append("<script type=\"text/javascript\">");
                            sb3.append(iAConfigManager.H.f14935d);
                            sb3.append("</script>");
                        }
                    }
                    strB = o.b("ia_mraid_bridge.txt");
                    if (!TextUtils.isEmpty(strB)) {
                        sb3.append("<div id='iaScriptBr' style='display:none;'>");
                        sb3.append(strB);
                        sb3.append("</div>");
                        if (IAlog.f18551a >= 2) {
                            sb3.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                        }
                    }
                    sb3.append(string2);
                    sb3.append("</body></html>");
                    if (i1Var.H != null) {
                        xVar = i1Var.f18699s;
                        if (xVar == null) {
                            eVarB = xVar.b();
                            if (eVarB == null && eVarB.J) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            eVar = i1Var.H;
                            string = sb3.toString();
                            if (z10) {
                                sb2 = new StringBuilder();
                                if (!TextUtils.isEmpty(eVar.f15808c)) {
                                    sb2.append(eVar.f15808c);
                                }
                                if (!TextUtils.isEmpty(eVar.f15809d)) {
                                    sb2.append(eVar.f15809d);
                                }
                                string = ScriptInjector.injectScriptContentIntoHtml(sb2.toString(), string);
                            }
                            if (TextUtils.isEmpty(eVar.f15807b)) {
                                string2 = string;
                            } else {
                                string2 = ScriptInjector.injectScriptContentIntoHtml(eVar.f15807b, string);
                            }
                        }
                    } else {
                        string2 = sb3.toString();
                    }
                }
            } else {
                sb3.append("<script> window.iaPreCachedAd = true; </script>");
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                zA = iAConfigManager2.f15026u.f15195b.a(false, "use_js_inline");
                if (zA) {
                    sb3.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                } else {
                    sb3.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                }
                if (!TextUtils.isEmpty(str)) {
                    sb3.append(str);
                }
                sb3.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script></head><style>body{text-align:center !important;margin:0;padding:0;}");
                if (!TextUtils.isEmpty(str2)) {
                    sb3.append(str2);
                }
                sb3.append("</style><body id=\"iaBody\">");
                if (i1Var.B) {
                    if (zA) {
                        sb3.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                    } else {
                        sb3.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                    }
                    if (zA) {
                        sb3.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                    } else {
                        sb3.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                    }
                }
                strB = o.b("ia_mraid_bridge.txt");
                if (!TextUtils.isEmpty(strB)) {
                    sb3.append("<div id='iaScriptBr' style='display:none;'>");
                    sb3.append(strB);
                    sb3.append("</div>");
                    if (IAlog.f18551a >= 2) {
                        sb3.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                    }
                }
                sb3.append(string2);
                sb3.append("</body></html>");
                if (i1Var.H != null) {
                    xVar = i1Var.f18699s;
                    if (xVar == null) {
                        eVarB = xVar.b();
                        if (eVarB == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        eVar = i1Var.H;
                        string = sb3.toString();
                        if (z10) {
                            sb2 = new StringBuilder();
                            if (!TextUtils.isEmpty(eVar.f15808c)) {
                                sb2.append(eVar.f15808c);
                            }
                            if (!TextUtils.isEmpty(eVar.f15809d)) {
                                sb2.append(eVar.f15809d);
                            }
                            string = ScriptInjector.injectScriptContentIntoHtml(sb2.toString(), string);
                        }
                        if (TextUtils.isEmpty(eVar.f15807b)) {
                            string2 = ScriptInjector.injectScriptContentIntoHtml(eVar.f15807b, string);
                        } else {
                            string2 = string;
                        }
                    }
                } else {
                    string2 = sb3.toString();
                }
            }
            string2 = null;
        }
        com.fyber.inneractive.sdk.web.i iVar2 = eVar2.f18668l;
        iVar2.getClass();
        IAlog.a("%sbuild html string took %d msec", IAlog.a(iVar2), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        com.fyber.inneractive.sdk.web.e eVar3 = this.f18571b;
        if (eVar3.f18662f) {
            return;
        }
        eVar3.f18659c = new e(eVar3, string2);
        eVar3.a().post(this.f18571b.f18659c);
    }
}
