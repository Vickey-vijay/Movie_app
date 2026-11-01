package sg.bigo.ads.core.adview;

import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.a<?> f71088a;

    public c(@NonNull sg.bigo.ads.api.a<?> aVar) {
        this.f71088a = aVar;
    }

    public final void a(int i10) {
        this.f71088a.setTag(Integer.valueOf(i10));
    }

    public void a(View view) {
        u.a(view, this.f71088a, null, -1);
    }

    public boolean a(int i10, int i11) {
        return u.a(this.f71088a, i10, i11);
    }
}
