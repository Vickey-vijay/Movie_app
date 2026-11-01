package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import ic.c;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes6.dex */
public final class Transform extends Message<Transform, a> {
    public static final ProtoAdapter<Transform> ADAPTER = new b();
    public static final Float DEFAULT_A;
    public static final Float DEFAULT_B;
    public static final Float DEFAULT_C;
    public static final Float DEFAULT_D;
    public static final Float DEFAULT_TX;
    public static final Float DEFAULT_TY;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f43165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f43166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f43167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f43168d;
    public final Float tx;
    public final Float ty;

    public static final class a extends Message.a<Transform, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Float f43169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Float f43170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Float f43171f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Float f43172g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Float f43173h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Float f43174i;

        public a g(Float f10) {
            this.f43169d = f10;
            return this;
        }

        public a h(Float f10) {
            this.f43170e = f10;
            return this;
        }

        @Override // com.squareup.wire.Message.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Transform c() {
            return new Transform(this.f43169d, this.f43170e, this.f43171f, this.f43172g, this.f43173h, this.f43174i, super.d());
        }

        public a j(Float f10) {
            this.f43171f = f10;
            return this;
        }

        public a k(Float f10) {
            this.f43172g = f10;
            return this;
        }

        public a l(Float f10) {
            this.f43173h = f10;
            return this;
        }

        public a m(Float f10) {
            this.f43174i = f10;
            return this;
        }
    }

    public static final class b extends ProtoAdapter<Transform> {
        public b() {
            super(FieldEncoding.LENGTH_DELIMITED, Transform.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Transform c(ic.b bVar) throws IOException {
            a aVar = new a();
            long jC = bVar.c();
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    bVar.d(jC);
                    return aVar.c();
                }
                switch (iF) {
                    case 1:
                        aVar.g(ProtoAdapter.f45191o.c(bVar));
                        break;
                    case 2:
                        aVar.h(ProtoAdapter.f45191o.c(bVar));
                        break;
                    case 3:
                        aVar.j(ProtoAdapter.f45191o.c(bVar));
                        break;
                    case 4:
                        aVar.k(ProtoAdapter.f45191o.c(bVar));
                        break;
                    case 5:
                        aVar.l(ProtoAdapter.f45191o.c(bVar));
                        break;
                    case 6:
                        aVar.m(ProtoAdapter.f45191o.c(bVar));
                        break;
                    default:
                        FieldEncoding fieldEncodingG = bVar.g();
                        aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().c(bVar));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(c cVar, Transform transform) throws IOException {
            Float f10 = transform.f43165a;
            if (f10 != null) {
                ProtoAdapter.f45191o.k(cVar, 1, f10);
            }
            Float f11 = transform.f43166b;
            if (f11 != null) {
                ProtoAdapter.f45191o.k(cVar, 2, f11);
            }
            Float f12 = transform.f43167c;
            if (f12 != null) {
                ProtoAdapter.f45191o.k(cVar, 3, f12);
            }
            Float f13 = transform.f43168d;
            if (f13 != null) {
                ProtoAdapter.f45191o.k(cVar, 4, f13);
            }
            Float f14 = transform.tx;
            if (f14 != null) {
                ProtoAdapter.f45191o.k(cVar, 5, f14);
            }
            Float f15 = transform.ty;
            if (f15 != null) {
                ProtoAdapter.f45191o.k(cVar, 6, f15);
            }
            cVar.k(transform.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Transform transform) {
            Float f10 = transform.f43165a;
            int iM = f10 != null ? ProtoAdapter.f45191o.m(1, f10) : 0;
            Float f11 = transform.f43166b;
            int iM2 = iM + (f11 != null ? ProtoAdapter.f45191o.m(2, f11) : 0);
            Float f12 = transform.f43167c;
            int iM3 = iM2 + (f12 != null ? ProtoAdapter.f45191o.m(3, f12) : 0);
            Float f13 = transform.f43168d;
            int iM4 = iM3 + (f13 != null ? ProtoAdapter.f45191o.m(4, f13) : 0);
            Float f14 = transform.tx;
            int iM5 = iM4 + (f14 != null ? ProtoAdapter.f45191o.m(5, f14) : 0);
            Float f15 = transform.ty;
            return iM5 + (f15 != null ? ProtoAdapter.f45191o.m(6, f15) : 0) + transform.unknownFields().size();
        }
    }

    public Transform(Float f10, Float f11, Float f12, Float f13, Float f14, Float f15) {
        this(f10, f11, f12, f13, f14, f15, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Transform)) {
            return false;
        }
        Transform transform = (Transform) obj;
        return unknownFields().equals(transform.unknownFields()) && com.squareup.wire.internal.a.d(this.f43165a, transform.f43165a) && com.squareup.wire.internal.a.d(this.f43166b, transform.f43166b) && com.squareup.wire.internal.a.d(this.f43167c, transform.f43167c) && com.squareup.wire.internal.a.d(this.f43168d, transform.f43168d) && com.squareup.wire.internal.a.d(this.tx, transform.tx) && com.squareup.wire.internal.a.d(this.ty, transform.ty);
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        DEFAULT_A = fValueOf;
        DEFAULT_B = fValueOf;
        DEFAULT_C = fValueOf;
        DEFAULT_D = fValueOf;
        DEFAULT_TX = fValueOf;
        DEFAULT_TY = fValueOf;
    }

    public Transform(Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f43165a = f10;
        this.f43166b = f11;
        this.f43167c = f12;
        this.f43168d = f13;
        this.tx = f14;
        this.ty = f15;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f10 = this.f43165a;
        int iHashCode2 = (iHashCode + (f10 != null ? f10.hashCode() : 0)) * 37;
        Float f11 = this.f43166b;
        int iHashCode3 = (iHashCode2 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.f43167c;
        int iHashCode4 = (iHashCode3 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.f43168d;
        int iHashCode5 = (iHashCode4 + (f13 != null ? f13.hashCode() : 0)) * 37;
        Float f14 = this.tx;
        int iHashCode6 = (iHashCode5 + (f14 != null ? f14.hashCode() : 0)) * 37;
        Float f15 = this.ty;
        int iHashCode7 = iHashCode6 + (f15 != null ? f15.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public a newBuilder() {
        a aVar = new a();
        aVar.f43169d = this.f43165a;
        aVar.f43170e = this.f43166b;
        aVar.f43171f = this.f43167c;
        aVar.f43172g = this.f43168d;
        aVar.f43173h = this.tx;
        aVar.f43174i = this.ty;
        aVar.b(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f43165a != null) {
            sb2.append(", a=");
            sb2.append(this.f43165a);
        }
        if (this.f43166b != null) {
            sb2.append(", b=");
            sb2.append(this.f43166b);
        }
        if (this.f43167c != null) {
            sb2.append(", c=");
            sb2.append(this.f43167c);
        }
        if (this.f43168d != null) {
            sb2.append(", d=");
            sb2.append(this.f43168d);
        }
        if (this.tx != null) {
            sb2.append(", tx=");
            sb2.append(this.tx);
        }
        if (this.ty != null) {
            sb2.append(", ty=");
            sb2.append(this.ty);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "Transform{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
