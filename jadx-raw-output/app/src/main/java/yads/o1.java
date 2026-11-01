package yads;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f80887a;

    public final void a(Activity activity) {
        synchronized (this) {
            ArrayList arrayList = this.f80887a;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!ck.p.e(((WeakReference) it.next()).get(), activity));
                mj.r rVar = mj.r.f64562a;
            }
            this.f80887a.add(new WeakReference(activity));
            Objects.toString(activity);
            boolean z10 = ad1.f75480a;
            mj.r rVar2 = mj.r.f64562a;
        }
    }

    public final void b(Activity activity) {
        Object next;
        synchronized (this) {
            Iterator it = this.f80887a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!ck.p.e(((WeakReference) next).get(), activity));
            WeakReference weakReference = (WeakReference) next;
            if (weakReference != null) {
                this.f80887a.remove(weakReference);
                Objects.toString(activity);
                boolean z10 = ad1.f75480a;
            }
            mj.r rVar = mj.r.f64562a;
        }
    }

    public o1(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f80887a = arrayList;
        if (activity != null) {
            arrayList.add(new WeakReference(activity));
        }
    }
}
