package com.yandex.div.core.view2.errors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import bk.l;
import ck.i;
import com.yandex.div.R$drawable;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import mj.r;

/* JADX INFO: compiled from: VariableMonitorView.kt */
/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"ViewConstructor"})
final class VariableView extends LinearLayout {
    public static final Companion Companion = new Companion(null);
    private final TextView nameText;
    private l<? super String, r> onEnterAction;
    private final TextView typeText;
    private final EditText valueText;

    /* JADX INFO: compiled from: VariableMonitorView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createEditableCell$lambda$2$lambda$1(VariableView variableView, EditText editText, TextView textView, int i10, KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getAction() != 0) || i10 != 6) {
            return false;
        }
        variableView.onEnterAction.invoke(editText.getText().toString());
        return true;
    }

    private final void addCell(TextView textView, int i10) {
        addView(textView, new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i10), getResources().getDisplayMetrics()), -1));
    }

    private final void configureCommon(TextView textView) {
        int iDpToPx = BaseDivViewExtensionsKt.dpToPx(8, textView.getResources().getDisplayMetrics());
        textView.setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        textView.setTextColor(-1);
        textView.setBackgroundResource(R$drawable.table_cell_background);
        textView.setHorizontallyScrolling(true);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setMaxLines(1);
    }

    private final TextView createCell() {
        TextView textView = new TextView(getContext());
        configureCommon(textView);
        return textView;
    }

    private final EditText createEditableCell() {
        final EditText editText = new EditText(getContext());
        configureCommon(editText);
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.div.core.view2.errors.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return VariableView.createEditableCell$lambda$2$lambda$1(this.f45840b, editText, textView, i10, keyEvent);
            }
        });
        return editText;
    }

    public final TextView getNameText() {
        return this.nameText;
    }

    public final TextView getTypeText() {
        return this.typeText;
    }

    public final EditText getValueText() {
        return this.valueText;
    }

    public final void setOnEnterAction(l<? super String, r> lVar) {
        this.onEnterAction = lVar;
    }

    public VariableView(Context context) {
        super(context);
        TextView textViewCreateCell = createCell();
        this.nameText = textViewCreateCell;
        TextView textViewCreateCell2 = createCell();
        this.typeText = textViewCreateCell2;
        EditText editTextCreateEditableCell = createEditableCell();
        this.valueText = editTextCreateEditableCell;
        this.onEnterAction = new l<String, r>() { // from class: com.yandex.div.core.view2.errors.VariableView$onEnterAction$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(String str) {
                invoke2(str);
                return r.f64562a;
            }
        };
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        addCell(textViewCreateCell, 200);
        addCell(textViewCreateCell2, 60);
        addView(editTextCreateEditableCell, new LinearLayout.LayoutParams(-2, -2, 1.0f));
    }
}
