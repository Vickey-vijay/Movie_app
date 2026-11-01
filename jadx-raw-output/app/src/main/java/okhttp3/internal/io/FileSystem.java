package okhttp3.internal.io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import com.ironsource.C3426d4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import okio.Sink;
import okio.Source;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* JADX INFO: compiled from: FileSystem.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: FileSystem.kt */
        public static final class SystemFileSystem implements FileSystem {
            public String toString() {
                return "FileSystem.SYSTEM";
            }

            @Override // okhttp3.internal.io.FileSystem
            public Sink appendingSink(File file) throws FileNotFoundException {
                p.j(file, C3426d4.i.f28530b);
                try {
                    return Okio.appendingSink(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.appendingSink(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                p.j(file, C3426d4.i.f28530b);
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File file) throws IOException {
                p.j(file, "directory");
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        p.i(file2, C3426d4.i.f28530b);
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                p.j(file, C3426d4.i.f28530b);
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File file, File file2) throws IOException {
                p.j(file, TypedValues.TransitionType.S_FROM);
                p.j(file2, TypedValues.TransitionType.S_TO);
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public Sink sink(File file) throws FileNotFoundException {
                p.j(file, C3426d4.i.f28530b);
                try {
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                p.j(file, C3426d4.i.f28530b);
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public Source source(File file) throws FileNotFoundException {
                p.j(file, C3426d4.i.f28530b);
                return Okio.source(file);
            }
        }

        private Companion() {
        }
    }

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
