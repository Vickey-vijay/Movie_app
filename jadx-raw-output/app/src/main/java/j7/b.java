package j7;

import android.os.Looper;
import androidx.annotation.RestrictTo;
import ii.r;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b {
    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean a(r<?> rVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            rVar.onSubscribe(io.reactivex.disposables.a.b());
            rVar.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
            return false;
        }
        return true;
    }
}
