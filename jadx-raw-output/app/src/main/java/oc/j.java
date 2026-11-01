package oc;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: ScarAdapterBase.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class j implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rc.c f65160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, qc.a> f65161b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qc.a f65162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c<l> f65163d;

    /* JADX INFO: compiled from: ScarAdapterBase.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f65164b;

        public a(Activity activity) {
            this.f65164b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f65162c.show(this.f65164b);
        }
    }

    @Override // oc.e
    public void a(Context context, String str, UnityAdFormat unityAdFormat, rc.b bVar) {
        this.f65160a.a(context, str, unityAdFormat, bVar);
    }

    @Override // oc.e
    public void b(Context context, boolean z10, rc.b bVar) {
        this.f65160a.b(context, z10, bVar);
    }

    @Override // oc.e
    public void c(Context context, List<UnityAdFormat> list, rc.b bVar) {
        this.f65160a.c(context, list, bVar);
    }

    @Override // oc.e
    public void d(Activity activity, String str, String str2) {
        qc.a aVar = this.f65161b.get(str2);
        if (aVar != null) {
            this.f65162c = aVar;
            k.a(new a(activity));
            return;
        }
        this.f65163d.handleError(b.f(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }

    public j(c<l> cVar) {
        this.f65163d = cVar;
    }
}
