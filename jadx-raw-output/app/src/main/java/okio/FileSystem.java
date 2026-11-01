package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.l;
import ck.i;
import ck.n;
import ck.p;
import com.ironsource.C3426d4;
import java.io.IOException;
import java.util.List;
import mj.d;
import okio.internal.ResourceFileSystem;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class FileSystem {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX INFO: compiled from: FileSystem.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final FileSystem get(java.nio.file.FileSystem fileSystem) {
            p.j(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }
    }

    public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    public abstract Sink appendingSink(Path path, boolean z10) throws IOException;

    public abstract void atomicMove(Path path, Path path2) throws IOException;

    public abstract Path canonicalize(Path path) throws IOException;

    public final void createDirectories(Path path, boolean z10) throws IOException {
        p.j(path, "dir");
        okio.internal.FileSystem.commonCreateDirectories(this, path, z10);
    }

    public abstract void createDirectory(Path path, boolean z10) throws IOException;

    public abstract void createSymlink(Path path, Path path2) throws IOException;

    public abstract void delete(Path path, boolean z10) throws IOException;

    public void deleteRecursively(Path path, boolean z10) throws IOException {
        p.j(path, "fileOrDirectory");
        okio.internal.FileSystem.commonDeleteRecursively(this, path, z10);
    }

    public abstract List<Path> list(Path path) throws IOException;

    public abstract List<Path> listOrNull(Path path);

    public kk.i<Path> listRecursively(Path path, boolean z10) {
        p.j(path, "dir");
        return okio.internal.FileSystem.commonListRecursively(this, path, z10);
    }

    public abstract FileMetadata metadataOrNull(Path path) throws IOException;

    public abstract FileHandle openReadOnly(Path path) throws IOException;

    public abstract FileHandle openReadWrite(Path path, boolean z10, boolean z11) throws IOException;

    public abstract Sink sink(Path path, boolean z10) throws IOException;

    public abstract Source source(Path path) throws IOException;

    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m3617write$default(FileSystem fileSystem, Path path, boolean z10, l lVar, int i10, Object obj) throws Throwable {
        Object objInvoke;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        p.j(path, C3426d4.i.f28530b);
        p.j(lVar, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path, z10));
        Throwable th2 = null;
        try {
            objInvoke = lVar.invoke(bufferedSinkBuffer);
            n.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            n.a(1);
        } catch (Throwable th4) {
            n.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    d.a(th4, th5);
                }
            }
            n.a(1);
            objInvoke = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        p.g(objInvoke);
        return objInvoke;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        p.i(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        p.i(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.appendingSink(path, z10);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectories(path, z10);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectory(path, z10);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.delete(path, z10);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.deleteRecursively(path, z10);
    }

    public static /* synthetic */ kk.i listRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.listRecursively(path, z10);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z10, boolean z11, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return fileSystem.openReadWrite(path, z10, z11);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.sink(path, z10);
    }

    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m3618read(Path path, l<? super BufferedSource, ? extends T> lVar) throws Throwable {
        T tInvoke;
        p.j(path, C3426d4.i.f28530b);
        p.j(lVar, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(path));
        Throwable th2 = null;
        try {
            tInvoke = lVar.invoke(bufferedSourceBuffer);
            n.b(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            n.a(1);
        } catch (Throwable th4) {
            n.b(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th5) {
                    d.a(th4, th5);
                }
            }
            n.a(1);
            th2 = th4;
            tInvoke = null;
        }
        if (th2 != null) {
            throw th2;
        }
        p.g(tInvoke);
        return tInvoke;
    }

    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m3619write(Path path, boolean z10, l<? super BufferedSink, ? extends T> lVar) throws Throwable {
        T tInvoke;
        p.j(path, C3426d4.i.f28530b);
        p.j(lVar, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(path, z10));
        Throwable th2 = null;
        try {
            tInvoke = lVar.invoke(bufferedSinkBuffer);
            n.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            n.a(1);
        } catch (Throwable th4) {
            n.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    d.a(th4, th5);
                }
            }
            n.a(1);
            tInvoke = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        p.g(tInvoke);
        return tInvoke;
    }

    public final Sink appendingSink(Path path) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        return appendingSink(path, false);
    }

    public void copy(Path path, Path path2) throws IOException {
        p.j(path, "source");
        p.j(path2, TypedValues.AttributesType.S_TARGET);
        okio.internal.FileSystem.commonCopy(this, path, path2);
    }

    public final void createDirectories(Path path) throws IOException {
        p.j(path, "dir");
        createDirectories(path, false);
    }

    public final void createDirectory(Path path) throws IOException {
        p.j(path, "dir");
        createDirectory(path, false);
    }

    public final void delete(Path path) throws IOException {
        p.j(path, "path");
        delete(path, false);
    }

    public final void deleteRecursively(Path path) throws IOException {
        p.j(path, "fileOrDirectory");
        deleteRecursively(path, false);
    }

    public final boolean exists(Path path) throws IOException {
        p.j(path, "path");
        return okio.internal.FileSystem.commonExists(this, path);
    }

    public final kk.i<Path> listRecursively(Path path) {
        p.j(path, "dir");
        return listRecursively(path, false);
    }

    public final FileMetadata metadata(Path path) throws IOException {
        p.j(path, "path");
        return okio.internal.FileSystem.commonMetadata(this, path);
    }

    public final FileHandle openReadWrite(Path path) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        return openReadWrite(path, false, false);
    }

    public final Sink sink(Path path) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        return sink(path, false);
    }
}
