package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.a;
import bk.l;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import lk.a0;
import lk.x;
import mj.g;
import mj.h;
import nj.b0;
import nj.t;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;

/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final ClassLoader classLoader;
    private final g roots$delegate;
    private final FileSystem systemFileSystem;

    /* JADX INFO: compiled from: ResourceFileSystem.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Path removeBase(Path path, Path path2) {
            p.j(path, "<this>");
            p.j(path2, "base");
            return getROOT().resolve(x.M(a0.E0(path.toString(), path2.toString()), '\\', '/', false, 4, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !x.C(path.name(), ".class", true);
        }

        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem fileSystem, int i10, i iVar) {
        this(classLoader, z10, (i10 & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<Pair<FileSystem, Path>> getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Pair<FileSystem, Path>> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        p.i(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        p.i(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            p.g(url);
            Pair<FileSystem, Path> fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        p.i(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        p.i(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            p.g(url2);
            Pair<FileSystem, Path> jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return b0.y0(arrayList, arrayList2);
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path path, boolean z10) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(Path path, Path path2) throws IOException {
        p.j(path, "source");
        p.j(path2, TypedValues.AttributesType.S_TARGET);
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) {
        p.j(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // okio.FileSystem
    public void createDirectory(Path path, boolean z10) throws IOException {
        p.j(path, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(Path path, Path path2) throws IOException {
        p.j(path, "source");
        p.j(path2, TypedValues.AttributesType.S_TARGET);
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        p.j(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public List<Path> list(Path path) throws FileNotFoundException {
        p.j(path, "dir");
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair<FileSystem, Path> pair : getRoots()) {
            FileSystem fileSystemComponent1 = pair.component1();
            Path pathComponent2 = pair.component2();
            try {
                List<Path> list = fileSystemComponent1.list(pathComponent2.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t.v(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.removeBase((Path) it.next(), pathComponent2));
                }
                nj.x.C(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return b0.O0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path path) {
        p.j(path, "dir");
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Pair<FileSystem, Path>> it = getRoots().iterator();
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair<FileSystem, Path> next = it.next();
            FileSystem fileSystemComponent1 = next.component1();
            Path pathComponent2 = next.component2();
            List<Path> listListOrNull = fileSystemComponent1.listOrNull(pathComponent2.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(t.v(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.removeBase((Path) it2.next(), pathComponent2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                nj.x.C(linkedHashSet, arrayList);
                z10 = true;
            }
        }
        if (z10) {
            return b0.O0(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        p.j(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (Pair<FileSystem, Path> pair : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = pair.component1().metadataOrNull(pair.component2().resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path path) throws FileNotFoundException {
        p.j(path, C3426d4.i.f28530b);
        if (!Companion.keepPath(path)) {
            throw new FileNotFoundException("file not found: " + path);
        }
        String relativePath = toRelativePath(path);
        for (Pair<FileSystem, Path> pair : getRoots()) {
            try {
                return pair.component1().openReadOnly(pair.component2().resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path path, boolean z10, boolean z11) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        throw new IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    public Sink sink(Path path, boolean z10) throws IOException {
        p.j(path, C3426d4.i.f28530b);
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public Source source(Path path) throws FileNotFoundException {
        Source source;
        p.j(path, C3426d4.i.f28530b);
        if (!Companion.keepPath(path)) {
            throw new FileNotFoundException("file not found: " + path);
        }
        Path path2 = ROOT;
        InputStream resourceAsStream = this.classLoader.getResourceAsStream(Path.resolve$default(path2, path, false, 2, (Object) null).relativeTo(path2).toString());
        if (resourceAsStream != null && (source = Okio.source(resourceAsStream)) != null) {
            return source;
        }
        throw new FileNotFoundException("file not found: " + path);
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem fileSystem) {
        p.j(classLoader, "classLoader");
        p.j(fileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = fileSystem;
        this.roots$delegate = b.a(new a<List<? extends Pair<? extends FileSystem, ? extends Path>>>() { // from class: okio.internal.ResourceFileSystem$roots$2
            {
                super(0);
            }

            @Override // bk.a
            public final List<? extends Pair<? extends FileSystem, ? extends Path>> invoke() {
                ResourceFileSystem resourceFileSystem = this.this$0;
                return resourceFileSystem.toClasspathRoots(resourceFileSystem.classLoader);
            }
        });
        if (z10) {
            getRoots().size();
        }
    }

    private final Pair<FileSystem, Path> toFileRoot(URL url) {
        if (!p.e(url.getProtocol(), C3426d4.i.f28530b)) {
            return null;
        }
        return h.a(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
    }

    private final Pair<FileSystem, Path> toJarRoot(URL url) {
        int iR0;
        String string = url.toString();
        p.i(string, "toString(...)");
        if (!x.R(string, "jar:file:", false, 2, null) || (iR0 = a0.r0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        Path.Companion companion = Path.Companion;
        String strSubstring = string.substring(4, iR0);
        p.i(strSubstring, "substring(...)");
        return h.a(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), this.systemFileSystem, new l<ZipEntry, Boolean>() { // from class: okio.internal.ResourceFileSystem$toJarRoot$zip$1
            @Override // bk.l
            public final Boolean invoke(ZipEntry zipEntry) {
                p.j(zipEntry, "entry");
                return Boolean.valueOf(ResourceFileSystem.Companion.keepPath(zipEntry.getCanonicalPath()));
            }
        }), ROOT);
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }
}
