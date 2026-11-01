package se;

import android.app.Activity;
import android.content.DialogInterface;

/* JADX INFO: compiled from: FinishListener.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f67235b;

    public final void a() {
        this.f67235b.finish();
    }

    public b(Activity activity) {
        this.f67235b = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        a();
    }
}
