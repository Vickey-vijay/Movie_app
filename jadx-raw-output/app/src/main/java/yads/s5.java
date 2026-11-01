package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class s5 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9 f82524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f82525b;

    public s5(z9 z9Var, WeakReference weakReference) {
        this.f82524a = z9Var;
        this.f82525b = weakReference;
        z9Var.a(this);
    }

    @Override // yads.f4
    public final void a(int i10, Bundle bundle) {
        uz1 uz1Var = (uz1) this.f82525b.get();
        if (uz1Var != null) {
            if (i10 == 19) {
                uz1Var.f83701a.b();
                uz1Var.f83702b.f77263f.f76876b.b(h1.f78009e);
            }
            if (i10 == 20) {
                uz1Var.f83702b.f77263f.f76876b.a(h1.f78009e);
                return;
            }
            switch (i10) {
                case 6:
                    uz1Var.f83701a.b();
                    uz1Var.f83702b.f77263f.f76876b.b(h1.f78008d);
                    break;
                case 7:
                    uz1Var.f83701a.b();
                    uz1Var.f83702b.f77263f.c();
                    break;
                case 8:
                    uz1Var.f83702b.f77263f.f76876b.a(h1.f78008d);
                    break;
                case 9:
                    boolean z10 = ad1.f75480a;
                    uz1Var.f83702b.f77263f.a();
                    break;
            }
        }
    }

    public /* synthetic */ s5(uz1 uz1Var) {
        this(new z9(), new WeakReference(uz1Var));
    }
}
