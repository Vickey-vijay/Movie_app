package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3319y1 extends AbstractC3198t5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f25762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActivityManager f25765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ea f25766f;

    @Override // com.inmobi.media.AbstractC3198t5
    public final void b() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3319y1(Context context, C3223u5 c3223u5, long j10, int i10) {
        super(c3223u5);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3223u5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f25762b = context;
        this.f25763c = j10;
        this.f25764d = i10;
        Object systemService = context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.h(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.f25765e = (ActivityManager) systemService;
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        this.f25766f = Da.a(context, "appClose");
    }

    @Override // com.inmobi.media.AbstractC3198t5
    public final void a() {
        AbstractC2940il.a(new C3294x1(this, null));
    }
}
