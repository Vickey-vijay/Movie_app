package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: compiled from: TrackConfig.java */
/* JADX INFO: loaded from: classes8.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f38351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f38352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f38353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f38354j;

    /* JADX INFO: compiled from: TrackConfig.java */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p f38358d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f38362h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private w f38363i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f f38364j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f38355a = 50;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38356b = 15000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f38357c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f38359e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f38360f = 50;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f38361g = 604800000;

        public b a(int i10, p pVar) {
            this.f38357c = i10;
            this.f38358d = pVar;
            return this;
        }

        public b b(int i10) {
            if (i10 <= 0) {
                this.f38355a = 50;
            } else {
                this.f38355a = i10;
            }
            return this;
        }

        public b c(int i10) {
            if (i10 < 0) {
                this.f38356b = 15000;
            } else {
                this.f38356b = i10;
            }
            return this;
        }

        public b d(int i10) {
            if (i10 < 0) {
                this.f38360f = 50;
            } else {
                this.f38360f = i10;
            }
            return this;
        }

        public b e(int i10) {
            if (i10 <= 0) {
                this.f38359e = 2;
            } else {
                this.f38359e = i10;
            }
            return this;
        }

        public b a(int i10) {
            if (i10 < 0) {
                this.f38361g = 604800000;
            } else {
                this.f38361g = i10;
            }
            return this;
        }

        public b a(d dVar) {
            this.f38362h = dVar;
            return this;
        }

        public b a(w wVar) {
            this.f38363i = wVar;
            return this;
        }

        public b a(f fVar) {
            this.f38364j = fVar;
            return this;
        }

        public x a() {
            if (y.b(this.f38362h) && com.mbridge.msdk.tracker.a.f38101a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.b(this.f38363i) && com.mbridge.msdk.tracker.a.f38101a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.b(this.f38358d) || y.b(this.f38358d.b())) && com.mbridge.msdk.tracker.a.f38101a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new x(this);
        }
    }

    private x(b bVar) {
        this.f38345a = bVar.f38355a;
        this.f38346b = bVar.f38356b;
        this.f38347c = bVar.f38357c;
        this.f38348d = bVar.f38359e;
        this.f38349e = bVar.f38360f;
        this.f38350f = bVar.f38361g;
        this.f38351g = bVar.f38358d;
        this.f38352h = bVar.f38362h;
        this.f38353i = bVar.f38363i;
        this.f38354j = bVar.f38364j;
    }
}
