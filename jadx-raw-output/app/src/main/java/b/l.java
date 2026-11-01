package b;

import android.view.View;
import com.yk.e.activity.WebActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebActivity f4728b;

    public l(WebActivity webActivity) {
        this.f4728b = webActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4728b.finish();
    }
}
