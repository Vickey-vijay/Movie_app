package com.green.hand.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.green.hand.library.R$styleable;
import y6.c;

/* JADX INFO: loaded from: classes7.dex */
public class EmojiTextview extends TextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20935g;

    public EmojiTextview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20933e = 0;
        this.f20934f = -1;
        this.f20935g = false;
        a(attributeSet);
    }

    public void setEmojiconSize(int i10) {
        this.f20930b = i10;
        super.setText(getText());
    }

    public void setUseSystemDefault(boolean z10) {
        this.f20935g = z10;
    }

    public final void a(AttributeSet attributeSet) {
        this.f20932d = (int) getTextSize();
        this.f20930b = (int) getTextSize();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.Emojicon);
            this.f20930b = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.Emojicon_emojiconSize, getTextSize());
            this.f20931c = typedArrayObtainStyledAttributes.getInt(R$styleable.Emojicon_emojiconAlignment, 1);
            this.f20933e = typedArrayObtainStyledAttributes.getInteger(R$styleable.Emojicon_emojiconTextStart, 0);
            this.f20934f = typedArrayObtainStyledAttributes.getInteger(R$styleable.Emojicon_emojiconTextLength, -1);
            this.f20935g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Emojicon_emojiconUseSystemDefault, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        setText(getText());
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            c.a(getContext(), spannableStringBuilder, this.f20930b, this.f20931c, this.f20932d, this.f20933e, this.f20934f, this.f20935g);
            charSequence = spannableStringBuilder;
        }
        super.setText(charSequence, bufferType);
    }

    public EmojiTextview(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20933e = 0;
        this.f20934f = -1;
        this.f20935g = false;
        a(attributeSet);
    }
}
