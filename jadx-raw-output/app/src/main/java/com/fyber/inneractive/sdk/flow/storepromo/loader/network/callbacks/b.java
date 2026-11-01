package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f15658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.model.b f15659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15661d;

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.b bVar, String str, g gVar) {
        this.f15659b = bVar;
        this.f15660c = str;
        this.f15658a = gVar;
        this.f15661d = -1;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String message;
        com.fyber.inneractive.sdk.flow.storepromo.loader.network.b bVar;
        boolean z11;
        String str = (String) obj;
        if (str != null && exc == null) {
            g gVar = this.f15658a;
            com.fyber.inneractive.sdk.flow.storepromo.model.b bVar2 = this.f15659b;
            int i10 = this.f15661d;
            gVar.getClass();
            IAlog.a("StorePromoResourcesLoader: onAssetDownloaded: type: %s, sortIndex: %s", bVar2, Integer.valueOf(i10));
            com.fyber.inneractive.sdk.flow.storepromo.model.c cVar = gVar.f15629d;
            cVar.f15668a.add(new com.fyber.inneractive.sdk.flow.storepromo.model.a(str, bVar2, i10));
            if (bVar2 == com.fyber.inneractive.sdk.flow.storepromo.model.b.SCREENSHOT) {
                cVar.f15676i++;
            }
            gVar.a(null, false, null, null);
            return;
        }
        com.fyber.inneractive.sdk.flow.storepromo.events.a aVar = exc instanceof com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a ? com.fyber.inneractive.sdk.flow.storepromo.events.a.FILE_SIZE_EXCEEDS_LIMIT : com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.model.b bVar3 = this.f15659b;
        if (exc != null) {
            message = exc.getMessage() != null ? exc.getMessage() : exc.toString();
        } else {
            message = "";
        }
        String str2 = "Unable download store promo asset type: " + bVar3 + ", error: " + message;
        g gVar2 = this.f15658a;
        String str3 = this.f15660c;
        int i11 = a.f15657a[this.f15659b.ordinal()];
        if (i11 == 1) {
            bVar = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.APP_ICON_FAILURE;
        } else if (i11 == 2) {
            bVar = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE;
        } else if (i11 != 3) {
            bVar = i11 != 4 ? com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.UNKNOWN_FAILURE : com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.RATING_ICON_FAILURE;
        } else {
            bVar = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.VIDEO_FAILURE;
        }
        if (bVar == com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE) {
            int i12 = gVar2.f15631f;
            int i13 = gVar2.f15632g + 1;
            gVar2.f15632g = i13;
            z11 = i12 - i13 < 2;
        }
        gVar2.a(aVar, z11, str2, str3);
    }

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.b bVar, String str, g gVar, int i10) {
        this.f15659b = bVar;
        this.f15660c = str;
        this.f15658a = gVar;
        this.f15661d = i10;
    }
}
