package fl;

import android.app.Activity;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f52966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f52967c;

    public b(n nVar, Activity activity, LinearLayout linearLayout) {
        this.f52967c = nVar;
        this.f52965a = activity;
        this.f52966b = linearLayout;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f52967c.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        int i10;
        int i11;
        AdSize adSize;
        this.f52967c.G = new AdView(this.f52965a);
        n nVar = this.f52967c;
        nVar.G.setAdUnitId(nVar.K);
        n nVar2 = this.f52967c;
        i.e eVar = nVar2.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = 1000;
        }
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 570;
        }
        AdView adView = nVar2.G;
        try {
            adSize = (i10 == 1000 && i11 == 570) ? AdSize.LARGE_BANNER : AdSize.BANNER;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            adSize = AdSize.BANNER;
        }
        adView.setAdSize(adSize);
        n nVar3 = this.f52967c;
        Activity activity = this.f52965a;
        int i12 = nVar3.B;
        if (i12 == 0) {
            nVar3.B = (nVar3.C * i10) / i11;
        } else {
            int i13 = nVar3.C;
            if (i13 == 0) {
                nVar3.C = (i12 * i11) / i10;
            } else {
                nVar3.B = (int) (i10 * (i13 / i11));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (nVar3.B == 0 && nVar3.C == 0) {
            nVar3.B = screenWidth;
            nVar3.C = (i11 * screenWidth) / i10;
        }
        if (nVar3.B >= screenWidth) {
            nVar3.B = screenWidth;
            nVar3.C = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (nVar3.C >= screenHeight) {
            nVar3.C = screenHeight;
            nVar3.B = (i10 * screenHeight) / i11;
        }
        AdLog.d(nVar3.E, "expressWidth " + nVar3.B);
        AdLog.d(nVar3.E, "expressHeight " + nVar3.C);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f52966b.getLayoutParams();
        n nVar4 = this.f52967c;
        layoutParams.width = nVar4.B;
        layoutParams.height = nVar4.C;
        nVar4.H.setLayoutParams(layoutParams);
        this.f52966b.removeAllViews();
        this.f52966b.addView(this.f52967c.G);
        n nVar5 = this.f52967c;
        nVar5.G.setAdListener(nVar5.L);
        this.f52967c.G.loadAd(new AdRequest.Builder().build());
    }
}
