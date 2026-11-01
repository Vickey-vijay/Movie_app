package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4524sh implements InterfaceC4481qn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4316k9 f57661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4599vh f57662b;

    public C4524sh(C4599vh c4599vh, C4316k9 c4316k9) {
        this.f57662b = c4599vh;
        this.f57661a = c4316k9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481qn
    public final void a(Object obj) {
        List list = (List) obj;
        C4316k9 c4316k9 = this.f57661a;
        if (mo.a((Collection) list)) {
            return;
        }
        c4316k9.f57091d = new C4265i9[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4302jl c4302jl = (C4302jl) list.get(i10);
            C4265i9[] c4265i9Arr = c4316k9.f57091d;
            Map map = Qf.f55798a;
            C4265i9 c4265i9 = new C4265i9();
            Integer num = c4302jl.f57026a;
            if (num != null) {
                c4265i9.f56960a = num.intValue();
            }
            Integer num2 = c4302jl.f57027b;
            if (num2 != null) {
                c4265i9.f56961b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c4302jl.f57029d)) {
                c4265i9.f56962c = c4302jl.f57029d;
            }
            c4265i9.f56963d = c4302jl.f57028c;
            c4265i9Arr[i10] = c4265i9;
            this.f57662b.f57827g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c4316k9.f57091d[i10]);
            this.f57662b.f57827g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
