package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public class S3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27570a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IronSourceError f27571b = null;

    public void a(IronSourceError ironSourceError) {
        this.f27570a = false;
        this.f27571b = ironSourceError;
    }

    public void c() {
        this.f27570a = true;
        this.f27571b = null;
    }

    public boolean b() {
        return this.f27570a;
    }

    public IronSourceError a() {
        return this.f27571b;
    }

    public String toString() {
        if (b()) {
            return "valid:" + this.f27570a;
        }
        return "valid:" + this.f27570a + ", IronSourceError:" + this.f27571b;
    }
}
