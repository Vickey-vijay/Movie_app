package ta;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.NativeAdCallBack;
import com.wangxiong.sdk.view.NativeLoader;
import com.yk.e.object.AdInfo;
import em.q;

/* JADX INFO: compiled from: WxWorldNativeAD.java */
/* JADX INFO: loaded from: classes11.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f72322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f72323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NativeLoader f72324c;

    /* JADX INFO: compiled from: WxWorldNativeAD.java */
    public class a implements NativeAdCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f72325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f72326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f72327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f72328d;

        public a(String str, AdInfoDetailEntry adInfoDetailEntry, int i10, FrameLayout frameLayout) {
            this.f72325a = str;
            this.f72326b = adInfoDetailEntry;
            this.f72327c = i10;
            this.f72328d = frameLayout;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i(this.f72325a, "信息流广告-被点击");
            sa.c.c(3, this.f72326b.getAd_type(), this.f72326b.getAd_source_id(), this.f72327c, this.f72326b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainNativeAdCallBack
        public void onAdClose() {
            Log.i(this.f72325a, "信息流广告-被关闭");
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i(this.f72325a, "信息流广告-error = " + str);
            sa.c.c(1, this.f72326b.getAd_type(), this.f72326b.getAd_source_id(), this.f72327c, this.f72326b.getAd_id(), 0, 0, 0);
            sa.c.b("adposition:" + this.f72327c + " Ad_source_id:" + this.f72326b.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainNativeAdCallBack
        public void onAdLoaded(View view) {
            Log.i(this.f72325a, "信息流广告-收到数据");
            FrameLayout frameLayout = this.f72328d;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.f72328d.addView(view);
            sa.c.c(4, this.f72326b.getAd_type(), this.f72326b.getAd_source_id(), this.f72327c, this.f72326b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainNativeAdCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i(this.f72325a, "信息流广告-展示");
            sa.c.c(2, this.f72326b.getAd_type(), this.f72326b.getAd_source_id(), this.f72327c, this.f72326b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainNativeAdCallBack
        public void onAdVideoComplete() {
            Log.i(this.f72325a, "信息流广告-视频播放完成");
        }

        @Override // com.yk.e.callBack.MainNativeAdCallBack
        public void onAdVideoStart() {
            Log.i(this.f72325a, "信息流广告-视频开始播放");
        }
    }

    public void a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry, int i10) {
        try {
            this.f72322a = frameLayout;
            int iA = q.getResources().getDisplayMetrics().widthPixels - em.c.a(24.0f);
            NativeLoader nativeLoader = new NativeLoader(this.f72323b, adInfoDetailEntry.getSdk_ad_id(), new a("test", adInfoDetailEntry, i10, frameLayout));
            this.f72324c = nativeLoader;
            nativeLoader.setExpressWH(iA, 0);
            sa.c.c(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), i10, adInfoDetailEntry.getAd_id(), 0, 0, 0);
            this.f72324c.loadAd();
        } catch (Exception unused) {
        }
    }

    public j(Activity activity) {
        this.f72323b = activity;
    }
}
