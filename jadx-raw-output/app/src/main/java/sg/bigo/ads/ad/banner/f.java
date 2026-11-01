package sg.bigo.ads.ad.banner;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<WeakReference<sg.bigo.ads.ad.c>> f67519a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static f f67520a = new f(0);
    }

    private f() {
        this.f67519a = new LinkedList();
    }

    public /* synthetic */ f(byte b10) {
        this();
    }

    public final boolean a(@NonNull sg.bigo.ads.ad.c cVar) {
        if (cVar.isExpired() || cVar.p() || cVar.f67544i) {
            return false;
        }
        synchronized (this.f67519a) {
            Iterator<WeakReference<sg.bigo.ads.ad.c>> it = this.f67519a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                sg.bigo.ads.ad.c cVar2 = it.next().get();
                if (cVar2 == cVar) {
                    z10 = true;
                } else if (cVar2 == null || cVar2.isExpired() || cVar2.p() || cVar2.f67544i) {
                    it.remove();
                }
            }
            if (z10 || this.f67519a.size() >= 3) {
                return false;
            }
            this.f67519a.add(new WeakReference<>(cVar));
            return true;
        }
    }

    public final boolean b(@NonNull sg.bigo.ads.ad.c cVar) {
        if (cVar == null) {
            return false;
        }
        synchronized (this.f67519a) {
            Iterator<WeakReference<sg.bigo.ads.ad.c>> it = this.f67519a.iterator();
            while (it.hasNext()) {
                if (it.next().get() == cVar) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }
}
