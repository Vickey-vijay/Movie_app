package com.green.hand.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import com.green.hand.library.R$styleable;
import y6.c;

/* JADX INFO: loaded from: classes10.dex */
public class EmojiMultiAutoCompleteTextView extends AppCompatMultiAutoCompleteTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20929e;

    public EmojiMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20929e = false;
        a(attributeSet);
    }

    public void setEmojiconSize(int i10) {
        this.f20926b = i10;
        b();
    }

    public void setUseSystemDefault(boolean z10) {
        this.f20929e = z10;
    }

    public final void a(AttributeSet attributeSet) {
        this.f20926b = (int) getTextSize();
        this.f20928d = (int) getTextSize();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.Emojicon);
            this.f20926b = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.Emojicon_emojiconSize, getTextSize());
            this.f20927c = typedArrayObtainStyledAttributes.getInt(R$styleable.Emojicon_emojiconAlignment, 1);
            this.f20929e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Emojicon_emojiconUseSystemDefault, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        setText(getText());
    }

    public final void b() {
        c.b(getContext(), getText(), this.f20926b, this.f20927c, this.f20928d, this.f20929e);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        b();
    }

    public EmojiMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20929e = false;
        a(attributeSet);
    }
}
