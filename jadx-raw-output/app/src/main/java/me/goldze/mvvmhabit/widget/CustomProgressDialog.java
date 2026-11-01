package me.goldze.mvvmhabit.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.widget.TextView;
import me.goldze.mvvmhabit.R$id;
import me.goldze.mvvmhabit.R$layout;
import me.goldze.mvvmhabit.R$style;

/* JADX INFO: loaded from: classes.dex */
public class CustomProgressDialog extends Dialog {
    public CustomProgressDialog(Context context) {
        this(context, R$style.Custom_Progress);
    }

    public CustomProgressDialog(Context context, int i10) {
        super(context, i10);
    }

    public static CustomProgressDialog getInstance(Context context, CharSequence charSequence, boolean z10, DialogInterface.OnCancelListener onCancelListener) {
        CustomProgressDialog customProgressDialog = new CustomProgressDialog(context, R$style.Custom_Progress);
        customProgressDialog.setTitle("");
        customProgressDialog.setContentView(R$layout.dialog_progress_custom);
        if (charSequence == null || charSequence.length() == 0) {
            customProgressDialog.findViewById(R$id.message).setVisibility(8);
        } else {
            ((TextView) customProgressDialog.findViewById(R$id.message)).setText(charSequence);
        }
        customProgressDialog.setCancelable(z10);
        if (onCancelListener != null) {
            customProgressDialog.setOnCancelListener(onCancelListener);
        }
        if (customProgressDialog.getWindow() != null) {
            customProgressDialog.getWindow().getAttributes().gravity = 17;
        }
        customProgressDialog.setCanceledOnTouchOutside(false);
        return customProgressDialog;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        AnimationDrawable animationDrawable = (AnimationDrawable) findViewById(R$id.loadingImageView).getBackground();
        if (z10) {
            animationDrawable.start();
        } else {
            animationDrawable.stop();
        }
    }

    public CustomProgressDialog setMessage(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            int i10 = R$id.message;
            findViewById(i10).setVisibility(0);
            TextView textView = (TextView) findViewById(i10);
            textView.setText(charSequence);
            textView.invalidate();
        }
        return this;
    }

    @Override // android.app.Dialog
    public void hide() {
        dismiss();
    }
}
