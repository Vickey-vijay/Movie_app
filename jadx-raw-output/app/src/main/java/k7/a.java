package k7;

import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import ii.k;

/* JADX INFO: compiled from: RxView.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    @NonNull
    @CheckResult
    public static k<Object> a(@NonNull View view) {
        j7.b.b(view, "view == null");
        return new b(view);
    }

    @NonNull
    @CheckResult
    public static k<Object> b(@NonNull View view) {
        j7.b.b(view, "view == null");
        return new c(view, j7.a.f61715b);
    }
}
