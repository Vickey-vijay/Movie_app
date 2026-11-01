package o4;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Period.java */
/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f65025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f65026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f65027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f65028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final d f65029e;

    public f(@Nullable String str, long j10, List<a> list, List<e> list2) {
        this(str, j10, list, list2, null);
    }

    public f(@Nullable String str, long j10, List<a> list, List<e> list2, @Nullable d dVar) {
        this.f65025a = str;
        this.f65026b = j10;
        this.f65027c = Collections.unmodifiableList(list);
        this.f65028d = Collections.unmodifiableList(list2);
        this.f65029e = dVar;
    }

    public int a(int i10) {
        int size = this.f65027c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f65027c.get(i11).f64989b == i10) {
                return i11;
            }
        }
        return -1;
    }
}
