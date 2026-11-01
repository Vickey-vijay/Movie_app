package pi;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: ListCompositeDisposable.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements mi.b, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<mi.b> f66147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f66148c;

    @Override // pi.a
    public boolean b(mi.b bVar) {
        qi.a.e(bVar, "d is null");
        if (!this.f66148c) {
            synchronized (this) {
                if (!this.f66148c) {
                    List linkedList = this.f66147b;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f66147b = linkedList;
                    }
                    linkedList.add(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    public void c(List<mi.b> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        Iterator<mi.b> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th2) {
                ni.a.b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.d((Throwable) arrayList.get(0));
        }
    }

    @Override // pi.a
    public boolean delete(mi.b bVar) {
        qi.a.e(bVar, "Disposable item is null");
        if (this.f66148c) {
            return false;
        }
        synchronized (this) {
            if (this.f66148c) {
                return false;
            }
            List<mi.b> list = this.f66147b;
            if (list != null && list.remove(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // mi.b
    public void dispose() {
        if (this.f66148c) {
            return;
        }
        synchronized (this) {
            if (this.f66148c) {
                return;
            }
            this.f66148c = true;
            List<mi.b> list = this.f66147b;
            this.f66147b = null;
            c(list);
        }
    }

    @Override // mi.b
    public boolean isDisposed() {
        return this.f66148c;
    }

    @Override // pi.a
    public boolean a(mi.b bVar) {
        if (delete(bVar)) {
            bVar.dispose();
            return true;
        }
        return false;
    }
}
