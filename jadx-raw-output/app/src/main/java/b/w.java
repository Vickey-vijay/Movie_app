package b;

import android.view.View;
import com.yk.e.activity.WebActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebActivity f4740b;

    public w(WebActivity webActivity) {
        this.f4740b = webActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4740b.IL1Iii.reload();
    }
}
