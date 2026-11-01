package l;

import android.app.Activity;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainNativeAdCallBack;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends r {
    public MainNativeAdCallBack B;
    public NativeAd C;
    public String D = "";
    public final q E = new q(this);

    @Override // l.r
    public final void B(Activity activity, int i10, int i11, j.z zVar) {
        this.B = zVar;
        i.e eVar = this.f61590k;
        String str = eVar.f54036a;
        this.D = eVar.f54038c;
        AbstractC4043il.IL1Iii(activity, str, new h(this, activity, i10, i11, zVar));
    }
}
