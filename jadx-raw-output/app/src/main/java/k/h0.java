package k;

import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements MBSplashShowListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f62010b;

    public h0(z0 z0Var) {
        this.f62010b = z0Var;
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onAdClicked(MBridgeIds mBridgeIds) {
        MainSplashAdCallBack mainSplashAdCallBack = this.f62010b.D;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdClick();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onAdTick(MBridgeIds mBridgeIds, long j10) {
        AdLog.d("onAdTick");
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onDismiss(MBridgeIds mBridgeIds, int i10) {
        MainSplashAdCallBack mainSplashAdCallBack = this.f62010b.D;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdClose();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onShowFailed(MBridgeIds mBridgeIds, String str) {
        this.f62010b.v(str);
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onShowSuccessed(MBridgeIds mBridgeIds) {
        z0 z0Var = this.f62010b;
        MainSplashAdCallBack mainSplashAdCallBack = z0Var.D;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdShow(gl.r0.b(null, z0Var.f61585f));
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
        AdLog.d("onZoomOutPlayFinish");
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
        AdLog.d("onZoomOutPlayStart");
    }
}
