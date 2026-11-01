package k7;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;
import ii.k;
import ii.r;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ViewLongClickObservable.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends k<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f62644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<Boolean> f62645c;

    /* JADX INFO: compiled from: ViewLongClickObservable.java */
    public static final class a extends ji.a implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f62646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r<? super Object> f62647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Callable<Boolean> f62648d;

        @Override // ji.a
        public void onDispose() {
            this.f62646b.setOnLongClickListener(null);
        }

        public a(View view, Callable<Boolean> callable, r<? super Object> rVar) {
            this.f62646b = view;
            this.f62647c = rVar;
            this.f62648d = callable;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!isDisposed()) {
                try {
                    if (this.f62648d.call().booleanValue()) {
                        this.f62647c.onNext(Notification.INSTANCE);
                        return true;
                    }
                    return false;
                } catch (Exception e10) {
                    this.f62647c.onError(e10);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public c(View view, Callable<Boolean> callable) {
        this.f62644b = view;
        this.f62645c = callable;
    }

    @Override // ii.k
    public void subscribeActual(r<? super Object> rVar) {
        if (!j7.b.a(rVar)) {
            return;
        }
        a aVar = new a(this.f62644b, this.f62645c, rVar);
        rVar.onSubscribe(aVar);
        this.f62644b.setOnLongClickListener(aVar);
    }
}
