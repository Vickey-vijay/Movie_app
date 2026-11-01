package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.media.W;
import com.inmobi.media.Z;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3070o1 f23874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f23875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3095p1 f23876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdConfig f23877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2808df f23878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3114pk f23879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23880g;

    public final Object a(P6 p10) {
        C3053n9 c3053n9 = this.f23874a.f24939c;
        if (c3053n9 != null) {
            c3053n9.a("AdFetchManager", "fetchAd Called");
        }
        String string = UUID.randomUUID().toString();
        ck.p.i(string, "toString(...)");
        Jg jg2 = this.f23876c.f25027a;
        Map map = jg2.f22937c;
        long j10 = jg2.f22935a;
        Context context = this.f23874a.f24938b;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        String str = context instanceof Activity ? ActivityChooserModel.ATTRIBUTE_ACTIVITY : "others";
        this.f23876c.getClass();
        return new Yn(new C3094p0(this.f23877d.getUrl(), new Ak(this.f23877d.getIncludeIdParams()), new C3044n0(string, map, j10, str, "native", kotlin.collections.a.j(), this.f23876c.f25027a.f22936b, this.f23877d.getRendering().getEnablePubMuteControl() && Ji.f22956f), this.f23879f, this.f23878e, this.f23874a.f24939c, this.f23880g).a(), this.f23874a.f24939c).a(new bk.l() { // from class: b7.h5
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Z.a(this.f4956b, (W) obj);
            }
        }, p10);
    }

    public Z(C3070o1 c3070o1, C3056nc c3056nc) {
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(c3056nc, "mediationSpecificConfig");
        this.f23874a = c3070o1;
        this.f23875b = new X(c3070o1.f24940d, c3070o1.f24942f);
        C3095p1 c3095p1 = c3070o1.f24937a;
        this.f23876c = c3095p1;
        AdConfig adConfig = c3095p1.f25028b;
        this.f23877d = adConfig;
        this.f23878e = new C2859ff(c3070o1.f24938b, c3070o1.f24939c).a();
        Integer num = c3056nc.f24891d;
        long jIntValue = num != null ? num.intValue() : 15000;
        Integer num2 = c3056nc.f24891d;
        long jIntValue2 = num2 != null ? num2.intValue() : 15000;
        Integer num3 = c3056nc.f24891d;
        this.f23879f = new C3114pk(jIntValue, jIntValue2, num3 != null ? num3.intValue() : 15000);
        this.f23880g = adConfig.getApplyGzipReq();
    }

    public static final mj.r a(Z z10, W w10) {
        ck.p.j(w10, "adFetchEvent");
        C3053n9 c3053n9 = z10.f23874a.f24939c;
        if (c3053n9 != null) {
            c3053n9.a("AdFetchManager", "adFetchEvent " + w10);
        }
        z10.f23875b.a(w10);
        return mj.r.f64562a;
    }
}
