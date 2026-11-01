package y6;

import android.content.res.Resources;

/* JADX INFO: compiled from: EmojiUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static int b() {
        return 20;
    }

    public static int a(float f10) {
        return (int) ((f10 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int c() {
        return (int) Math.ceil(((double) a.d()) / 20.0d);
    }
}
