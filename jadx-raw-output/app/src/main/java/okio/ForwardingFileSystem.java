package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.l;
import ck.p;
import ck.s;
import com.ironsource.C3426d4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.i;
import kotlin.sequences.SequencesKt___SequencesKt;
import nj.w;

/* JADX INFO: compiled from: ForwardingFileSystem.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem delegate;

    public Path onPathParameter(Path path, String str, String str2) {
        p.j(path, "path");
        p.j(str, C3426d4.g.f28493b);
        p.j(str2, "parameterName");
        return path;
    }

    public Path onPathResult(Path path, String str) {
        p.j(path, "path");
        p.j(str, C3426d4.g.f28493b);
        return path;
    }

    public ForwardingFileSystem(FileSystem fileSystem) {
        p.j(fileSystem, "delegate");
        this.delegate = fileSystem;
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path path, boolean z10) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        return this.delegate.appendingSink(onPathParameter(path, "appendingSink", C3426d4.i.f28530b), z10);
    }

    @Override // okio.FileSystem
    public void atomicMove(Path path, Path path2) throws IOException {
        p.j(path, "source");
        p.j(path2, TypedValues.AttributesType.S_TARGET);
        this.delegate.atomicMove(onPathParameter(path, "atomicMove", "source"), onPathParameter(path2, "atomicMove", TypedValues.AttributesType.S_TARGET));
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        p.j(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.FileSystem
    public void createDirectory(Path path, boolean z10) throws IOException {
        p.j(path, "dir");
        this.delegate.createDirectory(onPathParameter(path, "createDirectory", "dir"), z10);
    }

    @Override // okio.FileSystem
    public void createSymlink(Path path, Path path2) throws IOException {
        p.j(path, "source");
        p.j(path2, TypedValues.AttributesType.S_TARGET);
        this.delegate.createSymlink(onPathParameter(path, "createSymlink", "source"), onPathParameter(path2, "createSymlink", TypedValues.AttributesType.S_TARGET));
    }

    public final FileSystem delegate() {
        return this.delegate;
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        p.j(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), z10);
    }

    @Override // okio.FileSystem
    public List<Path> list(Path path) throws IOException {
        p.j(path, "dir");
        List<Path> list = this.delegate.list(onPathParameter(path, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        w.A(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path path) {
        p.j(path, "dir");
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(path, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        w.A(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public i<Path> listRecursively(Path path, boolean z10) {
        p.j(path, "dir");
        return SequencesKt___SequencesKt.K(this.delegate.listRecursively(onPathParameter(path, "listRecursively", "dir"), z10), new l<Path, Path>() { // from class: okio.ForwardingFileSystem.listRecursively.1
            {
                super(1);
            }

            @Override // bk.l
            public final Path invoke(Path path2) {
                p.j(path2, "it");
                return ForwardingFileSystem.this.onPathResult(path2, "listRecursively");
            }
        });
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        p.j(path, "path");
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : fileMetadataMetadataOrNull.copy((251 & 1) != 0 ? fileMetadataMetadataOrNull.isRegularFile : false, (251 & 2) != 0 ? fileMetadataMetadataOrNull.isDirectory : false, (251 & 4) != 0 ? fileMetadataMetadataOrNull.symlinkTarget : onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), (251 & 8) != 0 ? fileMetadataMetadataOrNull.size : null, (251 & 16) != 0 ? fileMetadataMetadataOrNull.createdAtMillis : null, (251 & 32) != 0 ? fileMetadataMetadataOrNull.lastModifiedAtMillis : null, (251 & 64) != 0 ? fileMetadataMetadataOrNull.lastAccessedAtMillis : null, (251 & 128) != 0 ? fileMetadataMetadataOrNull.extras : null);
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path path) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        return this.delegate.openReadOnly(onPathParameter(path, "openReadOnly", C3426d4.i.f28530b));
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path path, boolean z10, boolean z11) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        return this.delegate.openReadWrite(onPathParameter(path, "openReadWrite", C3426d4.i.f28530b), z10, z11);
    }

    @Override // okio.FileSystem
    public Sink sink(Path path, boolean z10) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        return this.delegate.sink(onPathParameter(path, "sink", C3426d4.i.f28530b), z10);
    }

    @Override // okio.FileSystem
    public Source source(Path path) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        return this.delegate.source(onPathParameter(path, "source", C3426d4.i.f28530b));
    }

    public String toString() {
        return s.b(getClass()).i() + '(' + this.delegate + ')';
    }
}
