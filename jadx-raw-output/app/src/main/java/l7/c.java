package l7;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: TextViewTextChangeEvent.java */
/* JADX INFO: loaded from: classes11.dex */
@AutoValue
public abstract class c {
    public abstract int a();

    public abstract int b();

    public abstract int d();

    @NonNull
    public abstract CharSequence e();

    @NonNull
    public abstract TextView f();

    @NonNull
    @CheckResult
    public static c c(@NonNull TextView textView, @NonNull CharSequence charSequence, int i10, int i11, int i12) {
        return new a(textView, charSequence, i10, i11, i12);
    }
}
