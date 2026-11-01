package li;

import android.os.Handler;
import android.os.Looper;
import ii.s;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: AndroidSchedulers.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f63572a = ki.a.d(new CallableC0575a());

    /* JADX INFO: renamed from: li.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidSchedulers.java */
    public static class CallableC0575a implements Callable<s> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public s call() throws Exception {
            return b.f63573a;
        }
    }

    /* JADX INFO: compiled from: AndroidSchedulers.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f63573a = new li.b(new Handler(Looper.getMainLooper()), false);
    }

    public static s a() {
        return ki.a.e(f63572a);
    }
}
