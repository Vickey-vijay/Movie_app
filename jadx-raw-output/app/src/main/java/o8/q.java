package o8;

import android.content.Context;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: StyleUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class q {
    public static boolean b(int i10) {
        return i10 > 0;
    }

    public static boolean c(int i10) {
        return i10 != 0;
    }

    public static boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    public static boolean d(String str) {
        return Pattern.compile("\\([^)]*\\)").matcher(str).find();
    }

    public static boolean e(String str) {
        int i10 = 0;
        while (Pattern.compile("%[^%]*\\d").matcher(str).find()) {
            i10++;
        }
        return i10 >= 2;
    }

    public static boolean f(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static ColorFilter g(Context context, int i10) {
        return BlendModeColorFilterCompat.createBlendModeColorFilterCompat(ContextCompat.getColor(context, i10), BlendModeCompat.SRC_ATOP);
    }
}
