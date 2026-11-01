package b;

import android.view.KeyEvent;
import android.view.View;
import com.yk.e.activity.WebActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements View.OnKeyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebActivity f4720b;

    public h(WebActivity webActivity) {
        this.f4720b = webActivity;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i10 == 4 && this.f4720b.IL1Iii.canGoBack()) {
            this.f4720b.IL1Iii.goBack();
            return true;
        }
        return false;
    }
}
