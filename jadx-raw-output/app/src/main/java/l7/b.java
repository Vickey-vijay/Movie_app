package l7;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: RxTextView.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b {
    @NonNull
    @CheckResult
    public static i7.a<c> a(@NonNull TextView textView) {
        j7.b.b(textView, "view == null");
        return new d(textView);
    }
}
