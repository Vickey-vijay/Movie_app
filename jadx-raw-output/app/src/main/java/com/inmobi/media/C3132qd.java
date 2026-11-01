package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.AppMetrics;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.Sponsored;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3132qd extends AbstractC3317y implements InterfaceC2786cj, InterfaceC3160rh, InterfaceC2843f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f25174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f25175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2819e1 f25176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Nc f25177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ec f25178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Jc f25179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D4 f25180h;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() throws JSONException {
        NativeMedia media;
        AppMetrics appMetrics;
        Sponsored sponsored;
        CTA cta;
        Description description;
        Title title;
        Icon icon;
        AppMetrics appMetrics2;
        AppMetrics appMetrics3;
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeLoadedState", "Initialize Called");
        }
        Dc dc2 = (Dc) this.f25178f.f22588f.getValue();
        Map mapA = AbstractC2939ik.a(dc2.f22517a);
        long j10 = dc2.f22518b.f24102a;
        nk.l0 l0Var = AbstractC2940il.f24565a;
        mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        Wj wj2 = Wj.f23753a;
        Wj.b("AdLoadSuccessful", mapA, EnumC2735ak.SDK);
        this.f25177e.f23238b.f23072b.a(Te.f23560a);
        JsonAssetObject assetsObject = this.f25178f.f22584b.getAssetsObject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNative.APP_INSTALLS, (assetsObject == null || (appMetrics3 = assetsObject.getAppMetrics()) == null) ? null : appMetrics3.getDownloads());
        jSONObject.put(InMobiNative.LIKES, (assetsObject == null || (appMetrics2 = assetsObject.getAppMetrics()) == null) ? null : appMetrics2.getLikes());
        C2755be c2755be = new C2755be((assetsObject == null || (title = assetsObject.getTitle()) == null) ? null : title.getText(), (assetsObject == null || (description = assetsObject.getDescription()) == null) ? null : description.getText(), new InMobiNativeImage((assetsObject == null || (icon = assetsObject.getIcon()) == null) ? null : icon.getUrl()), (assetsObject == null || (cta = assetsObject.getCta()) == null) ? null : cta.getText(), jSONObject, (assetsObject == null || (sponsored = assetsObject.getSponsored()) == null) ? null : sponsored.getText(), (assetsObject == null || (appMetrics = assetsObject.getAppMetrics()) == null) ? null : appMetrics.getRating(), ck.p.e((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video"), this.f25174b, this.f25175c);
        Ac ac2 = this.f25178f.f22585c;
        ac2.getClass();
        ck.p.j(c2755be, "pubData");
        InterfaceC2786cj interfaceC2786cj = ac2.f22360c;
        Cd cd2 = interfaceC2786cj instanceof Cd ? (Cd) interfaceC2786cj : null;
        if (cd2 != null) {
            cd2.a(c2755be);
        }
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3132qd(MediaView mediaView, View view, AbstractC2819e1 abstractC2819e1, Nc nc2, Ec ec2, Jc jc2) {
        ck.p.j(abstractC2819e1, "adSessionManager");
        ck.p.j(nc2, "nativeBeaconProcessor");
        ck.p.j(ec2, "nativeAdUnitComponent");
        ck.p.j(jc2, "stateMachine");
        C3292x c3292x = ec2.f22583a;
        super(c3292x);
        this.f25174b = mediaView;
        this.f25175c = view;
        this.f25176d = abstractC2819e1;
        this.f25177e = nc2;
        this.f25178f = ec2;
        this.f25179g = jc2;
        G g10 = c3292x.f25677b;
        this.f25180h = new D4(g10.f22699h, g10.f22692a.f25027a.f22935a);
    }

    @Override // com.inmobi.media.InterfaceC3160rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        ck.p.j(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeLoadedState", "registerViewForTracking - parentView: " + inMobiNativeViewData.getParentView$media_release() + ", isAttachedToWindow: " + inMobiNativeViewData.getParentView$media_release().isAttachedToWindow());
        }
        G g10 = this.f25754a.f25677b;
        ck.p.j(g10, "<this>");
        long timeToLive = g10.f22692a.f25028b.getCacheConfig("native").getTimeToLive();
        long millis = g10.f22702k;
        if (millis == -1) {
            millis = g10.f22701j + TimeUnit.SECONDS.toMillis(timeToLive);
        }
        if (millis - System.currentTimeMillis() < 0) {
            InterfaceC3028m9 interfaceC3028m9L2 = l();
            if (interfaceC3028m9L2 != null) {
                ((C3053n9) interfaceC3028m9L2).a("NativeLoadedState", "Ad-Expired");
            }
            Map mapA = AbstractC2939ik.a(((Dc) this.f25178f.f22588f.getValue()).f22517a);
            Wj wj2 = Wj.f23753a;
            Wj.b("AdExpired", mapA, EnumC2735ak.SDK);
        }
        this.f25180h.a();
        C2767c0 c2767c0 = this.f25754a.f25676a.f24940d;
        c2767c0.getClass();
        c2767c0.f24105d = SystemClock.elapsedRealtime();
        this.f25177e.f23238b.f23074d.a(Te.f23560a);
        Map mapA2 = AbstractC2939ik.a(((Dc) this.f25178f.f22588f.getValue()).f22517a);
        Wj wj3 = Wj.f23753a;
        Wj.b("StartTracking", mapA2, EnumC2735ak.SDK);
        this.f25179g.a(new C3207te(new C3232ue(new C3186si(), new Sg(inMobiNativeViewData, this.f25174b, this.f25175c), this.f25180h, this.f25176d, this.f25177e, this.f25178f), this.f25179g), this);
    }

    @Override // com.inmobi.media.InterfaceC2843f
    public final Object a(rj.c cVar) throws Throwable {
        InterfaceC3028m9 interfaceC3028m9L = l();
        if (interfaceC3028m9L != null) {
            ((C3053n9) interfaceC3028m9L).a("NativeLoadedState", "onDestroy");
        }
        Object objA = this.f25179g.a(new Vc(), this, (ContinuationImpl) cVar);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }
}
