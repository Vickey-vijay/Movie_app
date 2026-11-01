package h;

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
    public final /* synthetic */ Activity f53647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f53648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f53649c;

    public b(n nVar, Activity activity, LinearLayout linearLayout) {
        this.f53649c = nVar;
        this.f53647a = activity;
        this.f53648b = linearLayout;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f53649c.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        int i10;
        int i11;
        this.f53649c.G = new AdView(this.f53647a);
        n nVar = this.f53649c;
        nVar.G.setAdUnitId(nVar.K);
        this.f53649c.G.setAdSize(AdSize.LARGE_BANNER);
        n nVar2 = this.f53649c;
        i.e eVar = nVar2.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = 1000;
        }
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 570;
        }
        Activity activity = this.f53647a;
        int i12 = nVar2.B;
        if (i12 == 0) {
            nVar2.B = (nVar2.C * i10) / i11;
        } else {
            int i13 = nVar2.C;
            if (i13 == 0) {
                nVar2.C = (i12 * i11) / i10;
            } else {
                nVar2.B = (int) (i10 * (i13 / i11));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (nVar2.B == 0 && nVar2.C == 0) {
            nVar2.B = screenWidth;
            nVar2.C = (i11 * screenWidth) / i10;
        }
        if (nVar2.B >= screenWidth) {
            nVar2.B = screenWidth;
            nVar2.C = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (nVar2.C >= screenHeight) {
            nVar2.C = screenHeight;
            nVar2.B = (i10 * screenHeight) / i11;
        }
        AdLog.d(nVar2.E, "expressWidth " + nVar2.B);
        AdLog.d(nVar2.E, "expressHeight " + nVar2.C);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f53648b.getLayoutParams();
        n nVar3 = this.f53649c;
        layoutParams.width = nVar3.B;
        layoutParams.height = nVar3.C;
        nVar3.H.setLayoutParams(layoutParams);
        this.f53648b.removeAllViews();
        this.f53648b.addView(this.f53649c.G);
        n nVar4 = this.f53649c;
        nVar4.G.setAdListener(nVar4.L);
        this.f53649c.G.loadAd(new AdRequest.Builder().build());
    }
}
