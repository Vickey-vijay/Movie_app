package com.unity3d.services.core.network.core;

import android.content.Context;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: CronetEngineBuilderFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CronetEngineBuilderFactory {
    public final CronetEngine.Builder createCronetEngineBuilder(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return new CronetEngine.Builder(context);
    }
}
