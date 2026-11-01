package org.fourthline.cling.model.message;

import java.net.InetAddress;
import pn.d;

/* JADX INFO: compiled from: OutgoingDatagramMessage.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a<O extends d> extends UpnpMessage<O> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InetAddress f65771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f65772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public pn.c f65773i;

    @Override // org.fourthline.cling.model.message.UpnpMessage
    public pn.c j() {
        return this.f65773i;
    }

    public InetAddress u() {
        return this.f65771g;
    }

    public int v() {
        return this.f65772h;
    }

    public a(O o10, InetAddress inetAddress, int i10) {
        super(o10);
        this.f65773i = new pn.c(false);
        this.f65771g = inetAddress;
        this.f65772h = i10;
    }
}
