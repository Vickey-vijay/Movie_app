package yads;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class c63 extends Spannable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f76190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76192c;

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f76190a != null && this.f76191b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.f76190a;
            int i10 = this.f76191b;
            drawable.setBounds(0, 0, i10, i10);
            oe oeVar = new oe(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i11 = this.f76192c;
            colorDrawable.setBounds(0, 0, i11, i11);
            oe oeVar2 = new oe(colorDrawable);
            spannableStringBuilder.setSpan(oeVar, 0, 1, 33);
            spannableStringBuilder.setSpan(oeVar2, 1, 2, 33);
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public c63(Drawable drawable, int i10, int i11) {
        this.f76190a = drawable;
        this.f76191b = i10;
        this.f76192c = i11;
    }
}
