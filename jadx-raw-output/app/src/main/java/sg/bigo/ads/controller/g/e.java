package sg.bigo.ads.controller.g;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.common.u.a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e<T extends sg.bigo.ads.common.u.a> extends a<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final sg.bigo.ads.controller.b f70923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    private final Map<String, Object> f70924k;

    public e(@NonNull Map<String, Object> map, @NonNull sg.bigo.ads.common.g gVar, @Nullable sg.bigo.ads.controller.a.b bVar, @NonNull sg.bigo.ads.controller.b bVar2) {
        super(gVar, bVar);
        this.f70923j = bVar2;
        this.f70924k = map;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(int i10, int i11, String str) {
        this.f70923j.a(a(), i10, i11, str, null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(@NonNull String str, @NonNull Map<String, Object> map) {
        this.f70923j.a(a(), str);
    }

    @Override // sg.bigo.ads.controller.g.a
    @CallSuper
    public void a(@NonNull a.b bVar) {
        for (String str : this.f70924k.keySet()) {
            bVar.a(str, this.f70924k.get(str));
        }
    }
}
