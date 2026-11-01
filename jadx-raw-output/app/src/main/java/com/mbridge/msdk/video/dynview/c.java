package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: compiled from: ViewOption.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f38578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f38579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f38582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f38583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f38584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f38585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<String> f38586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f38588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f38589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f38590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f38591q;

    /* JADX INFO: compiled from: ViewOption.java */
    public static class b implements InterfaceC0396c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f38592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f38593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f38594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f38595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f38596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f38597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f38598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f38599h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f38600i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f38601j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f38602k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<String> f38603l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f38604m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f38605n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f38606o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f38607p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f38608q;

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c a(Context context) {
            this.f38592a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c b(int i10) {
            this.f38594c = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public c build() {
            return new c(this);
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c c(String str) {
            this.f38593b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c d(int i10) {
            this.f38604m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c e(int i10) {
            this.f38607p = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c f(int i10) {
            this.f38606o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c fileDirs(List<String> list) {
            this.f38603l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c orientation(int i10) {
            this.f38597f = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c a(float f10) {
            this.f38596e = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c b(float f10) {
            this.f38595d = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c c(int i10) {
            this.f38598g = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c a(View view) {
            this.f38599h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c b(String str) {
            this.f38608q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c a(List<CampaignEx> list) {
            this.f38600i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c a(int i10) {
            this.f38601j = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c a(boolean z10) {
            this.f38602k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0396c
        public InterfaceC0396c a(String str) {
            this.f38605n = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewOption.java */
    public interface InterfaceC0396c {
        InterfaceC0396c a(float f10);

        InterfaceC0396c a(int i10);

        InterfaceC0396c a(Context context);

        InterfaceC0396c a(View view);

        InterfaceC0396c a(String str);

        InterfaceC0396c a(List<CampaignEx> list);

        InterfaceC0396c a(boolean z10);

        InterfaceC0396c b(float f10);

        InterfaceC0396c b(int i10);

        InterfaceC0396c b(String str);

        c build();

        InterfaceC0396c c(int i10);

        InterfaceC0396c c(String str);

        InterfaceC0396c d(int i10);

        InterfaceC0396c e(int i10);

        InterfaceC0396c f(int i10);

        InterfaceC0396c fileDirs(List<String> list);

        InterfaceC0396c orientation(int i10);
    }

    private c(b bVar) {
        this.f38579e = bVar.f38596e;
        this.f38578d = bVar.f38595d;
        this.f38580f = bVar.f38597f;
        this.f38581g = bVar.f38598g;
        this.f38575a = bVar.f38592a;
        this.f38576b = bVar.f38593b;
        this.f38577c = bVar.f38594c;
        this.f38582h = bVar.f38599h;
        this.f38583i = bVar.f38600i;
        this.f38584j = bVar.f38601j;
        this.f38585k = bVar.f38602k;
        this.f38586l = bVar.f38603l;
        this.f38587m = bVar.f38604m;
        this.f38588n = bVar.f38605n;
        this.f38589o = bVar.f38606o;
        this.f38590p = bVar.f38607p;
        this.f38591q = bVar.f38608q;
    }

    public static b a() {
        return new b();
    }

    public List<CampaignEx> b() {
        return this.f38583i;
    }

    public Context c() {
        return this.f38575a;
    }

    public List<String> d() {
        return this.f38586l;
    }

    public int e() {
        return this.f38589o;
    }

    public String f() {
        return this.f38576b;
    }

    public int g() {
        return this.f38577c;
    }

    public int h() {
        return this.f38580f;
    }

    public View i() {
        return this.f38582h;
    }

    public int j() {
        return this.f38581g;
    }

    public float k() {
        return this.f38578d;
    }

    public int l() {
        return this.f38584j;
    }

    public float m() {
        return this.f38579e;
    }

    public String n() {
        return this.f38591q;
    }

    public int o() {
        return this.f38590p;
    }

    public boolean p() {
        return this.f38585k;
    }
}
