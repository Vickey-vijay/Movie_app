package yads;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class vp0 implements s43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p20 f83971a = new p20();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w43 f83972b = new w43();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f83973c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f83975e;

    @Override // yads.oa0
    public final Object a() {
        if (!(!this.f83975e)) {
            throw new IllegalStateException();
        }
        if (this.f83974d != 2 || this.f83973c.isEmpty()) {
            return null;
        }
        x43 x43Var = (x43) this.f83973c.removeFirst();
        if (this.f83972b.b(4)) {
            x43Var.f82731b |= 4;
        } else {
            w43 w43Var = this.f83972b;
            long j10 = w43Var.f82570f;
            p20 p20Var = this.f83971a;
            ByteBuffer byteBuffer = w43Var.f82568d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            p20Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            up0 up0Var = new up0(j10, yq.a(o20.f80903t, parcelableArrayList));
            x43Var.f83403c = this.f83972b.f82570f;
            x43Var.f84450d = up0Var;
            x43Var.f84451e = 0L;
        }
        this.f83972b.b();
        this.f83974d = 0;
        return x43Var;
    }

    @Override // yads.s43
    public final void a(long j10) {
    }

    @Override // yads.oa0
    public final void release() {
        this.f83975e = true;
    }

    @Override // yads.oa0
    public final Object b() {
        if (!(!this.f83975e)) {
            throw new IllegalStateException();
        }
        if (this.f83974d != 0) {
            return null;
        }
        this.f83974d = 1;
        return this.f83972b;
    }

    @Override // yads.oa0
    public final void flush() {
        if (!(!this.f83975e)) {
            throw new IllegalStateException();
        }
        this.f83972b.b();
        this.f83974d = 0;
    }

    public vp0() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f83973c.addFirst(new tp0(this));
        }
        this.f83974d = 0;
    }

    @Override // yads.oa0
    public final void a(w43 w43Var) {
        if (!this.f83975e) {
            if (this.f83974d == 1) {
                if (this.f83972b == w43Var) {
                    this.f83974d = 2;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final void a(x43 x43Var) {
        if (this.f83973c.size() < 2) {
            if (!this.f83973c.contains(x43Var)) {
                x43Var.f82731b = 0;
                x43Var.f84450d = null;
                this.f83973c.addFirst(x43Var);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }
}
