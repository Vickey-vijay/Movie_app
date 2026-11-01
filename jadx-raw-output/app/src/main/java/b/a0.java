package b;

import android.view.View;
import com.yk.e.activity.GameActivity;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameActivity f4705b;

    public a0(GameActivity gameActivity) {
        this.f4705b = gameActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4705b.ILil.loadUrl("javascript:window.location.reload( true )");
    }
}
