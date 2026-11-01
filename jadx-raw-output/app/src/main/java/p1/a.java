package p1;

/* JADX INFO: compiled from: ChangelessFileNameGenerator.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65866a;

    @Override // p1.b
    public boolean isFileNameChangeable() {
        return false;
    }

    @Override // p1.b
    public String generateFileName(int i10, long j10) {
        return this.f65866a;
    }

    public a(String str) {
        this.f65866a = str;
    }
}
