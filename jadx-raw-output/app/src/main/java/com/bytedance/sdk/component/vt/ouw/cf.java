package com.bytedance.sdk.component.vt.ouw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cf implements Cloneable {
    public TimeUnit fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f11934le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public TimeUnit f11935lh;
    public List<pno> ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public TimeUnit f11936ra;
    public long vt;
    public long yu;

    public static final class ouw {
        public TimeUnit fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public long f11937le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public TimeUnit f11938lh;
        public final List<pno> ouw;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public TimeUnit f11939ra;
        public long vt;
        public long yu;

        public ouw() {
            this.ouw = new ArrayList();
            this.vt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f11938lh = timeUnit;
            this.yu = 10000L;
            this.fkw = timeUnit;
            this.f11937le = 10000L;
            this.f11939ra = timeUnit;
        }

        public final ouw lh(long j10, TimeUnit timeUnit) {
            this.f11937le = j10;
            this.f11939ra = timeUnit;
            return this;
        }

        public final ouw ouw(long j10, TimeUnit timeUnit) {
            this.vt = j10;
            this.f11938lh = timeUnit;
            return this;
        }

        public final ouw vt(long j10, TimeUnit timeUnit) {
            this.yu = j10;
            this.fkw = timeUnit;
            return this;
        }

        public ouw(byte b10) {
            this.ouw = new ArrayList();
            this.vt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f11938lh = timeUnit;
            this.yu = 10000L;
            this.fkw = timeUnit;
            this.f11937le = 10000L;
            this.f11939ra = timeUnit;
        }

        public ouw(cf cfVar) {
            this.ouw = new ArrayList();
            this.vt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f11938lh = timeUnit;
            this.yu = 10000L;
            this.fkw = timeUnit;
            this.f11937le = 10000L;
            this.f11939ra = timeUnit;
            this.vt = cfVar.vt;
            this.f11938lh = cfVar.f11935lh;
            this.yu = cfVar.yu;
            this.fkw = cfVar.fkw;
            this.f11937le = cfVar.f11934le;
            this.f11939ra = cfVar.f11936ra;
        }
    }

    public abstract vt ouw(ryl rylVar);

    public abstract yu ouw();

    public final ouw vt() {
        return new ouw(this);
    }

    public cf(ouw ouwVar) {
        this.vt = ouwVar.vt;
        this.yu = ouwVar.yu;
        this.f11934le = ouwVar.f11937le;
        List<pno> list = ouwVar.ouw;
        this.f11935lh = ouwVar.f11938lh;
        this.fkw = ouwVar.fkw;
        this.f11936ra = ouwVar.f11939ra;
        this.ouw = list;
    }
}
