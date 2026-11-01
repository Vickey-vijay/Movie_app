package q4;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HlsPlaylist.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements h4.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f66518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66519c;

    public d(String str, List<String> list, boolean z10) {
        this.f66517a = str;
        this.f66518b = Collections.unmodifiableList(list);
        this.f66519c = z10;
    }
}
