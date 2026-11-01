package yj;

import bk.l;
import bk.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.AccessDeniedException;
import kotlin.io.FileWalkDirection;
import mj.r;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements kk.i<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f85756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f85757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<File, Boolean> f85758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<File, r> f85759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<File, IOException, r> f85760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f85761f;

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            ck.p.j(file, "rootDir");
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public final class b extends nj.c<File> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayDeque<c> f85762b;

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f85764b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public File[] f85765c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f85766d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f85767e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f85768f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                ck.p.j(file, "rootDir");
                this.f85768f = bVar;
            }

            @Override // yj.d.c
            public File b() {
                if (!this.f85767e && this.f85765c == null) {
                    l lVar = d.this.f85758c;
                    boolean z10 = false;
                    if (lVar != null && !((Boolean) lVar.invoke(a())).booleanValue()) {
                        z10 = true;
                    }
                    if (z10) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f85765c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        p pVar = d.this.f85760e;
                        if (pVar != null) {
                            pVar.mo1invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f85767e = true;
                    }
                }
                File[] fileArr = this.f85765c;
                if (fileArr != null) {
                    int i10 = this.f85766d;
                    ck.p.g(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f85765c;
                        ck.p.g(fileArr2);
                        int i11 = this.f85766d;
                        this.f85766d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f85764b) {
                    this.f85764b = true;
                    return a();
                }
                l lVar2 = d.this.f85759d;
                if (lVar2 != null) {
                    lVar2.invoke(a());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: yj.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class C0802b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f85769b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f85770c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0802b(b bVar, File file) {
                super(file);
                ck.p.j(file, "rootFile");
                this.f85770c = bVar;
            }

            @Override // yj.d.c
            public File b() {
                if (this.f85769b) {
                    return null;
                }
                this.f85769b = true;
                return a();
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f85771b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public File[] f85772c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f85773d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f85774e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                ck.p.j(file, "rootDir");
                this.f85774e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // yj.d.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f85771b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    yj.d$b r0 = r10.f85774e
                    yj.d r0 = yj.d.this
                    bk.l r0 = yj.d.e(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f85771b = r3
                    java.io.File r0 = r10.a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f85772c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f85773d
                    ck.p.g(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    yj.d$b r0 = r10.f85774e
                    yj.d r0 = yj.d.this
                    bk.l r0 = yj.d.g(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f85772c
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f85772c = r0
                    if (r0 != 0) goto L7b
                    yj.d$b r0 = r10.f85774e
                    yj.d r0 = yj.d.this
                    bk.p r0 = yj.d.f(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.mo1invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f85772c
                    if (r0 == 0) goto L85
                    ck.p.g(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    yj.d$b r0 = r10.f85774e
                    yj.d r0 = yj.d.this
                    bk.l r0 = yj.d.g(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f85772c
                    ck.p.g(r0)
                    int r1 = r10.f85773d
                    int r2 = r1 + 1
                    r10.f85773d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: yj.d.b.c.b():java.io.File");
            }
        }

        /* JADX INFO: renamed from: yj.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public /* synthetic */ class C0803d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f85762b = arrayDeque;
            if (d.this.f85756a.isDirectory()) {
                arrayDeque.push(a(d.this.f85756a));
            } else if (d.this.f85756a.isFile()) {
                arrayDeque.push(new C0802b(this, d.this.f85756a));
            } else {
                done();
            }
        }

        public final a a(File file) {
            int i10 = C0803d.$EnumSwitchMapping$0[d.this.f85757b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final File b() {
            while (true) {
                c cVarPeek = this.f85762b.peek();
                if (cVarPeek == null) {
                    return null;
                }
                File fileB = cVarPeek.b();
                if (fileB == null) {
                    this.f85762b.pop();
                } else {
                    if (ck.p.e(fileB, cVarPeek.a()) || !fileB.isDirectory() || this.f85762b.size() >= d.this.f85761f) {
                        return fileB;
                    }
                    this.f85762b.push(a(fileB));
                }
            }
        }

        @Override // nj.c
        public void computeNext() {
            File fileB = b();
            if (fileB != null) {
                setNext(fileB);
            } else {
                done();
            }
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f85775a;

        public abstract File b();

        public c(File file) {
            ck.p.j(file, "root");
            this.f85775a = file;
        }

        public final File a() {
            return this.f85775a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(File file, FileWalkDirection fileWalkDirection, l<? super File, Boolean> lVar, l<? super File, r> lVar2, p<? super File, ? super IOException, r> pVar, int i10) {
        this.f85756a = file;
        this.f85757b = fileWalkDirection;
        this.f85758c = lVar;
        this.f85759d = lVar2;
        this.f85760e = pVar;
        this.f85761f = i10;
    }

    @Override // kk.i
    public Iterator<File> iterator() {
        return new b();
    }

    public /* synthetic */ d(File file, FileWalkDirection fileWalkDirection, l lVar, l lVar2, p pVar, int i10, int i11, ck.i iVar) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, lVar, lVar2, pVar, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(File file, FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
        ck.p.j(file, "start");
        ck.p.j(fileWalkDirection, "direction");
    }
}
