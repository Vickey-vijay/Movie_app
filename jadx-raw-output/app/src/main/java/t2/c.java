package t2;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: InMobiAdViewHolder.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f72174a;

    public void a(e eVar) {
        this.f72174a.addView(eVar.a());
    }

    public FrameLayout b() {
        return this.f72174a;
    }

    public void c(ViewGroup.LayoutParams layoutParams) {
        this.f72174a.setLayoutParams(layoutParams);
    }

    public c(FrameLayout frameLayout) {
        this.f72174a = frameLayout;
    }
}
