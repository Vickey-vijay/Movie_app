package m8;

import android.annotation.TargetApi;
import android.view.View;

/* JADX INFO: compiled from: Compat.java */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static void a(View view, Runnable runnable) {
        b(view, runnable);
    }

    @TargetApi(16)
    public static void b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
