package e;

import android.app.Activity;
import com.mbridge.msdk.out.MBMultiStateEnum;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f52314b;

    public z(q qVar, Activity activity) {
        this.f52314b = qVar;
        this.f52313a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f52314b.v(i10 + ", " + str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        int dimensionPixelOffset = this.f52313a.getResources().getDimensionPixelOffset(IDUtil.getDimen(this.f52313a, "dp_135"));
        q qVar = this.f52314b;
        int i10 = qVar.B;
        if (i10 == 0) {
            qVar.B = (qVar.C * (-1)) / dimensionPixelOffset;
        } else {
            int i11 = qVar.C;
            if (i11 == 0) {
                qVar.C = (i10 * dimensionPixelOffset) / (-1);
            } else {
                qVar.B = (int) ((-1) * (i11 / dimensionPixelOffset));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(qVar.L);
        if (qVar.B == 0 && qVar.C == 0) {
            qVar.B = screenWidth;
            qVar.C = (dimensionPixelOffset * screenWidth) / (-1);
        }
        if (qVar.B >= screenWidth) {
            qVar.B = screenWidth;
            qVar.C = (screenWidth * dimensionPixelOffset) / (-1);
        }
        int screenHeight = ScreenUtil.getScreenHeight(qVar.L);
        if (qVar.C >= screenHeight) {
            qVar.C = screenHeight;
            qVar.B = (screenHeight * (-1)) / dimensionPixelOffset;
        }
        AdLog.d("expressWidth " + qVar.B);
        AdLog.d("expressHeight " + qVar.C);
        q qVar2 = this.f52314b;
        qVar2.N = new MBNativeAdvancedHandler(this.f52313a, qVar2.Q, qVar2.R);
        this.f52314b.N.setNativeViewSize((int) (((double) dimensionPixelOffset) * 1.28d), dimensionPixelOffset);
        this.f52314b.N.setCloseButtonState(MBMultiStateEnum.negative);
        this.f52314b.N.setPlayMuteState(1);
        this.f52314b.N.autoLoopPlay(3);
        q qVar3 = this.f52314b;
        qVar3.N.setAdListener(qVar3.S);
        this.f52314b.N.load();
    }
}
