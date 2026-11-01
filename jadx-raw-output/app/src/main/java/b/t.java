package b;

import android.view.View;
import com.yk.e.activity.GameActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameActivity f4737b;

    public t(GameActivity gameActivity) {
        this.f4737b = gameActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GameActivity.IL1Iii(this.f4737b, true);
    }
}
