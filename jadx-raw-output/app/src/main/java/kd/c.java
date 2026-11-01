package kd;

import android.content.Context;

/* JADX INFO: compiled from: DensityUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {
    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
