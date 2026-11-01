package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: AndroidManifestIntPropertyReader.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidManifestIntPropertyReader {
    private final Context context;

    public AndroidManifestIntPropertyReader(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
    }

    public final Integer getPropertyByName(String str) {
        p.j(str, "propertyName");
        try {
            Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            Integer numValueOf = Integer.valueOf(bundle.getInt(str));
            numValueOf.intValue();
            if (bundle.containsKey(str)) {
                return numValueOf;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
