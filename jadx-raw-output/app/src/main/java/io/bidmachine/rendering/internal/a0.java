package io.bidmachine.rendering.internal;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.model.Background;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 {
    public static final z a(Background background, Context context, io.bidmachine.rendering.internal.repository.a aVar) {
        ck.p.j(background, "<this>");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(aVar, "repository");
        return new z(context, aVar, background);
    }
}
