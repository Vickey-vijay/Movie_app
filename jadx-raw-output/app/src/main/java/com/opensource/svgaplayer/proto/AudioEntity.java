package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import ic.c;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes11.dex */
public final class AudioEntity extends Message<AudioEntity, a> {
    public static final String DEFAULT_AUDIOKEY = "";
    private static final long serialVersionUID = 0;
    public final String audioKey;
    public final Integer endFrame;
    public final Integer startFrame;
    public final Integer startTime;
    public final Integer totalTime;
    public static final ProtoAdapter<AudioEntity> ADAPTER = new b();
    public static final Integer DEFAULT_STARTFRAME = 0;
    public static final Integer DEFAULT_ENDFRAME = 0;
    public static final Integer DEFAULT_STARTTIME = 0;
    public static final Integer DEFAULT_TOTALTIME = 0;

    public static final class a extends Message.a<AudioEntity, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f43095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f43096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f43097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f43098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f43099h;

        public a g(String str) {
            this.f43095d = str;
            return this;
        }

        @Override // com.squareup.wire.Message.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public AudioEntity c() {
            return new AudioEntity(this.f43095d, this.f43096e, this.f43097f, this.f43098g, this.f43099h, super.d());
        }

        public a i(Integer num) {
            this.f43097f = num;
            return this;
        }

        public a j(Integer num) {
            this.f43096e = num;
            return this;
        }

        public a k(Integer num) {
            this.f43098g = num;
            return this;
        }

        public a l(Integer num) {
            this.f43099h = num;
            return this;
        }
    }

    public static final class b extends ProtoAdapter<AudioEntity> {
        public b() {
            super(FieldEncoding.LENGTH_DELIMITED, AudioEntity.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public AudioEntity c(ic.b bVar) throws IOException {
            a aVar = new a();
            long jC = bVar.c();
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    bVar.d(jC);
                    return aVar.c();
                }
                if (iF == 1) {
                    aVar.g(ProtoAdapter.f45193q.c(bVar));
                } else if (iF == 2) {
                    aVar.j(ProtoAdapter.f45181e.c(bVar));
                } else if (iF == 3) {
                    aVar.i(ProtoAdapter.f45181e.c(bVar));
                } else if (iF == 4) {
                    aVar.k(ProtoAdapter.f45181e.c(bVar));
                } else if (iF != 5) {
                    FieldEncoding fieldEncodingG = bVar.g();
                    aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().c(bVar));
                } else {
                    aVar.l(ProtoAdapter.f45181e.c(bVar));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(c cVar, AudioEntity audioEntity) throws IOException {
            String str = audioEntity.audioKey;
            if (str != null) {
                ProtoAdapter.f45193q.k(cVar, 1, str);
            }
            Integer num = audioEntity.startFrame;
            if (num != null) {
                ProtoAdapter.f45181e.k(cVar, 2, num);
            }
            Integer num2 = audioEntity.endFrame;
            if (num2 != null) {
                ProtoAdapter.f45181e.k(cVar, 3, num2);
            }
            Integer num3 = audioEntity.startTime;
            if (num3 != null) {
                ProtoAdapter.f45181e.k(cVar, 4, num3);
            }
            Integer num4 = audioEntity.totalTime;
            if (num4 != null) {
                ProtoAdapter.f45181e.k(cVar, 5, num4);
            }
            cVar.k(audioEntity.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(AudioEntity audioEntity) {
            String str = audioEntity.audioKey;
            int iM = str != null ? ProtoAdapter.f45193q.m(1, str) : 0;
            Integer num = audioEntity.startFrame;
            int iM2 = iM + (num != null ? ProtoAdapter.f45181e.m(2, num) : 0);
            Integer num2 = audioEntity.endFrame;
            int iM3 = iM2 + (num2 != null ? ProtoAdapter.f45181e.m(3, num2) : 0);
            Integer num3 = audioEntity.startTime;
            int iM4 = iM3 + (num3 != null ? ProtoAdapter.f45181e.m(4, num3) : 0);
            Integer num4 = audioEntity.totalTime;
            return iM4 + (num4 != null ? ProtoAdapter.f45181e.m(5, num4) : 0) + audioEntity.unknownFields().size();
        }
    }

    public AudioEntity(String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this(str, num, num2, num3, num4, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioEntity)) {
            return false;
        }
        AudioEntity audioEntity = (AudioEntity) obj;
        return unknownFields().equals(audioEntity.unknownFields()) && com.squareup.wire.internal.a.d(this.audioKey, audioEntity.audioKey) && com.squareup.wire.internal.a.d(this.startFrame, audioEntity.startFrame) && com.squareup.wire.internal.a.d(this.endFrame, audioEntity.endFrame) && com.squareup.wire.internal.a.d(this.startTime, audioEntity.startTime) && com.squareup.wire.internal.a.d(this.totalTime, audioEntity.totalTime);
    }

    public AudioEntity(String str, Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.audioKey = str;
        this.startFrame = num;
        this.endFrame = num2;
        this.startTime = num3;
        this.totalTime = num4;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.audioKey;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.startFrame;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.endFrame;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.startTime;
        int iHashCode5 = (iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.totalTime;
        int iHashCode6 = iHashCode5 + (num4 != null ? num4.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public a newBuilder() {
        a aVar = new a();
        aVar.f43095d = this.audioKey;
        aVar.f43096e = this.startFrame;
        aVar.f43097f = this.endFrame;
        aVar.f43098g = this.startTime;
        aVar.f43099h = this.totalTime;
        aVar.b(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.audioKey != null) {
            sb2.append(", audioKey=");
            sb2.append(this.audioKey);
        }
        if (this.startFrame != null) {
            sb2.append(", startFrame=");
            sb2.append(this.startFrame);
        }
        if (this.endFrame != null) {
            sb2.append(", endFrame=");
            sb2.append(this.endFrame);
        }
        if (this.startTime != null) {
            sb2.append(", startTime=");
            sb2.append(this.startTime);
        }
        if (this.totalTime != null) {
            sb2.append(", totalTime=");
            sb2.append(this.totalTime);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "AudioEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
