package l;

import android.app.Activity;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdInfo;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends r {
    public MainNativeAdCallBack B;
    public NativeAd C;
    public d.b D;
    public AdInfo E;
    public long F = 0;
    public String G = "";
    public final d H = new d(this);

    @Override // j.n0
    public final boolean b() {
        return true;
    }

    @Override // j.n0
    public final boolean t() {
        try {
            return System.currentTimeMillis() - this.F > 3600000;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return true;
        }
    }

    @Override // l.r
    public final void B(Activity activity, int i10, int i11, j.z zVar) {
        this.B = zVar;
        this.G = this.f61590k.f54038c;
        AdLog.d("unitID " + this.G);
        AbstractC4043il.IL1Iii(activity, new g(this, activity, i10, i11));
        Constant.addFragmentListener(activity, new i(this));
    }
}
