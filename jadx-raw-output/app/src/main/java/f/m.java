package f;

import com.mbridge.msdk.out.MBMultiStateEnum;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f52750b;

    public m(d dVar) {
        this.f52750b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.f52750b;
        q qVar = dVar.f52738b;
        qVar.F = new MBNativeAdvancedHandler(dVar.f52737a, qVar.I, qVar.J);
        q qVar2 = this.f52750b.f52738b;
        MBNativeAdvancedHandler mBNativeAdvancedHandler = qVar2.F;
        int i10 = qVar2.C;
        mBNativeAdvancedHandler.setNativeViewSize((int) (((double) i10) * 1.28d), i10);
        this.f52750b.f52738b.F.setCloseButtonState(MBMultiStateEnum.negative);
        this.f52750b.f52738b.F.setPlayMuteState(1);
        this.f52750b.f52738b.F.autoLoopPlay(3);
        q qVar3 = this.f52750b.f52738b;
        qVar3.F.setAdListener(qVar3.K);
        this.f52750b.f52738b.F.load();
    }
}
