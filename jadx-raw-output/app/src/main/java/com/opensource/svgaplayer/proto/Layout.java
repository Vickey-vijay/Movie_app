package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import ic.c;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class Layout extends Message<Layout, a> {
    public static final ProtoAdapter<Layout> ADAPTER = new b();
    public static final Float DEFAULT_HEIGHT;
    public static final Float DEFAULT_WIDTH;
    public static final Float DEFAULT_X;
    public static final Float DEFAULT_Y;
    private static final long serialVersionUID = 0;
    public final Float height;
    public final Float width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Float f43105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Float f43106y;

    public static final class a extends Message.a<Layout, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Float f43107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Float f43108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Float f43109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Float f43110g;

        @Override // com.squareup.wire.Message.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Layout c() {
            return new Layout(this.f43107d, this.f43108e, this.f43109f, this.f43110g, super.d());
        }

        public a h(Float f10) {
            this.f43110g = f10;
            return this;
        }

        public a i(Float f10) {
            this.f43109f = f10;
            return this;
        }

        public a j(Float f10) {
            this.f43107d = f10;
            return this;
        }

        public a k(Float f10) {
            this.f43108e = f10;
            return this;
        }
    }

    public static final class b extends ProtoAdapter<Layout> {
        public b() {
            super(FieldEncoding.LENGTH_DELIMITED, Layout.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Layout c(ic.b bVar) throws IOException {
            a aVar = new a();
            long jC = bVar.c();
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    bVar.d(jC);
                    return aVar.c();
                }
                if (iF == 1) {
                    aVar.j(ProtoAdapter.f45191o.c(bVar));
                } else if (iF == 2) {
                    aVar.k(ProtoAdapter.f45191o.c(bVar));
                } else if (iF == 3) {
                    aVar.i(ProtoAdapter.f45191o.c(bVar));
                } else if (iF != 4) {
                    FieldEncoding fieldEncodingG = bVar.g();
                    aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().c(bVar));
                } else {
                    aVar.h(ProtoAdapter.f45191o.c(bVar));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(c cVar, Layout layout) throws IOException {
            Float f10 = layout.f43105x;
            if (f10 != null) {
                ProtoAdapter.f45191o.k(cVar, 1, f10);
            }
            Float f11 = layout.f43106y;
            if (f11 != null) {
                ProtoAdapter.f45191o.k(cVar, 2, f11);
            }
            Float f12 = layout.width;
            if (f12 != null) {
                ProtoAdapter.f45191o.k(cVar, 3, f12);
            }
            Float f13 = layout.height;
            if (f13 != null) {
                ProtoAdapter.f45191o.k(cVar, 4, f13);
            }
            cVar.k(layout.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(Layout layout) {
            Float f10 = layout.f43105x;
            int iM = f10 != null ? ProtoAdapter.f45191o.m(1, f10) : 0;
            Float f11 = layout.f43106y;
            int iM2 = iM + (f11 != null ? ProtoAdapter.f45191o.m(2, f11) : 0);
            Float f12 = layout.width;
            int iM3 = iM2 + (f12 != null ? ProtoAdapter.f45191o.m(3, f12) : 0);
            Float f13 = layout.height;
            return iM3 + (f13 != null ? ProtoAdapter.f45191o.m(4, f13) : 0) + layout.unknownFields().size();
        }
    }

    public Layout(Float f10, Float f11, Float f12, Float f13) {
        this(f10, f11, f12, f13, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Layout)) {
            return false;
        }
        Layout layout = (Layout) obj;
        return unknownFields().equals(layout.unknownFields()) && com.squareup.wire.internal.a.d(this.f43105x, layout.f43105x) && com.squareup.wire.internal.a.d(this.f43106y, layout.f43106y) && com.squareup.wire.internal.a.d(this.width, layout.width) && com.squareup.wire.internal.a.d(this.height, layout.height);
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        DEFAULT_X = fValueOf;
        DEFAULT_Y = fValueOf;
        DEFAULT_WIDTH = fValueOf;
        DEFAULT_HEIGHT = fValueOf;
    }

    public Layout(Float f10, Float f11, Float f12, Float f13, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f43105x = f10;
        this.f43106y = f11;
        this.width = f12;
        this.height = f13;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f10 = this.f43105x;
        int iHashCode2 = (iHashCode + (f10 != null ? f10.hashCode() : 0)) * 37;
        Float f11 = this.f43106y;
        int iHashCode3 = (iHashCode2 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.width;
        int iHashCode4 = (iHashCode3 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.height;
        int iHashCode5 = iHashCode4 + (f13 != null ? f13.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public a newBuilder() {
        a aVar = new a();
        aVar.f43107d = this.f43105x;
        aVar.f43108e = this.f43106y;
        aVar.f43109f = this.width;
        aVar.f43110g = this.height;
        aVar.b(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f43105x != null) {
            sb2.append(", x=");
            sb2.append(this.f43105x);
        }
        if (this.f43106y != null) {
            sb2.append(", y=");
            sb2.append(this.f43106y);
        }
        if (this.width != null) {
            sb2.append(", width=");
            sb2.append(this.width);
        }
        if (this.height != null) {
            sb2.append(", height=");
            sb2.append(this.height);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "Layout{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
