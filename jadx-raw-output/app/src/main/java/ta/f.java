package ta;

import android.app.Activity;
import android.util.Log;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.InterstitialAdCallBack;
import com.wangxiong.sdk.view.InterstitialAdLoader;
import com.yk.e.object.AdInfo;

/* JADX INFO: compiled from: WxInterstitialAD.java */
/* JADX INFO: loaded from: classes11.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f72308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterstitialAdLoader f72309b;

    /* JADX INFO: compiled from: WxInterstitialAD.java */
    public class a implements InterstitialAdCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f72310a;

        public a(AdInfoDetailEntry adInfoDetailEntry) {
            this.f72310a = adInfoDetailEntry;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "插屏广告-被点击");
            sa.c.c(3, this.f72310a.getAd_type(), this.f72310a.getAd_source_id(), 9, this.f72310a.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdClose() {
            Log.i("TAG", "插屏广告-关闭");
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("TAG", "插屏广告-error = " + str);
            sa.c.c(1, this.f72310a.getAd_type(), this.f72310a.getAd_source_id(), 9, this.f72310a.getAd_id(), 0, 0, 0);
            sa.c.b("adposition:9 Ad_source_id:" + this.f72310a.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdLoaded() {
            Log.i("TAG", "插屏广告-缓存完成");
            if (f.this.f72308a != null) {
                f.this.f72309b.showAd();
                sa.c.c(4, this.f72310a.getAd_type(), this.f72310a.getAd_source_id(), 9, this.f72310a.getAd_id(), 1, 0, 0);
            }
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("TAG", "插屏广告-展示");
            sa.c.c(2, this.f72310a.getAd_type(), this.f72310a.getAd_source_id(), 9, this.f72310a.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdVideoComplete() {
            Log.i("TAG", "插屏广告-视频播放完成");
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdVideoStart() {
            Log.i("TAG", "插屏广告-视频开始播放");
        }
    }

    public void b(AdInfoDetailEntry adInfoDetailEntry) {
        try {
            InterstitialAdLoader interstitialAdLoader = new InterstitialAdLoader(this.f72308a, adInfoDetailEntry.getSdk_ad_id(), new a(adInfoDetailEntry));
            this.f72309b = interstitialAdLoader;
            interstitialAdLoader.loadAd();
            sa.c.c(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), 9, adInfoDetailEntry.getAd_id(), 0, 0, 0);
            this.f72309b.setVideoHasVoice(false);
        } catch (Exception unused) {
        }
    }

    public f(Activity activity) {
        this.f72308a = activity;
    }
}
