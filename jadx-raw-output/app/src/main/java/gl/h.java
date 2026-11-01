package gl;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h {
    public static void a(View view) {
        ViewGroup viewGroup;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }
}
