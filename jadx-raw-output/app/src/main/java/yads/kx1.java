package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class kx1 extends hk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mi2 f79615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io2 f79616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9 f79617e;

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        return ((ViewPager2) view).getAdapter() instanceof hx1;
    }

    @Override // yads.hk3
    public final void b(View view, Object obj) {
        try {
            ((ViewPager2) view).setAdapter(new hx1(this.f79615c, (List) obj, this.f79617e));
        } catch (IllegalArgumentException e10) {
            io2 io2Var = this.f79616d;
            String message = e10.getMessage();
            if (message == null) {
                message = "IllegalArgumentException: set adapter exception";
            }
            io2Var.reportError(message, e10);
        }
    }

    public kx1(ViewPager2 viewPager2, mi2 mi2Var, at1 at1Var, v9 v9Var) {
        super(viewPager2);
        this.f79615c = mi2Var;
        this.f79616d = at1Var;
        this.f79617e = v9Var;
    }
}
