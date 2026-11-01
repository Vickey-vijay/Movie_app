package okio;

import ck.i;
import ck.p;
import java.util.Arrays;
import nj.l;

/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class Segment {
    public static final Companion Companion = new Companion(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public Segment next;
    public boolean owner;
    public int pos;
    public Segment prev;
    public boolean shared;

    /* JADX INFO: compiled from: Segment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final void compact() {
        Segment segment = this.prev;
        int i10 = 0;
        if (!(segment != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        p.g(segment);
        if (segment.owner) {
            int i11 = this.limit - this.pos;
            Segment segment2 = this.prev;
            p.g(segment2);
            int i12 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            p.g(segment3);
            if (!segment3.shared) {
                Segment segment4 = this.prev;
                p.g(segment4);
                i10 = segment4.pos;
            }
            if (i11 > i12 + i10) {
                return;
            }
            Segment segment5 = this.prev;
            p.g(segment5);
            writeTo(segment5, i11);
            pop();
            SegmentPool.recycle(this);
        }
    }

    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        p.g(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        p.g(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        p.j(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        p.g(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment split(int i10) {
        Segment segmentTake;
        if (!(i10 > 0 && i10 <= this.limit - this.pos)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i10 >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i11 = this.pos;
            l.j(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        segmentTake.limit = segmentTake.pos + i10;
        this.pos += i10;
        Segment segment = this.prev;
        p.g(segment);
        segment.push(segmentTake);
        return segmentTake;
    }

    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        p.i(bArrCopyOf, "copyOf(...)");
        return new Segment(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(Segment segment, int i10) {
        p.j(segment, "sink");
        if (!segment.owner) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = segment.limit;
        if (i11 + i10 > 8192) {
            if (segment.shared) {
                throw new IllegalArgumentException();
            }
            int i12 = segment.pos;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = segment.data;
            l.j(bArr, bArr, 0, i12, i11, 2, null);
            segment.limit -= segment.pos;
            segment.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = segment.data;
        int i13 = segment.limit;
        int i14 = this.pos;
        l.g(bArr2, bArr3, i13, i14, i14 + i10);
        segment.limit += i10;
        this.pos += i10;
    }

    public Segment(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        p.j(bArr, "data");
        this.data = bArr;
        this.pos = i10;
        this.limit = i11;
        this.shared = z10;
        this.owner = z11;
    }
}
