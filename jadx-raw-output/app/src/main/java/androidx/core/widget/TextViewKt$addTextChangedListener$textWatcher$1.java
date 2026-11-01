package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import mj.r;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    public final /* synthetic */ bk.l<Editable, r> $afterTextChanged;
    public final /* synthetic */ bk.r<CharSequence, Integer, Integer, Integer, r> $beforeTextChanged;
    public final /* synthetic */ bk.r<CharSequence, Integer, Integer, Integer, r> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(bk.l<? super Editable, r> lVar, bk.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, r> rVar, bk.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, r> rVar2) {
        this.$afterTextChanged = lVar;
        this.$beforeTextChanged = rVar;
        this.$onTextChanged = rVar2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }
}
