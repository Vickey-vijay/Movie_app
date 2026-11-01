package eb;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import ck.p;

/* JADX INFO: compiled from: ScaleYTransformer.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f52568a = 0.001f;

    @Override // eb.a
    public void a(View view, RecyclerView recyclerView) {
        p.j(view, "v");
        p.j(recyclerView, "parent");
        ViewCompat.setScaleY(view, 1.0f - (Math.abs((((int) view.getX()) - (((recyclerView.getWidth() * 0.9f) - (view.getWidth() * 0.9f)) / 2)) / 10) * this.f52568a));
    }
}
