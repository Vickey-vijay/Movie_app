package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: CallbackCenter.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f6699a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f6700b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f6701c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f6702d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f6703e = new CopyOnWriteArrayList();

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f6704a[crashType.ordinal()];
        if (i10 == 1) {
            this.f6699a.add(iCrashCallback);
            this.f6700b.add(iCrashCallback);
            this.f6701c.add(iCrashCallback);
            this.f6702d.add(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f6702d.add(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f6700b.add(iCrashCallback);
        } else if (i10 == 4) {
            this.f6699a.add(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f6701c.add(iCrashCallback);
        }
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f6704a[crashType.ordinal()];
        if (i10 == 1) {
            this.f6699a.remove(iCrashCallback);
            this.f6700b.remove(iCrashCallback);
            this.f6701c.remove(iCrashCallback);
            this.f6702d.remove(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f6702d.remove(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f6700b.remove(iCrashCallback);
        } else if (i10 == 4) {
            this.f6699a.remove(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f6701c.remove(iCrashCallback);
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: CallbackCenter.java */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6704a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6704a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6704a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6704a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6704a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6704a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @NonNull
    public final List<ICrashCallback> c() {
        return this.f6700b;
    }

    @NonNull
    public final List<ICrashCallback> d() {
        return this.f6701c;
    }

    @NonNull
    public final List<ICrashCallback> e() {
        return this.f6702d;
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.f6703e.add(iOOMCallback);
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.f6703e.remove(iOOMCallback);
    }

    @NonNull
    public final List<IOOMCallback> a() {
        return this.f6703e;
    }

    @NonNull
    public final List<ICrashCallback> b() {
        return this.f6699a;
    }
}
