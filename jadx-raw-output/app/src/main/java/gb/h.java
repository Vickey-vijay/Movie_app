package gb;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.fvvcl.flickverse.R;

/* JADX INFO: compiled from: SimpleDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class h {
    public static Dialog a(Context context, View view, boolean z10) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.dialog_baseview, (ViewGroup) null, false);
        viewGroup.setBackgroundColor(0);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content_container);
        int dimension = (int) context.getResources().getDimension(R.dimen.dialog_margin);
        layoutParams.leftMargin = dimension;
        layoutParams.rightMargin = dimension;
        layoutParams.bottomMargin = dimension;
        viewGroup2.setLayoutParams(layoutParams);
        Dialog dialog = new Dialog(context, R.style.BaseDialog);
        dialog.setCancelable(z10);
        dialog.setContentView(viewGroup);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setDimAmount(0.5f);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -2;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        viewGroup2.addView(view);
        return dialog;
    }

    public static Dialog b(Context context, View view, boolean z10) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.dialog_baseview, (ViewGroup) null, false);
        viewGroup.setBackgroundColor(0);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content_container);
        int dimension = (int) context.getResources().getDimension(R.dimen.dp_20);
        layoutParams.leftMargin = dimension;
        layoutParams.rightMargin = dimension;
        layoutParams.bottomMargin = dimension;
        viewGroup2.setLayoutParams(layoutParams);
        Dialog dialog = new Dialog(context, R.style.BaseDialog);
        dialog.setCancelable(z10);
        dialog.setContentView(viewGroup);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setDimAmount(0.5f);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -2;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        viewGroup2.addView(view);
        return dialog;
    }
}
