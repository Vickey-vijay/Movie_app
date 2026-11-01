package sg.bigo.ads.controller.d;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.k;
import sg.bigo.ads.controller.a.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final sg.bigo.ads.controller.a.b f70738a;

    public static class a implements k.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f70739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f70740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f70741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final String f70742d;

        public a(@Nullable String str, @Nullable j jVar) {
            this.f70739a = str;
            if (jVar != null) {
                boolean zC = jVar.c();
                this.f70741c = zC;
                this.f70740b = jVar.a();
                str = sg.bigo.ads.controller.a.d.a(str, zC ? jVar.b() : jVar.a());
            } else {
                this.f70741c = false;
                this.f70740b = "";
            }
            this.f70742d = str;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String a() {
            return this.f70742d;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String b() {
            return this.f70739a;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String c() {
            return this.f70740b;
        }

        @Override // sg.bigo.ads.common.k.b
        public final boolean d() {
            return this.f70741c;
        }
    }

    public e(@Nullable sg.bigo.ads.controller.a.b bVar) {
        this.f70738a = bVar;
    }

    @Override // sg.bigo.ads.common.k
    @NonNull
    public final k.b a(@Nullable String str) {
        sg.bigo.ads.controller.a.b bVar = this.f70738a;
        return new a(str, bVar != null ? bVar.f70407a.f70336i.f70348b : null);
    }
}
