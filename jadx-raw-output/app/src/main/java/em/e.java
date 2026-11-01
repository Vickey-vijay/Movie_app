package em;

import android.content.Context;

/* JADX INFO: compiled from: DensityUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {
    public static int a(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }
}
