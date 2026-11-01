package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3404c0 implements InterfaceC3386b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ac f28289a;

    @Override // com.ironsource.InterfaceC3386b0
    public void a(Activity activity, O9 o10) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(o10, C3426d4.i.f28559p0);
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + o10.g() + " adInstanceId=" + o10.e());
        this.f28289a.a(activity, o10, new HashMap());
    }

    public C3404c0(Ac ac2) {
        ck.p.j(ac2, "networkShowApi");
        this.f28289a = ac2;
    }

    @Override // com.ironsource.InterfaceC3386b0
    public boolean a(O9 o10) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        return this.f28289a.a(o10);
    }
}
