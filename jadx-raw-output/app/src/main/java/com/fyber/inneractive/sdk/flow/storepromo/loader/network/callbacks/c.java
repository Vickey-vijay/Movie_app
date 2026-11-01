package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f15662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15663b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15664c;

    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String message;
        boolean z11;
        String str = (String) obj;
        if (this.f15663b) {
            IAlog.a("StorePromoTemplateCallback: onNetworkResult: the cached response was applied and this one being cached", new Object[0]);
            return;
        }
        IAlog.a("StorePromoTemplateCallback: onNetworkResult: fromCache: " + z10, new Object[0]);
        this.f15663b = true;
        if (str != null && exc == null) {
            g gVar = this.f15662a;
            gVar.getClass();
            IAlog.a("StorePromoResourcesLoader: onTemplateDownloaded", new Object[0]);
            gVar.f15629d.f15670c = str;
            gVar.a(null, false, null, null);
            return;
        }
        if (exc != null) {
            message = exc.getMessage() != null ? exc.getMessage() : exc.toString();
        } else {
            message = "";
        }
        String str2 = "Unable download store promo template, error: " + message;
        g gVar2 = this.f15662a;
        com.fyber.inneractive.sdk.flow.storepromo.events.a aVar = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
        String str3 = this.f15664c;
        if (com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.TEMPLATE_FAILURE == com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE) {
            int i10 = gVar2.f15631f;
            int i11 = gVar2.f15632g + 1;
            gVar2.f15632g = i11;
            z11 = i10 - i11 < 2;
        }
        gVar2.a(aVar, z11, str2, str3);
    }

    public c(g gVar, String str) {
        this.f15662a = gVar;
        this.f15664c = str;
    }
}
