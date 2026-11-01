package cc;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import com.scwang.smart.refresh.layout.constant.RefreshState;

/* JADX INFO: compiled from: RefreshKernel.java */
/* JADX INFO: loaded from: classes2.dex */
public interface e {
    ValueAnimator a(int i10);

    e b(@NonNull a aVar, int i10);

    @NonNull
    f c();

    e d(@NonNull a aVar);

    e e();

    e f(int i10, boolean z10);

    e g(@NonNull RefreshState refreshState);
}
