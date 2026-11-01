package dp;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f52276b;

    public s(e eVar) {
        this.f52276b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f52276b.C();
        this.f52276b.G.onAdClose();
    }
}
