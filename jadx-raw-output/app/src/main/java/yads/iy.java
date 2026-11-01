package yads;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class iy implements gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f78851a;

    @Override // yads.gf
    public final void a(View view) {
        Iterator it = this.f78851a.iterator();
        while (it.hasNext()) {
            ((gf) it.next()).a(view);
        }
    }

    @Override // yads.gf
    public final void cancel() {
        Iterator it = this.f78851a.iterator();
        while (it.hasNext()) {
            ((gf) it.next()).cancel();
        }
    }

    public iy(List list) {
        this.f78851a = list;
    }
}
