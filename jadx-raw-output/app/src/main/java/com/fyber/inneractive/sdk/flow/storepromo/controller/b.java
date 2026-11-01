package com.fyber.inneractive.sdk.flow.storepromo.controller;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.k;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InneractiveAdRequest f15594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f15596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.ui.c f15597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b f15598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.b f15599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15600g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a f15601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f15602i;

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar = this.f15597d;
        if (cVar != null) {
            if (cVar.f15685b != null && cVar.f15684a != null) {
                cVar.f15687d.setAnimationListener(cVar.f15692i);
                cVar.f15684a.setAnimation(cVar.f15687d);
                cVar.f15684a.setVisibility(8);
            }
            k kVar = this.f15602i;
            if (kVar == null || kVar.f15376b.a() == null || kVar.f15376b.a().f().b() == null) {
                return;
            }
            IAlog.a("%sonStorePromoDismissed restoring endcard focus", IAlog.a(kVar));
            kVar.f15376b.a().f().b().requestFocus();
        }
    }

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar, com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar2, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar, e eVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f15601h = aVar;
        this.f15596c = new c(cVar, this, this);
        this.f15599f = bVar;
        this.f15594a = inneractiveAdRequest;
        this.f15595b = eVar;
        this.f15598e = bVar2;
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar, com.fyber.inneractive.sdk.flow.storepromo.model.c cVar) {
        this.f15597d = new com.fyber.inneractive.sdk.flow.storepromo.ui.c(IAConfigManager.O.f15027v.a(), aVar, this.f15599f);
        u uVar = u.VAST_EVENT_SP_LOADED;
        InneractiveAdRequest inneractiveAdRequest = this.f15594a;
        e eVar = this.f15595b;
        String str = cVar.f15675h;
        w wVar = new w(uVar, inneractiveAdRequest, eVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("templateURL", str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
        }
        wVar.f16132f.put(jSONObject);
        wVar.a((String) null);
        IAlog.a("StorePromoController: onContentLoadedSuccess", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        this.f15600g = true;
        a();
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f15601h;
        if (aVar != null) {
            aVar.a(bVar, str, str2);
        }
    }
}
