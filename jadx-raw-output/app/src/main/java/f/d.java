package f;

import android.app.Activity;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f52738b;

    public d(q qVar, Activity activity) {
        this.f52738b = qVar;
        this.f52737a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f52738b.v(i10 + ", " + str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        int i10;
        int i11;
        q qVar = this.f52738b;
        i.e eVar = qVar.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = 1000;
        }
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 570;
        }
        int i12 = qVar.B;
        if (i12 == 0) {
            qVar.B = (qVar.C * i10) / i11;
        } else {
            int i13 = qVar.C;
            if (i13 == 0) {
                qVar.C = (i12 * i11) / i10;
            } else {
                qVar.B = (int) (i10 * (i13 / i11));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(qVar.D);
        if (qVar.B == 0 && qVar.C == 0) {
            qVar.B = screenWidth;
            qVar.C = (i11 * screenWidth) / i10;
        }
        if (qVar.B >= screenWidth) {
            qVar.B = screenWidth;
            qVar.C = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(qVar.D);
        if (qVar.C >= screenHeight) {
            qVar.C = screenHeight;
            qVar.B = (i10 * screenHeight) / i11;
        }
        AdLog.d("expressWidth " + qVar.B);
        AdLog.d("expressHeight " + qVar.C);
        this.f52737a.runOnUiThread(new m(this));
    }
}
