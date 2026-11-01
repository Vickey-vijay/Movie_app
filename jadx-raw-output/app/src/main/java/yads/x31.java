package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class x31 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y31 f84441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f84442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u41 f84443c;

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        boolean z10 = ad1.f75480a;
        this.f84441a.a(this.f84442b);
    }

    public x31(y31 y31Var, Map map, u41 u41Var) {
        this.f84441a = y31Var;
        this.f84442b = map;
        this.f84443c = u41Var;
    }

    @Override // yads.j41
    public final void a(i41 i41Var, boolean z10) {
        String str = this.f84443c.f83368c;
        Bitmap bitmap = i41Var.f78482a;
        if (bitmap != null) {
            if (str != null) {
                this.f84442b.put(str, bitmap);
                this.f84441a.f84807c.a(str, bitmap);
            }
            this.f84441a.a(this.f84442b);
        }
    }
}
