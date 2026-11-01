package com.inmobi.media;

import android.content.Context;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3359zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ea f25848a;

    public C3359zg(Context context, String str) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        this.f25848a = Da.a(context, str);
    }

    public final String a(String str) {
        ck.p.j(str, C3426d4.i.W);
        Ea ea2 = this.f25848a;
        ea2.getClass();
        ck.p.j(str, C3426d4.i.W);
        return ea2.f22577a.getString(str, null);
    }
}
