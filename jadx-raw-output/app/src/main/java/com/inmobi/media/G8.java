package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class G8 implements Pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J8 f22721a;

    public G8(J8 j10) {
        this.f22721a = j10;
    }

    @Override // com.inmobi.media.Pn
    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        ck.p.j(arrayList, "visibleViews");
        ck.p.j(arrayList2, "invisibleViews");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            H8 h10 = (H8) this.f22721a.f22904a.get(view);
            if (h10 == null) {
                this.f22721a.a(view);
            } else {
                H8 h11 = (H8) this.f22721a.f22905b.get(view);
                if (!ck.p.e(h10.f22788a, h11 != null ? h11.f22788a : null)) {
                    h10.f22791d = SystemClock.uptimeMillis();
                    this.f22721a.f22905b.put(view, h10);
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.f22721a.f22905b.remove((View) it2.next());
        }
        J8 j10 = this.f22721a;
        if (j10.f22908e.hasMessages(0)) {
            return;
        }
        j10.f22908e.postDelayed(j10.f22909f, j10.f22910g);
    }
}
