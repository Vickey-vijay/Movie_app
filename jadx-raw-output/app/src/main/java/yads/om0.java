package yads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.ironsource.Q6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class om0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw2 f81100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ox2 f81101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jg0 f81102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bh1 f81103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sd f81104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pm0 f81105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rd f81106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jm0 f81107h;

    public /* synthetic */ om0(Context context, d4 d4Var) {
        lw2 lw2Var = new lw2();
        ox2 ox2Var = new ox2();
        jg0 jg0Var = new jg0();
        Object obj = bh1.f75822f;
        this(d4Var, lw2Var, ox2Var, jg0Var, ah1.a(context), new sd(), new qm0());
    }

    public final void a(Context context, bk.p pVar) {
        String strP0;
        boolean z10;
        Location locationA;
        String str;
        pVar.mo1invoke("app_id", context.getPackageName());
        pVar.mo1invoke("app_version_code", og.a(context));
        pVar.mo1invoke(CommonUrlParts.APP_VERSION, og.b(context));
        pVar.mo1invoke("vast-integration-type", "inapp_sdk");
        pVar.mo1invoke("sdk_version", this.f81100a.a("%d.%d%d"));
        pVar.mo1invoke("sdk_version_name", this.f81100a.a("%d.%d.%d"));
        pVar.mo1invoke("sdk_vendor", "yandex");
        pVar.mo1invoke(((qm0) this.f81105f).b(), this.f81102c.a(context));
        yg1 yg1Var = this.f81102c.f79041b;
        yg1Var.getClass();
        Locale locale = context.getResources().getConfiguration().locale;
        yg1Var.f84950a.getClass();
        pVar.mo1invoke(CommonUrlParts.LOCALE, wg1.a(locale));
        pVar.mo1invoke("content_language", this.f81102c.f79041b.a(context));
        List listB = this.f81102c.f79041b.b(context);
        if (listB != null) {
            strP0 = nj.b0.p0(listB, StringUtils.COMMA, null, null, 0, null, null, 62, null);
        } else {
            strP0 = null;
        }
        pVar.mo1invoke("device_languages", strP0);
        String strC = ((qm0) this.f81105f).c();
        this.f81102c.getClass();
        pVar.mo1invoke(strC, jg0.a());
        String strD = ((qm0) this.f81105f).d();
        this.f81102c.getClass();
        pVar.mo1invoke(strD, Build.MODEL);
        String strE = ((qm0) this.f81105f).e();
        this.f81102c.getClass();
        pVar.mo1invoke(strE, "android");
        String strF = ((qm0) this.f81105f).f();
        this.f81102c.getClass();
        pVar.mo1invoke(strF, Build.VERSION.RELEASE);
        Boolean boolC = yc2.c(context);
        if (boolC != null) {
            if (boolC.booleanValue()) {
                str = "1";
            } else {
                str = "0";
            }
            pVar.mo1invoke("vpn_enabled", str);
        }
        boolean z11 = true;
        if ((!this.f81101b.b(context)) && (locationA = this.f81103d.a()) != null) {
            pVar.mo1invoke("location_timestamp", String.valueOf(locationA.getTime()));
            pVar.mo1invoke(Q6.f27466s, String.valueOf(locationA.getLatitude()));
            pVar.mo1invoke("lon", String.valueOf(locationA.getLongitude()));
            pVar.mo1invoke("precision", String.valueOf(Math.round(locationA.getAccuracy())));
        }
        if (!this.f81101b.b(context)) {
            pVar.mo1invoke(((qm0) this.f81105f).a(), this.f81107h.f79096a);
            pVar.mo1invoke(CommonUrlParts.APP_SET_ID, this.f81106g.f82198d);
            td tdVar = this.f81106g.f82195a;
            if (tdVar != null) {
                boolean z12 = tdVar.f82967b;
                String str2 = tdVar.f82966a;
                this.f81104e.getClass();
                if (str2 != null && str2.length() != 0 && !ck.p.e("00000000-0000-0000-0000-000000000000", str2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z12 && z10) {
                    pVar.mo1invoke("google_aid", str2);
                }
            }
            td tdVar2 = this.f81106g.f82196b;
            if (tdVar2 != null) {
                boolean z13 = tdVar2.f82967b;
                String str3 = tdVar2.f82966a;
                this.f81104e.getClass();
                if (str3 == null || str3.length() == 0 || ck.p.e("00000000-0000-0000-0000-000000000000", str3)) {
                    z11 = false;
                }
                if (!z13 && z11) {
                    pVar.mo1invoke("huawei_oaid", str3);
                }
            }
        }
        pVar.mo1invoke(CommonUrlParts.SCREEN_WIDTH, String.valueOf(kl3.d(context)));
        pVar.mo1invoke(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(kl3.b(context)));
        pVar.mo1invoke(CommonUrlParts.SCALE_FACTOR, String.valueOf(context.getResources().getDisplayMetrics().density));
        pVar.mo1invoke(CommonUrlParts.SCREEN_DPI, String.valueOf(kl3.a(context)));
    }

    public om0(d4 d4Var, lw2 lw2Var, ox2 ox2Var, jg0 jg0Var, bh1 bh1Var, sd sdVar, pm0 pm0Var) {
        this.f81100a = lw2Var;
        this.f81101b = ox2Var;
        this.f81102c = jg0Var;
        this.f81103d = bh1Var;
        this.f81104e = sdVar;
        this.f81105f = pm0Var;
        this.f81106g = d4Var.b();
        this.f81107h = d4Var.c();
    }
}
