package ta;

import android.app.Activity;
import android.util.Log;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.view.FloatViewAdLoader;
import com.yk.e.callBack.MainFloatViewCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: compiled from: WxFloatViewAd.java */
/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f72297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FloatViewAdLoader f72298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdInfoDetailEntry f72299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MainFloatViewCallback f72300d = new a();

    /* JADX INFO: compiled from: WxFloatViewAd.java */
    public class a implements MainFloatViewCallback {
        public a() {
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "floatViewAd广告-onAdClick");
            sa.c.c(3, d.this.f72299c.getAd_type(), d.this.f72299c.getAd_source_id(), 18, d.this.f72299c.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainFloatViewCallback
        public void onAdClose() {
            Log.i("TAG", "floatViewAd广告-onAdClose");
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            sa.c.c(1, d.this.f72299c.getAd_type(), d.this.f72299c.getAd_source_id(), 18, d.this.f72299c.getAd_id(), 0, 0, 0);
            sa.c.b("adposition:18 Ad_source_id:" + d.this.f72299c.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainFloatViewCallback
        public void onAdHide() {
            Log.i("TAG", "floatViewAd广告-onAdHide");
        }

        @Override // com.yk.e.callBack.MainFloatViewCallback
        public void onAdLoaded() {
            d dVar = d.this;
            if (dVar.f72300d != null) {
                dVar.f72298b.show();
            }
            Log.i("TAG", "floatViewAd广告-缓存成功");
            sa.c.c(4, d.this.f72299c.getAd_type(), d.this.f72299c.getAd_source_id(), 18, d.this.f72299c.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainFloatViewCallback
        public void onAdShow(AdInfo adInfo) {
            Log.i("TAG", "floatViewAd广告-onAdShow");
            sa.c.c(2, d.this.f72299c.getAd_type(), d.this.f72299c.getAd_source_id(), 18, d.this.f72299c.getAd_id(), 1, 0, 0);
        }
    }

    public void c(AdInfoDetailEntry adInfoDetailEntry) {
        try {
            this.f72299c = adInfoDetailEntry;
            FloatViewAdLoader floatViewAdLoader = this.f72298b;
            if (floatViewAdLoader != null) {
                floatViewAdLoader.destroyFloatView();
            }
            this.f72298b = new FloatViewAdLoader(this.f72297a, adInfoDetailEntry.getSdk_ad_id(), this.f72300d);
            sa.c.c(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), 18, adInfoDetailEntry.getAd_id(), 0, 0, 0);
            this.f72298b.setExpressSize(gc.b.c(80.0f));
            this.f72298b.setLocationY(0.8f);
            this.f72298b.setLocationX(1.0f);
            this.f72298b.loadAd();
        } catch (Exception unused) {
        }
    }

    public void d() {
        FloatViewAdLoader floatViewAdLoader = this.f72298b;
        if (floatViewAdLoader != null) {
            floatViewAdLoader.destroyFloatView();
            this.f72300d = null;
        }
    }

    public d(Activity activity) {
        this.f72297a = activity;
    }
}
