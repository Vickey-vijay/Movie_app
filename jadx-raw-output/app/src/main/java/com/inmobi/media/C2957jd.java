package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2957jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2982kd f24602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f24604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ua f24606e;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44963i);
        p10.startActivity(p11);
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f24603b = jElapsedRealtime;
        InterfaceC3028m9 interfaceC3028m9 = this.f24602a.f24675g;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("PublisherViewClickHandler", "handleLandingPageUrl: viewTouchTimestamp=" + jElapsedRealtime + ", lastClickedAssetUrl=" + this.f24604c);
        }
        String str = this.f24604c;
        if (str != null) {
            a(str, this.f24605d);
        }
    }

    public final void b(String str, String str2) {
        ck.p.j(str, "url");
        InterfaceC3028m9 interfaceC3028m9 = this.f24602a.f24675g;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("PublisherViewClickHandler", "handleNativeAssetClickUrl: url=" + str + ", fallbackUrl=" + str2);
        }
        this.f24604c = str;
        this.f24605d = str2;
        C2982kd c2982kd = this.f24602a;
        if (c2982kd.f24670b.f22692a.f25027a.f22940f) {
            InterfaceC3028m9 interfaceC3028m10 = c2982kd.f24675g;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("PublisherViewClickHandler", "Lock screen ad clicked, firing callback only");
            }
            ((AbstractC2894h) this.f24602a.f24674f).a(kotlin.collections.a.j());
            return;
        }
        InterfaceC3028m9 interfaceC3028m11 = c2982kd.f24675g;
        if (interfaceC3028m11 != null) {
            ((C3053n9) interfaceC3028m11).a("PublisherViewClickHandler", "Firing onAdClicked callback and handling landing page URL");
        }
        ((AbstractC2894h) this.f24602a.f24674f).a(kotlin.collections.a.j());
        a();
    }

    public C2957jd(C2982kd c2982kd) {
        ck.p.j(c2982kd, "landingPageModel");
        this.f24602a = c2982kd;
        C2908hd c2908hd = new C2908hd(this);
        C2933id c2933id = new C2933id(this);
        this.f24606e = new Ua(c2982kd.f24669a, new Va(false, c2982kd.f24672d.f23908i, c2982kd.f24670b.f22692a.f25028b.isCCTEnabled(), 16), c2908hd, c2933id, c2982kd.f24672d, c2982kd.f24675g, 128);
    }

    public final void a(String str, String str2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24602a.f24675g;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("PublisherViewClickHandler", "handleLandingPageUrl: processing url=" + str + ", isNetworkUrl=" + URLUtil.isNetworkUrl(str));
        }
        Ta taA = Ua.a(this.f24606e, "nativeOpen", (String) null, str, (Ya) null, 24);
        InterfaceC3028m9 interfaceC3028m10 = this.f24602a.f24675g;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).a("PublisherViewClickHandler", "processOpenRequest result: " + taA.f23554a);
        }
        if (taA.f23554a == 1) {
            InterfaceC3028m9 interfaceC3028m11 = this.f24602a.f24675g;
            if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).a("PublisherViewClickHandler", "Redirection resolved successfully");
                return;
            }
            return;
        }
        if (str2 != null) {
            InterfaceC3028m9 interfaceC3028m12 = this.f24602a.f24675g;
            if (interfaceC3028m12 != null) {
                ((C3053n9) interfaceC3028m12).a("PublisherViewClickHandler", "Primary URL failed, trying fallback URL: " + str2);
            }
            a(str2, null);
            return;
        }
        InterfaceC3028m9 interfaceC3028m13 = this.f24602a.f24675g;
        if (interfaceC3028m13 != null) {
            ((C3053n9) interfaceC3028m13).b("PublisherViewClickHandler", "Landing Page Handling Failed - no fallback URL available");
        }
    }

    public final void b() {
        C2982kd c2982kd = this.f24602a;
        InterfaceC3028m9 interfaceC3028m9 = c2982kd.f24675g;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("PublisherViewClickHandler", "takeAction called, isLockScreen=" + c2982kd.f24670b.f22692a.f25027a.f22940f);
        }
        if (this.f24602a.f24670b.f22692a.f25027a.f22940f) {
            a();
        }
    }

    public final void a(Intent intent) {
        C2982kd c2982kd = this.f24602a;
        InterfaceC3028m9 interfaceC3028m9 = c2982kd.f24675g;
        if (interfaceC3028m9 != null) {
            G g10 = c2982kd.f24670b;
            ((C3053n9) interfaceC3028m9).a("PublisherViewClickHandler", "openEmbeddedBrowser: creativeId=" + g10.f22696e + ", placementId=" + g10.f22692a.f25027a.f22935a);
        }
        intent.putExtra("creativeId", this.f24602a.f24670b.f22696e);
        intent.putExtra("impressionId", this.f24602a.f24670b.f22704m.f22612b);
        intent.putExtra("placementId", this.f24602a.f24670b.f22692a.f25027a.f22935a);
        intent.putExtra("supportLockScreen", this.f24602a.f24671c);
        Context context = Ji.f22951a;
        Context context2 = this.f24602a.f24669a;
        ck.p.j(context2, GAMConfig.KEY_CONTEXT);
        ck.p.j(intent, "intent");
        if (!(context2 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context2, intent);
        InterfaceC3028m9 interfaceC3028m10 = this.f24602a.f24675g;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).a("PublisherViewClickHandler", "Embedded browser activity started");
        }
    }
}
