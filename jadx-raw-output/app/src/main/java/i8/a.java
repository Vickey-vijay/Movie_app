package i8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.magical.ViewParams;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BuildRecycleItemViewParams.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<ViewParams> f54091a = new ArrayList();

    public static void b(List<View> list, int i10, int i11, int i12) {
        if (i11 > 0) {
            while (i11 >= 1) {
                list.add(0, null);
                i11--;
            }
        }
        if (i12 < i10) {
            for (int i13 = (i10 - 1) - i12; i13 >= 1; i13--) {
                list.add(null);
            }
        }
    }

    public static void a() {
        List<ViewParams> list = f54091a;
        if (list.size() > 0) {
            list.clear();
        }
    }

    public static void c(ViewGroup viewGroup, int i10) {
        int childCount;
        int count;
        int firstVisiblePosition;
        int lastVisiblePosition;
        ArrayList arrayList = new ArrayList();
        boolean z10 = viewGroup instanceof RecyclerView;
        if (z10) {
            childCount = ((RecyclerView) viewGroup).getChildCount();
        } else {
            if (!(viewGroup instanceof ListView)) {
                throw new IllegalArgumentException(viewGroup.getClass().getCanonicalName() + " Must be " + RecyclerView.class + " or " + ListView.class);
            }
            childCount = ((ListView) viewGroup).getChildCount();
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        if (z10) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) viewGroup).getLayoutManager();
            if (gridLayoutManager == null) {
                return;
            }
            count = gridLayoutManager.getItemCount();
            firstVisiblePosition = gridLayoutManager.findFirstVisibleItemPosition();
            lastVisiblePosition = gridLayoutManager.findLastVisibleItemPosition();
        } else {
            ListView listView = (ListView) viewGroup;
            ListAdapter adapter = listView.getAdapter();
            if (adapter == null) {
                return;
            }
            count = adapter.getCount();
            firstVisiblePosition = listView.getFirstVisiblePosition();
            lastVisiblePosition = listView.getLastVisiblePosition();
        }
        if (lastVisiblePosition > count) {
            lastVisiblePosition = count - 1;
        }
        b(arrayList, count, firstVisiblePosition, lastVisiblePosition);
        f54091a.clear();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            View view = (View) arrayList.get(i12);
            ViewParams viewParams = new ViewParams();
            if (view == null) {
                viewParams.b(0);
                viewParams.c(0);
                viewParams.d(0);
                viewParams.a(0);
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                viewParams.b(iArr[0]);
                viewParams.c(iArr[1] - i10);
                viewParams.d(view.getWidth());
                viewParams.a(view.getHeight());
            }
            f54091a.add(viewParams);
        }
    }

    public static ViewParams d(int i10) {
        List<ViewParams> list = f54091a;
        if (list.size() > i10) {
            return list.get(i10);
        }
        return null;
    }
}
