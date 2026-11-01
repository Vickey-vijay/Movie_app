package gc;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cc.e;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: DesignUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: gc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DesignUtil.java */
    public class C0477a implements AppBarLayout.OnOffsetChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ec.a f53396a;

        public C0477a(ec.a aVar) {
            this.f53396a = aVar;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i10) {
            this.f53396a.j(i10 >= 0, appBarLayout.getTotalScrollRange() + i10 <= 0);
        }
    }

    public static void a(View view, e eVar, ec.a aVar) {
        try {
            if (view instanceof CoordinatorLayout) {
                eVar.c().b(false);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new C0477a(aVar));
                    }
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
