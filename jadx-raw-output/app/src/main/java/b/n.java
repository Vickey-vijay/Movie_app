package b;

import android.view.KeyEvent;
import android.view.View;
import com.yk.e.activity.GameActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements View.OnKeyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameActivity f4731b;

    public n(GameActivity gameActivity) {
        this.f4731b = gameActivity;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i10 == 4 && this.f4731b.ILil.canGoBack()) {
            this.f4731b.ILil.goBack();
            return true;
        }
        return false;
    }
}
