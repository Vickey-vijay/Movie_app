package com.unity3d.services.core.fid;

import android.content.Context;
import ck.p;
import com.unity3d.services.core.reflection.GenericBridge;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Pair;
import nj.l0;

/* JADX INFO: compiled from: FIdStaticBridge.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class FIdStaticBridge extends GenericBridge {
    public FIdStaticBridge() {
        super(l0.g(new Pair(Constants.GET_INSTANCE, new Class[]{Context.class})), false);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return Constants.Companion.getClassName();
    }

    public final FIdBridge getInstance(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        Object objCallNonVoidMethod = callNonVoidMethod(Constants.GET_INSTANCE, null, context);
        if (objCallNonVoidMethod != null) {
            return new FIdBridge(objCallNonVoidMethod);
        }
        return null;
    }
}
