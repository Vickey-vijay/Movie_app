package b8;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;

/* JADX INFO: compiled from: PictureLoadingDialog.java */
/* JADX INFO: loaded from: classes10.dex */
public class c extends Dialog {
    public c(Context context) {
        super(context, R$style.Picture_Theme_AlertDialog);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    public final void a() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setWindowAnimations(R$style.PictureThemeDialogWindowStyle);
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.ps_alert_dialog);
        a();
    }
}
