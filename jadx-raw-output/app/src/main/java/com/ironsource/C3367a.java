package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3367a extends Thread {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f28048l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final InterfaceC3385b f28049m = new C0251a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final InterfaceC3715t9 f28050n = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28054d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3385b f28051a = f28049m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3715t9 f28052b = f28050n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f28053c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28055e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28056f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28057g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f28058h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28059i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28060j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f28061k = new c();

    /* JADX INFO: renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    public class C0251a implements InterfaceC3385b {
        @Override // com.ironsource.InterfaceC3385b
        public void a() {
        }

        @Override // com.ironsource.InterfaceC3385b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$b */
    public class b implements InterfaceC3715t9 {
        @Override // com.ironsource.InterfaceC3715t9
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3367a c3367a = C3367a.this;
            c3367a.f28058h = (c3367a.f28058h + 1) % Integer.MAX_VALUE;
        }
    }

    public void a(int i10) {
        this.f28059i = i10;
    }

    public int b() {
        return this.f28059i;
    }

    public C3367a c() {
        this.f28055e = null;
        return this;
    }

    public int a() {
        return this.f28060j;
    }

    public C3367a b(boolean z10) {
        this.f28056f = z10;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i10 = -1;
        while (!isInterrupted() && this.f28060j < this.f28059i) {
            int i11 = this.f28058h;
            this.f28053c.post(this.f28061k);
            try {
                Thread.sleep(this.f28054d);
                if (this.f28058h != i11) {
                    this.f28060j = 0;
                } else if (this.f28057g || !Debug.isDebuggerConnected()) {
                    this.f28060j++;
                    this.f28051a.a();
                    String str = C3676r4.f30596l;
                    if (str != null && !str.trim().isEmpty()) {
                        new P5(C3676r4.f30596l, String.valueOf(System.currentTimeMillis()), Z7.f27991k).a();
                    }
                } else {
                    if (this.f28058h != i10) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i10 = this.f28058h;
                }
            } catch (InterruptedException e10) {
                this.f28052b.a(e10);
                return;
            }
        }
        if (this.f28060j >= this.f28059i) {
            this.f28051a.b();
        }
    }

    public C3367a(int i10) {
        this.f28054d = i10;
    }

    public C3367a a(InterfaceC3385b interfaceC3385b) {
        if (interfaceC3385b == null) {
            this.f28051a = f28049m;
        } else {
            this.f28051a = interfaceC3385b;
        }
        return this;
    }

    public C3367a a(InterfaceC3715t9 interfaceC3715t9) {
        if (interfaceC3715t9 == null) {
            this.f28052b = f28050n;
        } else {
            this.f28052b = interfaceC3715t9;
        }
        return this;
    }

    public C3367a a(String str) {
        if (str == null) {
            str = "";
        }
        this.f28055e = str;
        return this;
    }

    public C3367a a(boolean z10) {
        this.f28057g = z10;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }
}
