package kotlin.io;

import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import java.io.File;
import java.io.IOException;
import yj.c;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
public class FileSystemException extends IOException {
    private final File file;
    private final File other;
    private final String reason;

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i10, i iVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemException(File file, File file2, String str) {
        super(c.b(file, file2, str));
        p.j(file, C3426d4.i.f28530b);
        this.file = file;
        this.other = file2;
        this.reason = str;
    }

    public final File getFile() {
        return this.file;
    }

    public final File getOther() {
        return this.other;
    }

    public final String getReason() {
        return this.reason;
    }
}
