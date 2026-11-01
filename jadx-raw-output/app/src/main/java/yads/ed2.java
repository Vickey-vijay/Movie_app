package yads;

import android.net.Uri;
import java.io.IOException;
import yads.ed2;
import yads.p30;

/* JADX INFO: loaded from: classes7.dex */
public final class ed2 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ed2 f77035a = new ed2();

    @Override // yads.p30
    public final void a(r83 r83Var) {
    }

    @Override // yads.p30
    public final void close() {
    }

    @Override // yads.p30
    public final Uri getUri() {
        return null;
    }

    static {
        new o30() { // from class: cp.h1
            @Override // yads.o30
            public final p30 createDataSource() {
                return new ed2();
            }
        };
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }
}
