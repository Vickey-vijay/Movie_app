package com.fyber.inneractive.sdk.flow.storepromo.loader;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.network.l0;
import com.fyber.inneractive.sdk.network.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f15626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CountDownLatch f15627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.b f15628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.model.c f15629d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15631f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f15630e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15632g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15633h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15634i = false;

    public final void a(com.fyber.inneractive.sdk.flow.storepromo.events.a aVar, boolean z10, String str, String str2) {
        f fVar;
        this.f15627b.countDown();
        if (this.f15634i) {
            return;
        }
        if (z10) {
            this.f15634i = true;
            this.f15633h = true;
            a();
            if (TextUtils.isEmpty(str)) {
                str = "Something went wrong during promo's resources download";
            }
            com.fyber.inneractive.sdk.flow.storepromo.b bVar = this.f15628c;
            if (bVar != null) {
                if (aVar == null) {
                    aVar = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
                }
                bVar.a(aVar.name(), str, str2);
                return;
            }
            return;
        }
        if (this.f15627b.getCount() != 0 || this.f15633h) {
            return;
        }
        this.f15634i = true;
        Collections.sort(this.f15629d.f15668a);
        this.f15630e.clear();
        com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = this.f15628c;
        if (bVar2 != null) {
            com.fyber.inneractive.sdk.flow.storepromo.model.c cVar = this.f15629d;
            IAlog.a("StorePromoManager : onPromoLoadSucceed", new Object[0]);
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.controller.b(cVar, bVar2, bVar2, bVar2, bVar2.f15585b, bVar2.f15586c);
            bVar2.f15587d = bVar3;
            bVar2.f15590g = cVar.f15676i;
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar3.f15596c;
            if (cVar2 == null || (fVar = cVar2.f15606d) == null) {
                return;
            }
            r.f18606a.execute(new e(fVar, new d(fVar)));
        }
    }

    public g(v vVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        this.f15626a = vVar;
        this.f15631f = vVar.f15951f.size();
        this.f15628c = bVar;
        this.f15629d = new com.fyber.inneractive.sdk.flow.storepromo.model.c(vVar);
    }

    public final void a() {
        for (t0 t0Var : this.f15630e) {
            l0 l0Var = IAConfigManager.O.f15024s;
            String str = t0Var.f16091g;
            l0Var.getClass();
            t0Var.c();
        }
        this.f15630e.clear();
    }
}
