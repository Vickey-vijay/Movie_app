package s;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: VpModuleUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f66971a;

    public static Context getContext() {
        Context context = f66971a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("should be initialized in application");
    }

    public static void a(@NonNull Context context) {
        f66971a = context.getApplicationContext();
    }
}
