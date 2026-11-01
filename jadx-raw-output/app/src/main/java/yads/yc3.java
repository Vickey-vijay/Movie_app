package yads;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.G5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class yc3 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc3 f84883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rc3 f84884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d4 f84885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f84886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc3(zc3 zc3Var, rc3 rc3Var, d4 d4Var, Context context) {
        super(1);
        this.f84883b = zc3Var;
        this.f84884c = rc3Var;
        this.f84885d = d4Var;
        this.f84886e = context;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        nl2 nl2Var = (nl2) obj;
        zc3 zc3Var = this.f84883b;
        rc3 rc3Var = this.f84884c;
        d4 d4Var = this.f84885d;
        Context context = this.f84886e;
        nl2Var.a(G5.M, "UTF-8");
        zc3Var.f85342a.getClass();
        nl2Var.a("rnd", String.valueOf(new Random().nextInt(89999999) + 10000000));
        Map mapA = rc3Var.a();
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!lk.a0.n0(str)) {
                    nl2Var.a(str, str2);
                }
            }
        }
        jm0 jm0Var = d4Var.f76560b.f82016a;
        zc3Var.f85344c.getClass();
        if (!ox2.a(context)) {
            nl2Var.a(CommonUrlParts.UUID, jm0Var.b());
            nl2Var.a("mauid", jm0Var.f79099d);
        }
        zc3Var.f85343b.getClass();
        uw uwVar = new uw(nl2Var);
        xw.f84720a.getClass();
        zw zwVar = (zw) ww.a(context);
        uwVar.mo1invoke(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, zwVar.c());
        uwVar.mo1invoke(InMobiSdk.IM_GDPR_CONSENT_IAB, zwVar.b());
        uwVar.mo1invoke("parsed_purpose_consents", zwVar.d());
        uwVar.mo1invoke("parsed_vendor_consents", zwVar.e());
        uwVar.mo1invoke("cmp_present", Integer.valueOf(zwVar.a() ? 1 : 0).toString());
        new om0(context, d4Var).a(context, new nm0(nl2Var));
        return nl2Var;
    }
}
