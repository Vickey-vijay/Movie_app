package com.unity3d.ads.core.extensions;

import android.content.Context;
import ck.p;
import com.ironsource.Y5;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;

/* JADX INFO: compiled from: ContextExtensions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ContextExtensionsKt {
    public static final File unityAdsDataStoreFile(Context context, String str) {
        p.j(context, "<this>");
        p.j(str, Y5.c.f27928b);
        return new File(context.getApplicationContext().getFilesDir(), UnityAdsConstants.Cache.DATASTORE_PATH + str);
    }
}
