package com.fyber.inneractive.sdk.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.mraid.e0;
import com.fyber.inneractive.sdk.mraid.f0;
import com.fyber.inneractive.sdk.mraid.k;
import com.fyber.inneractive.sdk.mraid.l;
import com.fyber.inneractive.sdk.mraid.n;
import com.fyber.inneractive.sdk.mraid.o;
import com.fyber.inneractive.sdk.mraid.p;
import com.fyber.inneractive.sdk.mraid.q;
import com.fyber.inneractive.sdk.mraid.s;
import com.fyber.inneractive.sdk.mraid.t;
import com.fyber.inneractive.sdk.mraid.u;
import com.fyber.inneractive.sdk.mraid.v;
import com.fyber.inneractive.sdk.mraid.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.b0;
import com.fyber.inneractive.sdk.web.c0;
import com.fyber.inneractive.sdk.web.d0;
import com.fyber.inneractive.sdk.web.g0;
import com.fyber.inneractive.sdk.web.i0;
import com.fyber.inneractive.sdk.web.j1;
import com.fyber.inneractive.sdk.web.m;
import com.fyber.inneractive.sdk.web.z;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public class IAmraidWebViewController extends i0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final f f18522p0;

    public static class MraidVideoFailedToDisplayError extends InneractiveUnitController.AdDisplayError {
        public MraidVideoFailedToDisplayError() {
            super("an MRAID video has not started playing in a timely fashion");
        }
    }

    public IAmraidWebViewController(boolean z10, c0 c0Var, z zVar, d0 d0Var, boolean z11, com.fyber.inneractive.sdk.measurement.e eVar, r rVar) {
        super(z10, c0Var, zVar, d0Var, eVar, rVar);
        this.f18522p0 = new f(this);
        this.F = z11;
        this.f18682b.setId(R.id.ia_inneractive_webview_mraid);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final boolean a(String str, g1 g1Var) {
        com.fyber.inneractive.sdk.mraid.f gVar;
        m mVar;
        Uri uri = Uri.parse(str);
        String string = uri.toString();
        uri.getScheme();
        if (string.startsWith("iaadfinishedloading")) {
            if (string.endsWith("success")) {
                IAlog.e("received iaadfinishedloading success", new Object[0]);
                if (!this.f18681a && this.f18686f != null && (mVar = this.f18682b) != null) {
                    mVar.a();
                    this.f18681a = true;
                    q();
                }
            }
            return true;
        }
        String scheme = Uri.parse(str).getScheme();
        m mVar2 = this.f18682b;
        if (mVar2 != null && mVar2.isShown() && this.N != f0.HIDDEN) {
            if (!"mraid".equals(scheme)) {
                return false;
            }
            URI uriCreate = URI.create(str);
            String host = uriCreate.getHost();
            try {
                LinkedHashMap linkedHashMapA = i0.a(uriCreate);
                switch (com.fyber.inneractive.sdk.mraid.j.f15978a[k.a(host).ordinal()]) {
                    case 1:
                        gVar = new com.fyber.inneractive.sdk.mraid.g(linkedHashMapA, this, g1Var);
                        break;
                    case 2:
                        gVar = new com.fyber.inneractive.sdk.mraid.i(linkedHashMapA, this, g1Var);
                        break;
                    case 3:
                        gVar = new w(linkedHashMapA, this, g1Var);
                        break;
                    case 4:
                        gVar = new q(linkedHashMapA, this, g1Var);
                        break;
                    case 5:
                        gVar = new s(linkedHashMapA, this, g1Var);
                        break;
                    case 6:
                        gVar = new o(linkedHashMapA, this, g1Var);
                        break;
                    case 7:
                        gVar = new u(linkedHashMapA, this, g1Var);
                        break;
                    case 8:
                        gVar = new t(linkedHashMapA, this, g1Var);
                        break;
                    case 9:
                        gVar = new com.fyber.inneractive.sdk.mraid.r(linkedHashMapA, this, g1Var);
                        break;
                    case 10:
                        gVar = new v(linkedHashMapA, this, g1Var);
                        break;
                    case 11:
                        gVar = new l(linkedHashMapA, this, g1Var);
                        break;
                    case 12:
                        gVar = new com.fyber.inneractive.sdk.mraid.m(linkedHashMapA, this, g1Var);
                        break;
                    case 13:
                        gVar = new n(linkedHashMapA, this, g1Var);
                        break;
                    case 14:
                        gVar = new p(linkedHashMapA, this, g1Var);
                        break;
                    case 15:
                        gVar = new com.fyber.inneractive.sdk.mraid.h(linkedHashMapA, this, g1Var);
                        break;
                    default:
                        gVar = null;
                        break;
                }
                if (gVar == null || ((gVar instanceof com.fyber.inneractive.sdk.mraid.i) && this.Q == c0.INTERSTITIAL)) {
                    m mVar3 = this.f18682b;
                    if (mVar3 != null) {
                        mVar3.a("window.mraidbridge.nativeCallComplete('" + host + "');");
                    }
                } else {
                    gVar.f15973a = host;
                    IAlog.e("Processing MRaid command: %s", host);
                    if (gVar instanceof com.fyber.inneractive.sdk.mraid.e) {
                        a(new com.fyber.inneractive.sdk.web.f0(this, (com.fyber.inneractive.sdk.mraid.e) gVar));
                    } else {
                        if (gVar.b()) {
                            i();
                        }
                        gVar.a();
                    }
                    m mVar4 = this.f18682b;
                    if (mVar4 != null) {
                        mVar4.a("window.mraidbridge.nativeCallComplete('" + host + "');");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void e() {
        b(false);
        Handler handler = com.fyber.inneractive.sdk.util.r.f18607b;
        handler.removeCallbacks(this.f18522p0);
        handler.removeCallbacks(this.J);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.measurement.tracker.e f() {
        return this.I;
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void n() {
        m mVar;
        if (this.C && this.D && this.A && (mVar = this.f18682b) != null) {
            mVar.a("FyberMraidVideoController.play()");
            f fVar = this.f18522p0;
            if (fVar != null) {
                com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(fVar, 5000L);
            }
            if (this.E) {
                this.f18682b.a("FyberMraidVideoController.mute(true)");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i1
    public final void k() {
        boolean z10;
        String externalStorageState;
        int size;
        super.k();
        m mVar = this.f18682b;
        boolean z11 = true;
        if (mVar != null && mVar.getContext() != null) {
            try {
                size = com.fyber.inneractive.sdk.util.o.f18599a.getPackageManager().queryIntentActivities(new Intent(this.f18682b.getContext(), (Class<?>) InneractiveRichMediaVideoPlayerActivityCore.class), 0).size();
            } catch (Throwable unused) {
                size = 0;
            }
            if (size > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        e0 e0Var = new e0();
        e0Var.f15969b = com.fyber.inneractive.sdk.util.k.n();
        e0Var.f15968a = com.fyber.inneractive.sdk.util.k.n();
        e0Var.f15970c = true;
        e0Var.f15972e = z10;
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (Throwable unused2) {
            externalStorageState = "";
        }
        if (!"mounted".equals(externalStorageState) || com.fyber.inneractive.sdk.util.o.f18599a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z11 = false;
        }
        e0Var.f15971d = z11;
        a(e0Var);
    }

    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final boolean a(WebView webView, String str) {
        r rVar;
        IAlog.a("IAmraidWebViewController: handleUrl = %s", str);
        if (this.f18682b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        }
        String lowerCase = str != null ? str.toLowerCase(Locale.US) : null;
        if (lowerCase != null) {
            Locale locale = Locale.US;
            if (lowerCase.startsWith("FyMraidVideo".toLowerCase(locale))) {
                if (lowerCase.endsWith("fyMraidVideoAd".toLowerCase(locale))) {
                    IAlog.e("Dispatching MRAID Video detection event", new Object[0]);
                    com.fyber.inneractive.sdk.response.e eVarB = this.f18700t;
                    if (eVarB == null) {
                        x xVar = this.f18699s;
                        eVarB = xVar == null ? null : xVar.b();
                    }
                    com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.MRAID_VIDEO_DETECTED;
                    InneractiveAdRequest inneractiveAdRequest = this.f18698r;
                    x xVar2 = this.f18699s;
                    JSONArray jSONArrayB = (xVar2 == null || (rVar = xVar2.f15748c) == null) ? null : rVar.b();
                    com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
                    wVar.f16129c = uVar;
                    wVar.f16127a = inneractiveAdRequest;
                    wVar.f16130d = jSONArrayB;
                    wVar.a((String) null);
                    this.D = true;
                    n();
                } else if (lowerCase.endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase(locale))) {
                    IAlog.b("MRAID Video has not started in a timely fashion, showing close button", new Object[0]);
                    j1 j1Var = this.f18687g;
                    if (j1Var != null) {
                        this.X = false;
                        ((b0) j1Var).b(false);
                        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION;
                        InneractiveAdRequest inneractiveAdRequest2 = this.f18698r;
                        x xVar3 = this.f18699s;
                        com.fyber.inneractive.sdk.response.e eVarB2 = xVar3 == null ? null : xVar3.b();
                        x xVar4 = this.f18699s;
                        JSONArray jSONArrayB2 = xVar4 == null ? null : xVar4.f15748c.b();
                        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVarB2);
                        wVar2.f16128b = tVar;
                        wVar2.f16127a = inneractiveAdRequest2;
                        wVar2.f16130d = jSONArrayB2;
                        wVar2.a("video_timeout_in_msecs", String.valueOf(5000)).a((String) null);
                    }
                    j1 j1Var2 = this.f18687g;
                    if (j1Var2 != null) {
                        ((b0) j1Var2).a(new MraidVideoFailedToDisplayError());
                    }
                } else if (str.toLowerCase(locale).endsWith("fyMraidVideoAdCompleted".toLowerCase(locale))) {
                    j1 j1Var3 = this.f18687g;
                    if (j1Var3 instanceof g0) {
                        ((com.fyber.inneractive.sdk.renderers.s) ((g0) j1Var3)).f18409a.J();
                    }
                }
                return true;
            }
        }
        return super.a(webView, str);
    }

    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.l
    public final void a(boolean z10) {
        m mVar;
        super.a(z10);
        if (this.D && this.C && this.A && (mVar = this.f18682b) != null) {
            StringBuilder sb2 = new StringBuilder("FyberMraidVideoController.");
            sb2.append(z10 ? "play" : CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            sb2.append("();");
            mVar.a(sb2.toString());
        }
        if (this.f18682b == null || !z10) {
            return;
        }
        Handler handler = com.fyber.inneractive.sdk.util.r.f18607b;
        handler.postDelayed(new g(this), 1L);
        handler.postDelayed(new g(this), 100L);
        handler.postDelayed(new g(this), 250L);
        handler.postDelayed(new g(this), 1000L);
    }
}
