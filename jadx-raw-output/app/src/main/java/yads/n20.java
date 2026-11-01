package yads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class n20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f80513a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f80514b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Layout.Alignment f80515c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Layout.Alignment f80516d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f80517e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80518f = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80519g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f80520h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f80521i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f80522j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f80523k = -3.4028235E38f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f80524l = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f80525m = -3.4028235E38f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f80526n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f80527o = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f80528p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f80529q;

    public final n20 a(float f10) {
        this.f80517e = f10;
        this.f80518f = 0;
        return this;
    }

    public final n20 b(float f10) {
        this.f80520h = f10;
        return this;
    }

    public final n20 b(int i10) {
        this.f80521i = i10;
        return this;
    }

    public final void c(int i10) {
        this.f80527o = i10;
        this.f80526n = true;
    }

    public final n20 a(int i10) {
        this.f80519g = i10;
        return this;
    }

    public final n20 b() {
        this.f80524l = -3.4028235E38f;
        return this;
    }

    public final n20 a(SpannableStringBuilder spannableStringBuilder) {
        this.f80513a = spannableStringBuilder;
        return this;
    }

    public final n20 a(Layout.Alignment alignment) {
        this.f80515c = alignment;
        return this;
    }

    public final o20 a() {
        return new o20(this.f80513a, this.f80515c, this.f80516d, this.f80514b, this.f80517e, this.f80518f, this.f80519g, this.f80520h, this.f80521i, this.f80522j, this.f80523k, this.f80524l, this.f80525m, this.f80526n, this.f80527o, this.f80528p, this.f80529q);
    }
}
