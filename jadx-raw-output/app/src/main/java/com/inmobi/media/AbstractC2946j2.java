package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2946j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24579a;

    public abstract Object a(FrameLayout frameLayout, C2981kc c2981kc);

    public abstract Object a(ContinuationImpl continuationImpl);

    public abstract void a();

    public abstract void a(qk.l lVar);

    public abstract void b();

    public AbstractC2946j2(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f24579a = context;
    }
}
