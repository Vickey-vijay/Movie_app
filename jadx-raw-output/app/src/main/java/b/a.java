package b;

import android.app.Activity;
import android.view.View;
import com.yk.e.activity.MainInterstitialActivity;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f4703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f4704c;

    public a(MainInterstitialActivity mainInterstitialActivity, Activity activity) {
        this.f4704c = mainInterstitialActivity;
        this.f4703b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainInterstitialActivity mainInterstitialActivity = this.f4704c;
        if (mainInterstitialActivity.ILil.adAreaType == 1) {
            Activity activity = this.f4703b;
            String str = mainInterstitialActivity.iIi1;
            String str2 = mainInterstitialActivity.f3304lIlii;
            AdLog.i("addAdAreaCountData");
            String str3 = Constant.fileAdAreaTypeCount;
            HashMap<String, List<String>> map = Constant.adAreaNumMap;
            gl.g.b(activity, str.toLowerCase(Locale.getDefault()), str2, str3, map);
            AdLog.d("addAdAreaCountData " + map.toString());
            MainInterstitialActivity mainInterstitialActivity2 = this.f4704c;
            Activity activity2 = this.f4703b;
            if (gl.c.f53460b == null) {
                mainInterstitialActivity2.getClass();
                gl.c.f53460b = new gl.c();
            }
            gl.c.f53460b.a(activity2, 6, mainInterstitialActivity2.ILil, mainInterstitialActivity2.f3297ILl.adPlcID, false);
            this.f4704c.f51168Lil.onAdClick();
            this.f4704c.f51168Lil.onAdClose();
            this.f4704c.IL1Iii(this.f4703b);
        }
    }
}
