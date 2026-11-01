package com.vungle.ads.internal.network;

import al.e;
import al.f;
import bl.g0;
import ck.p;
import kotlin.Metadata;
import kotlinx.serialization.internal.EnumDescriptor;

/* JADX INFO: compiled from: TpatSender.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/network/HttpMethod.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/network/HttpMethod;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class HttpMethod$$serializer implements g0<HttpMethod> {
    public static final HttpMethod$$serializer INSTANCE = new HttpMethod$$serializer();
    public static final /* synthetic */ kotlinx.serialization.descriptors.a descriptor;

    private HttpMethod$$serializer() {
    }

    @Override // bl.g0
    public xk.b<?>[] childSerializers() {
        return new xk.b[0];
    }

    @Override // xk.a
    public HttpMethod deserialize(e decoder) {
        p.j(decoder, "decoder");
        return HttpMethod.values()[decoder.s(getDescriptor())];
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, HttpMethod httpMethod) {
        p.j(fVar, "encoder");
        p.j(httpMethod, "value");
        fVar.f(getDescriptor(), httpMethod.ordinal());
    }

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.vungle.ads.internal.network.HttpMethod", 2);
        enumDescriptor.k("GET", false);
        enumDescriptor.k("POST", false);
        descriptor = enumDescriptor;
    }

    @Override // bl.g0
    public xk.b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
