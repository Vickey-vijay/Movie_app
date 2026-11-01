package com.yzq.zxinglibrary.android;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import te.c;
import ue.f;
import we.a;
import y5.i;

/* JADX INFO: loaded from: classes.dex */
public final class CaptureActivityHandler extends Handler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f51193e = CaptureActivityHandler.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureActivity f51194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f51195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public State f51196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f51197d;

    public enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public void a() {
        this.f51196c = State.DONE;
        this.f51197d.j();
        Message.obtain(this.f51195b.a(), 5).sendToTarget();
        try {
            this.f51195b.join(500L);
        } catch (InterruptedException unused) {
        }
        removeMessages(3);
        removeMessages(2);
    }

    public void b() {
        if (this.f51196c == State.SUCCESS) {
            this.f51196c = State.PREVIEW;
            this.f51197d.g(this.f51195b.a(), 1);
            this.f51194a.drawViewfinder();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 2) {
            this.f51196c = State.PREVIEW;
            this.f51197d.g(this.f51195b.a(), 1);
        }
        if (i10 == 3) {
            this.f51196c = State.SUCCESS;
            this.f51194a.handleDecode((i) message.obj);
            return;
        }
        switch (i10) {
            case 6:
                b();
                break;
            case 7:
                this.f51194a.setResult(-1, (Intent) message.obj);
                this.f51194a.finish();
                break;
            case 8:
                this.f51194a.switchFlashImg(8);
                break;
            case 9:
                this.f51194a.switchFlashImg(9);
                break;
        }
    }

    public CaptureActivityHandler(CaptureActivity captureActivity, c cVar) {
        this.f51194a = captureActivity;
        f fVar = new f(captureActivity, new a(captureActivity.getViewfinderView()));
        this.f51195b = fVar;
        fVar.start();
        this.f51196c = State.SUCCESS;
        this.f51197d = cVar;
        cVar.i();
        b();
    }
}
