package yj;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import lk.a0;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes10.dex */
public class i extends h {
    public static final File s(File file, File file2, boolean z10, int i10) throws IOException {
        p.j(file, "<this>");
        p.j(file2, TypedValues.AttributesType.S_TARGET);
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z10) {
                throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    a.a(fileInputStream, fileOutputStream, i10);
                    b.a(fileOutputStream, null);
                    b.a(fileInputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        b.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    b.a(fileInputStream, th4);
                    throw th5;
                }
            }
        } else if (!file2.mkdirs()) {
            throw new FileSystemException(file, file2, "Failed to create target directory.");
        }
        return file2;
    }

    public static /* synthetic */ File t(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return s(file, file2, z10, i10);
    }

    public static final File u(File file, File file2) {
        p.j(file, "<this>");
        p.j(file2, "relative");
        if (e.b(file2)) {
            return file2;
        }
        String string = file.toString();
        p.i(string, "toString(...)");
        if ((string.length() == 0) || a0.c0(string, File.separatorChar, false, 2, null)) {
            return new File(string + file2);
        }
        return new File(string + File.separatorChar + file2);
    }

    public static final File v(File file, String str) {
        p.j(file, "<this>");
        p.j(str, "relative");
        return u(file, new File(str));
    }
}
