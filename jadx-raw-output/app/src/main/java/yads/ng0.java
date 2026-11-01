package yads;

import android.app.Activity;
import android.app.Dialog;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ng0 {
    public static final void a(Dialog dialog) {
        boolean z10;
        Activity ownerActivity = dialog.getOwnerActivity();
        if (ownerActivity != null && (ownerActivity.isFinishing() || ownerActivity.isDestroyed())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (dialog.isShowing() && z10) {
            try {
                dialog.dismiss();
            } catch (Exception unused) {
                boolean z11 = ad1.f75480a;
            }
        }
    }
}
