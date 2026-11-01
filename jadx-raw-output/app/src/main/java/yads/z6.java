package yads;

import androidx.media3.common.Player;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f85226a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile rp0 f85227b;

    public static final void a(rp0 rp0Var) {
        f85227b = rp0Var;
        for (Player.Listener listener : f85226a) {
            if (f85227b != null) {
                rp0 rp0Var2 = f85227b;
                if (rp0Var2 != null) {
                    rp0Var2.f82374a.addListener(listener);
                }
            } else {
                f85226a.add(listener);
            }
        }
    }
}
