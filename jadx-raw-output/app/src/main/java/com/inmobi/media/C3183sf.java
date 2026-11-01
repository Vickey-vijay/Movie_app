package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3183sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3359zg f25325a;

    public C3183sf(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f25325a = new C3359zg(context, "omid_js_store");
    }
}
