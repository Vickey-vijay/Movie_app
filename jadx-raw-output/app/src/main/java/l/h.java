package l;

import android.app.Activity;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.inf.IComCallback;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdLoader;
import sg.bigo.ads.api.NativeAdRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f63334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f63335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f63336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainNativeAdCallBack f63337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f63338e;

    public h(w wVar, Activity activity, int i10, int i11, j.z zVar) {
        this.f63338e = wVar;
        this.f63334a = activity;
        this.f63335b = i10;
        this.f63336c = i11;
        this.f63337d = zVar;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f63338e.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new NativeAdLoader.Builder().withAdLoadListener((AdLoadListener<NativeAd>) new d0(this)).build().loadAd(new NativeAdRequest.Builder().withSlotId(this.f63338e.D).build());
    }
}
