package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import ik.i;

/* JADX INFO: compiled from: SpannableString.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SpannableStringKt {
    public static final void set(Spannable spannable, int i10, int i11, Object obj) {
        spannable.setSpan(obj, i10, i11, 17);
    }

    public static final void set(Spannable spannable, i iVar, Object obj) {
        spannable.setSpan(obj, iVar.getStart().intValue(), iVar.getEndInclusive().intValue(), 17);
    }

    public static final void clearSpans(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }
}
