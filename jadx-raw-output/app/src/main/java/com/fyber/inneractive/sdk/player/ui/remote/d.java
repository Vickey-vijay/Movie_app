package com.fyber.inneractive.sdk.player.ui.remote;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.r;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements com.fyber.inneractive.sdk.web.remoteui.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.remoteui.a f18090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.remoteui.b f18091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f18092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f18093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f18094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18095f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.g f18099j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18096g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18097h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f18100k = new b(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f18101l = new c(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18102m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18103n = false;

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f18607b.removeCallbacks(this.f18100k);
        String str2 = (map == null || !map.containsKey("failedURL")) ? this.f18095f : (String) map.get("failedURL");
        if (z10) {
            if (b() != null) {
                b().L = false;
            }
            a();
            t tVar = t.VAST_ERROR_DVC_FAILURE;
            t0 t0Var = this.f18092c;
            com.fyber.inneractive.sdk.network.events.a.a(tVar, bVar, t0Var != null ? t0Var.f15746a : null, b(), str, str2, Boolean.valueOf(this.f18098i));
        } else {
            t tVar2 = t.VAST_ERROR_DVC_FAILURE;
            String strName = bVar.name();
            t0 t0Var2 = this.f18092c;
            com.fyber.inneractive.sdk.network.events.a.a(tVar2, strName, str2, t0Var2 != null ? t0Var2.f15746a : null, b(), map, Boolean.valueOf(this.f18098i));
        }
        com.fyber.inneractive.sdk.web.remoteui.a aVar = this.f18090a;
        if (aVar != null) {
            aVar.a(bVar, str, z10, map);
        }
    }

    public final com.fyber.inneractive.sdk.response.e b() {
        t0 t0Var = this.f18092c;
        if (t0Var != null) {
            return t0Var.f15747b;
        }
        return null;
    }

    public d(Context context, t0 t0Var, String str) {
        InneractiveAdRequest inneractiveAdRequest;
        this.f18092c = t0Var;
        this.f18095f = str;
        com.fyber.inneractive.sdk.web.remoteui.b bVar = new com.fyber.inneractive.sdk.web.remoteui.b();
        this.f18091b = bVar;
        this.f18093d = new e(this);
        bVar.setCommandHandler(this);
        bVar.setResultFailureListener(this);
        bVar.setCommandHandler(this);
        if (t0Var != null) {
            inneractiveAdRequest = t0Var.f15746a;
        } else {
            inneractiveAdRequest = null;
        }
        this.f18099j = new com.fyber.inneractive.sdk.flow.g(context, true, inneractiveAdRequest, b(), null);
    }

    public final void a() {
        this.f18097h = true;
        this.f18094e = null;
        e eVar = this.f18093d;
        eVar.f18105b.clear();
        eVar.f18104a = null;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f18607b.removeCallbacks(this.f18100k);
        this.f18091b.setVisibility(8);
        this.f18091b.setUiReady(false);
        this.f18091b.destroy();
        this.f18099j = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap map) {
        d dVar;
        com.fyber.inneractive.sdk.flow.g gVar;
        g1 lastClickedLocation = this.f18091b.getLastClickedLocation();
        e eVar = this.f18093d;
        eVar.getClass();
        str.getClass();
        switch (str) {
            case "clickSkip":
                eVar.a(6, lastClickedLocation);
                break;
            case "expandCollapseClick":
                eVar.a(5, lastClickedLocation);
                break;
            case "appInfoClick":
                eVar.a(10, lastClickedLocation);
                break;
            case "shouldSkipUpdateUi.true":
                d dVar2 = eVar.f18104a;
                if (dVar2 != null) {
                    dVar2.f18102m = true;
                    break;
                }
                break;
            case "onGeneralError":
                d dVar3 = eVar.f18104a;
                if (dVar3 != null) {
                    dVar3.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_GENERAL_ERROR, (String) map.get("error"), "true".equalsIgnoreCase((String) map.get("shouldFailUi")), map);
                    break;
                }
                break;
            case "ctaClick":
                eVar.a(3, lastClickedLocation);
                break;
            case "isSkipEnabled.false":
                d dVar4 = eVar.f18104a;
                if (dVar4 != null) {
                    dVar4.f18103n = false;
                    break;
                }
                break;
            case "clickMuteUnmute":
                eVar.a(1, lastClickedLocation);
                break;
            case "DOMLoaded":
                String str2 = eVar.f18106c ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
                d dVar5 = eVar.f18104a;
                if (dVar5 != null) {
                    dVar5.f18091b.a(str2);
                }
                Iterator it = eVar.f18105b.keySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) eVar.f18105b.get((String) it.next());
                    if (!TextUtils.isEmpty(str3) && (dVar = eVar.f18104a) != null) {
                        dVar.f18091b.a(str3);
                    }
                }
                eVar.f18105b.clear();
                d dVar6 = eVar.f18104a;
                if (dVar6 != null) {
                    IAlog.a("%s : remote UI loaded successfully", "RemoteUIWebviewController");
                    IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
                    r.f18607b.removeCallbacks(dVar6.f18100k);
                    dVar6.f18096g = false;
                    dVar6.f18091b.setUiReady(true);
                    if (dVar6.b() != null) {
                        dVar6.b().L = true;
                    }
                    dVar6.f18091b.setVisibility(0);
                    break;
                }
                break;
            case "adIdentifierClick":
                d dVar7 = eVar.f18104a;
                if (dVar7 != null && (gVar = dVar7.f18099j) != null) {
                    gVar.a();
                    break;
                }
                break;
            case "shouldSkipUpdateUi.false":
                d dVar8 = eVar.f18104a;
                if (dVar8 != null) {
                    dVar8.f18102m = false;
                    break;
                }
                break;
            case "isSkipEnabled.true":
                d dVar9 = eVar.f18104a;
                if (dVar9 != null) {
                    dVar9.f18103n = true;
                    break;
                }
                break;
            case "onVideoClick":
                eVar.a(7, lastClickedLocation);
                break;
            case "onResourceError":
                d dVar10 = eVar.f18104a;
                if (dVar10 != null) {
                    dVar10.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_RESOURCE_ERROR, (String) map.get("error"), true, map);
                    break;
                }
                break;
            default:
                IAlog.a("%s: unknown command: %s", "RemoteUiCommandHandler", str);
                break;
        }
        d dVar11 = eVar.f18104a;
        if (dVar11 != null) {
            dVar11.f18091b.a("FyberRemoteUiBridge.nativeCallComplete()");
        }
    }
}
