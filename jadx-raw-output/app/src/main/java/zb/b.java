package zb;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: RippleDrawableUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f86388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f86389b;

    @RequiresApi(api = 21)
    public RippleDrawable a(@NonNull ColorStateList colorStateList) {
        return new RippleDrawable(colorStateList, this.f86388a, this.f86389b);
    }

    public b(Object obj, Object obj2) {
        Drawable drawable;
        if (obj == null) {
            drawable = null;
        } else {
            drawable = (Drawable) obj;
        }
        this.f86388a = drawable;
        this.f86389b = obj2 != null ? (Drawable) obj2 : null;
    }
}
