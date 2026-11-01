package ok;

import android.os.Looper;
import java.util.List;
import nk.y1;
import sk.r;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a implements r {
    @Override // sk.r
    public int a() {
        return 1073741823;
    }

    @Override // sk.r
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // sk.r
    public y1 c(List<? extends r> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(h.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
