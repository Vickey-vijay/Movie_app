package kotlin.io;

import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import java.io.File;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class FileAlreadyExistsException extends FileSystemException {
    public /* synthetic */ FileAlreadyExistsException(File file, File file2, String str, int i10, i iVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAlreadyExistsException(File file, File file2, String str) {
        super(file, file2, str);
        p.j(file, C3426d4.i.f28530b);
    }
}
