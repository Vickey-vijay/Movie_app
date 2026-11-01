package sg.bigo.ads.core.g.a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.core.t;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.g.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements sg.bigo.ads.core.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f71486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public b f71487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0737a f71488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b.a f71489d = new b.a() { // from class: sg.bigo.ads.core.g.a.a.1
        @Override // sg.bigo.ads.core.g.a.b.a
        public final void a() {
            InterfaceC0737a interfaceC0737a = a.this.f71488c;
            if (interfaceC0737a != null) {
                interfaceC0737a.a();
            }
            b bVarB = a.this.b();
            u.a(bVarB, a.this.f71486a, null, -1);
            bVarB.setVPAIDEvenListener(a.this.f71487b.getVPAIDEvenListener());
            bVarB.setLayoutParams(a.this.f71487b.getLayoutParams());
            u.b(a.this.f71487b);
            a.this.f71487b = bVarB;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f71490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f71491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f71492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f71493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f f71494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f71495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f71496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t f71497l;

    /* JADX INFO: renamed from: sg.bigo.ads.core.g.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0737a {
        void a();
    }

    public a(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull String str, int i10, int i11, @NonNull f fVar, @Nullable String str2, int i12, t tVar) {
        this.f71490e = context;
        this.f71486a = viewGroup;
        this.f71491f = str;
        this.f71492g = i10;
        this.f71493h = i11;
        this.f71494i = fVar;
        this.f71495j = str2;
        this.f71496k = i12;
        this.f71497l = tVar;
        b bVarB = b();
        this.f71487b = bVarB;
        u.a(bVarB, viewGroup, null, 0);
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        this.f71487b.a("window.vpaidwrapper.pauseAd()");
    }

    public final b b() {
        b bVar = new b(this.f71490e, this.f71491f, this.f71492g, this.f71493h, this.f71494i, this.f71495j, this.f71496k, this.f71497l);
        bVar.setOnRenderProcessGoneListener(this.f71489d);
        return bVar;
    }
}
