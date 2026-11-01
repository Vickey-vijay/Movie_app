package sg.bigo.ads.api.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final b f69376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.a.l f69377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.b f69378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.common.g f69379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f69380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f69381f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public sg.bigo.ads.common.g f69382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final b f69383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private final sg.bigo.ads.api.a.l f69384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private final sg.bigo.ads.api.b f69385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        private final Context f69386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Context f69387f;

        public a(@NonNull b bVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull Context context, @NonNull Context context2) {
            this.f69383b = bVar;
            this.f69384c = lVar;
            this.f69385d = bVar2;
            this.f69386e = context;
            this.f69387f = context2;
        }

        public final f a() {
            f fVar = new f(this.f69383b, this.f69384c, this.f69385d, this.f69386e, this.f69387f, (byte) 0);
            fVar.f69379d = this.f69382a;
            return fVar;
        }
    }

    private f(@NonNull b bVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull Context context, @NonNull Context context2) {
        this.f69376a = bVar;
        this.f69377b = lVar;
        this.f69378c = bVar2;
        this.f69380e = context;
        this.f69381f = context2;
    }

    public /* synthetic */ f(b bVar, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.api.b bVar2, Context context, Context context2, byte b10) {
        this(bVar, lVar, bVar2, context, context2);
    }

    public final f a(b bVar) {
        f fVar = new f(bVar, this.f69377b, this.f69378c, this.f69380e, this.f69381f);
        fVar.f69379d = this.f69379d;
        return fVar;
    }
}
