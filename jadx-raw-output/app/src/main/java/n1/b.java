package n1;

import java.io.File;

/* JADX INFO: compiled from: FileSizeBackupStrategy.java */
/* JADX INFO: loaded from: classes3.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f64669a;

    public b(long j10) {
        this.f64669a = j10;
    }

    @Override // n1.a
    public boolean a(File file) {
        if (file.length() > this.f64669a) {
            return true;
        }
        return false;
    }
}
