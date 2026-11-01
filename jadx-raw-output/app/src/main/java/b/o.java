package b;

import android.view.View;
import com.yk.e.activity.GameActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameActivity f4732b;

    public o(GameActivity gameActivity) {
        this.f4732b = gameActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f4732b.ILil.canGoBack()) {
            this.f4732b.ILil.goBack();
        } else {
            this.f4732b.finish();
        }
    }
}
