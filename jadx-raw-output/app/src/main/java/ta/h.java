package ta;

import android.app.Activity;
import android.util.Log;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.RewardVideoAdCallBack;
import com.wangxiong.sdk.view.RewardVideoLoader;
import com.yk.e.object.AdInfo;

/* JADX INFO: compiled from: WxRewardAd.java */
/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f72317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RewardVideoLoader f72318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f72319c = "Wxtest";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RewardVideoAdCallBack f72320d = new a();

    /* JADX INFO: compiled from: WxRewardAd.java */
    public class a implements RewardVideoAdCallBack {
        public a() {
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i(h.this.f72319c, "激励视频广告被点击");
            i iVar = h.this.f72317a;
            if (iVar != null) {
                iVar.b();
            }
        }

        @Override // com.yk.e.callBack.MainVideoAdCallBack
        public void onAdClose() {
            Log.i(h.this.f72319c, "激励视频广告关闭");
            i iVar = h.this.f72317a;
            if (iVar != null) {
                iVar.c();
            }
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i(h.this.f72319c, "激励视频广告加载失败:" + str);
            i iVar = h.this.f72317a;
            if (iVar != null) {
                iVar.a(String.valueOf(i10), str);
            }
        }

        @Override // com.yk.e.callBack.MainVideoAdCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i(h.this.f72319c, "激励视频广告展示");
            i iVar = h.this.f72317a;
            if (iVar != null) {
                iVar.onAdShow();
            }
        }

        @Override // com.yk.e.callBack.MainVideoAdCallBack
        public void onAdVideoCache() {
            Log.i(h.this.f72319c, "激励视频广告收到数据");
            i iVar = h.this.f72317a;
            if (iVar != null) {
                iVar.d();
            }
        }

        @Override // com.yk.e.callBack.MainVideoAdCallBack
        public void onAdVideoComplete() {
            Log.i(h.this.f72319c, "激励视频广告播放完成");
        }

        @Override // com.yk.e.callBack.MainRewardVideoAdCallBack
        public void onReward(String str) {
            Log.i(h.this.f72319c, "可以发放奖励了,trans_id = " + str);
        }
    }

    public void a() {
        if (this.f72320d != null) {
            this.f72320d = null;
        }
        if (this.f72318b != null) {
            this.f72318b = null;
        }
        if (this.f72317a != null) {
            this.f72317a = null;
        }
    }

    public void b(i iVar) {
        this.f72317a = iVar;
    }

    public h(Activity activity, AdInfoDetailEntry adInfoDetailEntry) {
        this.f72318b = new RewardVideoLoader(activity, adInfoDetailEntry.getSdk_ad_id(), this.f72320d);
    }
}
