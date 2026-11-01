package com.unity3d.ads.core.data.model;

import ck.i;
import ck.p;
import java.io.File;

/* JADX INFO: compiled from: CachedFile.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final int priority;
    private final String protocol;
    private final String url;

    public CachedFile(String str, String str2, File file, String str3, long j10, String str4, int i10) {
        p.j(str, "url");
        p.j(str2, "name");
        p.j(str4, "protocol");
        this.url = str;
        this.name = str2;
        this.file = file;
        this.extension = str3;
        this.contentLength = j10;
        this.protocol = str4;
        this.priority = i10;
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.name;
    }

    public final File component3() {
        return this.file;
    }

    public final String component4() {
        return this.extension;
    }

    public final long component5() {
        return this.contentLength;
    }

    public final String component6() {
        return this.protocol;
    }

    public final int component7() {
        return this.priority;
    }

    public final CachedFile copy(String str, String str2, File file, String str3, long j10, String str4, int i10) {
        p.j(str, "url");
        p.j(str2, "name");
        p.j(str4, "protocol");
        return new CachedFile(str, str2, file, str3, j10, str4, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        return p.e(this.url, cachedFile.url) && p.e(this.name, cachedFile.name) && p.e(this.file, cachedFile.file) && p.e(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && p.e(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.name.hashCode()) * 31;
        File file = this.file;
        int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + Integer.hashCode(this.priority);
    }

    public String toString() {
        return "CachedFile(url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ CachedFile(String str, String str2, File file, String str3, long j10, String str4, int i10, int i11, i iVar) {
        this(str, str2, (i11 & 4) != 0 ? null : file, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? -1L : j10, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10);
    }
}
