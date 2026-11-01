package sa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;

/* JADX INFO: compiled from: TextAndPictureUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class k0 {
    public static SpannableString a(Context context, String str, int i10) {
        SpannableString spannableString = new SpannableString("  " + str);
        Drawable drawable = context.getResources().getDrawable(i10);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        spannableString.setSpan(new p0(drawable), 0, 1, 33);
        return spannableString;
    }
}
