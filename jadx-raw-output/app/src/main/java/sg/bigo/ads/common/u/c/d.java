package sg.bigo.ads.common.u.c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f69966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69967b;

    public d(@NonNull a aVar) {
        this.f69966a = aVar;
        this.f69967b = g.a(aVar.f69959b);
    }

    @NonNull
    public final String a() {
        return this.f69967b;
    }

    @Nullable
    public final String a(String str) {
        return this.f69966a.a(str);
    }
}
