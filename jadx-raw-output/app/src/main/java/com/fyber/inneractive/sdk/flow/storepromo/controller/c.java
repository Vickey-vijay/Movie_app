package com.fyber.inneractive.sdk.flow.storepromo.controller;

import com.fyber.inneractive.sdk.flow.storepromo.loader.f;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements com.fyber.inneractive.sdk.flow.storepromo.loader.a, com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a, com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b f15603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a f15604b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f15606d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.a f15608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f15609g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15607e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b f15605c = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b(this);

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a
    public final void a(String str, HashMap map) {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f15604b;
        if (aVar == null) {
            IAlog.b("StorePromoWebViewController: onCommandReceived: command: %s the webview is null", str);
            return;
        }
        g1 lastClickedLocation = aVar.getLastClickedLocation();
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b bVar = this.f15605c;
        if (bVar != null) {
            bVar.a(str, map, lastClickedLocation);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(HashMap map) {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void b() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f15604b;
        if (aVar != null) {
            aVar.a("DTStorePromoBridge.nativeCallComplete()");
        }
    }

    public c(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar, b bVar) {
        this.f15608f = aVar;
        this.f15609g = bVar;
        this.f15603a = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b(this, aVar);
        this.f15606d = new f(cVar, this);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(int i10, g1 g1Var) {
        if (i10 != 0) {
            b bVar = this.f15609g;
            if (bVar != null) {
                a aVar = a.INSTALL;
                IAlog.a("StorePromoView: onClick: type: " + aVar, new Object[0]);
                if (aVar == a.CLOSE) {
                    bVar.a();
                    return;
                }
                com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar2 = bVar.f15598e;
                if (bVar2 != null) {
                    bVar2.a(g1Var);
                    return;
                }
                return;
            }
            return;
        }
        b bVar3 = this.f15609g;
        if (bVar3 != null) {
            IAlog.a("StorePromoView: onClick: type: " + a.CLOSE, new Object[0]);
            bVar3.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar, com.fyber.inneractive.sdk.flow.storepromo.model.c cVar) {
        IAlog.a("StorePromoWebViewController: onContentLoadedSuccess: content is loaded successfully", new Object[0]);
        this.f15607e = true;
        this.f15604b = aVar;
        aVar.setWebViewClient(this.f15603a);
        com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar2 = this.f15608f;
        if (aVar2 != null) {
            aVar2.a(this.f15604b, cVar);
            this.f15608f = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        this.f15607e = false;
        com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar = this.f15608f;
        if (aVar != null) {
            aVar.a(bVar, str, str2);
            this.f15608f = null;
        }
    }
}
