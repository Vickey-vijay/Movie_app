package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import ck.i;
import ek.b;

/* JADX INFO: loaded from: classes8.dex */
public final class CroppedTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42956a;

    @SuppressLint({"CustomViewStyleable"})
    public CroppedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CroppedTextView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CroppedTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42956a = getMaxLines();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int lineHeight = getLineHeight();
        if (lineHeight > 0) {
            int iMin = Math.min((getMeasuredHeight() + b.c(getLineHeight() * 0.05f)) / lineHeight, this.f42956a);
            if (iMin != getMinLines() || iMin != getMaxLines()) {
                setLines(iMin);
                TextUtils.TruncateAt ellipsize = getEllipsize();
                setEllipsize(null);
                setEllipsize(ellipsize);
            }
        }
    }
}
