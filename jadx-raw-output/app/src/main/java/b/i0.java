package b;

import android.text.TextUtils;
import com.yk.e.activity.MainInterstitialActivity;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.pl.BaseAdPlayer;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 implements BaseAdPlayer.IPlayerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f4723a;

    public i0(MainInterstitialActivity mainInterstitialActivity) {
        this.f4723a = mainInterstitialActivity;
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayComplete() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f4723a.f51168Lil;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdVideoComplete();
        }
        if (this.f4723a.ILil.playable.equals("1")) {
            AdLog.d("playableUrlLoadFailed " + this.f4723a.LlLI1);
            MainInterstitialActivity mainInterstitialActivity = this.f4723a;
            if (mainInterstitialActivity.LlLI1) {
                mainInterstitialActivity.f51168Lil.onAdClick();
                mainInterstitialActivity.f51168Lil.onAdClose();
                MainInterstitialActivity mainInterstitialActivity2 = mainInterstitialActivity.IL1Iii;
                if (gl.c.f53460b == null) {
                    gl.c.f53460b = new gl.c();
                }
                gl.c.f53460b.a(mainInterstitialActivity2, 6, mainInterstitialActivity.ILil, mainInterstitialActivity.f3297ILl.adPlcID, false);
                mainInterstitialActivity.IL1Iii(mainInterstitialActivity.IL1Iii);
                return;
            }
            if (!TextUtils.isEmpty(mainInterstitialActivity.ILil.playableUrl)) {
                this.f4723a.f3302iILLL1.setVisibility(8);
                this.f4723a.f3307il.setVisibility(8);
                this.f4723a.Ilil.setVisibility(0);
                MainInterstitialActivity mainInterstitialActivity3 = this.f4723a;
                mainInterstitialActivity3.f3298IL.loadUrl(mainInterstitialActivity3.ILil.playableUrl);
                return;
            }
            AdLog.d("playableUrl is empty!");
            MainInterstitialActivity mainInterstitialActivity4 = this.f4723a;
            mainInterstitialActivity4.f51168Lil.onAdClick();
            mainInterstitialActivity4.f51168Lil.onAdClose();
            MainInterstitialActivity mainInterstitialActivity5 = mainInterstitialActivity4.IL1Iii;
            if (gl.c.f53460b == null) {
                gl.c.f53460b = new gl.c();
            }
            gl.c.f53460b.a(mainInterstitialActivity5, 6, mainInterstitialActivity4.ILil, mainInterstitialActivity4.f3297ILl.adPlcID, false);
            mainInterstitialActivity4.IL1Iii(mainInterstitialActivity4.IL1Iii);
        }
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayFailed(String str) {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f4723a.f51168Lil;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdFail(AdSdkStateCode.MAIN_RENDER_FAILED, str);
            return;
        }
        AdLog.e("mainAdCallBack is null, msg = " + str);
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onStartPlay() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f4723a.f51168Lil;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdVideoStart();
        }
    }
}
