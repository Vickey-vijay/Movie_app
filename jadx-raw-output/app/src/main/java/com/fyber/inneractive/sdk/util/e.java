package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.ironsource.G5;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f18576b;

    public e(com.fyber.inneractive.sdk.web.e eVar, String str) {
        this.f18576b = eVar;
        this.f18575a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.e eVar = this.f18576b;
        Object obj = this.f18575a;
        eVar.getClass();
        String str = (String) obj;
        String str2 = s.a() ? "http://" : "https://";
        if (!TextUtils.isEmpty(str) && !eVar.f18657a.isTerminated() && !eVar.f18657a.isShutdown()) {
            if (TextUtils.isEmpty(eVar.f18667k)) {
                eVar.f18668l.f18696p = str2.concat("wv.inner-active.mobi/");
            } else {
                eVar.f18668l.f18696p = str2 + eVar.f18667k;
            }
            if (eVar.f18662f) {
                return;
            }
            com.fyber.inneractive.sdk.web.i iVar = eVar.f18668l;
            com.fyber.inneractive.sdk.web.m mVar = iVar.f18682b;
            if (mVar != null) {
                DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(mVar, iVar.f18696p, str, "text/html", G5.N, null);
                eVar.f18668l.f18697q = str;
            } else {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_TO_WEBVIEW);
                com.fyber.inneractive.sdk.web.g gVar = iVar.f18686f;
                if (gVar != null) {
                    gVar.a(iVar, inneractiveInfrastructureError);
                }
                iVar.b(true);
            }
        } else if (!eVar.f18657a.isTerminated() && !eVar.f18657a.isShutdown()) {
            com.fyber.inneractive.sdk.web.i iVar2 = eVar.f18668l;
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.EMPTY_FINAL_HTML);
            com.fyber.inneractive.sdk.web.g gVar2 = iVar2.f18686f;
            if (gVar2 != null) {
                gVar2.a(iVar2, inneractiveInfrastructureError2);
            }
            iVar2.b(true);
        }
        eVar.f18662f = true;
        eVar.f18657a.shutdownNow();
        Handler handler = eVar.f18658b;
        if (handler != null) {
            d dVar = eVar.f18660d;
            if (dVar != null) {
                handler.removeCallbacks(dVar);
            }
            e eVar2 = eVar.f18659c;
            if (eVar2 != null) {
                eVar.f18658b.removeCallbacks(eVar2);
            }
            eVar.f18658b = null;
        }
        eVar.f18668l.f18695o = null;
    }
}
