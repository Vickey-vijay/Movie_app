package ap;

import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: IRenderView.java */
/* JADX INFO: loaded from: classes7.dex */
public interface a {
    void a(int i10, int i11);

    Bitmap b();

    void c(@NonNull xyz.doikki.videoplayer.player.a aVar);

    View getView();

    void release();

    void setScaleType(int i10);

    void setVideoRotation(int i10);
}
