package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import com.ironsource.C3426d4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import nj.w;

/* JADX INFO: compiled from: JvmSystemFileSystem.kt */
/* JADX INFO: loaded from: classes4.dex */
public class JvmSystemFileSystem extends FileSystem {
    @Override // okio.FileSystem
    public List<Path> list(Path path) throws IOException {
        p.j(path, "dir");
        List<Path> list = list(path, true);
        p.g(list);
        return list;
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    private final List<Path> list(Path path, boolean z10) throws IOException {
        File file = path.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                p.g(str);
                arrayList.add(path.resolve(str));
            }
            w.A(arrayList);
            return arrayList;
        }
        if (!z10) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + path);
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path path, boolean z10) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        if (z10) {
            requireExist(path);
        }
        return Okio.sink(path.toFile(), true);
    }

    @Override // okio.FileSystem
    public void atomicMove(Path path, Path path2) throws IOException {
        p.j(path, "source");
        p.j(path2, TypedValues.AttributesType.S_TARGET);
        if (path.toFile().renameTo(path2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + path + " to " + path2);
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        p.j(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        Path.Companion companion = Path.Companion;
        p.g(canonicalFile);
        return Path.Companion.get$default(companion, canonicalFile, false, 1, (Object) null);
    }

    @Override // okio.FileSystem
    public void createDirectory(Path path, boolean z10) throws IOException {
        p.j(path, "dir");
        if (path.toFile().mkdir()) {
            return;
        }
        FileMetadata fileMetadataMetadataOrNull = metadataOrNull(path);
        if (!(fileMetadataMetadataOrNull != null && fileMetadataMetadataOrNull.isDirectory())) {
            throw new IOException("failed to create directory: " + path);
        }
        if (z10) {
            throw new IOException(path + " already exists.");
        }
    }

    @Override // okio.FileSystem
    public void createSymlink(Path path, Path path2) throws IOException {
        p.j(path, "source");
        p.j(path2, TypedValues.AttributesType.S_TARGET);
        throw new IOException("unsupported");
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        p.j(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path path) {
        p.j(path, "dir");
        return list(path, false);
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        p.j(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new FileMetadata(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path path) {
        p.j(path, C3426d4.i.f28530b);
        return new JvmFileHandle(false, new RandomAccessFile(path.toFile(), "r"));
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path path, boolean z10, boolean z11) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        if (!((z10 && z11) ? false : true)) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (z10) {
            requireCreate(path);
        }
        if (z11) {
            requireExist(path);
        }
        return new JvmFileHandle(true, new RandomAccessFile(path.toFile(), "rw"));
    }

    @Override // okio.FileSystem
    public Sink sink(Path path, boolean z10) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        if (z10) {
            requireCreate(path);
        }
        return Okio__JvmOkioKt.sink$default(path.toFile(), false, 1, null);
    }

    @Override // okio.FileSystem
    public Source source(Path path) {
        p.j(path, C3426d4.i.f28530b);
        return Okio.source(path.toFile());
    }

    private final void requireCreate(Path path) throws IOException {
        if (!exists(path)) {
            return;
        }
        throw new IOException(path + " already exists.");
    }

    private final void requireExist(Path path) throws IOException {
        if (exists(path)) {
            return;
        }
        throw new IOException(path + " doesn't exist.");
    }
}
