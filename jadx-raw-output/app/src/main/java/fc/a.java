package fc;

import android.graphics.PointF;
import android.view.View;
import ec.i;

/* JADX INFO: compiled from: SimpleBoundaryDecider.java */
/* JADX INFO: loaded from: classes3.dex */
public class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PointF f52936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f52937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f52938c = true;

    @Override // ec.i
    public boolean a(View view) {
        i iVar = this.f52937b;
        return iVar != null ? iVar.a(view) : gc.b.a(view, this.f52936a, this.f52938c);
    }

    @Override // ec.i
    public boolean b(View view) {
        i iVar = this.f52937b;
        return iVar != null ? iVar.b(view) : gc.b.b(view, this.f52936a);
    }
}
