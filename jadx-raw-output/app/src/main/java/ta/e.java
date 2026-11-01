package ta;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.BannerCallBack;
import com.wangxiong.sdk.view.BannerAd;
import com.yk.e.object.AdInfo;
import em.q;

/* JADX INFO: compiled from: WxHome3BannerAD.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f72302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BannerAd f72303b;

    /* JADX INFO: compiled from: WxHome3BannerAD.java */
    public class a implements BannerCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f72304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f72305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f72306c;

        public a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry, int i10) {
            this.f72304a = frameLayout;
            this.f72305b = adInfoDetailEntry;
            this.f72306c = i10;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "banner广告-被点击");
            sa.c.c(3, this.f72305b.getAd_type(), this.f72305b.getAd_source_id(), this.f72306c, this.f72305b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdClose() {
            Log.i("TAG", "banner广告-关闭");
            FrameLayout frameLayout = this.f72304a;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("TAG", "banner广告-error = " + str);
            sa.c.c(1, this.f72305b.getAd_type(), this.f72305b.getAd_source_id(), this.f72306c, this.f72305b.getAd_id(), 0, 0, 0);
            sa.c.b("adposition:" + this.f72306c + " Ad_source_id:" + this.f72305b.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdLoaded(View view) {
            Log.i("TAG", "banner广告-缓存成功");
            this.f72304a.removeAllViews();
            this.f72304a.addView(view);
            sa.c.c(4, this.f72305b.getAd_type(), this.f72305b.getAd_source_id(), this.f72306c, this.f72305b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("TAG", "banner广告-展示");
            sa.c.c(2, this.f72305b.getAd_type(), this.f72305b.getAd_source_id(), this.f72306c, this.f72305b.getAd_id(), 1, 0, 0);
        }
    }

    public void a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry, int i10) {
        try {
            this.f72303b = new BannerAd(this.f72302a, adInfoDetailEntry.getSdk_ad_id(), new a(frameLayout, adInfoDetailEntry, i10));
            this.f72303b.setExpressWH(q.getResources().getDisplayMetrics().widthPixels - em.c.a(25.0f), 0);
            this.f72303b.loadAd();
            sa.c.c(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), i10, adInfoDetailEntry.getAd_id(), 0, 0, 0);
        } catch (Exception unused) {
        }
    }

    public e(Activity activity) {
        this.f72302a = activity;
    }
}
