package dp;

import android.view.View;
import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f52278b;

    public w(g gVar) {
        this.f52278b = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f52278b.C();
        MainMaterialCallback mainMaterialCallback = this.f52278b.G;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClose();
        }
    }
}
