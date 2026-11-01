package l1;

/* JADX INFO: compiled from: PrinterSet.java */
/* JADX INFO: loaded from: classes2.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b[] f63390a;

    @Override // l1.b
    public void a(int i10, String str, String str2) {
        for (b bVar : this.f63390a) {
            bVar.a(i10, str, str2);
        }
    }

    public c(b... bVarArr) {
        this.f63390a = bVarArr;
    }
}
