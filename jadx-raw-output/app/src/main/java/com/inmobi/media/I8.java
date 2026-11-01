package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class I8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f22850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f22851c;

    public I8(J8 j10) {
        ck.p.j(j10, "impressionTracker");
        this.f22849a = I8.class.getSimpleName();
        this.f22850b = new ArrayList();
        this.f22851c = new WeakReference(j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ck.p.i(this.f22849a, "TAG");
        J8 j10 = (J8) this.f22851c.get();
        if (j10 != null) {
            for (Map.Entry entry : j10.f22905b.entrySet()) {
                View view = (View) entry.getKey();
                H8 h10 = (H8) entry.getValue();
                ck.p.i(this.f22849a, "TAG");
                Objects.toString(h10);
                if (SystemClock.uptimeMillis() - h10.f22791d >= h10.f22790c) {
                    ck.p.i(this.f22849a, "TAG");
                    C3076o7 c3076o7 = j10.f22911h;
                    c3076o7.getClass();
                    if (view instanceof GestureDetectorOnGestureListenerC2785ci) {
                        InterfaceC3028m9 interfaceC3028m9 = c3076o7.f24962a.f25151f;
                        if (interfaceC3028m9 != null) {
                            ((C3053n9) interfaceC3028m9).a("HtmlAdTracker", "fireImpression");
                        }
                        ((GestureDetectorOnGestureListenerC2785ci) view).u();
                    }
                    this.f22850b.add(view);
                }
            }
            Iterator it = this.f22850b.iterator();
            while (it.hasNext()) {
                j10.a((View) it.next());
            }
            this.f22850b.clear();
            if (j10.f22905b.isEmpty() || j10.f22908e.hasMessages(0)) {
                return;
            }
            j10.f22908e.postDelayed(j10.f22909f, j10.f22910g);
        }
    }
}
