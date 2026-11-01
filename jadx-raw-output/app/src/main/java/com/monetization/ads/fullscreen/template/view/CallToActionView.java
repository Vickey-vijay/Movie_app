package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import ck.i;
import com.yandex.mobile.ads.R$styleable;
import yads.c63;

/* JADX INFO: loaded from: classes11.dex */
public final class CallToActionView extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f42954a;

    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private static Drawable a(Context context, int i10) {
        return ContextCompat.getDrawable(context, i10);
    }

    public /* synthetic */ CallToActionView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void a() {
        setSpannableFactory(Spannable.Factory.getInstance());
        setText(this.f42954a);
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        return this.f42954a;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence instanceof String) {
            this.f42954a = charSequence;
        }
        super.setText(this.f42954a, TextView.BufferType.SPANNABLE);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        super(context, attributeSet, i10);
        Drawable drawableA = null;
        int i12 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalIconButton, i10, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalIconButton_monetization_internal_icon, 0);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_size, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_offset, 0);
            typedArrayObtainStyledAttributes.recycle();
            drawableA = resourceId != 0 ? a(context, resourceId) : null;
            i11 = dimensionPixelSize2;
            i12 = dimensionPixelSize;
        } else {
            i11 = 0;
        }
        setSpannableFactory(new c63(drawableA, i12, i11));
    }
}
