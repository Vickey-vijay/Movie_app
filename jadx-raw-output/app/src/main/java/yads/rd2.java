package yads;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes6.dex */
public final class rd2 implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nk.l f82200a;

    public rd2(kotlinx.coroutines.c cVar) {
        this.f82200a = cVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f82200a.K(null, null);
    }
}
