package yads;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f77922a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f77923b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f77924c = new StringBuilder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f77925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f77928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f77929h;

    public final void a() {
        int length = this.f77924c.length();
        if (length > 0) {
            this.f77924c.delete(length - 1, length);
            for (int size = this.f77922a.size() - 1; size >= 0; size--) {
                ft ftVar = (ft) this.f77922a.get(size);
                int i10 = ftVar.f77492c;
                if (i10 != length) {
                    return;
                }
                ftVar.f77492c = i10 - 1;
            }
        }
    }

    public final void b(int i10) {
        this.f77928g = i10;
        this.f77922a.clear();
        this.f77923b.clear();
        this.f77924c.setLength(0);
        this.f77925d = 15;
        this.f77926e = 0;
        this.f77927f = 0;
    }

    public gt(int i10, int i11) {
        b(i10);
        this.f77929h = i11;
    }

    public final o20 a(int i10) {
        int i11;
        float f10;
        int i12 = this.f77926e + this.f77927f;
        int i13 = 32 - i12;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i14 = 0; i14 < this.f77923b.size(); i14++) {
            CharSequence charSequenceSubSequence = (CharSequence) this.f77923b.get(i14);
            int i15 = ib3.f78556a;
            if (charSequenceSubSequence.length() > i13) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i13);
            }
            spannableStringBuilder.append(charSequenceSubSequence);
            spannableStringBuilder.append('\n');
        }
        SpannableString spannableStringB = b();
        int i16 = ib3.f78556a;
        int length = spannableStringB.length();
        SpannableString spannableStringSubSequence = spannableStringB;
        if (length > i13) {
            spannableStringSubSequence = spannableStringB.subSequence(0, i13);
        }
        spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i13 - spannableStringBuilder.length();
        int i17 = i12 - length2;
        if (i10 != Integer.MIN_VALUE) {
            i11 = i10;
        } else if (this.f77928g != 2 || (Math.abs(i17) >= 3 && length2 >= 0)) {
            i11 = (this.f77928g != 2 || i17 <= 0) ? 0 : 2;
        } else {
            i11 = 1;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                i12 = 32 - length2;
            }
            f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i18 = this.f77925d;
        if (i18 > 7) {
            i18 -= 17;
        } else if (this.f77928g == 1) {
            i18 -= this.f77929h - 1;
        }
        return new o20(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i18, 1, Integer.MIN_VALUE, f11, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f77924c);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 < this.f77922a.size()) {
            ft ftVar = (ft) this.f77922a.get(i14);
            boolean z11 = ftVar.f77491b;
            int i16 = ftVar.f77490a;
            if (i16 != 8) {
                boolean z12 = i16 == 7;
                if (i16 != 7) {
                    i13 = ht.A[i16];
                }
                z10 = z12;
            }
            int i17 = ftVar.f77492c;
            i14++;
            if (i17 != (i14 < this.f77922a.size() ? ((ft) this.f77922a.get(i14)).f77492c : length)) {
                if (i10 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                    i10 = -1;
                } else if (i10 == -1 && z11) {
                    i10 = i17;
                }
                if (i11 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i17;
                }
                if (i13 != i12) {
                    if (i12 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                    }
                    i15 = i17;
                    i12 = i13;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
        }
        if (i15 != length && i12 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }
}
