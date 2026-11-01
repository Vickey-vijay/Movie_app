package g5;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Clock.java */
/* JADX INFO: loaded from: classes5.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f53058a = new d0();

    l createHandler(Looper looper, @Nullable Handler.Callback callback);

    long elapsedRealtime();

    long uptimeMillis();
}
