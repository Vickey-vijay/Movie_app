package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import ck.p;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.core.fid.FIdBridge;
import com.unity3d.services.core.fid.FIdStaticBridge;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import kotlin.c;
import nk.i;

/* JADX INFO: compiled from: AndroidFIdDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidFIdDataSource implements FIdDataSource {
    private FIdStaticBridge bridge;
    private final Context context;

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    public String invoke() {
        Task<String> appInstanceId;
        try {
            Result.a aVar = Result.Companion;
            FIdBridge fIdStaticBridge = this.bridge.getInstance(this.context);
            if (fIdStaticBridge != null && (appInstanceId = fIdStaticBridge.getAppInstanceId()) != null) {
                return (String) i.b(null, new AndroidFIdDataSource$invoke$1$1(appInstanceId, null), 1, null);
            }
            return null;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Object objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
            return (String) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
        }
    }

    public AndroidFIdDataSource(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
        this.bridge = new FIdStaticBridge();
    }
}
