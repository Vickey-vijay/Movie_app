package v9;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: DetachClickListener.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DialogInterface.OnClickListener f73141b;

    /* JADX INFO: renamed from: v9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DetachClickListener.java */
    public class ViewTreeObserverOnWindowAttachListenerC0766a implements ViewTreeObserver.OnWindowAttachListener {
        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowAttached() {
        }

        public ViewTreeObserverOnWindowAttachListenerC0766a() {
        }

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowDetached() {
            a.this.f73141b = null;
        }
    }

    public static a c(DialogInterface.OnClickListener onClickListener) {
        return new a(onClickListener);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        DialogInterface.OnClickListener onClickListener = this.f73141b;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i10);
        }
    }

    public a(DialogInterface.OnClickListener onClickListener) {
        this.f73141b = onClickListener;
    }

    public void b(Dialog dialog) {
        if (dialog.getWindow() != null) {
            dialog.getWindow().getDecorView().getViewTreeObserver().addOnWindowAttachListener(new ViewTreeObserverOnWindowAttachListenerC0766a());
        }
    }
}
