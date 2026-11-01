package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class k implements com.fyber.inneractive.sdk.interfaces.c, com.fyber.inneractive.sdk.interfaces.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f15463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f15464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f15465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.a f15466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.b f15467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.r0 f15468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f15469g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.timeouts.content.a f15472j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15470h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15471i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f15474l = new j(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f15473k = new d(this);

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.interfaces.a aVar, com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f15463a = inneractiveAdRequest;
        this.f15464b = eVar;
        this.f15466d = aVar;
        this.f15467e = bVar;
        this.f15473k = new d(this);
        this.f15469g = rVar;
        UnitDisplayType unitDisplayType = eVar.f18447p;
        this.f15472j = new com.fyber.inneractive.sdk.network.timeouts.content.a((unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(Locale.US) : UnitDisplayType.BANNER.name().toLowerCase(Locale.US), com.fyber.inneractive.sdk.response.a.a(eVar.f18438g) == com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST ? "video" : "display", (int) eVar.K, eVar.D, IAConfigManager.O.f15017l, this.f15469g);
        if (this.f15463a == null) {
            this.f15468f = com.fyber.inneractive.sdk.config.a.a(eVar.f18446o);
        }
        try {
            i();
        } catch (Throwable th2) {
            IAlog.f("Failed to start ContentLoader", IAlog.a(this));
            com.fyber.inneractive.sdk.network.z.a(th2, inneractiveAdRequest, eVar);
            this.f15473k.a();
            b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.CONTENT_LOADER_START_FAILED));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        int i10;
        String strA = IAlog.a(this);
        Integer numValueOf = Integer.valueOf(this.f15471i - 1);
        int i11 = this.f15471i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f15472j;
        if (aVar != null) {
            if (aVar.f16106g) {
                i11 = aVar.f16100a - i11;
            }
            i10 = (aVar.f16101b * i11) + aVar.f16103d + (i11 == aVar.f16100a ? aVar.f16107h : 0);
        } else {
            i10 = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onRetry() attempt: %d timeout: %d", strA, numValueOf, Integer.valueOf(i10));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.f15467e;
        if (bVar != null) {
            bVar.b();
        }
        i();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public abstract void cancel();

    public abstract String e();

    public abstract void h();

    public InneractiveInfrastructureError d() {
        i iVar = i.WEBVIEW_LOAD_TIMEOUT;
        com.fyber.inneractive.sdk.response.e eVar = this.f15464b;
        if ("video".equalsIgnoreCase((eVar == null || com.fyber.inneractive.sdk.response.a.a(eVar.f18438g) != com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST) ? "display" : "video")) {
            iVar = i.VIDEO_AD_LOAD_TIMEOUT;
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, iVar);
    }

    public final com.fyber.inneractive.sdk.config.s0 f() {
        InneractiveAdRequest inneractiveAdRequest = this.f15463a;
        return inneractiveAdRequest == null ? this.f15468f : inneractiveAdRequest.getSelectedUnitConfig();
    }

    public final void g() {
        String str;
        this.f15473k.a();
        InneractiveAdRequest inneractiveAdRequest = this.f15463a;
        if (inneractiveAdRequest != null) {
            str = inneractiveAdRequest.f15701b;
        } else {
            com.fyber.inneractive.sdk.response.e eVar = this.f15464b;
            if (eVar == null || (str = eVar.B) == null) {
                str = null;
            }
        }
        com.fyber.inneractive.sdk.metrics.d.f15849d.a(str).i();
        x xVar = this.f15465c;
        if (xVar != null) {
            xVar.a(str);
        }
        com.fyber.inneractive.sdk.interfaces.a aVar = this.f15466d;
        if (aVar != null) {
            aVar.a(this.f15463a);
        }
    }

    public final void i() {
        int i10;
        int i11 = this.f15471i;
        this.f15471i = i11 + 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f15472j;
        if (aVar != null) {
            if (aVar.f16106g) {
                i11 = aVar.f16100a - i11;
            }
            i10 = (aVar.f16101b * i11) + aVar.f16103d + (i11 == aVar.f16100a ? aVar.f16107h : 0);
        } else {
            i10 = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : Start timeout: %d, attempt number: %d", IAlog.a(this), Integer.valueOf(i10), Integer.valueOf(this.f15471i - 1));
        d dVar = this.f15473k;
        if (dVar.f15347a == null) {
            HandlerThread handlerThread = new HandlerThread("TimeoutHandlerThread");
            handlerThread.start();
            dVar.f15347a = new Handler(handlerThread.getLooper());
        }
        dVar.f15347a.postDelayed(dVar.f15350d, i10);
        h();
    }

    public void c() {
        g();
    }

    public final void b(InneractiveInfrastructureError inneractiveInfrastructureError) {
        String string;
        IAlog.a("%s : IAAdContentLoaderImpl : Handle Retry for error: %s", IAlog.a(this), inneractiveInfrastructureError.getErrorCode().toString());
        d dVar = this.f15473k;
        dVar.getClass();
        IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(dVar));
        Handler handler = dVar.f15347a;
        if (handler != null) {
            handler.removeCallbacks(dVar.f15350d);
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f15472j;
        boolean z10 = this.f15471i <= (aVar != null ? aVar.f16100a : 0);
        IAlog.a("%s : IAAdContentLoaderImpl : should retry: %s", IAlog.a(this), Boolean.valueOf(z10));
        if (z10) {
            x xVar = this.f15465c;
            if (xVar != null) {
                xVar.destroy();
                this.f15465c = null;
            }
            com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.f15472j;
            int i10 = aVar2 != null ? aVar2.f16104e : 0;
            IAlog.a("%s : IAAdContentLoaderImpl : retryLoad : post load ad content retry task with delay: %d", IAlog.a(this), Integer.valueOf(i10));
            com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(this.f15474l, i10);
            return;
        }
        com.fyber.inneractive.sdk.interfaces.a aVar3 = this.f15466d;
        if (aVar3 != null) {
            aVar3.a(inneractiveInfrastructureError);
        }
        InneractiveAdRequest inneractiveAdRequest = this.f15463a;
        com.fyber.inneractive.sdk.response.e eVar = this.f15464b;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f15469g;
        JSONArray jSONArrayB = rVar == null ? null : rVar.b();
        if (inneractiveInfrastructureError.getErrorCode() == InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_FAILED_TO_LOAD_AD;
            if (!inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
                IAlog.a("Firing Event 402 - NativeAdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                JSONObject jSONObject = new JSONObject();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.f16128b = tVar;
                wVar.f16127a = inneractiveAdRequest;
                wVar.f16130d = jSONArrayB;
                if (inneractiveInfrastructureError.getCause() != null) {
                    string = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    for (int i11 = 7; i11 >= 0 && i11 < 13 && i11 < stackTrace.length; i11++) {
                        sb2.append(stackTrace[i11].toString());
                        sb2.append(StringUtils.COMMA);
                    }
                    Log.d("stack trace:", sb2.toString());
                    string = sb2.toString();
                }
                String string2 = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
                try {
                    jSONObject.put("message", string2);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "message", string2);
                }
                try {
                    jSONObject.put(UnifiedMediationParams.KEY_DESCRIPTION, string);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", UnifiedMediationParams.KEY_DESCRIPTION, string);
                }
                String strDescription = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("extra_description", strDescription);
                } catch (Exception unused3) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "extra_description", strDescription);
                }
                wVar.f16132f.put(jSONObject);
                wVar.a((String) null);
                inneractiveInfrastructureError.addReportedError(tVar);
            }
        } else {
            a.a(inneractiveAdRequest, inneractiveInfrastructureError, this.f15465c, eVar, jSONArrayB);
        }
        cancel();
    }

    public void a() {
        int i10;
        InneractiveInfrastructureError inneractiveInfrastructureError;
        String strA = IAlog.a(this);
        Integer numValueOf = Integer.valueOf(this.f15471i - 1);
        int i11 = this.f15471i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f15472j;
        if (aVar != null) {
            if (aVar.f16106g) {
                i11 = aVar.f16100a - i11;
            }
            i10 = (aVar.f16101b * i11) + aVar.f16103d + (i11 == aVar.f16100a ? aVar.f16107h : 0);
        } else {
            i10 = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onTimeout() attempt: %d timeout: %d", strA, numValueOf, Integer.valueOf(i10));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.f15467e;
        if (bVar != null) {
            bVar.a();
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.f15472j;
        if (this.f15471i <= (aVar2 != null ? aVar2.f16100a : 0)) {
            inneractiveInfrastructureError = d();
        } else {
            inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.IN_FLIGHT_TIMEOUT, i.NO_TIME_TO_LOAD_AD_CONTENT);
        }
        com.fyber.inneractive.sdk.util.r.f18606a.execute(new e(new f(this.f15464b, this.f15463a, e(), this.f15469g.b()), inneractiveInfrastructureError));
        b(inneractiveInfrastructureError);
    }
}
