package sa;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: RxTimer.java */
/* JADX INFO: loaded from: classes5.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mi.b f67149a;

    /* JADX INFO: compiled from: RxTimer.java */
    public class a implements ii.r<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f67150b;

        @Override // ii.r
        public void onComplete() {
        }

        @Override // ii.r
        public void onError(@NonNull Throwable th2) {
        }

        public a(b bVar) {
            this.f67150b = bVar;
        }

        @Override // ii.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(@NonNull Long l10) {
            b bVar = this.f67150b;
            if (bVar != null) {
                bVar.a(l10.longValue());
            }
        }

        @Override // ii.r
        public void onSubscribe(@NonNull mi.b bVar) {
            g0.this.f67149a = bVar;
        }
    }

    /* JADX INFO: compiled from: RxTimer.java */
    public interface b {
        void a(long j10);
    }

    public void b() {
        mi.b bVar = this.f67149a;
        if (bVar == null || bVar.isDisposed()) {
            return;
        }
        this.f67149a.dispose();
    }

    public void c(long j10, b bVar) {
        ii.k.interval(j10, TimeUnit.MILLISECONDS).observeOn(li.a.a()).subscribe(new a(bVar));
    }
}
