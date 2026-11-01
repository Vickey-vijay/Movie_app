package kb;

import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ViewPageHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager f62742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f62743b;

    public a a() {
        return this.f62743b;
    }

    public final void b() {
        this.f62743b = new a(this.f62742a.getContext());
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.f62742a, this.f62743b);
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (NoSuchFieldException e11) {
            e11.printStackTrace();
        }
    }

    public b(ViewPager viewPager) {
        this.f62742a = viewPager;
        b();
    }
}
