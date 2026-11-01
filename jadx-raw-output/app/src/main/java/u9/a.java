package u9;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.Window;

/* JADX INFO: compiled from: SpecialShapeUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {
    public static int a(Context context) {
        Rect rect = new Rect();
        Window window = ((Activity) context).getWindow();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top - window.findViewById(R.id.content).getTop();
    }

    public static int b(Context context) {
        int dimensionPixelSize = 0;
        int iA = context instanceof Activity ? a(context) : 0;
        if (iA != 0) {
            return iA;
        }
        try {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
            }
        } catch (Exception unused) {
        }
        return dimensionPixelSize;
    }
}
