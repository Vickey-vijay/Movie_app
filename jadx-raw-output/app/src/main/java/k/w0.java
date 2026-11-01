package k;

import android.os.Handler;
import android.os.Message;
import com.ironsource.Z7;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.IDUtil;
import java.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f62041b;

    public w0(x xVar) {
        this.f62041b = xVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        x xVar = this.f62041b;
        int i10 = xVar.C;
        if (i10 > 0) {
            xVar.C = i10 - 1;
            xVar.D.setText(IDUtil.getString(this.f62041b.G, "main_skip") + Z7.f27998r + this.f62041b.C);
            return false;
        }
        Timer timer = xVar.E;
        if (timer != null) {
            timer.cancel();
            xVar.E = null;
        }
        AdPlayer adPlayer = xVar.I;
        if (adPlayer != null) {
            adPlayer.release();
        }
        this.f62041b.F.onAdComplete();
        this.f62041b.F.onAdClose();
        return false;
    }
}
