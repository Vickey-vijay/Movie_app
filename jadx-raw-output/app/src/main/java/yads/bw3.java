package yads;

import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class bw3 extends rw3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bw3 f75999d = new bw3();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.rw3
    public final void a(boolean z10) {
        Iterator it = Collections.unmodifiableCollection(nw3.f80846c.f80847a).iterator();
        while (it.hasNext()) {
            ka kaVar = ((wv3) it.next()).f84355e;
            if (kaVar.f79343b.get() != 0) {
                ix3.f78850a.a((WebView) kaVar.f79343b.get(), "setState", z10 ? "foregrounded" : "backgrounded", kaVar.f79342a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.rw3
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(nw3.f80846c.f80848b).iterator();
        while (it.hasNext()) {
            View view = (View) ((wv3) it.next()).f84354d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
