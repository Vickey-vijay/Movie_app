package yads;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class kt {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f79534w = a(2, 2, 2, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f79535x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f79536y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f79537z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f79538a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f79539b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f79541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f79545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f79546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f79547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f79548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f79549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f79550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f79551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f79552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f79553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f79554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f79555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f79556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f79557t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f79558u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f79559v;

    static {
        int iA = a(0, 0, 0, 0);
        f79535x = iA;
        int iA2 = a(0, 0, 0, 3);
        f79536y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f79537z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
    }

    public final void a(char c10) {
        if (c10 != '\n') {
            this.f79539b.append(c10);
            return;
        }
        this.f79538a.add(a());
        this.f79539b.clear();
        if (this.f79553p != -1) {
            this.f79553p = 0;
        }
        if (this.f79554q != -1) {
            this.f79554q = 0;
        }
        if (this.f79555r != -1) {
            this.f79555r = 0;
        }
        if (this.f79557t != -1) {
            this.f79557t = 0;
        }
        while (true) {
            if ((!this.f79548k || this.f79538a.size() < this.f79547j) && this.f79538a.size() < 15) {
                return;
            } else {
                this.f79538a.remove(0);
            }
        }
    }

    public final void b() {
        this.f79538a.clear();
        this.f79539b.clear();
        this.f79553p = -1;
        this.f79554q = -1;
        this.f79555r = -1;
        this.f79557t = -1;
        this.f79559v = 0;
        this.f79540c = false;
        this.f79541d = false;
        this.f79542e = 4;
        this.f79543f = false;
        this.f79544g = 0;
        this.f79545h = 0;
        this.f79546i = 0;
        this.f79547j = 15;
        this.f79548k = true;
        this.f79549l = 0;
        this.f79550m = 0;
        this.f79551n = 0;
        int i10 = f79535x;
        this.f79552o = i10;
        this.f79556s = f79534w;
        this.f79558u = i10;
    }

    public kt() {
        b();
    }

    public static int a(int i10, int i11, int i12, int i13) {
        int i14;
        ni.a(i10, 4);
        ni.a(i11, 4);
        ni.a(i12, 4);
        ni.a(i13, 4);
        if (i13 != 2) {
            i14 = i13 != 3 ? 255 : 0;
        } else {
            i14 = 127;
        }
        return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f79553p != -1) {
            if (!z10) {
                this.f79539b.setSpan(new StyleSpan(2), this.f79553p, this.f79539b.length(), 33);
                this.f79553p = -1;
            }
        } else if (z10) {
            this.f79553p = this.f79539b.length();
        }
        if (this.f79554q == -1) {
            if (z11) {
                this.f79554q = this.f79539b.length();
            }
        } else {
            if (z11) {
                return;
            }
            this.f79539b.setSpan(new UnderlineSpan(), this.f79554q, this.f79539b.length(), 33);
            this.f79554q = -1;
        }
    }

    public final void a(int i10, int i11) {
        if (this.f79555r != -1 && this.f79556s != i10) {
            this.f79539b.setSpan(new ForegroundColorSpan(this.f79556s), this.f79555r, this.f79539b.length(), 33);
        }
        if (i10 != f79534w) {
            this.f79555r = this.f79539b.length();
            this.f79556s = i10;
        }
        if (this.f79557t != -1 && this.f79558u != i11) {
            this.f79539b.setSpan(new BackgroundColorSpan(this.f79558u), this.f79557t, this.f79539b.length(), 33);
        }
        if (i11 != f79535x) {
            this.f79557t = this.f79539b.length();
            this.f79558u = i11;
        }
    }

    public final SpannableString a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f79539b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f79553p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f79553p, length, 33);
            }
            if (this.f79554q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f79554q, length, 33);
            }
            if (this.f79555r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f79556s), this.f79555r, length, 33);
            }
            if (this.f79557t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f79558u), this.f79557t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }
}
