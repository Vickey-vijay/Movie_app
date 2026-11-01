package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import bk.r;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class TextViewKt {
    public static final TextWatcher addTextChangedListener(TextView textView, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, mj.r> rVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, mj.r> rVar2, bk.l<? super Editable, mj.r> lVar) {
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, r rVar, r rVar2, bk.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = new r<CharSequence, Integer, Integer, Integer, mj.r>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.1
                public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
                }

                @Override // bk.r
                public /* bridge */ /* synthetic */ mj.r invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return mj.r.f64562a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            rVar2 = new r<CharSequence, Integer, Integer, Integer, mj.r>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.2
                public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
                }

                @Override // bk.r
                public /* bridge */ /* synthetic */ mj.r invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return mj.r.f64562a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            lVar = new bk.l<Editable, mj.r>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Editable editable) {
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ mj.r invoke(Editable editable) {
                    invoke2(editable);
                    return mj.r.f64562a;
                }
            };
        }
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, final bk.l<? super Editable, mj.r> lVar) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                lVar.invoke(editable);
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, mj.r> rVar) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                rVar.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, mj.r> rVar) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                rVar.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
