package com.applovin.shadow.okio;

import ck.i;
import ck.p;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj.t;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class Path implements Comparable<Path> {
    public static final Companion Companion = new Companion(null);
    public static final String DIRECTORY_SEPARATOR;
    private final ByteString bytes;

    /* JADX INFO: compiled from: Path.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(str, z10);
        }

        public final Path get(File file) {
            p.j(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        public final Path get(String str) {
            p.j(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        public final Path get(String str, boolean z10) {
            p.j(str, "<this>");
            return com.applovin.shadow.okio.internal.Path.commonToPath(str, z10);
        }

        public final Path get(java.nio.file.Path path) {
            p.j(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(file, z10);
        }

        public final Path get(File file, boolean z10) {
            p.j(file, "<this>");
            String string = file.toString();
            p.i(string, "toString(...)");
            return get(string, z10);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(path, z10);
        }

        public final Path get(java.nio.file.Path path, boolean z10) {
            p.j(path, "<this>");
            return get(path.toString(), z10);
        }
    }

    public static final Path get(File file) {
        return Companion.get(file);
    }

    public static final Path get(File file, boolean z10) {
        return Companion.get(file, z10);
    }

    public static final Path get(String str) {
        return Companion.get(str);
    }

    public static final Path get(String str, boolean z10) {
        return Companion.get(str, z10);
    }

    public static final Path get(java.nio.file.Path path) {
        return Companion.get(path);
    }

    public static final Path get(java.nio.file.Path path, boolean z10) {
        return Companion.get(path, z10);
    }

    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(str, z10);
    }

    public final Path resolve(Path path) {
        p.j(path, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, path, false);
    }

    static {
        String str = File.separator;
        p.i(str, "separator");
        DIRECTORY_SEPARATOR = str;
    }

    public Path(ByteString byteString) {
        p.j(byteString, "bytes");
        this.bytes = byteString;
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(byteString, z10);
    }

    @Override // java.lang.Comparable
    public int compareTo(Path path) {
        p.j(path, "other");
        return getBytes$okio().compareTo(path.getBytes$okio());
    }

    public boolean equals(Object obj) {
        return (obj instanceof Path) && p.e(((Path) obj).getBytes$okio(), getBytes$okio());
    }

    public final ByteString getBytes$okio() {
        return this.bytes;
    }

    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i10, getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(t.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i10, getBytes$okio().size()));
        }
        return arrayList;
    }

    public final Path normalized() {
        return Companion.get(toString(), true);
    }

    public final Path relativeTo(Path path) {
        p.j(path, "other");
        if (!p.e(getRoot(), path.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + path).toString());
        }
        List<ByteString> segmentsBytes = getSegmentsBytes();
        List<ByteString> segmentsBytes2 = path.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i10 = 0;
        while (i10 < iMin && p.e(segmentsBytes.get(i10), segmentsBytes2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && getBytes$okio().size() == path.getBytes$okio().size()) {
            return Companion.get$default(Companion, ".", false, 1, (Object) null);
        }
        if (!(segmentsBytes2.subList(i10, segmentsBytes2.size()).indexOf(com.applovin.shadow.okio.internal.Path.DOT_DOT) == -1)) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + path).toString());
        }
        Buffer buffer = new Buffer();
        ByteString slash = com.applovin.shadow.okio.internal.Path.getSlash(path);
        if (slash == null && (slash = com.applovin.shadow.okio.internal.Path.getSlash(this)) == null) {
            slash = com.applovin.shadow.okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i11 = i10; i11 < size; i11++) {
            buffer.write(com.applovin.shadow.okio.internal.Path.DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i10 < size2) {
            buffer.write(segmentsBytes.get(i10));
            buffer.write(slash);
            i10++;
        }
        return com.applovin.shadow.okio.internal.Path.toPath(buffer, false);
    }

    public final Path resolve(Path path, boolean z10) {
        p.j(path, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, path, z10);
    }

    public final File toFile() {
        return new File(toString());
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(path2, z10);
    }

    public final Path getRoot() {
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            return null;
        }
        return new Path(getBytes$okio().substring(0, iRootLength));
    }

    public int hashCode() {
        return getBytes$okio().hashCode();
    }

    public final boolean isAbsolute() {
        if (com.applovin.shadow.okio.internal.Path.rootLength(this) != -1) {
            return true;
        }
        return false;
    }

    public final boolean isRelative() {
        if (com.applovin.shadow.okio.internal.Path.rootLength(this) == -1) {
            return true;
        }
        return false;
    }

    public final boolean isRoot() {
        if (com.applovin.shadow.okio.internal.Path.rootLength(this) == getBytes$okio().size()) {
            return true;
        }
        return false;
    }

    public final String name() {
        return nameBytes().utf8();
    }

    public final ByteString nameBytes() {
        int indexOfLastSlash = com.applovin.shadow.okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash != -1) {
            return ByteString.substring$default(getBytes$okio(), indexOfLastSlash + 1, 0, 2, null);
        }
        if (volumeLetter() != null && getBytes$okio().size() == 2) {
            return ByteString.EMPTY;
        }
        return getBytes$okio();
    }

    public final Path parent() {
        Path path;
        if (!p.e(getBytes$okio(), com.applovin.shadow.okio.internal.Path.DOT) && !p.e(getBytes$okio(), com.applovin.shadow.okio.internal.Path.SLASH) && !p.e(getBytes$okio(), com.applovin.shadow.okio.internal.Path.BACKSLASH) && !com.applovin.shadow.okio.internal.Path.lastSegmentIsDotDot(this)) {
            int indexOfLastSlash = com.applovin.shadow.okio.internal.Path.getIndexOfLastSlash(this);
            if (indexOfLastSlash == 2 && volumeLetter() != null) {
                if (getBytes$okio().size() == 3) {
                    return null;
                }
                path = new Path(ByteString.substring$default(getBytes$okio(), 0, 3, 1, null));
            } else {
                if (indexOfLastSlash == 1 && getBytes$okio().startsWith(com.applovin.shadow.okio.internal.Path.BACKSLASH)) {
                    return null;
                }
                if (indexOfLastSlash == -1 && volumeLetter() != null) {
                    if (getBytes$okio().size() == 2) {
                        return null;
                    }
                    path = new Path(ByteString.substring$default(getBytes$okio(), 0, 2, 1, null));
                } else {
                    if (indexOfLastSlash == -1) {
                        return new Path(com.applovin.shadow.okio.internal.Path.DOT);
                    }
                    if (indexOfLastSlash == 0) {
                        path = new Path(ByteString.substring$default(getBytes$okio(), 0, 1, 1, null));
                    } else {
                        return new Path(ByteString.substring$default(getBytes$okio(), 0, indexOfLastSlash, 1, null));
                    }
                }
            }
            return path;
        }
        return null;
    }

    public final Path resolve(String str) {
        p.j(str, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().writeUtf8(str), false), false);
    }

    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        p.i(path, "get(...)");
        return path;
    }

    public String toString() {
        return getBytes$okio().utf8();
    }

    public final Character volumeLetter() {
        boolean z10;
        boolean z11 = false;
        if (ByteString.indexOf$default(getBytes$okio(), com.applovin.shadow.okio.internal.Path.SLASH, 0, 2, (Object) null) != -1 || getBytes$okio().size() < 2 || getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) getBytes$okio().getByte(0);
        if ('a' <= c10 && c10 < '{') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if ('A' <= c10 && c10 < '[') {
                z11 = true;
            }
            if (!z11) {
                return null;
            }
        }
        return Character.valueOf(c10);
    }

    public final Path resolve(ByteString byteString) {
        p.j(byteString, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().write(byteString), false), false);
    }

    public final Path resolve(String str, boolean z10) {
        p.j(str, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().writeUtf8(str), false), z10);
    }

    public final Path resolve(ByteString byteString, boolean z10) {
        p.j(byteString, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().write(byteString), false), z10);
    }
}
