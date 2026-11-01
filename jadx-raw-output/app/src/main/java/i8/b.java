package i8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;

/* JADX INFO: compiled from: MagicalViewWrapper.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup.MarginLayoutParams f54092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f54093b;

    public void a(float f10) {
        this.f54092a.height = Math.round(f10);
        this.f54093b.setLayoutParams(this.f54092a);
    }

    public void b(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f54092a;
        marginLayoutParams.leftMargin = i10;
        this.f54093b.setLayoutParams(marginLayoutParams);
    }

    public void c(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f54092a;
        marginLayoutParams.topMargin = i10;
        this.f54093b.setLayoutParams(marginLayoutParams);
    }

    public void d(float f10) {
        this.f54092a.width = Math.round(f10);
        this.f54093b.setLayoutParams(this.f54092a);
    }

    public b(View view) {
        this.f54093b = view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f54092a = marginLayoutParams;
        if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) marginLayoutParams).gravity = GravityCompat.START;
        }
    }
}
