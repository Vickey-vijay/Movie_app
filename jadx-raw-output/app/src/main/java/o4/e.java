package o4;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* JADX INFO: compiled from: EventStream.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventMessage[] f65020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f65021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f65023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f65024e;

    public String a() {
        return this.f65022c + "/" + this.f65023d;
    }

    public e(String str, String str2, long j10, long[] jArr, EventMessage[] eventMessageArr) {
        this.f65022c = str;
        this.f65023d = str2;
        this.f65024e = j10;
        this.f65021b = jArr;
        this.f65020a = eventMessageArr;
    }
}
