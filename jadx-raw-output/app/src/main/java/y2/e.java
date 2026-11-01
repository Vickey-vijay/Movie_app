package y2;

import android.content.Context;
import android.view.ViewGroup;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.json.JSONObject;

/* JADX INFO: compiled from: MintegralFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f75245a = new e();

    /* JADX INFO: compiled from: MintegralFactory.kt */
    public static final class a implements y2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBBidNewInterstitialHandler f75246a;

        @Override // y2.b
        public void a(Context context, String str, String str2) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(str, "placementId");
            p.j(str2, "adUnitId");
            this.f75246a = new MBBidNewInterstitialHandler(context, str, str2);
        }

        @Override // y2.b
        public void b(NewInterstitialWithCodeListener newInterstitialWithCodeListener) {
            p.j(newInterstitialWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f75246a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setInterstitialVideoListener(newInterstitialWithCodeListener);
            }
        }

        @Override // y2.b
        public void loadFromBid(String str) {
            p.j(str, "bidToken");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f75246a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.loadFromBid(str);
            }
        }

        @Override // y2.b
        public void playVideoMute(int i10) {
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f75246a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.playVideoMute(i10);
            }
        }

        @Override // y2.b
        public void setExtraInfo(JSONObject jSONObject) {
            p.j(jSONObject, "jsonObject");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f75246a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setExtraInfo(jSONObject);
            }
        }

        @Override // y2.b
        public void showFromBid() {
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f75246a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.showFromBid();
            }
        }
    }

    /* JADX INFO: compiled from: MintegralFactory.kt */
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBNewInterstitialHandler f75247a;

        @Override // y2.g
        public void a(Context context, String str, String str2) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(str, "placementId");
            p.j(str2, "adUnitId");
            this.f75247a = new MBNewInterstitialHandler(context, str, str2);
        }

        @Override // y2.g
        public void b(NewInterstitialWithCodeListener newInterstitialWithCodeListener) {
            p.j(newInterstitialWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f75247a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.setInterstitialVideoListener(newInterstitialWithCodeListener);
            }
        }

        @Override // y2.g
        public void load() {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f75247a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.load();
            }
        }

        @Override // y2.g
        public void playVideoMute(int i10) {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f75247a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.playVideoMute(i10);
            }
        }

        @Override // y2.g
        public void show() {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f75247a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.show();
            }
        }
    }

    /* JADX INFO: compiled from: MintegralFactory.kt */
    public static final class c implements y2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBBidRewardVideoHandler f75248a;

        @Override // y2.c
        public void a(Context context, String str, String str2) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(str, "placementId");
            p.j(str2, "adUnitId");
            this.f75248a = new MBBidRewardVideoHandler(context, str, str2);
        }

        @Override // y2.c
        public void b(RewardVideoWithCodeListener rewardVideoWithCodeListener) {
            p.j(rewardVideoWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f75248a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.setRewardVideoListener(rewardVideoWithCodeListener);
            }
        }

        @Override // y2.c
        public void loadFromBid(String str) {
            p.j(str, "bidToken");
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f75248a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.loadFromBid(str);
            }
        }

        @Override // y2.c
        public void playVideoMute(int i10) {
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f75248a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.playVideoMute(i10);
            }
        }

        @Override // y2.c
        public void setExtraInfo(JSONObject jSONObject) {
            p.j(jSONObject, "jsonObject");
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f75248a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.setExtraInfo(jSONObject);
            }
        }

        @Override // y2.c
        public void showFromBid() {
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f75248a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.showFromBid();
            }
        }
    }

    /* JADX INFO: compiled from: MintegralFactory.kt */
    public static final class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBRewardVideoHandler f75249a;

        @Override // y2.h
        public void a(Context context, String str, String str2) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(str, "placementId");
            p.j(str2, "adUnitId");
            this.f75249a = new MBRewardVideoHandler(context, str, str2);
        }

        @Override // y2.h
        public void b(RewardVideoWithCodeListener rewardVideoWithCodeListener) {
            p.j(rewardVideoWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBRewardVideoHandler mBRewardVideoHandler = this.f75249a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.setRewardVideoListener(rewardVideoWithCodeListener);
            }
        }

        @Override // y2.h
        public void load() {
            MBRewardVideoHandler mBRewardVideoHandler = this.f75249a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.load();
            }
        }

        @Override // y2.h
        public void playVideoMute(int i10) {
            MBRewardVideoHandler mBRewardVideoHandler = this.f75249a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.playVideoMute(i10);
            }
        }

        @Override // y2.h
        public void show() {
            MBRewardVideoHandler mBRewardVideoHandler = this.f75249a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.show();
            }
        }
    }

    /* JADX INFO: renamed from: y2.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MintegralFactory.kt */
    public static final class C0800e implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBSplashHandler f75250a;

        @Override // y2.j
        public void a() {
            MBSplashHandler mBSplashHandler = this.f75250a;
            if (mBSplashHandler != null) {
                mBSplashHandler.preLoad();
            }
        }

        @Override // y2.j
        public void b(String str, String str2) {
            p.j(str, "placementId");
            p.j(str2, "adUnitId");
            this.f75250a = new MBSplashHandler(str, str2, true, 5);
        }

        @Override // y2.j
        public void c(MBSplashLoadWithCodeListener mBSplashLoadWithCodeListener) {
            p.j(mBSplashLoadWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBSplashHandler mBSplashHandler = this.f75250a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setSplashLoadListener(mBSplashLoadWithCodeListener);
            }
        }

        @Override // y2.j
        public void d(ViewGroup viewGroup, String str) {
            p.j(viewGroup, "group");
            p.j(str, "bidToken");
            MBSplashHandler mBSplashHandler = this.f75250a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(viewGroup, str);
            }
        }

        @Override // y2.j
        public void e(String str) {
            p.j(str, "token");
            MBSplashHandler mBSplashHandler = this.f75250a;
            if (mBSplashHandler != null) {
                mBSplashHandler.preLoadByToken(str);
            }
        }

        @Override // y2.j
        public void f(MBSplashShowListener mBSplashShowListener) {
            p.j(mBSplashShowListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBSplashHandler mBSplashHandler = this.f75250a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setSplashShowListener(mBSplashShowListener);
            }
        }

        @Override // y2.j
        public void g(ViewGroup viewGroup) {
            p.j(viewGroup, "group");
            MBSplashHandler mBSplashHandler = this.f75250a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(viewGroup);
            }
        }

        @Override // y2.j
        public void onDestroy() {
            MBSplashHandler mBSplashHandler = this.f75250a;
            if (mBSplashHandler != null) {
                mBSplashHandler.onDestroy();
            }
        }

        @Override // y2.j
        public void setExtraInfo(JSONObject jSONObject) {
            p.j(jSONObject, "jsonObject");
            MBSplashHandler mBSplashHandler = this.f75250a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setExtraInfo(jSONObject);
            }
        }
    }

    public static final y2.b a() {
        return new a();
    }

    public static final g b() {
        return new b();
    }

    public static final MBBannerView c(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return new MBBannerView(context);
    }

    public static final y2.c d() {
        return new c();
    }

    public static final h e() {
        return new d();
    }

    public static final j f() {
        return new C0800e();
    }
}
