package ta;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.BannerCallBack;
import com.wangxiong.sdk.view.BannerAd;
import com.yk.e.object.AdInfo;

/* JADX INFO: compiled from: WxBannerAD.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f72286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BannerAd f72287b;

    /* JADX INFO: compiled from: WxBannerAD.java */
    public class a implements BannerCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f72288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f72289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f72290c;

        public a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry, int i10) {
            this.f72288a = frameLayout;
            this.f72289b = adInfoDetailEntry;
            this.f72290c = i10;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "banner广告-被点击");
            sa.c.c(3, this.f72289b.getAd_type(), this.f72289b.getAd_source_id(), this.f72290c, this.f72289b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdClose() {
            Log.i("TAG", "banner广告-关闭");
            FrameLayout frameLayout = this.f72288a;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("TAG", "banner广告-error = " + str);
            sa.c.c(1, this.f72289b.getAd_type(), this.f72289b.getAd_source_id(), this.f72290c, this.f72289b.getAd_id(), 0, 0, 0);
            sa.c.b("adposition:" + this.f72290c + " Ad_source_id:" + this.f72289b.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdLoaded(View view) {
            Log.i("TAG", "banner广告-缓存成功");
            this.f72288a.removeAllViews();
            this.f72288a.addView(view);
            sa.c.c(4, this.f72289b.getAd_type(), this.f72289b.getAd_source_id(), this.f72290c, this.f72289b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("TAG", "banner广告-展示");
            sa.c.c(2, this.f72289b.getAd_type(), this.f72289b.getAd_source_id(), this.f72290c, this.f72289b.getAd_id(), 1, 0, 0);
        }
    }

    public void a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry, int i10) {
        try {
            BannerAd bannerAd = new BannerAd(this.f72286a, adInfoDetailEntry.getSdk_ad_id(), new a(frameLayout, adInfoDetailEntry, i10));
            this.f72287b = bannerAd;
            bannerAd.loadAd();
            sa.c.c(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), i10, adInfoDetailEntry.getAd_id(), 0, 0, 0);
        } catch (Exception unused) {
        }
    }

    public b(Activity activity) {
        this.f72286a = activity;
    }
}
