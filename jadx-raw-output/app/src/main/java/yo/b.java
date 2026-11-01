package yo;

import android.view.View;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: IControlComponent.java */
/* JADX INFO: loaded from: classes4.dex */
public interface b {
    void a(@NonNull a aVar);

    void b(boolean z10);

    void e(boolean z10, Animation animation);

    void f(int i10, int i11);

    @Nullable
    View getView();

    void onPlayStateChanged(int i10);

    void onPlayerStateChanged(int i10);
}
