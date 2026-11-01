package ta;

import android.app.Activity;
import android.util.Log;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.InterstitialAdCallBack;
import com.wangxiong.sdk.view.InterstitialAdLoader;
import com.yk.e.object.AdInfo;
import x9.e0;

/* JADX INFO: compiled from: WxPauseInterstitialAD.java */
/* JADX INFO: loaded from: classes11.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f72312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterstitialAdLoader f72313b;

    /* JADX INFO: compiled from: WxPauseInterstitialAD.java */
    public class a implements InterstitialAdCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f72314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f72315b;

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdVideoComplete() {
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdVideoStart() {
        }

        public a(AdInfoDetailEntry adInfoDetailEntry, int i10) {
            this.f72314a = adInfoDetailEntry;
            this.f72315b = i10;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "banner广告-被点击");
            sa.c.c(3, this.f72314a.getAd_type(), this.f72314a.getAd_source_id(), this.f72315b, this.f72314a.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdClose() {
            Log.i("aaaaaaaaaaa", "banner广告-关闭");
            tl.a.a().b(new e0(true));
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("TAG", "banner广告-error = " + str);
            sa.c.c(1, this.f72314a.getAd_type(), this.f72314a.getAd_source_id(), this.f72315b, this.f72314a.getAd_id(), 0, 0, 0);
            sa.c.b("adposition:" + this.f72315b + " Ad_source_id:" + this.f72314a.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdLoaded() {
            Log.i("TAG", "banner广告-缓存成功");
            if (g.this.f72313b != null) {
                g.this.f72313b.showAd();
            }
            sa.c.c(4, this.f72314a.getAd_type(), this.f72314a.getAd_source_id(), this.f72315b, this.f72314a.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("aaaaaaaaaaa", "banner广告-展示");
            tl.a.a().b(new e0(true));
            sa.c.c(2, this.f72314a.getAd_type(), this.f72314a.getAd_source_id(), this.f72315b, this.f72314a.getAd_id(), 1, 0, 0);
        }
    }

    public void b(AdInfoDetailEntry adInfoDetailEntry, int i10) {
        try {
            InterstitialAdLoader interstitialAdLoader = new InterstitialAdLoader(this.f72312a, adInfoDetailEntry.getSdk_ad_id(), new a(adInfoDetailEntry, i10));
            this.f72313b = interstitialAdLoader;
            interstitialAdLoader.loadAd();
            sa.c.c(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), i10, adInfoDetailEntry.getAd_id(), 0, 0, 0);
        } catch (Exception unused) {
        }
    }

    public void c() {
        if (this.f72313b != null) {
            this.f72313b = null;
        }
    }

    public g(Activity activity) {
        this.f72312a = activity;
    }
}
