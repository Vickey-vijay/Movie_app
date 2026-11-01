package il;

import android.app.Activity;
import android.view.View;
import com.yk.e.callBack.MainFloatViewCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import gl.g;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f54227b;

    public f(e eVar) {
        this.f54227b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainFloatViewCallback mainFloatViewCallback;
        MainFloatViewCallback mainFloatViewCallback2;
        MainFloatViewCallback mainFloatViewCallback3;
        e eVar = this.f54227b;
        eVar.N++;
        if (eVar.f61589j.adAreaType != 1) {
            if (!eVar.D && (mainFloatViewCallback = eVar.C) != null) {
                mainFloatViewCallback.onAdClose();
            }
            this.f54227b.D();
            return;
        }
        Activity activity = eVar.B;
        String str = eVar.f61588i;
        String str2 = eVar.f61581b;
        AdLog.i("addAdAreaCountData");
        String str3 = Constant.fileAdAreaTypeCount;
        HashMap<String, List<String>> map = Constant.adAreaNumMap;
        g.b(activity, str.toLowerCase(Locale.getDefault()), str2, str3, map);
        AdLog.d("addAdAreaCountData " + map.toString());
        e eVar2 = this.f54227b;
        if (eVar2.N == 1) {
            if (!eVar2.D && (mainFloatViewCallback3 = eVar2.C) != null) {
                mainFloatViewCallback3.onAdClick();
            }
            eVar2.m(eVar2.B, 27);
        }
        e eVar3 = this.f54227b;
        if (eVar3.N >= 2) {
            if (!eVar3.D && (mainFloatViewCallback2 = eVar3.C) != null) {
                mainFloatViewCallback2.onAdClose();
            }
            this.f54227b.D();
        }
    }
}
