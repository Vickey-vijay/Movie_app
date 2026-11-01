package com.applovin.shadow.okio;

import ck.i;
import ck.p;
import com.ironsource.D8;
import java.util.ArrayList;
import java.util.Map;
import jk.c;
import jk.d;
import nj.b0;

/* JADX INFO: compiled from: FileMetadata.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FileMetadata {
    private final Long createdAtMillis;
    private final Map<c<?>, Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;
    private final Long lastAccessedAtMillis;
    private final Long lastModifiedAtMillis;
    private final Long size;
    private final Path symlinkTarget;

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public FileMetadata(boolean z10, boolean z11, Path path, Long l10, Long l11, Long l12, Long l13, Map<c<?>, ? extends Object> map) {
        p.j(map, "extras");
        this.isRegularFile = z10;
        this.isDirectory = z11;
        this.symlinkTarget = path;
        this.size = l10;
        this.createdAtMillis = l11;
        this.lastModifiedAtMillis = l12;
        this.lastAccessedAtMillis = l13;
        this.extras = kotlin.collections.a.x(map);
    }

    public final FileMetadata copy(boolean z10, boolean z11, Path path, Long l10, Long l11, Long l12, Long l13, Map<c<?>, ? extends Object> map) {
        p.j(map, "extras");
        return new FileMetadata(z10, z11, path, l10, l11, l12, l13, map);
    }

    public final <T> T extra(c<? extends T> cVar) {
        p.j(cVar, "type");
        Object obj = this.extras.get(cVar);
        if (obj == null) {
            return null;
        }
        return (T) d.a(cVar, obj);
    }

    public final Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public final Map<c<?>, Object> getExtras() {
        return this.extras;
    }

    public final Long getLastAccessedAtMillis() {
        return this.lastAccessedAtMillis;
    }

    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final Long getSize() {
        return this.size;
    }

    public final Path getSymlinkTarget() {
        return this.symlinkTarget;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public final boolean isRegularFile() {
        return this.isRegularFile;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add(D8.f26328e);
        }
        if (this.size != null) {
            arrayList.add("byteCount=" + this.size);
        }
        if (this.createdAtMillis != null) {
            arrayList.add("createdAt=" + this.createdAtMillis);
        }
        if (this.lastModifiedAtMillis != null) {
            arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis);
        }
        if (this.lastAccessedAtMillis != null) {
            arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis);
        }
        if (!this.extras.isEmpty()) {
            arrayList.add("extras=" + this.extras);
        }
        return b0.p0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ FileMetadata(boolean z10, boolean z11, Path path, Long l10, Long l11, Long l12, Long l13, Map map, int i10, i iVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) == 0 ? z11 : false, (i10 & 4) != 0 ? null : path, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) == 0 ? l13 : null, (i10 & 128) != 0 ? kotlin.collections.a.j() : map);
    }
}
