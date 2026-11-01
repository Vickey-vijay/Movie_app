package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import ic.c;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes9.dex */
public final class FrameEntity extends Message<FrameEntity, a> {
    public static final ProtoAdapter<FrameEntity> ADAPTER = new b();
    public static final Float DEFAULT_ALPHA = Float.valueOf(0.0f);
    public static final String DEFAULT_CLIPPATH = "";
    private static final long serialVersionUID = 0;
    public final Float alpha;
    public final String clipPath;
    public final Layout layout;
    public final List<ShapeEntity> shapes;
    public final Transform transform;

    public static final class a extends Message.a<FrameEntity, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Float f43100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Layout f43101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Transform f43102f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f43103g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<ShapeEntity> f43104h = com.squareup.wire.internal.a.g();

        public a g(Float f10) {
            this.f43100d = f10;
            return this;
        }

        @Override // com.squareup.wire.Message.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public FrameEntity c() {
            return new FrameEntity(this.f43100d, this.f43101e, this.f43102f, this.f43103g, this.f43104h, super.d());
        }

        public a i(String str) {
            this.f43103g = str;
            return this;
        }

        public a j(Layout layout) {
            this.f43101e = layout;
            return this;
        }

        public a k(Transform transform) {
            this.f43102f = transform;
            return this;
        }
    }

    public static final class b extends ProtoAdapter<FrameEntity> {
        public b() {
            super(FieldEncoding.LENGTH_DELIMITED, FrameEntity.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public FrameEntity c(ic.b bVar) throws IOException {
            a aVar = new a();
            long jC = bVar.c();
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    bVar.d(jC);
                    return aVar.c();
                }
                if (iF == 1) {
                    aVar.g(ProtoAdapter.f45191o.c(bVar));
                } else if (iF == 2) {
                    aVar.j(Layout.ADAPTER.c(bVar));
                } else if (iF == 3) {
                    aVar.k(Transform.ADAPTER.c(bVar));
                } else if (iF == 4) {
                    aVar.i(ProtoAdapter.f45193q.c(bVar));
                } else if (iF != 5) {
                    FieldEncoding fieldEncodingG = bVar.g();
                    aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().c(bVar));
                } else {
                    aVar.f43104h.add(ShapeEntity.ADAPTER.c(bVar));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(c cVar, FrameEntity frameEntity) throws IOException {
            Float f10 = frameEntity.alpha;
            if (f10 != null) {
                ProtoAdapter.f45191o.k(cVar, 1, f10);
            }
            Layout layout = frameEntity.layout;
            if (layout != null) {
                Layout.ADAPTER.k(cVar, 2, layout);
            }
            Transform transform = frameEntity.transform;
            if (transform != null) {
                Transform.ADAPTER.k(cVar, 3, transform);
            }
            String str = frameEntity.clipPath;
            if (str != null) {
                ProtoAdapter.f45193q.k(cVar, 4, str);
            }
            ShapeEntity.ADAPTER.a().k(cVar, 5, frameEntity.shapes);
            cVar.k(frameEntity.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(FrameEntity frameEntity) {
            Float f10 = frameEntity.alpha;
            int iM = f10 != null ? ProtoAdapter.f45191o.m(1, f10) : 0;
            Layout layout = frameEntity.layout;
            int iM2 = iM + (layout != null ? Layout.ADAPTER.m(2, layout) : 0);
            Transform transform = frameEntity.transform;
            int iM3 = iM2 + (transform != null ? Transform.ADAPTER.m(3, transform) : 0);
            String str = frameEntity.clipPath;
            return iM3 + (str != null ? ProtoAdapter.f45193q.m(4, str) : 0) + ShapeEntity.ADAPTER.a().m(5, frameEntity.shapes) + frameEntity.unknownFields().size();
        }
    }

    public FrameEntity(Float f10, Layout layout, Transform transform, String str, List<ShapeEntity> list) {
        this(f10, layout, transform, str, list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrameEntity)) {
            return false;
        }
        FrameEntity frameEntity = (FrameEntity) obj;
        return unknownFields().equals(frameEntity.unknownFields()) && com.squareup.wire.internal.a.d(this.alpha, frameEntity.alpha) && com.squareup.wire.internal.a.d(this.layout, frameEntity.layout) && com.squareup.wire.internal.a.d(this.transform, frameEntity.transform) && com.squareup.wire.internal.a.d(this.clipPath, frameEntity.clipPath) && this.shapes.equals(frameEntity.shapes);
    }

    public FrameEntity(Float f10, Layout layout, Transform transform, String str, List<ShapeEntity> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.alpha = f10;
        this.layout = layout;
        this.transform = transform;
        this.clipPath = str;
        this.shapes = com.squareup.wire.internal.a.e("shapes", list);
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f10 = this.alpha;
        int iHashCode2 = (iHashCode + (f10 != null ? f10.hashCode() : 0)) * 37;
        Layout layout = this.layout;
        int iHashCode3 = (iHashCode2 + (layout != null ? layout.hashCode() : 0)) * 37;
        Transform transform = this.transform;
        int iHashCode4 = (iHashCode3 + (transform != null ? transform.hashCode() : 0)) * 37;
        String str = this.clipPath;
        int iHashCode5 = ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 37) + this.shapes.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public a newBuilder() {
        a aVar = new a();
        aVar.f43100d = this.alpha;
        aVar.f43101e = this.layout;
        aVar.f43102f = this.transform;
        aVar.f43103g = this.clipPath;
        aVar.f43104h = com.squareup.wire.internal.a.a("shapes", this.shapes);
        aVar.b(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.alpha != null) {
            sb2.append(", alpha=");
            sb2.append(this.alpha);
        }
        if (this.layout != null) {
            sb2.append(", layout=");
            sb2.append(this.layout);
        }
        if (this.transform != null) {
            sb2.append(", transform=");
            sb2.append(this.transform);
        }
        if (this.clipPath != null) {
            sb2.append(", clipPath=");
            sb2.append(this.clipPath);
        }
        if (!this.shapes.isEmpty()) {
            sb2.append(", shapes=");
            sb2.append(this.shapes);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "FrameEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
