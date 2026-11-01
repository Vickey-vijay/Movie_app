package com.inmobi.media;

import android.webkit.URLUtil;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class V7 implements Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23692a;

    @Override // com.inmobi.media.Gg
    public final Object a(rj.c cVar) {
        return mj.r.f64562a;
    }

    public V7(String str) {
        ck.p.j(str, "content");
        this.f23692a = str;
    }

    @Override // com.inmobi.media.Gg
    public final void a() {
        if (URLUtil.isValidUrl(lk.a0.k1(this.f23692a).toString())) {
            return;
        }
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2162);
        throw new Ig(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(map));
    }

    @Override // com.inmobi.media.Gg
    public final Object b() {
        return lk.a0.k1(this.f23692a).toString();
    }
}
