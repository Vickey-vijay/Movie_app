package yads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import yads.o20;
import yads.xq;

/* JADX INFO: loaded from: classes7.dex */
public final class o20 implements xq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o20 f80902s = new o20("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final wq f80903t = new wq() { // from class: cp.e7
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return o20.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f80904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f80905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f80906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f80907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f80908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f80909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f80910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f80911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f80912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f80913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f80914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f80915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f80916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f80917o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f80918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f80919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f80920r;

    public o20(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            ni.a(bitmap);
        } else {
            ni.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f80904b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f80904b = charSequence.toString();
        } else {
            this.f80904b = null;
        }
        this.f80905c = alignment;
        this.f80906d = alignment2;
        this.f80907e = bitmap;
        this.f80908f = f10;
        this.f80909g = i10;
        this.f80910h = i11;
        this.f80911i = f11;
        this.f80912j = i12;
        this.f80913k = f13;
        this.f80914l = f14;
        this.f80915m = z10;
        this.f80916n = i14;
        this.f80917o = i13;
        this.f80918p = f12;
        this.f80919q = i15;
        this.f80920r = f15;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || o20.class != obj.getClass()) {
            return false;
        }
        o20 o20Var = (o20) obj;
        return TextUtils.equals(this.f80904b, o20Var.f80904b) && this.f80905c == o20Var.f80905c && this.f80906d == o20Var.f80906d && ((bitmap = this.f80907e) != null ? !((bitmap2 = o20Var.f80907e) == null || !bitmap.sameAs(bitmap2)) : o20Var.f80907e == null) && this.f80908f == o20Var.f80908f && this.f80909g == o20Var.f80909g && this.f80910h == o20Var.f80910h && this.f80911i == o20Var.f80911i && this.f80912j == o20Var.f80912j && this.f80913k == o20Var.f80913k && this.f80914l == o20Var.f80914l && this.f80915m == o20Var.f80915m && this.f80916n == o20Var.f80916n && this.f80917o == o20Var.f80917o && this.f80918p == o20Var.f80918p && this.f80919q == o20Var.f80919q && this.f80920r == o20Var.f80920r;
    }

    public static final o20 a(Bundle bundle) {
        float f10;
        int i10;
        float f11;
        int i11;
        boolean z10;
        int i12;
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            f10 = bundle.getFloat(Integer.toString(4, 36));
            i10 = bundle.getInt(Integer.toString(5, 36));
        } else {
            f10 = -3.4028235E38f;
            i10 = Integer.MIN_VALUE;
        }
        int i13 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
        float f12 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
        int i14 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            float f13 = bundle.getFloat(Integer.toString(10, 36));
            i11 = bundle.getInt(Integer.toString(9, 36));
            f11 = f13;
        } else {
            f11 = -3.4028235E38f;
            i11 = Integer.MIN_VALUE;
        }
        float f14 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
        float f15 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
        if (bundle.containsKey(Integer.toString(13, 36))) {
            i12 = bundle.getInt(Integer.toString(13, 36));
            z10 = true;
        } else {
            z10 = false;
            i12 = -16777216;
        }
        return new o20(charSequence2, alignment2, alignment4, bitmap2, f10, i10, i13, f12, i14, i11, f11, f14, f15, bundle.getBoolean(Integer.toString(14, 36), false) ? z10 : false, i12, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : 0.0f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80904b, this.f80905c, this.f80906d, this.f80907e, Float.valueOf(this.f80908f), Integer.valueOf(this.f80909g), Integer.valueOf(this.f80910h), Float.valueOf(this.f80911i), Integer.valueOf(this.f80912j), Float.valueOf(this.f80913k), Float.valueOf(this.f80914l), Boolean.valueOf(this.f80915m), Integer.valueOf(this.f80916n), Integer.valueOf(this.f80917o), Float.valueOf(this.f80918p), Integer.valueOf(this.f80919q), Float.valueOf(this.f80920r)});
    }
}
