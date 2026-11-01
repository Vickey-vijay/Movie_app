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

/* JADX INFO: compiled from: WxDetailBannerAD.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f72292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BannerAd f72293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ta.a f72294c;

    /* JADX INFO: compiled from: WxDetailBannerAD.java */
    public class a implements BannerCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f72295a;

        public a(FrameLayout frameLayout) {
            this.f72295a = frameLayout;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "banner广告-被点击");
            ta.a aVar = c.this.f72294c;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdClose() {
            Log.i("TAG", "banner广告-关闭");
            ta.a aVar = c.this.f72294c;
            if (aVar != null) {
                aVar.c();
            }
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("TAG", "banner广告-error = " + str);
            ta.a aVar = c.this.f72294c;
            if (aVar != null) {
                aVar.a(String.valueOf(i10), str);
            }
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdLoaded(View view) {
            Log.i("TAG", "banner广告-缓存成功");
            FrameLayout frameLayout = this.f72295a;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                this.f72295a.addView(view);
            }
            ta.a aVar = c.this.f72294c;
            if (aVar != null) {
                aVar.onSuccess();
            }
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("TAG", "banner广告-展示");
            ta.a aVar = c.this.f72294c;
            if (aVar != null) {
                aVar.onAdShow();
            }
        }
    }

    public void a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry) {
        try {
            this.f72293b = new BannerAd(this.f72292a, adInfoDetailEntry.getSdk_ad_id(), new a(frameLayout));
            this.f72293b.setExpressWH(q.getResources().getDisplayMetrics().widthPixels - em.c.a(25.0f), 0);
            this.f72293b.loadAd();
        } catch (Exception unused) {
        }
    }

    public void b() {
        if (this.f72293b != null) {
            this.f72293b = null;
        }
        if (this.f72294c != null) {
            this.f72294c = null;
        }
    }

    public void c(ta.a aVar) {
        this.f72294c = aVar;
    }

    public c(Activity activity) {
        this.f72292a = activity;
    }
}
