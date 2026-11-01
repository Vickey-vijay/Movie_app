package com.fyber.inneractive.sdk.flow.storepromo;

import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.storepromo.loader.f;
import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.flow.storepromo.ui.c;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.b, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f15583k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f15584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InneractiveAdRequest f15586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.b f15587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b f15588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15590g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f15591h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15592i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f15593j = new a();

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar = this.f15587d;
        if (bVar != null) {
            c cVar = bVar.f15597d;
            if (cVar != null) {
                if (cVar.f15685b != null && cVar.f15684a != null) {
                    cVar.f15687d.setAnimationListener(cVar.f15692i);
                    cVar.f15684a.setAnimation(cVar.f15687d);
                    cVar.f15684a.setVisibility(8);
                }
                if (cVar.f15685b != null) {
                    cVar.f15684a = null;
                    cVar.f15685b = null;
                }
                com.fyber.inneractive.sdk.flow.storepromo.ui.b bVar2 = cVar.f15688e;
                if (bVar2 != null) {
                    try {
                        o.f18599a.unregisterReceiver(bVar2);
                    } catch (Exception unused) {
                    }
                    cVar.f15688e = null;
                }
                cVar.f15689f = null;
                bVar.f15597d = null;
            }
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar.f15596c;
            if (cVar2 != null) {
                f fVar = cVar2.f15606d;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f15620a;
                    if (aVar != null) {
                        aVar.destroy();
                        fVar.f15620a = null;
                    }
                    fVar.f15624e = null;
                    fVar.f15623d = null;
                    fVar.f15622c = null;
                    fVar.f15625f = null;
                    fVar.f15621b = null;
                }
                com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar2 = cVar2.f15604b;
                if (aVar2 != null) {
                    aVar2.destroy();
                    cVar2.f15604b = null;
                }
                cVar2.f15608f = null;
                cVar2.f15609g = null;
                cVar2.f15605c = null;
                cVar2.f15606d = null;
                bVar.f15596c = null;
            }
            bVar.f15602i = null;
            bVar.f15598e = null;
            bVar.f15599f = null;
            bVar.f15601h = null;
            this.f15587d = null;
        }
    }

    public b(v vVar, e eVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f15584a = new g(vVar, this);
        this.f15589f = vVar.f15948c;
        this.f15585b = eVar;
        this.f15586c = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(g1 g1Var) {
        c cVar;
        View view;
        this.f15592i = true;
        com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar = this.f15588e;
        if (bVar != null) {
            bVar.a(g1Var);
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = this.f15587d;
        com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar2 == null || (cVar = bVar2.f15597d) == null || cVar.f15685b == null || (view = cVar.f15684a) == null || view.getParent() == null || cVar.f15685b.getVisibility() != 0) ? false : true, this.f15592i);
        Iterator it = this.f15591h.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it.next()).a(bVar3);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        a(bVar.name(), str, str2);
    }

    public final void a(String str, String str2, String str3) {
        IAlog.b("StorePromoManager: reportStorePromoError: %s, msg: %s", str, str2);
        if (this.f15593j != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f15586c;
            e eVar = this.f15585b;
            HashMap map = new HashMap(1);
            if (!TextUtils.isEmpty(str2)) {
                map.put("error", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                map.put("failedURL", str3);
            }
            com.fyber.inneractive.sdk.network.events.a.a(t.ERROR_STORE_PROMO_FAILURE, str, (String) null, inneractiveAdRequest, eVar, map, (Boolean) null);
            this.f15593j = null;
        }
    }
}
