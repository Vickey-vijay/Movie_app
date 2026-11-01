package u4;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import t4.h;
import t4.i;

/* JADX INFO: compiled from: CeaDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class e implements t4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<b> f72697a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<i> f72698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue<b> f72699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f72700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f72701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f72702f;

    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class b extends h implements Comparable<b> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f72703i;

        public b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull b bVar) {
            if (isEndOfStream() != bVar.isEndOfStream()) {
                if (isEndOfStream()) {
                    return 1;
                }
                return -1;
            }
            long j10 = this.f64971e - bVar.f64971e;
            if (j10 == 0) {
                j10 = this.f72703i - bVar.f72703i;
                if (j10 == 0) {
                    return 0;
                }
            }
            if (j10 > 0) {
                return 1;
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: CeaDecoder.java */
    public final class c extends i {
        public c() {
        }

        @Override // t4.i, o3.f
        public final void release() {
            e.this.h(this);
        }
    }

    public abstract t4.e a();

    public abstract void b(h hVar);

    public abstract boolean e();

    @Override // o3.c
    public void release() {
    }

    @Override // o3.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h dequeueInputBuffer() throws SubtitleDecoderException {
        g5.a.f(this.f72700d == null);
        if (this.f72697a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f72697a.pollFirst();
        this.f72700d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // o3.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public i dequeueOutputBuffer() throws SubtitleDecoderException {
        if (this.f72698b.isEmpty()) {
            return null;
        }
        while (!this.f72699c.isEmpty() && this.f72699c.peek().f64971e <= this.f72701e) {
            b bVarPoll = this.f72699c.poll();
            if (bVarPoll.isEndOfStream()) {
                i iVarPollFirst = this.f72698b.pollFirst();
                iVarPollFirst.addFlag(4);
                g(bVarPoll);
                return iVarPollFirst;
            }
            b(bVarPoll);
            if (e()) {
                t4.e eVarA = a();
                if (!bVarPoll.isDecodeOnly()) {
                    i iVarPollFirst2 = this.f72698b.pollFirst();
                    iVarPollFirst2.a(bVarPoll.f64971e, eVarA, Long.MAX_VALUE);
                    g(bVarPoll);
                    return iVarPollFirst2;
                }
            }
            g(bVarPoll);
        }
        return null;
    }

    @Override // o3.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void queueInputBuffer(h hVar) throws SubtitleDecoderException {
        g5.a.a(hVar == this.f72700d);
        if (hVar.isDecodeOnly()) {
            g(this.f72700d);
        } else {
            b bVar = this.f72700d;
            long j10 = this.f72702f;
            this.f72702f = 1 + j10;
            bVar.f72703i = j10;
            this.f72699c.add(this.f72700d);
        }
        this.f72700d = null;
    }

    @Override // o3.c
    public void flush() {
        this.f72702f = 0L;
        this.f72701e = 0L;
        while (!this.f72699c.isEmpty()) {
            g(this.f72699c.poll());
        }
        b bVar = this.f72700d;
        if (bVar != null) {
            g(bVar);
            this.f72700d = null;
        }
    }

    @Override // t4.f
    public void setPositionUs(long j10) {
        this.f72701e = j10;
    }

    public e() {
        int i10 = 0;
        while (true) {
            if (i10 >= 10) {
                break;
            }
            this.f72697a.add(new b());
            i10++;
        }
        this.f72698b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f72698b.add(new c());
        }
        this.f72699c = new PriorityQueue<>();
    }

    public final void g(b bVar) {
        bVar.clear();
        this.f72697a.add(bVar);
    }

    public void h(i iVar) {
        iVar.clear();
        this.f72698b.add(iVar);
    }
}
