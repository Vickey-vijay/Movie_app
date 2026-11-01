package com.applovin.shadow.okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.p;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.Source;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kk.k;
import kk.l;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import mj.r;
import nj.i;
import nj.s;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class FileSystem {

    /* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    /* JADX INFO: compiled from: FileSystem.kt */
    @d(c = "com.applovin.shadow.okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileSystem.kt */
    @d(c = "com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
    public static final class C08611 extends RestrictedSuspendLambda implements p<k<? super Path>, c<? super r>, Object> {
        public final /* synthetic */ Path $dir;
        public final /* synthetic */ boolean $followSymlinks;
        public final /* synthetic */ com.applovin.shadow.okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08611(Path path, com.applovin.shadow.okio.FileSystem fileSystem, boolean z10, c<? super C08611> cVar) {
            super(2, cVar);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            C08611 c08611 = new C08611(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, cVar);
            c08611.L$0 = obj;
            return c08611;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(k<? super Path> kVar, c<? super r> cVar) {
            return ((C08611) create(kVar, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            k kVar;
            i iVar;
            Iterator<Path> it;
            Object objF = a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    it = (Iterator) this.L$2;
                    i iVar2 = (i) this.L$1;
                    k kVar2 = (k) this.L$0;
                    kotlin.c.b(obj);
                    iVar = iVar2;
                    kVar = kVar2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                k kVar3 = (k) this.L$0;
                i iVar3 = new i();
                iVar3.addLast(this.$dir);
                kVar = kVar3;
                iVar = iVar3;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            }
            while (it.hasNext()) {
                Path next = it.next();
                com.applovin.shadow.okio.FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z10 = this.$followSymlinks;
                this.L$0 = kVar;
                this.L$1 = iVar;
                this.L$2 = it;
                this.label = 1;
                if (FileSystem.collectRecursively(kVar, fileSystem, iVar, next, z10, false, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f9 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:17:0x0059, B:48:0x00f3, B:50:0x00f9, B:54:0x0104), top: B:73:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    /* JADX WARN: Code duplicated, block: B:66:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:48:0x00f3->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [kk.k] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, kk.k, kk.k<? super com.applovin.shadow.okio.Path>] */
    /* JADX WARN: Type inference failed for: r17v1, types: [kk.k] */
    public static final Object collectRecursively(k<? super Path> kVar, com.applovin.shadow.okio.FileSystem fileSystem, i<Path> iVar, Path path, boolean z10, boolean z11, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        com.applovin.shadow.okio.FileSystem fileSystem2;
        i<Path> iVar2;
        boolean z12;
        ?? r12;
        boolean z13;
        com.applovin.shadow.okio.FileSystem fileSystem3;
        i<Path> iVar3;
        ?? r13;
        com.applovin.shadow.okio.FileSystem fileSystem4;
        Path path2;
        boolean z14;
        boolean z15;
        Iterator<Path> it;
        Path next;
        boolean z16;
        Path path3 = path;
        boolean z17 = z11;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            if (z17) {
                fileSystem2 = fileSystem;
                iVar2 = iVar;
                z12 = z10;
            } else {
                anonymousClass1.L$0 = kVar;
                fileSystem2 = fileSystem;
                anonymousClass1.L$1 = fileSystem2;
                iVar2 = iVar;
                anonymousClass1.L$2 = iVar2;
                anonymousClass1.L$3 = path3;
                z12 = z10;
                anonymousClass1.Z$0 = z12;
                anonymousClass1.Z$1 = z17;
                anonymousClass1.label = 1;
                if (kVar.a(path3, anonymousClass1) == objF) {
                    return objF;
                }
            }
            r12 = kVar;
            z13 = z12;
            fileSystem3 = fileSystem2;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    z15 = anonymousClass1.Z$1;
                    z14 = anonymousClass1.Z$0;
                    it = (Iterator) anonymousClass1.L$4;
                    path2 = (Path) anonymousClass1.L$3;
                    iVar3 = (i) anonymousClass1.L$2;
                    fileSystem4 = (com.applovin.shadow.okio.FileSystem) anonymousClass1.L$1;
                    k kVar2 = (k) anonymousClass1.L$0;
                    try {
                        kotlin.c.b(obj);
                        r13 = kVar2;
                        while (it.hasNext()) {
                            next = it.next();
                            if (z15) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            anonymousClass1.L$0 = r13;
                            anonymousClass1.L$1 = fileSystem4;
                            anonymousClass1.L$2 = iVar3;
                            anonymousClass1.L$3 = path2;
                            anonymousClass1.L$4 = it;
                            anonymousClass1.Z$0 = z14;
                            anonymousClass1.Z$1 = z15;
                            anonymousClass1.label = 2;
                            if (collectRecursively(r13, fileSystem4, iVar3, next, z14, z16, anonymousClass1) == objF) {
                                return objF;
                            }
                        }
                        iVar3.removeLast();
                        z17 = z15;
                        path3 = path2;
                        r12 = r13;
                        if (z17) {
                            return r.f64562a;
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.label = 3;
                        if (r12.a(path3, anonymousClass1) == objF) {
                            return objF;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        iVar3.removeLast();
                        throw th;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                return r.f64562a;
            }
            boolean z18 = anonymousClass1.Z$1;
            boolean z19 = anonymousClass1.Z$0;
            Path path4 = (Path) anonymousClass1.L$3;
            iVar2 = (i) anonymousClass1.L$2;
            fileSystem3 = (com.applovin.shadow.okio.FileSystem) anonymousClass1.L$1;
            k kVar3 = (k) anonymousClass1.L$0;
            kotlin.c.b(obj);
            z17 = z18;
            z13 = z19;
            path3 = path4;
            r12 = kVar3;
        }
        List<Path> listListOrNull = fileSystem3.listOrNull(path3);
        if (listListOrNull == null) {
            listListOrNull = s.k();
        }
        if (!listListOrNull.isEmpty()) {
            Path path5 = path3;
            int i12 = 0;
            while (true) {
                if (z13 && iVar2.contains(path5)) {
                    throw new IOException("symlink cycle at " + path3);
                }
                Path pathSymlinkTarget = symlinkTarget(fileSystem3, path5);
                if (pathSymlinkTarget != null) {
                    i12++;
                    path5 = pathSymlinkTarget;
                } else if (z13 || i12 == 0) {
                    iVar2.addLast(path5);
                    try {
                        r13 = r12;
                        fileSystem4 = fileSystem3;
                        iVar3 = iVar2;
                        path2 = path3;
                        z14 = z13;
                        z15 = z17;
                        it = listListOrNull.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            if (z15) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            anonymousClass1.L$0 = r13;
                            anonymousClass1.L$1 = fileSystem4;
                            anonymousClass1.L$2 = iVar3;
                            anonymousClass1.L$3 = path2;
                            anonymousClass1.L$4 = it;
                            anonymousClass1.Z$0 = z14;
                            anonymousClass1.Z$1 = z15;
                            anonymousClass1.label = 2;
                            if (collectRecursively(r13, fileSystem4, iVar3, next, z14, z16, anonymousClass1) == objF) {
                                return objF;
                            }
                        }
                        iVar3.removeLast();
                        z17 = z15;
                        path3 = path2;
                        r12 = r13;
                    } catch (Throwable th3) {
                        th = th3;
                        iVar3 = iVar2;
                        iVar3.removeLast();
                        throw th;
                    }
                }
            }
        }
        if (z17) {
            return r.f64562a;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.label = 3;
        if (r12.a(path3, anonymousClass1) == objF) {
            return objF;
        }
        return r.f64562a;
    }

    public static final void commonCopy(com.applovin.shadow.okio.FileSystem fileSystem, Path path, Path path2) throws IOException {
        Long lValueOf;
        Throwable th2;
        Long lValueOf2;
        ck.p.j(fileSystem, "<this>");
        ck.p.j(path, "source");
        ck.p.j(path2, TypedValues.AttributesType.S_TARGET);
        Source source = fileSystem.source(path);
        Throwable th3 = null;
        try {
            BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path2));
            try {
                lValueOf2 = Long.valueOf(bufferedSinkBuffer.writeAll(source));
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                th2 = null;
            } catch (Throwable th5) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th6) {
                        mj.d.a(th5, th6);
                    }
                }
                th2 = th5;
                lValueOf2 = null;
            }
            if (th2 != null) {
                throw th2;
            }
            ck.p.g(lValueOf2);
            lValueOf = Long.valueOf(lValueOf2.longValue());
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th7) {
                    th3 = th7;
                }
            }
            if (th3 != null) {
                throw th3;
            }
            ck.p.g(lValueOf);
        } catch (Throwable th8) {
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th9) {
                    mj.d.a(th8, th9);
                }
            }
            th3 = th8;
            lValueOf = null;
        }
    }

    public static final void commonCreateDirectories(com.applovin.shadow.okio.FileSystem fileSystem, Path path, boolean z10) throws IOException {
        ck.p.j(fileSystem, "<this>");
        ck.p.j(path, "dir");
        i iVar = new i();
        for (Path pathParent = path; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            iVar.addFirst(pathParent);
        }
        if (z10 && iVar.isEmpty()) {
            throw new IOException(path + " already exists.");
        }
        Iterator<E> it = iVar.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path path, boolean z10) throws IOException {
        ck.p.j(fileSystem, "<this>");
        ck.p.j(path, "fileOrDirectory");
        Iterator it = l.b(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, path, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean commonExists(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        ck.p.j(fileSystem, "<this>");
        ck.p.j(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final kk.i<Path> commonListRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path path, boolean z10) throws IOException {
        ck.p.j(fileSystem, "<this>");
        ck.p.j(path, "dir");
        return l.b(new C08611(path, fileSystem, z10, null));
    }

    public static final FileMetadata commonMetadata(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        ck.p.j(fileSystem, "<this>");
        ck.p.j(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public static final Path symlinkTarget(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        ck.p.j(fileSystem, "<this>");
        ck.p.j(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        ck.p.g(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
