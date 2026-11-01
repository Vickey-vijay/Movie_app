package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import ic.c;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes11.dex */
public final class SpriteEntity extends Message<SpriteEntity, a> {
    public static final ProtoAdapter<SpriteEntity> ADAPTER = new b();
    public static final String DEFAULT_IMAGEKEY = "";
    public static final String DEFAULT_MATTEKEY = "";
    private static final long serialVersionUID = 0;
    public final List<FrameEntity> frames;
    public final String imageKey;
    public final String matteKey;

    public static final class a extends Message.a<SpriteEntity, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f43162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<FrameEntity> f43163e = com.squareup.wire.internal.a.g();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f43164f;

        @Override // com.squareup.wire.Message.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SpriteEntity c() {
            return new SpriteEntity(this.f43162d, this.f43163e, this.f43164f, super.d());
        }

        public a h(String str) {
            this.f43162d = str;
            return this;
        }

        public a i(String str) {
            this.f43164f = str;
            return this;
        }
    }

    public static final class b extends ProtoAdapter<SpriteEntity> {
        public b() {
            super(FieldEncoding.LENGTH_DELIMITED, SpriteEntity.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public SpriteEntity c(ic.b bVar) throws IOException {
            a aVar = new a();
            long jC = bVar.c();
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    bVar.d(jC);
                    return aVar.c();
                }
                if (iF == 1) {
                    aVar.h(ProtoAdapter.f45193q.c(bVar));
                } else if (iF == 2) {
                    aVar.f43163e.add(FrameEntity.ADAPTER.c(bVar));
                } else if (iF != 3) {
                    FieldEncoding fieldEncodingG = bVar.g();
                    aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().c(bVar));
                } else {
                    aVar.i(ProtoAdapter.f45193q.c(bVar));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(c cVar, SpriteEntity spriteEntity) throws IOException {
            String str = spriteEntity.imageKey;
            if (str != null) {
                ProtoAdapter.f45193q.k(cVar, 1, str);
            }
            FrameEntity.ADAPTER.a().k(cVar, 2, spriteEntity.frames);
            String str2 = spriteEntity.matteKey;
            if (str2 != null) {
                ProtoAdapter.f45193q.k(cVar, 3, str2);
            }
            cVar.k(spriteEntity.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(SpriteEntity spriteEntity) {
            String str = spriteEntity.imageKey;
            int iM = (str != null ? ProtoAdapter.f45193q.m(1, str) : 0) + FrameEntity.ADAPTER.a().m(2, spriteEntity.frames);
            String str2 = spriteEntity.matteKey;
            return iM + (str2 != null ? ProtoAdapter.f45193q.m(3, str2) : 0) + spriteEntity.unknownFields().size();
        }
    }

    public SpriteEntity(String str, List<FrameEntity> list, String str2) {
        this(str, list, str2, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpriteEntity)) {
            return false;
        }
        SpriteEntity spriteEntity = (SpriteEntity) obj;
        return unknownFields().equals(spriteEntity.unknownFields()) && com.squareup.wire.internal.a.d(this.imageKey, spriteEntity.imageKey) && this.frames.equals(spriteEntity.frames) && com.squareup.wire.internal.a.d(this.matteKey, spriteEntity.matteKey);
    }

    public SpriteEntity(String str, List<FrameEntity> list, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.imageKey = str;
        this.frames = com.squareup.wire.internal.a.e(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS, list);
        this.matteKey = str2;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.imageKey;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.frames.hashCode()) * 37;
        String str2 = this.matteKey;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public a newBuilder() {
        a aVar = new a();
        aVar.f43162d = this.imageKey;
        aVar.f43163e = com.squareup.wire.internal.a.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS, this.frames);
        aVar.f43164f = this.matteKey;
        aVar.b(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.imageKey != null) {
            sb2.append(", imageKey=");
            sb2.append(this.imageKey);
        }
        if (!this.frames.isEmpty()) {
            sb2.append(", frames=");
            sb2.append(this.frames);
        }
        if (this.matteKey != null) {
            sb2.append(", matteKey=");
            sb2.append(this.matteKey);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "SpriteEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
