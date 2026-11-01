package o4;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: DashManifest.java */
/* JADX INFO: loaded from: classes7.dex */
public class b implements h4.d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f64994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f64996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f64997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f64998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f64999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f65000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f65001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final m f65002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Uri f65003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final g f65004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<f> f65005l;

    public b(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, @Nullable g gVar, @Nullable m mVar, @Nullable Uri uri, List<f> list) {
        this.f64994a = j10;
        this.f64995b = j11;
        this.f64996c = j12;
        this.f64997d = z10;
        this.f64998e = j13;
        this.f64999f = j14;
        this.f65000g = j15;
        this.f65001h = j16;
        this.f65004k = gVar;
        this.f65002i = mVar;
        this.f65003j = uri;
        this.f65005l = list == null ? Collections.emptyList() : list;
    }

    @Override // h4.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b copy(List<StreamKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= d()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f19401b != i10) {
                long jE = e(i10);
                if (jE != -9223372036854775807L) {
                    j10 += jE;
                }
            } else {
                f fVarC = c(i10);
                arrayList.add(new f(fVarC.f65025a, fVarC.f65026b - j10, b(fVarC.f65027c, linkedList), fVarC.f65028d));
            }
            i10++;
        }
        long j11 = this.f64995b;
        return new b(this.f64994a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f64996c, this.f64997d, this.f64998e, this.f64999f, this.f65000g, this.f65001h, this.f65004k, this.f65002i, this.f65003j, arrayList);
    }

    public final f c(int i10) {
        return this.f65005l.get(i10);
    }

    public final int d() {
        return this.f65005l.size();
    }

    public final long e(int i10) {
        if (i10 != this.f65005l.size() - 1) {
            return this.f65005l.get(i10 + 1).f65026b - this.f65005l.get(i10).f65026b;
        }
        long j10 = this.f64995b;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - this.f65005l.get(i10).f65026b;
    }

    public static ArrayList<a> b(List<a> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i10 = streamKeyPoll.f19401b;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i11 = streamKeyPoll.f19402c;
            a aVar = list.get(i11);
            List<i> list2 = aVar.f64990c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.f19403d));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.f19401b != i10) {
                    break;
                }
            } while (streamKeyPoll.f19402c == i11);
            arrayList.add(new a(aVar.f64988a, aVar.f64989b, arrayList2, aVar.f64991d, aVar.f64992e, aVar.f64993f));
        } while (streamKeyPoll.f19401b == i10);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    public final long f(int i10) {
        return k3.k.a(e(i10));
    }
}
