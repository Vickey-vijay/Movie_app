package okio.internal;

/* JADX INFO: compiled from: ZipFiles.kt */
/* JADX INFO: loaded from: classes11.dex */
final class EocdRecord {
    private final long centralDirectoryOffset;
    private final int commentByteCount;
    private final long entryCount;

    public final long getCentralDirectoryOffset() {
        return this.centralDirectoryOffset;
    }

    public final int getCommentByteCount() {
        return this.commentByteCount;
    }

    public final long getEntryCount() {
        return this.entryCount;
    }

    public EocdRecord(long j10, long j11, int i10) {
        this.entryCount = j10;
        this.centralDirectoryOffset = j11;
        this.commentByteCount = i10;
    }
}
