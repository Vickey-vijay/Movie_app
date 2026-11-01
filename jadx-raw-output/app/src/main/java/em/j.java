package em;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: compiled from: ScreenUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class j {
    public static int a(float f10, Context context) {
        return (int) TypedValue.applyDimension(1, f10, b(context));
    }

    public static DisplayMetrics b(Context context) {
        return context.getResources().getDisplayMetrics();
    }
}
