package xyz.doikki.videoplayer.controller;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: compiled from: OrientationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f75146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0797a f75147b;

    /* JADX INFO: renamed from: xyz.doikki.videoplayer.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OrientationHelper.java */
    public interface InterfaceC0797a {
        void onOrientationChanged(int i10);
    }

    public void a(InterfaceC0797a interfaceC0797a) {
        this.f75147b = interfaceC0797a;
    }

    public a(Context context) {
        super(context);
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f75146a < 300) {
            return;
        }
        InterfaceC0797a interfaceC0797a = this.f75147b;
        if (interfaceC0797a != null) {
            interfaceC0797a.onOrientationChanged(i10);
        }
        this.f75146a = jCurrentTimeMillis;
    }
}
