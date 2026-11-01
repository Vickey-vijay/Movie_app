package y9;

import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: TKRenderView.java */
/* JADX INFO: loaded from: classes8.dex */
public class i implements ap.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ap.a f75331b;

    @Override // ap.a
    public void setScaleType(int i10) {
    }

    @Override // ap.a
    public void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f75331b.a(i10, i11);
        if (i11 > i10) {
            this.f75331b.setScaleType(5);
        } else {
            this.f75331b.setScaleType(0);
        }
    }

    @Override // ap.a
    public Bitmap b() {
        return this.f75331b.b();
    }

    @Override // ap.a
    public void c(@NonNull xyz.doikki.videoplayer.player.a aVar) {
        this.f75331b.c(aVar);
    }

    @Override // ap.a
    public View getView() {
        return this.f75331b.getView();
    }

    @Override // ap.a
    public void release() {
        this.f75331b.release();
    }

    @Override // ap.a
    public void setVideoRotation(int i10) {
        this.f75331b.setVideoRotation(i10);
    }

    public i(@NonNull ap.a aVar) {
        this.f75331b = aVar;
    }
}
