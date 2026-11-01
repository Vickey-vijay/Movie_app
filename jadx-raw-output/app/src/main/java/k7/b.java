package k7;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;
import ii.k;
import ii.r;

/* JADX INFO: compiled from: ViewClickObservable.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends k<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f62641b;

    /* JADX INFO: compiled from: ViewClickObservable.java */
    public static final class a extends ji.a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f62642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r<? super Object> f62643c;

        @Override // ji.a
        public void onDispose() {
            this.f62642b.setOnClickListener(null);
        }

        public a(View view, r<? super Object> rVar) {
            this.f62642b = view;
            this.f62643c = rVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!isDisposed()) {
                this.f62643c.onNext(Notification.INSTANCE);
            }
        }
    }

    public b(View view) {
        this.f62641b = view;
    }

    @Override // ii.k
    public void subscribeActual(r<? super Object> rVar) {
        if (!j7.b.a(rVar)) {
            return;
        }
        a aVar = new a(this.f62641b, rVar);
        rVar.onSubscribe(aVar);
        this.f62641b.setOnClickListener(aVar);
    }
}
