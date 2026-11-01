package com.green.hand.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.green.hand.library.R$styleable;
import y6.c;

/* JADX INFO: loaded from: classes7.dex */
public class EmojiEdittext extends EditText {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f20919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextWatcher f20924g;

    public class a implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (EmojiEdittext.this.f20919b != null) {
                EmojiEdittext.this.f20919b.setEnabled(!editable.toString().isEmpty());
            }
            int selectionStart = EmojiEdittext.this.getSelectionStart();
            int selectionEnd = EmojiEdittext.this.getSelectionEnd();
            EmojiEdittext.this.removeTextChangedListener(this);
            EmojiEdittext.this.d();
            EmojiEdittext.this.setText(y6.a.f(editable.toString(), EmojiEdittext.this.getTextSize()), TextView.BufferType.SPANNABLE);
            EmojiEdittext.this.setSelection(selectionStart, selectionEnd);
            EmojiEdittext.this.addTextChangedListener(this);
        }
    }

    public EmojiEdittext(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20919b = null;
        this.f20923f = false;
        this.f20924g = new a();
        c(attributeSet);
    }

    public void setEmojiconSize(int i10) {
        this.f20920c = i10;
        d();
    }

    public void setUseSystemDefault(boolean z10) {
        this.f20923f = z10;
    }

    public final void c(AttributeSet attributeSet) {
        this.f20920c = (int) getTextSize();
        this.f20922e = (int) getTextSize();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.Emojicon);
            this.f20920c = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.Emojicon_emojiconSize, getTextSize());
            this.f20921d = typedArrayObtainStyledAttributes.getInt(R$styleable.Emojicon_emojiconAlignment, 1);
            this.f20923f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Emojicon_emojiconUseSystemDefault, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        setText(getText());
        addTextChangedListener(this.f20924g);
    }

    public final void d() {
        c.b(getContext(), getText(), this.f20920c, this.f20921d, this.f20922e, this.f20923f);
    }

    public EmojiEdittext(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20919b = null;
        this.f20923f = false;
        this.f20924g = new a();
        c(attributeSet);
    }
}
