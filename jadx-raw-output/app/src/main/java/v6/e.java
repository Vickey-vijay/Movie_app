package v6;

import y5.j;

/* JADX INFO: compiled from: QRCodeDecoderMetaData.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f73116a;

    public void a(j[] jVarArr) {
        if (!this.f73116a || jVarArr == null || jVarArr.length < 3) {
            return;
        }
        j jVar = jVarArr[0];
        jVarArr[0] = jVarArr[2];
        jVarArr[2] = jVar;
    }

    public e(boolean z10) {
        this.f73116a = z10;
    }
}
